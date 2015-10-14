import web
import sqlite3

def main():
    urls = [
        '/', Login,
        '/welcome/(.+)', Welcome,
        '/logout', Login
    ]

    app = web.application(urls, globals())
    app.run()


class Login:
    def __init__(self):
        self.login_form = web.form.Form(
            web.form.Textbox('username', web.form.notnull, description="Username"),
            web.form.Password('password', web.form.notnull, description="Password"),
            web.form.Button('login', html='Login')
        )

    def render_login_page(self, error=None):
        return web.template.render('static', globals()).login(error, self.login_form)

    def GET(self):
        return self.render_login_page()

    def POST(self):
        if not self.login_form.validates():
            return self.render_login_page()

        username = self.login_form.d.username
        password = self.login_form.d.password

        try:
            user = UserStorage().lookup(username, password)
            return web.seeother('/welcome/' + user)
        except InvalidCredentials:
            return self.render_login_page('Invalid Username or Password')

class InvalidCredentials(Exception):
    pass

class UserStorage:
    def lookup(self, username, password):
        connection = sqlite3.connect('data.db')
        cursor = connection.cursor()

        row = cursor.execute("SELECT * from users WHERE username = '%s'" % username)
        user = row.fetchone()

        if user is None:
            raise InvalidCredentials
        else:
            return user[1]


class Welcome:
    def GET(self, username):
        return web.template.render('static', globals()).welcome(username)


if __name__=="__main__":
    main()

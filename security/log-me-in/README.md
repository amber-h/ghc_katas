##Log Me In
The flag is the password to the administrator account.

####Difficulty: Easy

####Pre-requisites
* Python2
* Python Virtualenv

Note: Mac OS X users can do the following:

1. If you have the command `pip`, use `pip install virtualenv`
2. If you don't have pip, run `brew install python`. If you don't want to download and install python (you will need tethering if you are at GHC because python is sizeable) then you can use `pyenv-virtualenv`. You can then use pyenv's instructions for using virtual environments.

###Setup Instructions
1. Create a virutalenv for python2.
    ```bash
    $ virtualenv env
    $ source env/bin/activate
    ```

    If python2 is not your main python, but it exists in a different location, then...
    ```bash
    $ virtualenv -p /path/to/python2 env
    $ source env/bin/activate
    ```
2. Install requirements for the application.
    ```bash
    (env)$ pip install -r requirements.txt
    ```
3. Run the program.
    ```bash
    (env)$ python app.py
    ```
4. When you are done playing, you can escape from the virtual environment.
    ```bash
    (env)$ deactivate
    ```
5. You can peek at the answer in the answer file, but that's no fun. ;)

###Player Instructions
1. Visit the vulnerable application at `localhost:8080`.
2. Try to get the flag, which is the password to the administrator account.

You are only allowed to use the browser.

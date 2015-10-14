##SPAMy Game
Try to get the flag in the answer directory!

####Difficulty: Med-Hard

####Pre-requisites
Netcat (`nc` command) Note: Mac OS X has nc in /usr/bin/nc
Python2 (Note: Python 2 only. Python 3 not supported.)

###Setup Instructions
1. To start the game, run it in the background with:
    ```bash
    $ python spam.py &
    ```
2. When you're done playing, you can kill the running program by calling...
    ```bash
    $ ps aux | grep spam
    ```
    Then you can run `kill` on the PID (process ID) of the process running "python spam.py". The PID will be the number in the row of this program and in the second column.
    ```bash
    $ kill 12345
    ```
Note: Most of the answer is included in the answer directory, but try not to look until you've got it!

####Player Instructions
Use netcat to contact the program at port 8000.
```bash
$ nc localhost 8000
```
You are allowed to look at the python code in spam.py.

You are allowed to write some scripts to help you get the flag.

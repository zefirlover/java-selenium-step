# java-selenium-step
Java Maven Selenium JUnit automation tests created to test authorisation 
and appearance of the tabs in the "step" application.
#### What is the "step" application?
"step" is a unified platform for software automation that allows you to make 
the most out of automation artifacts while getting rid of specific tools.
More information you can get here: https://step.exense.ch/knowledgebase/3.18/
### "step" installation
First, you need to install the actual Java Development Kit (18 or above) from here:
https://www.oracle.com/java/technologies/downloads/#java18. Be aware about the environmental
variables!![img_1.png](img_1.png)
Also, add the java home path to the Path variable.

Second, you need to install the Community MongoDB Server from here:
https://www.mongodb.com/try/download/community

Download the `agent` and the `controller` from here:
https://github.com/exense/step/releases/latest

Unzip both step archives. There should be a controller folder and an agent folder.
Run through the default steps of MongoDB’s installation wizard, using the default port.
Choose to install the MongoDB Compass from the installation wizard mentioned before.

### Start the "step"
Open the MongoDB Compass and click green `Connect` button. If you have an error in
process, tap the `Ctrl + Shift + Esc`, go to the `Services` tab, find the MongoDB process,
click `Right Mouse Button` on it and click `Run`:![img_2.png](img_2.png)

Then, go to the step controller folder, `bin/startController.bat` and run it.
Optionally, you can run the step agent from `'step-agent-folder'/bin/startAgent.bat`.
After that go to the `localhost:8080`. If everything is okay, you will see this page:
![img_3.png](img_3.png)
If you see anything else, that means you need to terminate controller and agent,
open the command prompt in administrator mode and use the `netstat -ano | findstr :8080`.
Then the pid will appear at the right which you can kill with taskkill.
![img_4.png](img_4.png)
Use the `taskkill /pid 11704 /F` command and start controller and agent again.

Note: login: admin and password: init are default values.

### Project installation
Install the Chrome and the appropriate version of ChromeDriver:
https://chromedriver.chromium.org/downloads

Do not forget about installing the Maven: https://www.baeldung.com/install-maven-on-windows-linux-mac

Also, be aware about the system variables:![img_1.png](img_1.png)
Maven and Java path needs to be added to the Path variable too. More instructions here:
https://www.lambdatest.com/blog/getting-started-with-maven-for-selenium-testing/

After that you can download the project.![img.png](img.png)
Click the "code" button. You can download ZIP archive or use the `git clone` command.

Also, go to the `src/test/resources/conf.properties` and change the
`C:/bin/chromedriver.exe`
reference to the path where your `chromedriver.exe` is placed, or on the 
environmental variable.

### How to start your tests
To start the tests you can use the ▶ button on your IDE or the `mvn test` command.
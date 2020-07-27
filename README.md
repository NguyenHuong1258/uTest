# About the Framework
This framework is basically developed and designed to automate web applications
# Work Flow 
1. Create a branch
2. Do your work
3. Prepare feature/bug_fix branch (Make sure commit history is clean)
4. Raise pull request to merge your branch into the main repo branch
# Tools, Approaches and Technologies Used
* Design pattern: Singleton & Factory
* Gherkin 
* Core Java
* Maven
* Selenium WebDriver
* Cucumber
* Junit
* Page Object Manager
* TestNG
* Extent report
# How to Setup & Configure
1. Install and IDE such as VScode/IntelliJ/Eclipse (Any latest version will work)
2. Install Maven plugin in IDE if it is not present/enabled. Also install plugins for Gherkins
3. Use git lfs clone to download the automation framework to your local system
4. Locate pom.XML and right click and choose Run As -> Maven Build
5. Check whether the build is successful
6. From command prompt go to project level and execute following command(it is advised to use command line option to run):

    `mvn test -Dcucumber.options="--tags @<feature_tag_name>"`

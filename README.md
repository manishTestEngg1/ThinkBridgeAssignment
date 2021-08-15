# ThinkBridgeAssignment
Assignment On Automation Script for Question 2.

=> Project Name is flightsearch
Note: Project contain two xml file for running the test cases
First "validatedropdowntest.xml" file contain test cases for checking "Country" dropdown eg: English and Dutch option
Second "signoffnewuser.xml" file contain one test case for registering new user and validate email sent succesfull

Step To Run validatedropdowntest.xml are :
open validatedropdowntest.xml file
run as "TestNG Suite"
then one executed two testcase will run
Step To Run signoffnewuser.xml are :
Note: Before Running Enter "FullName", "Organization Name", "email" in SignUpTests class for testcase "signOffTest"

open signoffnewuser.xml file
run as "TestNG Suite"
then one executed one testcase will run
Project Description :
Project is created as an "Maven"
I have used "Page Object Model" using PageFactory
I have used properties file to store "url" of company
I have used Parameterization Concept of TestNG to read which browser to open for running test cases
Selenium Webdriver is 3.141.9
General Notes :
We can Run Both TestCases using either "chrome" or firefox" by configuring into xml file under parameters

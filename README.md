# nomo-challenge

**This is a Katalon framework that uses chrome browser and written in Java.Groovy
 built to test NOMO project as a challenge provided by NOMO hiring team**

To run the project:
1- Install Katalon studio standalone version (you will find the katalon intsall file attached to the repo)
2- open the git Icon and clone the project from the repo 'git@github.com:MohamedAshElbehery/nomo-challenge.git'
3- Don't forget to update chrome driver through Tools > Update webdrivers > chrome

The project uses BDD and POM best practices as you will find the page objects in their own folder labeled by page name

Also follows OOP rules as you will find the code mudularized to avoid repetition

the default profile is located in profiles entry it consists of 1 global variable since it's a small project
and we don't have a lot of env variables
 
you will find a test cases folder that contains of the tests and modules each in their own folder labeled by page name
 
I have covered 5 scenarios 4 of them related to property finance feature and the whole 4 uses the same modules using different
variables and conditions, a better practice would have been a data driven approach but it wsn't stated in the task description

The remaining test is for validating task one it consists of elements and redirect assertions

To run the tests you simply go to the tests folder and go to the folder containing the page you want to test then go to
the test, it will first open in manual view so you have to go to script view to see the code it's located at the bottom of the page,
beside it you will find the variables tab which contains the variables used in the tests

so to run the test you go to the test and click the green run button on the top of the page

I covered all the tasks including using the property finance calculator by switching to it's iframe and filling the data
also got the out puts and cleaned it by a string split module and asserted it by the expected value

you will also find videos attached to the repo

I used git commands like clone, commit, and push
http link to repo: https://github.com/MohamedAshElbehery/nomo-challenge.git
ssh : git@github.com:MohamedAshElbehery/nomo-challenge.git

You will find the videos attached to the repo under the folder Videos

##talk to you soon
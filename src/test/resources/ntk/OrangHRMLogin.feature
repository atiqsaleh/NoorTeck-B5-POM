Feature: OrangeHRM Login functionality
#
#Scenario: Verify user able to login with correct credentials
#Given User is on OrangeHRM login page
#When User enters username "admin"
#And User enters password "admin123"
#And User clicks login button
#Then User verifies page title "OrangeHRM"


# there is 2 way of parameter

Scenario: Verify user able to login with correct credentials
Given User is on OrangeHRM login page
When User enters  credentials "admin" "admin123"
And User clicks login button
Then User verifies page title "OrangeHRM"

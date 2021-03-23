*** Settings ***
Documentation   Basic info about test suite
Library         SeleniumLibrary
Resource        ../Resources/keywords.robot
Test Setup      Start Test
Test Teardown   End Web Test

*** Variables ***
${BROWSER}      chrome
${URL}          http://rental21.infotiv.net/webpage/html/gui/index.php
${PASSWORD}     test01
${EMAIL}        tester01@test.se

*** Test Cases ***
Test That Cancel Button Redirects To The Date Selection Page
    [Documentation]                     Test Cancel Button On Create User Page
    [Tags]                              krav-Create User
    Click on Create User Button
    Click On Cancel Button
    Date Selection Page Shows


Test That I Get A Welcomephrase If Successfully Logged In
    [Documentation]                     Test Login And Get A Welcomephrase With Firstname On Header
    [Tags]                              krav-Header
    Entered My Login Information
    Login On Website
    I Get A Welcomephrase
    Logout






*** Settings ***
Documentation
Library         SeleniumLibrary
Resource        ../Resources/vg_keywords.robot
Test Setup      Open Browser And Go To Infotiv
Test Teardown   Clear Booking And Logout And Close Webpage


*** Variables ***
${BROWSER}              chrome
${URL}                  http://rental21.infotiv.net
${CARD_NUMBER}          1111111111111111
${CARD_NAME_HOLDER}     Testo
${CARD_CVCID}           987
${BROWSER}              chrome
${URL}                  http://rental21.infotiv.net/webpage/html/gui/index.php
${PASSWORD}             test01
${EMAIL}                tester01@test.se

*** Test Cases ***
Scenario: Test Of Book A Car
    [Documentation]             Test The Navigation Flow Of Booking A Car
    [Tags]                      krav-Book Car

    Given I Have Entered My Login Information
    When I Have Booked The Audi Q7
    And Enter My Credit Card Information
    Then Car Is Now Ready To Pickup

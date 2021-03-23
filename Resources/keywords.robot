*** Keywords ***
Start Test
    Open Browser                        about:blank     ${BROWSER}
    Go To                               ${URL}
    Page Should Contain                 Infotiv Car Rental

Click on Create User Button
    Press Keys                          id=createUser      RETURN
    Page Should Contain                 Create user
Click On Cancel Button
    Press Keys                          id=cancel          RETURN
Date Selection Page Shows
    Page Should Contain                 Infotiv Car Rental

Click On Login Button
    Page Should Contain Button          id=login
    Press Keys                          id=login           RETURN

Entered My Login Information
    Page Should Contain Element         id=userInfoTop
    Input Text                          xpath://*[@id="email"]       ${EMAIL}
    Input Password                      xpath://*[@id="password"]    ${PASSWORD}
Login On Website
    Click On Login Button
I Get A Welcomephrase
    Page Should Contain Element                xpath://*[@id="welcomePhrase"]
Logout
    Page Should Contain Button          id=logout
    Press Keys                          id=logout          RETURN
End Web Test
    Close Browser
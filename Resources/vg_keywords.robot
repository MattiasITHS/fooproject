*** Keywords ***
# Setup Test
Open Browser And Go To Infotiv
    I Have Open Chrome
    I Have Entered The Webadress
    The Website Shows
I Have Open Chrome
    Open Browser                        about:blank     ${BROWSER}
I Have Entered The Webadress
    Go To                               ${URL}
The Website Shows
    Page Should Contain                 Infotiv Car Rental

# GIVEN
I Have Entered My Login Information
    Enter Email And Password
    Click On Login Button
    Page Should Contain A Welcome Phrase
Enter Email And Password
    Input Text                          xpath://*[@id="email"]       ${EMAIL}
    Input Password                      xpath://*[@id="password"]    ${PASSWORD}
Click On Login Button
    Press Keys                          id=login                RETURN
Page Should Contain A Welcome Phrase
    Page Should Contain Element         id=welcomePhrase

# WHEN
I Have Booked The Audi Q7
    I Click Continue
    Page Shows Available Cars
    Audi Q7 Is Available
    I Click Book
    Page Shows Confirm Booking Of Audi Q7
I Click Continue
    Page Should Contain                 Infotiv Car Rental
    Press Keys                          id=continue             RETURN
Page Shows Available Cars
    Page Should Contain Element         id=carSelection
Audi Q7 Is Available
    Page Should Contain Element         xpath://*[@id="carTable"]/tbody/tr[1]
I Click Book
    Press Keys                          id=bookQ7pass5          RETURN
Page Shows Confirm Booking Of Audi Q7
    Page Should Contain Element         xpath://*[@id="confirmSelection"]/form

# AND
Enter My Credit Card Information
    I Enter Card Information
    I Click Confirm Booking
I Enter Card Information
    Page Should Contain Element         xpath://*[@id="confirmSelection"]/form
    Input Text                          id=cardNum          ${CARD_NUMBER}
    Input Text                          id=fullName         ${CARD_NAME_HOLDER}
    Input Text                          id=cvc              ${CARD_CVCID}
I Click Confirm Booking
    Press Keys                          id=confirm          RETURN

# THEN
Car Is Now Ready To Pickup
    Page Should Contain Element         xpath://*[@id="confirmMessage"]/label

# Test Teardown
Clear Booking And Logout And Close Webpage
    Go To Mypage
    Delete Booked Car
    Close Browser
Go To Mypage
    Click Element                       id=title
    Page Should Contain                 Infotiv Car Rental
    Click Element                       id=mypage
    Page Should Contain                 Mypage
Delete Booked Car
    Page Should Contain Element         xpath://*[@id="middlepane"]/table/tbody/tr[2]
    Click Element                       id=unBook1
    Handle Alert                        action=ACCEPT
    Click Element                       id=logout








Feature: Verify omrbranch Booking Hotel module

  Scenario Outline: Verify omrbaranch Booking hotel with valid datas
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User enter GST details  "<Registration No>","<Company Name>" and "<Company Address>"
    And User add special request "<Special request>"
    When User select payment options
    And User enter payment details,proceed with card type "<cardType>"
      | Select card | Card No          | Card Name | Month | Year | cvv |
      | Visa        | 5555555555552222 | Mani      | June  | 2028 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | June  | 2028 | 123 |
      | Amex        | 5555555555550000 | Mani      | June  | 2028 | 123 |
      | Discover    | 5555555555556666 | Mani      | June  | 2028 | 123 |
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | Special request    | cardType   |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-27 | 2024-06-28 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Need early checkin | Debit Card |

  Scenario Outline: Verify omrbaranch Booking hotel with valid credit card details
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User enter GST details  "<Registration No>","<Company Name>" and "<Company Address>"
    And User add special request "<Special request>"
    When User select payment options
    And User enter payment details,proceed with card type "<cardType>"
      | Select card | Card No          | Card Name | Month | Year | cvv |
      | Visa        | 5555555555552223 | Mani      | June  | 2028 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | June  | 2028 | 123 |
      | Amex        | 5555555555550000 | Mani      | June  | 2028 | 123 |
      | Discover    | 5555555555556666 | Mani      | June  | 2028 | 123 |
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | Special request    | cardType   |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Need early checkin | Debit Card |

  Scenario Outline: Verify omrbaranch Booking hotel with credit card and without special request details
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User enter GST details  "<Registration No>","<Company Name>" and "<Company Address>"
    When User select payment options
    And User enter payment details,proceed with card type "<cardType>"
      | Select card | Card No          | Card Name | Month | Year | cvv |
      | Visa        | 5555555555552223 | Mani      | June  | 2028 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | June  | 2028 | 123 |
      | Amex        | 5555555555550000 | Mani      | June  | 2028 | 123 |
      | Discover    | 5555555555556666 | Mani      | June  | 2028 | 123 |
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | cardType    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Credit Card |

  Scenario Outline: Verify omrbaranch Booking hotel with debit card and without special request details
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User enter GST details  "<Registration No>","<Company Name>" and "<Company Address>"
    When User select payment options
    And User enter payment details,proceed with card type "<cardType>"
      | Select card | Card No          | Card Name | Month | Year | cvv |
      | Visa        | 5555555555552222 | Mani      | June  | 2028 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | June  | 2028 | 123 |
      | Amex        | 5555555555550000 | Mani      | June  | 2028 | 123 |
      | Discover    | 5555555555556666 | Mani      | June  | 2028 | 123 |
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | cardType   |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Debit Card |

  Scenario Outline: Verify omrbaranch Booking hotel with debit card, special request and without GST details
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User add special request "<Special request>"
    When User select payment options
    And User enter payment details,proceed with card type "<cardType>"
      | Select card | Card No          | Card Name | Month | Year | cvv |
      | Visa        | 5555555555552222 | Mani      | June  | 2028 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | June  | 2028 | 123 |
      | Amex        | 5555555555550000 | Mani      | June  | 2028 | 123 |
      | Discover    | 5555555555556666 | Mani      | June  | 2028 | 123 |
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Special request    | cardType   |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com | Need early checkin | Debit Card |

  Scenario Outline: Verify omrbaranch Booking hotel with credit card, special request and without GST details
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User add special request "<Special request>"
    When User select payment options
    And User enter payment details,proceed with card type "<cardType>"
      | Select card | Card No          | Card Name | Month | Year | cvv |
      | Visa        | 5555555555552223 | Mani      | June  | 2028 | 123 |
      | Mastercard  | 5555555555554444 | Mani      | June  | 2028 | 123 |
      | Amex        | 5555555555550000 | Mani      | June  | 2028 | 123 |
      | Discover    | 5555555555556666 | Mani      | June  | 2028 | 123 |
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Special request    | cardType    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com | Need early checkin | Credit Card |

  Scenario Outline: Without entering any fields and verify the error message
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    When User Click next Button
    Then Verify error message "Let us know for whom you are booking the hotel","Please select Salutation of the user","Please provide First Name of the user","Please provide Last Name of the user","Please provide Contact Number of the user to ease the communication (if required)" and "Please provide Email ID of the user to ease the communication (if required)"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 |

  Scenario Outline: Verify omrbaranch Booking hotel with UPI valid datas
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User enter GST details  "<Registration No>","<Company Name>" and "<Company Address>"
    And User add special request "<Special request>"
    When User select payment options
    And User enter payment details,proceed with upi payment "<upiId>"
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | Special request    | upiId                |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Need early checkin | seleniumtraining@vbc |

  Scenario Outline: Verify omrbaranch Booking hotel with UPI and without special request
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User enter GST details  "<Registration No>","<Company Name>" and "<Company Address>"
    When User select payment options
    And User enter payment details,proceed with upi payment "<upiId>"
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | upiId                |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | seleniumtraining@vbc |

  Scenario Outline: Verify omrbaranch Booking hotel with UPI without gst details
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User add special request "<Special request>"
    When User select payment options
    And User enter payment details,proceed with upi payment "<upiId>"
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Special request    | upiId                |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com | Need early checkin | seleniumtraining@vbc |

  Scenario Outline: Booking hotel without UPI and verify error message
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    And User add special request "<Special request>"
    When User select payment options
    And User should select Submit button
    Then User should verify upi error message "Please provide your UPI ID"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Special request    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com | Need early checkin |

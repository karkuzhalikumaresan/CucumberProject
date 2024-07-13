Feature: Verify omrbranch Cancel Booking Hotel module

  Scenario Outline: Cancel the created orderId book hotel by card debit - VISA with GST & Spl req
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
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | Special request    | cardType   | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Need early checkin | Debit Card | 2024-06-21 |

  Scenario Outline: Cancel the created orderId book hotel by credit card - VISA with GST & Spl req
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
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | Special request    | cardType    | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Need early checkin | Credit Card | 2024-06-21 |

  Scenario Outline: Cancel the created orderId book hotel by UPI id with GST & Spl req
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
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | Special request    | upiId                | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Need Early CheckIn | seleniumtraining@vbc | 2024-06-26 |

  Scenario Outline: Cancel the created orderId book hotel by UPI id without Spl req
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
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | upiId                | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | seleniumtraining@vbc | 2024-06-26 |

  Scenario Outline: Cancel the created orderId book hotel by credit card - VISA without Spl req
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
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | cardType    | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Credit Card | 2024-06-21 |

  Scenario Outline: Cancel the created orderId book hotel by card debit - VISA without Spl req
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
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | Registration No | Company Name           | Company Address | cardType   | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |      9043592058 | Greens Tech OMR Branch | Thoraipakkam    | Debit Card | 2024-06-26 |

  Scenario Outline: Cancel the created orderId book hotel by card debit - VISA without GST & Spl req
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
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
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | cardType   | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com | Debit Card | 2024-06-26 |

  Scenario Outline: Cancel the created orderId book hotel by card credit - VISA without GST & Spl req
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
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
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | cardType    | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com | Credit Card | 2024-06-26 |

  Scenario Outline: Cancel the created orderId book hotel by UPI id without GST & Spl req
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save first hotel and price
    And User handle confirm booking popup
    Then User should verify after success message "Book Hotel "
    And User should enter valid guest details "<Select salution>", "<First Name>","<Last Name>","<Mobile No>" and "<Email>"
    When User select payment options
    And User enter payment details,proceed with upi payment "<upiId>"
    And User should select Submit button
    Then User should verify booking success message "Booking is Confirmed"
    And User should verify selected hotel and booked hotel are same "Park Hyatt"
    When User navigate to my booking page
    Then User should verify my booking "Bookings"
    When User should search the order Id
    Then User should verify same order Id
    And User should verify Hotel name as selected
    And User should verify Hotel price as selected
    When User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
    When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount | Select salution | First Name | Last Name | Mobile No  | Email                         | upiId                  | checkIn    |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-25 | 2024-06-26 | 2-Two    | 2-Two      |          1 | Ms.             | Karkuzhali | Kumaresan | 9942222100 | karkuzhalikumaresan@gmail.com |seleniumtraining@vbc | 2024-06-26 |

      
    Scenario Outline: Cancel the First displayed orderID
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User click user name and my account
    And User click edit button and change checking date "<checkIn>"
    Then User verify booking updated success message "Booking updated successfully"
     When User Click cancel button and handle popUp
    Then User should verify the success message "Your booking cancelled successfully"
    
    
    Examples: 
      | username                      | password  |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | 
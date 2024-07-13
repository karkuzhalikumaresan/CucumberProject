Feature: Verify omrbranch login module

  Scenario Outline: Verify omrbaranch login with search hotels with valid datas
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    And User click search button
    Then User should verify after search Success message "Select Hotel"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 |

  Scenario Outline: Verify select multiple room type present in header
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    And User click search button
    Then User should verify after search Success message "Select Hotel"
    And User should Verify same selected roomtype is pesent in the header or not "<selectroomtype>"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype                      | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Standard/Deluxe/Suite/Luxury/Studio | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 |

  Scenario Outline: Verify omrbaranch login with mandatory datas
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    And User Search "<SelectState>","<Selectcity>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search success message "Select Hotel"

    Examples: 
      | username                      | password  | SelectState | Selectcity      | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | 2024-06-10 | 2024-06-11 | 2-Two    | 2-Two      |          1 |

  Scenario Outline: Verify omrbaranch login with enter details click search and print error message
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    When User click search button
    Then User should verify error message of mandatory fields "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username                      | password  |
      | karkuzhalikumaresan@gmail.com | Karu@1993 |

  Scenario Outline: Verify all hotel price sorted by low to high
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search hotel with valid credentials in omrbranch website
    And User enter "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>","<childcount>"
    And User click search button
    Then User should verify after search success message "Select Hotel"
    When User click Price low to high

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-10 | 2024-06-11 | 2-Two    | 2-Two      |          1 |

  Scenario Outline: Verify all hotel price sorted by high to low
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search hotel with valid credentials in omrbranch website
    And User enter "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>","<childcount>"
    And User click search button
    Then User should verify after search success message "Select Hotel"
    When User click Price High to low

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-10 | 2024-06-11 | 2-Two    | 2-Two      |          1 |

  Scenario Outline: Verify all hotel name sorted by ascending order
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search hotel with valid credentials in omrbranch website
    And User enter "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>","<childcount>"
    And User click search button
    Then User should verify after search success message "Select Hotel"
    When User click Price Name Ascending

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-10 | 2024-06-11 | 2-Two    | 2-Two      |          1 |

  Scenario Outline: Verify all hotel name sorted by descending order
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search hotel with valid credentials in omrbranch website
    And User enter "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>","<childcount>"
    And User click search button
    Then User should verify after search success message "Select Hotel"
    When User click Price Name Descending

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-10 | 2024-06-11 | 2-Two    | 2-Two      |          1 |

  Scenario: Verify user is on amazon product search
    Given User is on amazon page
    When User search product
      | name    | passwoed |
      | TV      | samsung  |
      | LAPTOP  | Dell     |
      | ANDROID | Realme   |
      | IOS     | ipad     |
    Then User should verify all product listed

  Scenario Outline: Verify selected room type is ends with displayed hotel name.
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    And User click search button
    Then User should verify after search Success message "Select Hotel"
    And User should verify hotel name end room type is mentioned or not

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 |

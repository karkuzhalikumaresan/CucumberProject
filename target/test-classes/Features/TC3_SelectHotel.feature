Feature: Verify omrbranch select Hotel module

  Scenario Outline: Verify omrbaranch select hotel with valid datas
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karkuzhali"
    When User search "<SelectState>","<Selectcity>","<selectroomtype>","<checkIn>","<checkOut>","<Noofroom>","<adultcount>" and "<childcount>"
    Then User should verify after search Success message "Select Hotel"
    When User save last hotel name and price
    And User dismiss booking popup

    Examples: 
      | username                      | password  | SelectState | Selectcity      | selectroomtype | checkIn    | checkOut   | Noofroom | adultcount | childcount |
      | karkuzhalikumaresan@gmail.com | Karu@1993 | Tamil Nadu  | Tiruchirappalli | Suite          | 2024-06-20 | 2024-06-21 | 2-Two    | 2-Two      |          1 |

Feature: Verify omrbranch login module

  Scenario Outline: Verify omrbaranch login with valid data
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify after login success message "Welcome Karkuzhali"

    Examples: 
      | username                      | password  |
      | karkuzhalikumaresan@gmail.com | Karu@1993 |

  Scenario Outline: Verify omrbaranch login with valid data
    Given User is on omrbranch page
    When User enter "<username>" and "<password>" with ENTER key
    Then User should verify after login success message "Welcome Karkuzhali"

    Examples: 
      | username                      | password  |
      | karkuzhalikumaresan@gmail.com | Karu@1993 |

  Scenario Outline: Verify omrbaranch login with Invalid data
    Given User is on omrbranch page
    When User enter "<username>" and "<password>"
    And User click login button
    Then User should verify error message after login "Invalid Login details or Your Password might have expired."

    Examples: 
      | username                      | password   |
      | karkuzhalikumaresan@gmail.com | Karu@19923 |

Feature: Gift Card

  Scenario: Send Gift Card
    Given the user is on the UrbanLadder Homepage
    Then the user should be redirected to the GiftCard page after clicking the GiftCards button
    And the user have to choose Bithday/Anniversary button
    And the user should select git amound and the delivery date
    And the user have to fill the sender details
    And the user have to fill the receiver details
    When the user enters invalid email, error should be saved in excel
    And the user should enter Recipients_correct email
    And the user enters invalid To_email, error should be saved in excel
    And the user should enter To_correct email
    Then clicks the confirm button

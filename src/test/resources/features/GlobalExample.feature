Feature: Make buying of articles
  As a new client
  I want to login to the page www.abc.com
  To buy an article

  Scenario: Add articles to the buying car
    Given a new client login to the buying car
    When he adds 3 ammount of Mascara de respirador of belleza y salud to the car
    Then the product added should be displayed on the buying car

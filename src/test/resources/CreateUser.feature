Feature: Users

  Scenario: I want to create a new user

    Given the user has authentication to todo.ly
    When the user send POST request 'api/user.json' with json and BASIC authentication

    """
    {
        "Email": "boris0.0.0@gmail.com",
        "FullName": "Boris Perez",
        "Password": "Password"
    }
    """
    Then the user expected the response code 200

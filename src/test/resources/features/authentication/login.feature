Feature:  Login

  Rule: The user can be log in the app by using valid credential

      Example: Using valid credential
        Given Colin is on the login page
        When Colin logs in with valid account
        Then he should be presented with the product page
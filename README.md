# barcaShopPlayWright

Simple Playwright test suite on basic user account creation, product addition to cart/checkout (checkout isn't implemented). The test suite captures screenshots at the end of test case run (for logging purposes).


#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

 4. JUnit5 5.1x
    
 5. Playwright 1.55

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE (or mvn test in-terminal)

## Test Case List

//user navigation to register page test

1.	// Test 001 -> navigate to register page test

//valid user account creation test

1.	// Test 002 -> valid user account creation test

//invalid user account creation tests

//no singular input

1.	// Test 002a -> invalid user account creation test - no display name
2.	// Test 002b -> invalid user account creation test - no email
3.	// Test 002c -> invalid user account creation test - no password/confirm password

//too short singular input

1.	// Test 002d -> invalid user account creation test - too short display name (3 chars) (the user account was created, test has failed)
2.	// Test 002e -> invalid user account creation test - too short email (1 char -> name, domain) (the user account was created, test has failed)
3.	// Test 002f -> invalid user account creation test - too short password/confirm password (5 chars)

//too long singular input

1.	// Test 002g -> invalid user account creation test - too long display name (201 chars) (the user account was created, test has failed)
2.	// Test 002h -> invalid user account creation test - too long email (100 chars -> name, domain)
3.	// Test 002i -> invalid user account creation test - too long password/confirm password (21 chars) (the user account was created, test has failed)

//invalid singular input format

1.	// Test 002j -> invalid user account creation test - invalid display name input format (special symbols only) (the user account was created, test has failed)
2.	// Test 002k -> invalid user account creation test - invalid email input format (missing '@')
3.	// Test 002l -> invalid user account creation test - existing email (used beforehand in manual testing)
4.	// Test 002m -> invalid user account creation test - mismatching confirm password

//valid user login test

1.	// Test 003 -> valid user login test

//invalid user login tests

//no singular input

1.	// Test 003a -> invalid user login test - no login email
2.	// Test 003b -> invalid user login test - no login password

//invalid singular input

1.	// Test 003c -> invalid user login test - invalid login email
2.	// Test 003d -> invalid user login test - invalid login email format (missing '@')
3.	// Test 003e -> invalid user login test - invalid login password

//valid user logout test

1.	// Test 004 -> valid user logout test

//add single shop dashboard product to shopping cart modal tests

1.	// Test 005 -> add single shop dashboard product ("Xavi Hernandez") to shopping cart modal test (as a guest)
2.	// Test 005a -> add single shop dashboard product ("Jules Kound") to shopping cart modal test (as a registered user)

//add multiple shop dashboard products to shopping cart modal tests

1.	// Test 005b -> add multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") to shopping cart modal test (as a guest)
2.	// Test 005c -> add multiple shop dashboard products ("Robert Lewandowski", "Marc-André ter Stegen", "Inaki Pena", "Ikay Gundogan") to shopping cart modal test (as a registered user)

//remove product(s) from shopping cart modal tests (since the registered user will have the same output, only guest branch is tested to avoid redundancy)

1.	// Test 006 -> remove single product ("Xavi Hernandez") from shopping cart modal test (as a guest)
2.	// Test 006a -> remove multiple products ("Xavi Hernandez", "Oscar Hernandez") from shopping cart modal test (as a guest)

//single shop dashboard product checkout tests (since the checkout feature isn't implemented, other functionalities are being tested)

1.	// Test 007 -> single shop dashboard product ("Xavi Hernandez") checkout test (as a guest)
2.	// Test 007a -> single shop dashboard product ("Jules Kound") checkout test (as a registered user)

//multiple shop dashboard products checkout tests

1.	// Test 007b -> multiple shop dashboard products ("Xavi Hernandez", "Oscar Hernandez", "Marcos Alonso", "Ferran Torres") checkout test (as a guest)
2.	// Test 007c -> multiple shop dashboard products ("Robert Lewandowski", "Marc-André ter Stegen", "Inaki Pena", "Ikay Gundogan") checkout test (as a registered user)

//update product quantity in checkout test

1.	// Test 008 -> update single shop dashboard product ("Xavi Hernandez") quantity in checkout page test (as a guest)

//remove product quantity from checkout test

1.	// Test 009 -> remove single shop dashboard product ("Xavi Hernandez") quantity from checkout page test (as a guest)
2.	// Test 009a -> remove multiple set shop dashboard products ("Xavi Hernandez", "Oscar Hernandez") from checkout test (as a guest)

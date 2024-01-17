# Calculator-in-Java

# Calculator Program

This Java program provides a calculator with various functionalities including basic arithmetic operations and statistical calculations on arrays.

## Files

1. **Main.java**
   - Contains the main method to run the calculator program.
   - Displays a menu to the user and calls appropriate methods from the Calculator class based on user input.

2. **Calculator.java**
   - Defines the Calculator class containing methods for different arithmetic and statistical operations.

3. **UserInput.java**
   - Defines the UserInput class containing methods for user input.

## Main.java

### `main` Method
- Entry point of the program.
- Welcomes the user and initializes objects of the UserInput and Calculator classes.
- Displays a menu to the user and processes user input to perform corresponding operations.

### `menuDisplay` Method
- Displays the calculator menu with options from 1 to 10.

## Calculator.java

### Arithmetic Methods
1. **`addition` Method**
   - Performs addition of two numbers provided by the user.

2. **`subtraction` Method**
   - Performs subtraction of two numbers provided by the user.

3. **`multiplication` Method**
   - Performs multiplication of two numbers provided by the user.

4. **`division` Method**
   - Performs division of two numbers provided by the user. Checks for division by zero.

### Statistical Methods
5. **`sumOfArray` Method**
   - Calculates the sum of elements in an array provided by the user.

6. **`meanOfArray` Method**
   - Calculates the mean (average) of elements in an array provided by the user.

7. **`modeOfArray` Method**
   - Calculates the mode of elements in an array provided by the user.

8. **`medianOfArray` Method**
   - Calculates the median of elements in an array provided by the user.

9. **`varianceOfArray` Method**
   - Calculates the variance of elements in an array provided by the user.

10. **`stdOfArray` Method**
    - Calculates the standard deviation of elements in an array provided by the user.

## UserInput.java

### `choice` Method
- Takes user input for the choice of operation (1-10) from the menu.

### `inputNumbers` Method
- Takes user input for two numbers and returns them as an array.

### `inputArray` Method
- Takes user input for the size and elements of an array and returns the array.


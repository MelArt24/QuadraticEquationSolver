# QuadraticEquationSolver
Software development methodologies and technologies Lab1

## Application Description
This application solves quadratic equations of the form:
a * x^2 + b * x + c = 0

The program allows the user to enter the coefficients `a`, `b`, `c` in interactive mode or load them from a text file in non-interactive mode. Depending on the value of the discriminant of the equation, the program will output two, one or zero roots.

## Instructions on how to assemble and launch the project

### Project assembly

1. Install Kotlin on your computer if you haven't already did it. You can do this by downloading kotlin-compiler-2.0.21.zip in [this repository](https://github.com/JetBrains/kotlin/releases/tag/v2.0.21).
2. Open a terminal in your project directory.
3. Use the following command to compile the Kotlin code and create a JAR file:
   ```bash
   kotlinc Main.kt -include-runtime -d Main.jar

4. I created a solver.bat file so that you can run the project in terminal without file:
    ```bash
   ./solver
5.  or with file:
    ```bash
    ./solver test.txt
    
6. Or you can just press Shift + F 10 to run the project in interactive mode.

## File format description for non-interactive mode

The file for non-interactive mode should contain three coefficients (a, b, c) separated by spaces. For example:
`1 3 2`

## Indication of revert-commit

A revert commit was performed in this project to undo some changes to the files. The commit with hash `6c576e17adb52a55e556cc347e662006cfd986ea` was reverted, which made changes to Main.kt.

[reverted commit](https://github.com/MelArt24/QuadraticEquationSolver/commit/8bc957265d7ce50d8e9b847049795b8beddf56dc)

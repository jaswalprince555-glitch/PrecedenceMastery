# Precedence Mastery
~~~
A Java program designed to demonstrate how the compiler evaluates mathematical expressions, operator precedence rules, string concatenation, and variable assignment associativity. 

## Purpose of the Code

This program breaks down complex precedence rules into four clear steps, showing exactly how Java processes equations when operator rules conflict. It moves past basic math to prove how the compiler handles left-to-right execution, right-to-left assignment, and parenthesis overrides.

## How It Works (Step-by-Step Breakdown)

Based on the operations in the code, here is exactly how the program evaluates each scenario:

1. **Equal Precedence (Left-to-Right):** 
   The program evaluates `20 % 3 * 5 / 2`. Since modulo (`%`), multiplication (`*`), and division (`/`) share the same precedence, the compiler solves it strictly left-to-right:
   * Step 1: `20 % 3 = 2`
   * Step 2: `2 * 5 = 10`
   * Step 3: `10 / 2 = 5`
2. **Division vs Multiplication:** 
   The program evaluates `50 / 5 * 2`. It proves that division and multiplication are treated equally and processed left-to-right (evaluating to `20`), rather than prioritizing multiplication first.
3. **String Concatenation vs. Addition:** 
   * First, it prints a string added to numbers: `"value.is: " + 10 + 20`. Because it reads left-to-right, the numbers are treated as text, resulting in `1020`.
   * Second, it uses parentheses: `"value.is: " + (10 + 20)`. The parentheses force the math to evaluate first, resulting in `30`.
4. **Right-to-Left Assignment & Mathematical Precedence:** 
   The program declares three variables (`x, y, z`) and uses a chained assignment: `x = y = z = 100 - 50 * 2`. 
   * Step 1: Multiplication is evaluated first (`50 * 2 = 100`).
   * Step 2: Subtraction is evaluated next (`100 - 100 = 0`).
   * Step 3: The result `0` is assigned right-to-left to `z`, then `y`, then `x`. 
   * Finally, it calculates `(x + y + z)` inside the print statement, which equals `0`.
~~~

Expected Output After Running
~~~
result 1 :5
result2 :20
value.is: 1020
value.is: 30
add x + y + z :0
~~~


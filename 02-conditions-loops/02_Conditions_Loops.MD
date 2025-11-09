# Java Control Flow: Conditions and Loops

Control flow in Java manages the order in which statements are executed in a program. There are two main parts: **conditional statements** (for decision making) and **loops** (for repeating actions).

## 1. Conditional Statements

Conditional constructs allow programs to make choices based on boolean conditions. The most common are `if`, `else if`, `else`, and `switch`.

### if / else if / else

Basic branching with if and else:

```java
if (condition) {
    // executed if condition is true
} else if (anotherCondition) {
    // executed if previous was false, this is true
} else {
    // executed if all above are false
}
```

**Example:**

```java
int age = 18;
if (age >= 18) {
    System.out.println("You are an adult");
} else {
    System.out.println("You are not an adult");
}
```

### Comparison and Logical Operators

- `==` equal,
- `!=` not equal,
- `>` greater than,
- `<` less than,
- `>=` greater or equal,
- `<=` less or equal
- `&&` (AND), `||` (OR), `!` (NOT)

### switch Statement

Used for multi-way branching, great for selecting between several exact values:

```java
switch(variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no cases match
}
```

**Example:**

```java
int day = 3;
switch(day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
}
```

**Use `break` to prevent fall-through!** The `default` block is optional but recommended.

### Ternary Operator

A shortcut for simple if/else:

```java
int score = 75;
String result = (score >= 60) ? "Pass" : "Fail";
System.out.println(result); // Outputs: Pass
```

## 2. Loops

Loops are used to repeat code multiple times. Java supports three main types: `for`, `while`, and `do-while`.

### for Loop

Best when you know how many times to iterate:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
*Prints numbers 0 through 4.*

### while Loop

Use when the number of repetitions isn't known ahead of time. Checks condition before each loop:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### do-while Loop

Like while, but always runs the loop body at least once (condition is checked after running):

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

### for-each Loop

Best for going through arrays or collections:

```java
int[] nums = {1, 2, 3, 4, 5};
for (int num : nums) {
    System.out.println(num);
}
```

## 3. Loop Control: break and continue

- `break` exits the loop immediately.
- `continue` skips the current iteration and moves to the next.

**Examples:**

```java
// break example
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Loop stops when i == 5
    }
    System.out.println(i); // Prints 1–4
}

// continue example
for (int i = 1; i <= 5; i++) {
    if (i % 2 == 0) {
        continue; // Skips even numbers
    }
    System.out.println(i); // Prints only odd numbers: 1, 3, 5
}
```

## 4. Summary Table

| Type           | When to Use                       | Checks Condition        | Runs At Least Once? |
|----------------|-----------------------------------|------------------------|---------------------|
| `for`          | Known number of iterations        | Before loop            | No                  |
| `while`        | Unknown until runtime             | Before loop            | No                  |
| `do-while`     | Unknown, needs at least once run  | After loop body        | Yes                 |
| `for-each`     | Go through arrays/collections     | n/a                    | Yes (per element)   |

## 5. Practical Example

```java
import java.util.Scanner;

public class ControlFlowDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // if-else
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Welcome!");

            // switch
            System.out.println("Choose option: 1 - View, 2 - Edit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("View mode");
                    break;
                case 2:
                    System.out.println("Edit mode");
                    break;
                default:
                    System.out.println("Unknown option");
            }

            // for loop
            System.out.println("Numbers 1 to 5:");
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            // while with break
            int attempts = 0;
            while (true) {
                System.out.print("Enter password (hint: 1234): ");
                int password = scanner.nextInt();
                attempts++;
                if (password == 1234) {
                    System.out.println("Access granted!");
                    break;
                }
                if (attempts >= 3) {
                    System.out.println("Too many attempts");
                    break;
                }
                System.out.println("Wrong password");
            }
        }
        scanner.close();
    }
}
```

***

This covers the essentials: how to use `if`, `switch`, all loop types, and loop control in Java. If you want practice tasks or step-by-step exercises, just tell me![1][3][4]

[1](https://www.codingshuttle.com/blogs/java-flow-control/)
[2](https://www.w3schools.com/java/java_conditions.asp)
[3](https://dev.to/be11amer/control-flow-mastering-conditional-statements-and-loops-188d)
[4](https://labex.io/tutorials/java-java-control-flow-conditionals-and-loops-413751)
[5](https://mrebi.com/en/java/java-control-flow/)
[6](https://www.geeksforgeeks.org/java/loops-in-java/)
[7](https://kotlinlang.org/docs/control-flow.html)
[8](https://aivista.in/tutorials/Jpage6.html)
[9](https://www.mytectra.com/tutorials/core-java/control-statements-if-else-switch-loops)
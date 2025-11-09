void main() {
    // Conditional Statements

    // if / else if / else
    int age = 16;
    if (age < 0) {
        IO.println("Impossible!");
    } else if (age >= 18) {
        IO.println("You are an adult");
    } else {
        IO.println("You are not an adult");
    }

    // switch Statement
    int day = 3;
    switch (day) {
        case 1:
            IO.println("Monday");
            break;
        case 2:
            IO.println("Tuesday");
            break;
        case 3:
            IO.println("Wednesday");
            break;
        default:
            IO.println("Other day");
    }

    // Ternary Operator (shortcut for simple if/else):
    int score = 75;
    String result = (score >= 60) ? "Pass" : "Fail";
    IO.println(result); // Output: Pass

    // Loops: for, while, do-while
    // for Loop : Best when you know how many times to iterate
    for (int i = 0; i < 5; i++) {
        IO.println(i); // Prints numbers 0 through 4
    }

    // while Loop : Use when the number of repetitions isn't know ahead of time
    int i = 0;
    while (i < 5) {
        IO.println(i);
        i++;
    }

    // do-while Loop : like while, but alway runs the loop body at least once
    int k = 0;
    do {
        IO.println(k);
        k++;
    } while (k < 5);

    // for-each Loop : Best for going through arrays or collections:
    int[] nums = {1, 2, 3, 4, 5};
    for (int num : nums) {
        IO.println(num);
    }

    // Loop Control: break and continue
    // break exits the loop immediately
    // continue skips the current iteration and moves to the next
    // break example:
    for (int n = 1; n <= 10; n++) {
        if (n == 5) break;
        IO.println(n); // Prints 1-4
    }
    // continue example:
    for (int l = 1; l <= 5; l++) {
        if (l % 2 == 0) continue;
        IO.println(l); // Prints only odd numbers: 1,3,5
    }

    // Practical Example : "Guess the Number" Game
    Scanner scanner = new Scanner(System.in);
    IO.println("Do you want to play \"Guess the Number\"? [Y]es / [N]o: ");
    String answer = scanner.nextLine().toLowerCase();

    // if-else
    if (Objects.equals(answer, "y") || Objects.equals(answer, "yes")) {
        int attempts = 0;
        int maxNumber = 0;
        int secretNumber = 0;
        int maxAttempts = 5;
        IO.print("Choose difficulty (1 - easy [1-5], 2 - hard [1-20], 3 - extreme [1-100]: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                maxNumber = 5;
                secretNumber = 3;
                break;
            case 2:
                maxNumber = 20;
                secretNumber = 17;
                break;
            case 3:
                maxNumber = 100;
                secretNumber = 74;
                break;
            default:
                IO.println("Unknown option!");
                scanner.close(); return;
        }

        attempts = 0;
        while (attempts < maxAttempts) {
            IO.print("Guess the number from 1 to " + maxNumber + ": ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                IO.println("You won!");
                break;
            } else {
                attempts++;
                if (attempts == maxAttempts) {
                    IO.println("Too many attempts! The number was " + secretNumber);
                } else {
                    IO.println("You have " + (maxAttempts - attempts) + " attempt(s) left!");
                }
            }
        }
    } else {
        IO.println("Okay, you don't wanna play the game...");
    }

    scanner.close();

}

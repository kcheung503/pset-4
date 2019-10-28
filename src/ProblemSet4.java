/**
 * Problem Set 4.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();

        // comment out or uncomment as needed

        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     *
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */

    public void sum() {
     int lowerBound = 1;
     int upperBound = 0;
     int integerSum = 0;

     System.out.println("");
     while (lowerBound > upperBound) {
       System.out.print("Lower bound: ");
       lowerBound = in.nextInt();
       System.out.print("Upper bound: ");
       upperBound = in.nextInt();
     }

     for (int i = lowerBound; i <= upperBound; i++) {
       if (i % 2 == 0) {
         integerSum += i;
       }
     }

     System.out.printf("\n%,d.\n", integerSum);
   }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

    public void reverse() {
      int forwardIntInput;
            System.out.println("");
            do {
              System.out.print("Positive integer: ");
              forwardIntInput = in.nextInt();
            } while (forwardIntInput <= 0);
            String forwardInt = String.valueOf(forwardIntInput);
            String reverseInt = "";
            String addDigit = "";

            for (int i = forwardInt.length(); i > 0; i--) {
              if(i != forwardInt.length()) {
                reverseInt = reverseInt + ", ";
              }
              addDigit = forwardInt.substring(i - 1, i);
              reverseInt = reverseInt + addDigit;
            }
            reverseInt = reverseInt + ".";

            System.out.println("\n" + reverseInt);
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {
      int oddInt;
            int oddIntSum = 0;

            System.out.println("");
            do {
              System.out.print("Positive integer: ");
              oddInt = in.nextInt();
            } while (oddInt <= 0);
            String oddIntString = String.valueOf(oddInt);
            int addInteger;

            for (int i = oddIntString.length(); i > 0; i--) {
              addInteger = Integer.parseInt(oddIntString.substring(i - 1, i));
              if(addInteger % 2 == 1) {
                oddIntSum += addInteger;
              }
            }

        System.out.println("\n" + oddIntSum + ".");
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    public void average() {
        int intListItem = 0;
        int intListTotal = 0;
        int numNonNegativeInt = 0;

        System.out.println("");
        do {
          System.out.print("Non-negative integer: ");
          intListItem = in.nextInt();
          if(intListItem >= 0) {
            intListTotal += intListItem;
            numNonNegativeInt++;
          }
        } while (intListItem >= 0);

        if (numNonNegativeInt > 0) {
          double nonNegativeIntAvg = (double) intListTotal / (double) numNonNegativeInt;
          System.out.printf("\n%,.2f\n", nonNegativeIntAvg, ".");
        } else {
          System.out.println("\nIn order for the program to work, you need to input at least one number to average before entering a negative to end the program.");
          }
      }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {
      int maybePrimeInt;
          boolean isPrime = true;

          System.out.println("");
          do {
            System.out.print("Non-negative integer: ");
            maybePrimeInt = in.nextInt();
          } while (maybePrimeInt < 0);

          String maybePrimeString = String.valueOf(maybePrimeInt);
          for (int i = 2; i <= maybePrimeInt / 2; i++) {

          }
          if (isPrime == true) {
            System.out.println("\nPrime.");
          } else {
            System.out.println("\nNot prime.");
          }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {
      int n = 0;
         System.out.println("");
         while (n <= 0 || n > 92) {
             System.out.print("Positive integer: ");
             n = in.nextInt();
         }

         long base1 = 0;
         long base2 = 1;
         long fibonacci = 0;

         for (int i = 2; i <= n; i++) {
             fibonacci = base1 + base2;
             base1 = base2;
             base2 = fibonacci;
         }

         System.out.println("\n" + base2 + ".");
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {
      int intToFactor = 0;
        System.out.println(" ");
        while (intToFactor <= 0) {
            System.out.print("Positive integer: ");
            intToFactor = in.nextInt();
        }

        String usedFactors = " ";
        int factor1;
        int factor2;
        boolean lineStarted = false;
        double factoringRemainder;

        for (int i = 1; i <= intToFactor; i++) {
          factor1 = i;
          factoringRemainder = (double) intToFactor % (double) factor1;
          factor2 = intToFactor / factor1;
          if (factoringRemainder == 0 && !usedFactors.contains(String.valueOf(" " + factor1 + " ")) && !usedFactors.contains(String.valueOf(" " + factor2 + " "))) {
            usedFactors = usedFactors + factor1 + " " + factor2 + " ";
            if (lineStarted == true) {
              System.out.print(", ");
            } else {
              System.out.println(" ");
            }
            System.out.print(factor1 + ", " + factor2);
            lineStarted = true;
          }
        }
        System.out.print(".");
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {

    }
}

package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //        int count = 6;
            /*
                    while (count != 6) {
                        System.out.println("Count value is " + count);
                        count++;
                    }

                    for (int i = 6; i != 6; i++) {
                        System.out.println("Count value is " + count);
                    }
            */

            /*
                    count = 6;
                    do {
                        System.out.println("Count value was " + count);
                        count++;

                        if (count > 100) {
                            break;
                        }
                    } while (count != 6);
            */

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber((number))) {
                continue;
            }

            System.out.println("Even Numbers " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total Even Numbers Found = " + evenNumbersFound);

        /*
         * Modify the while code above
         * Make it also record the total number of even numbers it has found
         * And break it once 5 is found
         * And at the end, display the total number of even numbers found
         */
    }

    /*
     * Create a method called isEvenNumber that takes a parameter of type int
     * It's purpose is to determine if the argument passed to the method is
     * an even number or not.
     * return true if an even number, otherwise return false;
     */

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

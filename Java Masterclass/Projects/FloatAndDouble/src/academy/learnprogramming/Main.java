package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);

          //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         //////////////////////////////////////////////////////////////////////// *** Directions *** //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // The Challenge:
        // Step 1: Create a variable with the appropriate type to store the number of pounds to be converted in kilograms.
        // Step 2: Calculate the result i.e. the number of number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate  variable.
        // Step 3: Print out the result
        // Hint: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.

          //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         //////////////////////////////////////////////////////////////////////// *** End of Line *** /////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);

//        double pie = 3.1415927d;
//        double anotherNumber = 3_000_000.4_567_890d;
//        System.out.println(pie);
//        System.out.println(anotherNumber);
    }
}

import java.util.Scanner;

public class BubbleSort_RenturaSuliman {

    public static void main(String[] args) {
        Scanner renSul = new Scanner(System.in);
        
        //This section is the main function of the code. 
        do {
            System.out.println("Enter at least 10 strings (minimum 3 characters each):");
            String[] userInput = new String[10];
            
            //This section will get the return value of the input in getInput
            for (int i = 0; i < 10; i++) {
                userInput[i] = getUserInput(renSul);
            }

            bubbleSortAlgorithm(userInput, 0, userInput.length - 1);

            System.out.println("\nSorted Strings (Ascending order of ASCII values):");
            displayUserArray(userInput, 0);
            
        //This part will ask the user if they want to run the program again or not
            System.out.println("\nDo you want to run again? (yes/no)");
        } while (renSul.next().equalsIgnoreCase("yes"));

        System.out.println("Program exited.");
    }
    
    //This section will intercept the user if the user enter an numerical value
    private static String getUserInput(Scanner renSul) {
        
        //Ask the user to input characters
        System.out.print("Enter a string: ");
        String input = renSul.next();
        
        //This will check the user input if it's valid or not. If it's valid it will return the user input.
        String regex = "^[\\p{L}0-9\\s.!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?\\\\|]{3,}$";
        if (!input.matches(regex) || input.length() < 3) {
            System.out.println("Invalid input. Numeric input only is not allowed.");
            return getUserInput(renSul);
        }
        //Return the user's input if they're valid input
        return input;
    }
    
    //This section sorted the strings according to the required sorting algorithm
    private static void bubbleSortAlgorithm(String[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            for (int i = startIndex; i < endIndex; i++) {
                if (totalASCIIValue(array[i]) > totalASCIIValue(array[i + 1])) {
                    // This section swap elements if they are in the wrong order
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

            // This section recursively sort the remaining elements
            bubbleSortAlgorithm(array, startIndex, endIndex - 1);
        }
    }
    
    //This section determine the ASCII value of each String the user inputs
    private static int totalASCIIValue(String str) {
        int totalValue = 0;
        for (char c : str.toCharArray()) {
            totalValue += (int) c;
        }
        return totalValue;
    }
    
    //This section store the user's inputs
    private static void displayUserArray(String[] array, int index) {
        if (index < array.length) {
            System.out.println("String #" + (index + 1) + ": " + array[index]);
            displayUserArray(array, index + 1);
        }
    }
}

//Authors: Suliman, Jufel
//         Rentura, John Lloyd 

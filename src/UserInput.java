import java.util.Scanner;

/**
 * Convenience class for getting input from a user
 */
public class UserInput
{
    /**
     * Gets single word Strings from the user.
     *


     * Usage example:

     *  <code>System.out.print("Enter your first name: ");

     * String firstName = UserInput.getString();
     * </code>
     * <strong>Note: It is important to print a prompt
     * prior to calling this method. The console window
     * must be open already, otherwise the program will
     * hang. Printing a prompt helps ensure this.</strong>
     * @return the first word the user types
     */
    public static String getString() {

        Scanner in = new Scanner(System.in);
        return in.next();

    }
    public static String getLine() {

        Scanner in = new Scanner(System.in);
        return in.nextLine();

    }
    public static double getDouble() {

        Scanner in = new Scanner(System.in);
        return in.nextDouble();

    }
    public static int getInt() {

        Scanner in = new Scanner(System.in);
        return in.nextInt();

    }
    public static boolean getBoolean() {

        Scanner in = new Scanner(System.in);
        return in.nextBoolean();

    }
    public static String getValidInput(String... validInputs)
    {
        String input = "";
        boolean valid = false;
        do
        {
            input = getLine();
            for(String str : validInputs)
            {
                if(input.toLowerCase().equals(str.toLowerCase()))
                    valid = true;
            }
            if(!valid)
                System.out.print("Invalid input. Please try again\n>");
        }
        while(!valid);
        return input;
    }
}
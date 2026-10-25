import java.util.Scanner;
import java.security.SecureRandom;                              

public class PasswordGenerator 
{
    static SecureRandom random = new SecureRandom();
    public static String generatePassword(int length, boolean upper, boolean lower, boolean numbers, boolean symbols) 
    {

        StringBuilder characters = new StringBuilder();

        if (upper)
        characters.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        if (lower)
        characters.append("abcdefghijklmnopqrstuvwxyz");

        if (numbers)
        characters.append("0123456789");

        if (symbols)
        characters.append("!@#$%^&*()-_+=");

        if (characters.length() == 0)
        throw new IllegalArgumentException("Select at least one character type.");

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) 
        {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        boolean again = true;

        while (again) 
        {
            System.out.print("Enter password length (8-64): ");

            if (!sc.hasNextInt()) 
            {
                System.out.println("Please enter a valid integer.");
                sc.nextLine();
                continue;
            }

            int length = sc.nextInt();

            if (length < 8 || length > 64) 
            {
                System.out.println("Password length must be between 8 and 64.");
                continue;
            }

            System.out.print("Include uppercase letters? (true/false): ");
            boolean upper = sc.nextBoolean();

            System.out.print("Include lowercase letters? (true/false): ");
            boolean lower = sc.nextBoolean();

            System.out.print("Include numbers? (true/false): ");
            boolean numbers = sc.nextBoolean();

            System.out.print("Include symbols? (true/false): ");
            boolean symbols = sc.nextBoolean();

            if (!upper && !lower && !numbers && !symbols) 
            {
                System.out.println("Select at least one character type.");
                continue;
            }

            String password = generatePassword(length, upper, lower, numbers, symbols);

            System.out.println("\nGenerated password: " + password);

            System.out.print("\nGenerate another password? (true/false): ");
            again = sc.nextBoolean();

            System.out.println();
        }

        sc.close();
        System.out.println("Thank you for using Password Generator!");
    }
}
import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a switch statement.
*/

public class DaysWeek
{
   public static void main(String args[])
   {
      String input;     // To hold the user's input
      char letter;   // letter that the day starts with

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user for a grade of pet food.
      System.out.println("Select a day of the week. Enter the first letter : M or m for monday, T or t for Tuesday and Thursday, etc.");
      input = keyboard.nextLine();
      letter = input.charAt(0);

      // Display pricing for the selected grade.
      if (letter == 's')
      {
      System.out.println("The days that begin with the letter s are Saturday and Sunday");
      }
      else if (letter == 'S')
      {
      System.out.println("The days that begin with the letter s are Saturday and Sunday");
      }
      else if (letter == 'm')
      {
          System.out.println("The day that begins with the letter m is Monday");
      }
      else if (letter == 'M')
      {
          System.out.println("The day that begins with the letter m is Monday");
      }
      else if (letter == 't')
      {
          System.out.println("The days that begin with the letter t are Tuesday and Thursday");
      }
      else if (letter == 'T')
      {
          System.out.println("The days that begin with the letter T are Tuesday and Thursday");
      }
      else if (letter == 'w')
      {
          System.out.println("The day that begins with the letter w is wednesday");
      }
      else if (letter == 'W')
      { 
          System.out.println("The day that begins with the letter m is Monday");
      }
      else if (letter == 'f')
      {
          System.out.println("The day that begins with the letter f is Friday");
      }
      else if (letter == 'F')
      {
          System.out.println("The day that begins with the letter f is Friday");
      }
      else
      {
          System.out.println("There is no day of the week that starts with that letter");
      }
      
      
      /*switch(letter)
      {
         case 'm':
         case 'M':
            System.out.println("The day that begins with the letter m is monday");
            break;
         case 't':
         case 'T':
            System.out.println("The days that begin with the letter t are Tuesday and Thursday");
            break;
         case 'w':
         case 'W':
            System.out.println("The day that begins with w is Wednesday");
            break;
         case 'f':
         case 'F':
             System.out.println("The day that begins with the letter f is Friday");
             break;
         case 's':
         case 'S':
             System.out.println("The days that begin with the letter s are Saturday and Sunday");
             break;
         default:
            System.out.println("There is no day that begins with that letter");
      }*/
   }
}

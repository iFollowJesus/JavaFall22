//Cesar A. Reyna
//COSC 1430
//Project0
//9/11/2022

/**
 * @com.register ( clsid=DE9ED9F3-9ADD-11D5-BD68-006008C06665, typelib=DE9ED9F2-9ADD-11D5-BD68-006008C06665 )
 */

package one;
public class FirstProgram
{
    public static void main(String[] args)
    {   
    	System.out.println("My name is Cesar A. Reyna ");
        System.out.println("My class is COSC 1430.001 ");
        System.out.println("Project0 ");
        System.out.println("9/11/2022 ");
        System.out.println("Hello out there.");
        System.out.println("Want to talk some more?");
        System.out.println("Answer y for yes or n for no.");

        char answerLetter;
        answerLetter = SavitchIn.readLineNonwhiteChar();
        if (answerLetter == 'y')
               System.out.println("Nice weather we are having.");

        System.out.println("Good-bye.");

        System.out.println("Press enter key to end program.");
        String junk;
        junk = SavitchIn.readLine();
    }
}
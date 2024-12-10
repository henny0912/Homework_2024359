/* Homework for String Methods
 * Student Number: 2024359
 * Name: Egshiglen Enkhbayar
 */

/**
 * in this task, InputUtilitiesV package has been used
 * and new method called askUserForName has been created in the package.
 * Also created another package called NameManipulator and created 3 different
 * ways to manipulate the string (username).
 */
package stringmethodhomework;
//import NameManipulator package
import NameManipulator.NameManipulator;
//import InputUtilitiesV package
import inpututilities.InputUtilitiesV;

/**
 *
 * @author egshi
 */

public class StringMethodHomework {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //property to store username
        String username;
        
        //create an instance of InputUtilitiesv
        InputUtilitiesV myInput = new InputUtilitiesV();
        
        //use askUserForName method from InputUtilitiesV to ask the user for their name
        username = myInput.askUserForName("Please enter your name: ");
        
        //create an instance of NameManipulator
        NameManipulator manipulator = new NameManipulator();
        
        //setName method to set the username
        manipulator.setName(username);
        
        //execute the finals process and show the results on the screen
        manipulator.executeName();
    }
    
}

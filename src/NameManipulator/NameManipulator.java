
package NameManipulator;

/**
 *
 * @author egshi
 */
public class NameManipulator {
   //private property to store username
    private String username;
    
    //public method to set username
    //use "this" as the value of the username property of this particular object
    public void setName (String username){
        this.username = username;
    }
    
    //private method to change username to uppercase
    private String changeToUpperCase(){
        return username.toUpperCase().trim();
    }
    
    //private method to change the position of first letter to the second and the second to first
    private String swapFirstSecondLetters (String input) {
        if (input.length() < 2) {
            //if the username has less than two letters, return the same
            return input;
        }
        
        //otherwise the position of second letter move to first and second to first
        //return input.charAt(1) + input.substring(2, input.length()) + input.charAt(0);
        return input.charAt(1) + "" + input.charAt(0) + input.substring(2);
    }
    
    //private method to remove all vowels from the username
    private String removeVowels(String input) {
        //remove all vowels from the name
        return input.replaceAll("[aeiouAEIOU]+", "");
    }
    
    //public method to execute the name manipulation
    public void executeName(){
        try{
            //execute the name manipulation
            //first step uppercase
            String usernameUpperCase = changeToUpperCase();
            //second step swapping first and second letters
            String usernameSwap = swapFirstSecondLetters(usernameUpperCase);
            //third step removing vowels
            String usernameNoVowels = removeVowels(usernameSwap);

            //show the results on the screen
            System.out.println("Version 1(Original Username): " + username);
            System.out.println("Version 2(Uppercase Username): " + usernameUpperCase);
            System.out.println("Version 3(First and Second letters swapped): " + usernameSwap);
            System.out.println("version 4(Vowels removed): " + usernameNoVowels);
        }catch (Exception e){
            //catch any unexpected exceptions and display the error message
            System.out.println("An error!" + e.getMessage());
        }
    }
    
}

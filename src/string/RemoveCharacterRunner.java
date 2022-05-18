package string;
import java.util.Scanner;

public class RemoveCharacterRunner {
    
    public static void main(String[] args) {
        String stringOne,stringTwo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String one :");
        stringOne = scan.nextLine();
        stringOne=stringOne.toLowerCase();
        
        System.out.print("Enter the String two :");
        stringTwo = scan.nextLine();
        stringTwo=stringTwo.toLowerCase();
   
        scan.close();    
        
        RemoveCharacter removeCharacter = new RemoveCharacter();
        removeCharacter.removeCharacters(stringOne, stringTwo);
        
    
    }

}
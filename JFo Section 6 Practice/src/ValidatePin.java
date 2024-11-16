import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner (System.in);
        
    	int validpin = 1980;
    	
    	 int userPin = 0;
     
     while(userPin != validpin) {
    	  System.out.println("Enter a pin : ");
    	   userPin = sc.nextInt();
     }
     
     System.out.println("The pin is correct : ");
    }
}

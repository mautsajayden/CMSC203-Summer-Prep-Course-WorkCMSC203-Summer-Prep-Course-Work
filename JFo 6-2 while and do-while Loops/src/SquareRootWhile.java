import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();
	
	number = -1;
	
	while(number < 0) {
		System.out.println("Type a num");
		number = console.nextInt();
	}
	
   
    }
    
}

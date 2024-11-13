import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        
    	Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        
    	System.out.println("Enter num ");
    	int n = sc.nextInt();
    	System.out.println("Enter num ");
    	int n2 = sc.nextInt();
    	System.out.println("Enter num ");
    	int n3 = sc.nextInt();
    	
        int sum = n+n2+n3;
        System.out.println(sum);  
        
        //Remember to close the Scanner
        sc.close();
    }
}

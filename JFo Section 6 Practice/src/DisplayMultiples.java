import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Choose a number : ");
    	int num = sc.nextInt();
    	int sum=0;
    	
    	for(int i =1; i <=12; i++) {
    		sum = num * i;
    		System.out.println(num + " x " + i + " = " + sum);
    	}
    }

}

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	int num =-1;
    	int sum = 0;
    	
    	for(int i =0; i < 10; i++) {
    		if(num == 0) {
    			break;
    		}
    		else 
    		{
    			System.out.println("Enter a number : ");
            	num = sc.nextInt();
            	sum +=num; 
    		}
    	}
    	
    	
    	

    }
}

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
    	//byte name = 128;
    	
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte

    	short num = 128;
    	System.out.println((byte)num);
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again

        byte value = 127;
        value +=1; 
        System.out.println(value);
        value+=1;
        System.out.println(value);
        
        
    }    
}

import javax.swing.JOptionPane; 

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
    	
    	//javax.swing.JOptionPane.showMessageDialog(null, "Hello ");
        
        String name = JOptionPane.showInputDialog("What is your name ");
        
        //Parse the input as an int.
        //Print its value +1
        
        int num = Integer.parseInt(name);
        num+=1;
        System.out.println(num);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}

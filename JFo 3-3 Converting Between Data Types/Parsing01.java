public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        String shirtprice = "15";
        String taxRate = "0.05";
       String gibberish = "887ds7nds87dsfs";
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        int total = (int)(Integer.parseInt(shirtprice) * Double.parseDouble(taxRate));
     
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
       int gib = Integer.parseInt(gibberish);
        
        System.out.println(total + " "  );
    }
    
}

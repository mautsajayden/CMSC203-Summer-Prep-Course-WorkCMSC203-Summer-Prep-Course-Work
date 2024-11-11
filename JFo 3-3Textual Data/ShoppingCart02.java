public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        
        double price = 0.0;
        double tax = 0.0;
        int quantity = 0;
        
        // Declare and assign a calculated totalPrice
         quantity = 2;
         tax = .10;
         price = 15;
        
         double total = (price * quantity) * tax;
        // Modify message to include quantity 
        
         message += (total);
         
        System.out.println(message);
        
        // Print another message with the total cost
        
    }    
}

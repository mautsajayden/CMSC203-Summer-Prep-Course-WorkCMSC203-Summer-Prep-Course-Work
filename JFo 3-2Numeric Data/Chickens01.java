public class Chickens01 {
    public static void main(String[] args) {
      
    	
        int eggsPerChicken = 5;
        int chickenCount = 3;
        
       
        int mondayEggs = eggsPerChicken * chickenCount;
        
       
        chickenCount += 1; 
        int tuesdayEggs = eggsPerChicken * chickenCount;
        
      
        chickenCount /= 2; 
        int wednesdayEggs = eggsPerChicken * chickenCount;
        
      
        int totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        System.out.println("Total eggs collected for scenario 1: " + totalEggs);
        
        
        eggsPerChicken = 4;
        chickenCount = 8;
        
            mondayEggs = eggsPerChicken * chickenCount;
        
       
        chickenCount += 1; 
        tuesdayEggs = eggsPerChicken * chickenCount;
       
        chickenCount /= 2; 
        wednesdayEggs = eggsPerChicken * chickenCount;
        
       
        totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        System.out.println("Total eggs collected for scenario 2: " + totalEggs);
    }
}

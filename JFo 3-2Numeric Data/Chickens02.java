public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here

    	
    	int mon = 100;
    	int tue = 121;
    	int wed = 117;
    	
    	int totEggs = mon + tue + wed;
   
    	int dailyAverage = totEggs/ 3;
    	int monthlyAverage = (totEggs * (30/3));
    	double  monthlyProfit =(double)(monthlyAverage) * .18;
    	
    	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}

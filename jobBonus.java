public class jobBonus {
    public static void main (String [] args) {

        int perforanceRating = 70; 
        int yearsExperience = 3;
        int bonus = 0;
        
        if (perforanceRating >= 90 ) {
            bonus = 10000; 
        }

        else if (perforanceRating >= 70 && perforanceRating <=89){
            bonus = 5000; 
        }

        else if (perforanceRating >= 50 && perforanceRating <=69){
            bonus = 2500; 
        }

        else if (yearsExperience >= 2) {
            bonus = bonus /2;
            
        }

        System.out.println("The Employee's Bonus is: PhP " + bonus);
    }
    
    
}
package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        int x = 47;
        int y = 78;
        if (y > x){
            System.out.println("y is greater than x ");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        int social_hours = 5;
        if (social_hours > 8){
            System.out.println("Time to have personal space.");
        } else {
            System.out.println("Alright let's talk then.");
        }

        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        int speed = 67;
        if (speed > 80){
            System.out.println("You've exceeded the speed limit!");
        } 
        else if (speed < 80) {
            System.out.println("Your speed is looking good.");
        } 
        else {
            System.out.println("Do you want to turn up the radio?");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        String weather = "Sunny" ;
        String forecast = "Cloudy" ;
        if ( weather == "Sunny" ){
            System.out.println("It's a good day to be outside.");
        } 
        if ( forecast == "Cloudy" ){
            System.out.println("It may get a bit cold outside so bring  your coat.");
        } 

        else {
            System.out.println("The weather station got it wrong again!");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        int temp = 88;
        boolean Sunny = true; 
        
        if (temp > 70 && Sunny){
            System.out.println("The weather is great today lets do something fun !");
        

        }

        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        int work_hours = 3;
        boolean break_time = true; 
        
        if (work_hours > 4 || break_time){
            System.out.println("It's time to take a 30 minute break from work.");
        

        }
    }
}

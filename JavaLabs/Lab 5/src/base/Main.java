package base;

public class Main {
    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     *
     * We're gonna look at the first hour where we have 15 customers!
     *
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     *
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     *
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     *
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static double cash = 1500.0;
    static double tips = 0.0;


    public static void main(String[] args) {
        int [] lemonadeList = {1,3,2,6,4,8,1,7,3,2};
        int [] pretzelList ={4,2,3,1,2,10,6,1,2,6,9};
        int [] cashList= {8,8,4,24,6,2,16,48,32,4,20,64,12,8,2,56,4,12,24,18,16};
        int [] tipList = {4,10,5,4,10,4,3};
        System.out.println(totalCash(cashList));
        System.out.println(totalTip(tipList));
        System.out.println(pretzellStand(pretzelList));
        int pretzelsAvailable = 60 - pretzellStand(pretzelList);
        System.out.println(pretzelsAvailable);
        System.out.println(lemonadeStand(lemonadeList));
        int lemonadeAvailable = 43 - lemonadeStand(lemonadeList);
        System.out.println(lemonadeAvailable);
        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonadeAvailable);
        System.out.println("Pretzels Inventory: " + pretzelsAvailable);
        System.out.println("Cash: " + totalCash(cashList));
        System.out.println("Tips: " + totalTip(tipList));

        wet_inventory();
        
       

    }

    //static void  dry_inventory() {
    public static int pretzellStand(int[] pretzelList ){
            int sum = 0;
            int i;
            for (i = 0; i < pretzelList.length; i++) {
                sum += pretzelList[i];
        
    
            }
            return sum;

        }
    
    
    public static int lemonadeStand(int [] lemonadeList ){
            int add = 0;
            int i;
            for (i=0; i < lemonadeList.length; i++) {
                add += lemonadeList[i];
            }
            return add;
    
        }
    public static int totalCash(int []cashList){
            int count = 0;
            int i;
            for (i=0; i < cashList.length; i++) {
                count += cashList[i];
            }
            return count;
        }
    
    public static int totalTip(int [] tipList){
            int value = 0;
            int i;
            for (i=0; i < tipList.length; i++) {
                value += tipList[i];
            }
        
        return value;
        }

    
    
        
    
    
    
    
        
    

    static void wet_inventory() {
        /**
         * We have 10 customers in the first hour! This is what they bought! When running this with your dry code you
         * don't want to run this function because then the numbers in the end will be wrong!
         */
        //Customer 1
        pretzels_available -= 4;
        cash += 8;
        lemonades_available -= 1;
        cash += 8;
        tips += 4;

        //Customer 2
        pretzels_available -= 2;
        cash += 4;
        lemonades_available -= 3;
        cash += 24;

        //Customer 3
        pretzels_available -= 3;
        cash += 6;

        //Customer 4
        pretzels_available -= 1;
        cash += 2;
        lemonades_available -= 2;
        cash += 16;

        //Customer 5
        lemonades_available -= 6;
        cash += 48;
        tips += 10;

        //Customer 6
        lemonades_available -= 4;
        cash += 32;
        tips += 5;

        //Customer 7
        pretzels_available -= 2;
        cash += 4;

        //Customer 8
        pretzels_available -= 10;
        cash += 20;
        lemonades_available -= 8;
        cash += 64;
        tips += 10;


        //Customer 9
        pretzels_available -= 6;
        cash += 12;

        //Customer 10
        lemonades_available -= 1;
        cash += 8;

        //Customer 11
        pretzels_available -= 1;
        cash += 2;

        //Customer 12
        lemonades_available -= 7;
        cash += 56;
        tips += 4;

        //Customer 13
        pretzels_available -= 2;
        cash += 4;

        //Customer 14
        pretzels_available -= 6;
        cash += 12;
        lemonades_available -= 3;
        cash += 24;

        //Customer 15
        pretzels_available -= 9;
        cash += 18;
        lemonades_available -= 2;
        cash += 16;
        tips += 3;

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }
}

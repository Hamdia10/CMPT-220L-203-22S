package base;

public class Plant {
    boolean needsWatering;
    String plantFamily;
    double height;
    String Name;
    
    
   
    public Plant (boolean needsWatering, String plantFamily, double height, String Name){
        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
        this.height = height;
        this.Name= Name;

        
        sunlightRequirements();
        wateringinstructions();
    
    
    }
    public static void wateringinstructions(){
        int hours = 12;
        if (hours == 12)
        {
            System.out.println("It is time to water the plants in the garden");
            
        }
      
    }
    public static void sunlightRequirements(){
        
      String sunlight = "Throughout the day";
      if(sunlight == "Throughout the day")
      {
          System.out.println("Oak trees and rosebushes need sunlight" + sunlight);


       }
    
       

    }
    






    
  }

package base;

public class Plant {
    boolean needsWatering;
    String plantFamily;
    double height;
    String plantName;
    double waterlevel;
    
    
   
    public Plant (boolean needsWatering, String plantFamily, double height, String plantName, double waterlevel){
        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
        this.height = height;
        this.plantName= plantName;
        this.waterlevel = waterlevel;

        
        sunlightRequirements();
        wateringinstructions();
    
    
    }
    public  void wateringinstructions(){
        
        if ( waterlevel < 56)
        {
            System.out.println("It is time to water the plants in the garden because the water level is" + waterlevel );
            
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

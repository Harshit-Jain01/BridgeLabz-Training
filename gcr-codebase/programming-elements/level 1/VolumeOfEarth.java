class VolumeOfEarth{
    public static void main(String []args){
          // declaring the radius of earth
	  int earthRadius=6378;
	  // calculating the volume of Earth in Km and miles
 	  double volOfEarthInKm=(4/3)*Math.PI*Math.pow(earthRadius,3);
	  double volOfEarthInMiles=volOfEarthInKm*0.621371;
          // displaying the volume of earth 
	  System.out.println("The volume of earth in cubic kilometers is "+volOfEarthInKm+" and cubic miles is "+volOfEarthInMiles);
    }
}

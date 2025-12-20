import java.util.*;
class SpringSeason{

  //creating method to find whether Its a Spring Season 
   public  boolean checkSpringSeason(int month,int day){
    if(day<=0 ||month<3 || month>6 || (month==3 && (day<20 || day>31) ) || (month==6 && day>20) ||(month==4 && day>30)||(month==5 && day>31))
	return false;
	return true;
   }
   
   public static void main(String []args){
   
     //taking input for month and day from command line argument
	  int month=Integer.parseInt(args[0]);
	  int day=Integer.parseInt(args[0]);
	  
	  //creating object of class
	  SpringSeason object=new SpringSeason();
	  boolean result=object.checkSpringSeason(month,day);
	  
	  //displaying season
	  if(result)
	  System.out.println("Its a Spring Season");
	  else 
	  System.out.println("Its not a Spring Season");
	  
	  }
   }
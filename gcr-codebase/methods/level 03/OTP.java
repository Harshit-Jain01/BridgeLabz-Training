import java.util.*;

class OTP{

	//generate a six-digit OTP number 
	public static int generateOtp(){
		
		int otp=(int)(Math.random()*900000)+100000;
		return otp;
	}
	
	//to check if all otp are unique
	public static boolean isUniqueOtp(int []otp){
		
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<10;i++)
		set.add(otp[i]);
		
		return set.size()==otp.length;
	}
	
	  public static void main(String[] args){
		
		int []arr=new int[10];
		System.out.println("Otp are:");
		for(int i=0;i<10;i++)
		arr[i]=generateOtp();
		
		//display otp
		for(int i=0;i<10;i++)
		System.out.println(arr[i]);
		
		//checking if uniue
		System.out.println(isUniqueOtp(arr)?"All otp unique":"All otp not unique");
		
		}
	}
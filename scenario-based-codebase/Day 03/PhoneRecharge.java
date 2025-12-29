import java.util.*;

class PhoneRecharge{
	
	public static void main(String []args){
	
	Scanner kb=new Scanner(System.in);
	
	//storing sim name
	String []sim={"Airtel","BSNL","Jio","VI"};
	
	
	
	String choice="Y";
	int bal=0;
	int amt=0;
	
	//taking recharge amount
	while(choice.equals("Y")){
	System.out.println("Enter sim name\nAirtel\nBSNL\nJio\nVI");
	String name=kb.next();
	switch(name){
	case "Airtel": case "airtel":
	System.out.println("Recharge Available\n199\n300\n666\n999");
	System.out.println("Enter recharge amount");
	amt=kb.nextInt();
	bal+=amt;
	System.out.println("Total balance "+bal);
	break;
	case "Jio":case "jio":
	System.out.println("Recharge Available\n159\n212\n656\n799");
	System.out.println("Enter recharge amount");
	 amt=kb.nextInt();
	bal+=amt;
	System.out.println("Total balance "+bal);
	break;
	case "VI":case "vi":
	System.out.println("Recharge Available\n179\n310\n555\n599");
	System.out.println("Enter recharge amount");
	amt=kb.nextInt();
	bal+=amt;
	System.out.println("Total balance "+bal);
	break;
	case "Bsnl": case "bsnl":
	System.out.println("Recharge Available\n99\n210\n450\n699");
	System.out.println("Enter recharge amount");
	 amt=kb.nextInt();
	bal+=amt;
	System.out.println("Total balance "+bal);
	break;
	}
	System.out.println("Do you want to recharge again(Y/N)");
	choice=kb.next();
	}
	
	kb.close();
	}


}
	
	
	
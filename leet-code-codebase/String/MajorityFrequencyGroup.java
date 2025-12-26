import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class MajorityFrequencyGroup{
	
	// method to find majority frequency group
    public static String majorityFrequencyGroup(String s) {

        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Integer> list=new ArrayList<Integer>();
        for(Map.Entry<Character,Integer> p:map.entrySet()){
            list.add(p.getValue());
        }

        Collections.sort(list);
        int m=0,k=list.get(0),c=1,ans=0;
        for(int i=1;i<list.size();i++){
            if(k==list.get(i)){
                c++;
            }
            else{
                if(c>=m){
                    m=c;
                    ans=k;
                }
                k=list.get(i);
                c=1;
            }
        }
        if(c>=m){
            m=c;
            ans=k;
        }
        StringBuilder h=new StringBuilder("");
        for(Map.Entry<Character,Integer> p:map.entrySet()){
            if(p.getValue()==ans)
                h.append(p.getKey());
        }
        return h.toString();
    }

    public static void main(String[] args){
		
		//take input string
        Scanner input=new Scanner(System.in);
        System.out.println("Enter string");
        String s=input.nextLine();

        System.out.println(majorityFrequencyGroup(s));

        input.close();
    }
}

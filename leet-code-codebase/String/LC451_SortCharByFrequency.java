import java.util.*;
class LC451_SortCharByFrequency{
    public static String frequencySort(String s){
        Map<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        PriorityQueue<Map.Entry<Character,Integer>> pq=
            new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> e=pq.poll();
            for(int i=0;i<e.getValue();i++)
                sb.append(e.getKey());
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
        String s=sc.nextLine();
        System.out.print(frequencySort(s));
        sc.close();
    }
}

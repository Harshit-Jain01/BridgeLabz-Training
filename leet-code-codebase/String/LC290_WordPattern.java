import java.util.*;

class LC290_WordPattern{

    public static boolean wordPattern(String pattern, String s) {
	
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) return false;

        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        boolean[] flag = new boolean[26];

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!flag[c - 'a'] && set.contains(arr[i])) {
                map.put(c, arr[i]);
                flag[c - 'a'] = true;
                set.remove(arr[i]);
            }
        }

        for (int j = 0; j < pattern.length(); j++) {
            char c = pattern.charAt(j);
            if (!map.containsKey(c) || !map.get(c).equals(arr[j])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pattern:");
        String pattern = sc.nextLine();

        System.out.println("Enter string:");
        String s = sc.nextLine();

        System.out.println(wordPattern(pattern, s));

        sc.close();
    }
}

import java.util.*;
class LC482_LicenseKeyFormatting{
    public static String licenseKeyFormatting(String s,int k){
        StringBuilder sb=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!='-')
                sb.append(s.charAt(i));
        s=sb.toString();
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
            j++;
            if(j%k==0 && i!=0)
                ans.append('-');
        }
        return ans.reverse().toString().toUpperCase();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter license key string: ");
        String s=sc.nextLine();
        System.out.print("Enter group size k: ");
        int k=sc.nextInt();
        System.out.print(licenseKeyFormatting(s,k));
        sc.close();
    }
}

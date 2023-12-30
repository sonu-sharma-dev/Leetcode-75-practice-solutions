public class Solution2 {
        public String gcdOfStrings(String str1, String str2) {
            if(!(str1+str2).equals(str2+str1))
                return "";
            int a=str1.length();
            int b=str2.length();
            int gcd;
            if(a>b){
                gcd=gcd(a,b);
            }else
            {
                gcd=gcd(b,a);
            }
            return str1.substring(0,gcd);
        }
        public  int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

    public static void main(String[] args) {
        Solution2 s2=new Solution2();
        System.out.println(s2.gcdOfStrings("ABAS","AB"));
    }
    }

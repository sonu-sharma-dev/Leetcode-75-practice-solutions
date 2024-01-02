public class Solution5 {
        public String reverseVowels(String s) {
            int i = 0;
            int n = s.length() - 1;
            char[] ch = s.toCharArray();

            while (i < n) {
                if (!isVowel(ch[i])) {
                    i++;
                } else if (!isVowel(ch[n])) {
                    n--;
                } else {
                    char temp = ch[i];
                    ch[i] = ch[n];
                    ch[n] = temp;
                    i++;
                    n--;
                }
            }
            return String.valueOf(ch);
        }
        public boolean isVowel(char ch) {
            ch = Character.toUpperCase(ch);
            return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        }

    public static void main(String[] args) {
        Solution5 s=new Solution5();
        s.reverseVowels("hellO");
    }

}

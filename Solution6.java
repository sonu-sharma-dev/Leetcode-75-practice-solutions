public class Solution6 {
    public static void main(String[] args) {
        Solution6 s1=new Solution6();
        System.out.println(s1.reverseWords("  Wonderful Am  I"));
    }

        public String reverseWords(String s) {
            String result = "";
            int i = 0;
            int n = s.length();
            char ch[] = s.toCharArray();

            while (i < n) {
                while (i < n && ch[i] == ' ')
                    i++;
                if (i >= n) break;
                int j = i + 1;
                while (j < n && ch[j] != ' ')
                    j++;

                // Fix: Corrected the length parameter in the String constructor
                String sub = new String(ch, i, j - i);

                if (result.length() == 0)
                    result = sub;
                else
                    result = sub + " " + result;

                i = j + 1;
            }
            return result;
        }

}

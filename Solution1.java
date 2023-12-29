public class Solution1 {
        public String mergeAlternately(String word1, String word2) {
            String merge = "";
            char[] charArrayStr = word1.toCharArray();
            char[] charArrayStr2 = word2.toCharArray();
            int totalLength = word1.length() + word2.length();

            if(word1.length() == word2.length()){

                for(int i = 0; i< word1.length(); i++){

                    merge += charArrayStr[i]; //a
                    merge += charArrayStr2[i]; // ap
                }
            }
            else if(word1.length() > word2.length()){

                for(int i = 0; i< word1.length(); i++){

                    merge += charArrayStr[i];
                    if(i < word2.length())
                        merge += charArrayStr2[i];
                }
            }
            else{
                for(int i = 0; i< word2.length(); i++){

                    if(i < word1.length())
                        merge += charArrayStr[i];

                    merge += charArrayStr2[i];
                }
            }


            return merge;
        }

    public static void main(String[] args) {
        Solution1 s=new Solution1();
        System.out.println(s.mergeAlternately("abcd","efg"));

    }
}



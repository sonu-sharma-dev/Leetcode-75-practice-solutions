public class Solution9 {
        public int compress(char[] chars) {
            if (chars == null || chars.length == 0) {
                return 0;
            }

            int writeIdx = 0;  // index to write the compressed characters
            int count = 1;     // count of consecutive repeating characters

            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == chars[i - 1]) {
                    count++;
                } else {
                    chars[writeIdx++] = chars[i - 1];

                    if (count > 1) {
                        char[] countChars = String.valueOf(count).toCharArray();
                        for (char c : countChars) {
                            chars[writeIdx++] = c;
                        }
                    }

                    count = 1;
                }
            }

            chars[writeIdx++] = chars[chars.length - 1];

            if (count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                for (char c : countChars) {
                    chars[writeIdx++] = c;
                }
            }

            return writeIdx;

        }

}

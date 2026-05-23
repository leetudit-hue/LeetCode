class Solution {
    public int compress(char[] chars) {
        int index = 0;   // position to write compressed result
        int i = 0;       // position to read input
        
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // count consecutive repeating chars
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // write character
            chars[index++] = currentChar;

            // write count if greater than 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        // return new length after compression
        return index;
    }
}

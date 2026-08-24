// // 
// class Solution {
//     public boolean isPalindromic(String s) {
//         ArrayList<Integer> arr = new ArrayList<>();

//         for (int i = 0; i < s.length(); i++) {
//             int ascii = s.charAt(i);
//             arr.add(ascii);
//         }

//         StringBuilder sb = new StringBuilder();

//         for (int num : arr) {
//             sb.append(Integer.toBinaryString(num));
//         }

//         int i = 0;
//         int j = sb.length() - 1;

//         while (i < j) {
//             if (sb.charAt(i) != sb.charAt(j)) {
//                 return false;
//             }

//             i++;
//             j--;
//         }

//         return true;
//     }
// }
class Solution {
    public boolean isPalindromic(String s) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            arr.add(ascii);
        }

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            String binary = Integer.toBinaryString(num);
            while (binary.length() < 8) {
                binary = "0" + binary;
            }
            sb.append(binary);
        }

        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
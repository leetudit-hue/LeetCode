class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        if(num1.equals("0") || num2.equals("0")) return "0";
        int[]arr = new int[n1+n2];
        for(int i = n1-1 ; i >= 0 ; i--){
            for(int j = n2-1 ; j >= 0 ; j--){
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                int mul = d1 * d2;
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + arr[p2];
                arr[p2] = sum % 10;
                arr[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num);
        }
        int idx = 0;
        while(idx <= sb.length() && sb.charAt(idx) == '0'){
            idx++;
        }
        return sb.substring(idx);
    }
}
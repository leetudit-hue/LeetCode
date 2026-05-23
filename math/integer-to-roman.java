class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        int[]val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i = 0 ; i < val.length ; i++){
            while(val[i] <= num){
                ans.append(roman[i]);
                num-=val[i];
            }
        }
        return ans.toString();
    }
}
class Solution {
    static int find(int[]s1,int[]d1,int[]s2,int[]d2){
        int finish1 = Integer.MAX_VALUE;
        for(int i = 0 ; i < s1.length ; i++){
            finish1 = Math.min(s1[i]+d1[i],finish1);
        }
        int finish2 = Integer.MAX_VALUE;
        for(int j = 0 ; j < s2.length ; j++){
            finish2 = Math.min(finish2,Math.max(finish1,s2[j])+d2[j]);
        }
        return finish2;
    }
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        int f1 = find(lst,ld,wst,wd);
        int f2 = find(wst,wd,lst,ld);
        return Math.min(f1,f2);
    }
}
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        int n = a.length;
        Arrays.sort(a);
        boolean destroy = true;
        for(int i = 0 ; i < n ; i++){
            if(mass >= Math.pow(10,5)) return true;
            if(a[i]<=mass){
                mass+=a[i];
            }
            else{
                destroy =  false;
                break;
            }
        }
        return destroy;
    }
}
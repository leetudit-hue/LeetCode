class Solution {
    public double angleClock(int hour, int minutes) {
        double hourA = (hour % 12) * 30 + (0.5 * minutes) ;
        double minA = minutes * 6;
        double diff = Math.abs(hourA-minA);
        double ans = Math.min(diff,360-diff);
        return ans;
    }
}
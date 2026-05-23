/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        while(low <= high){
            int pick = high + (low - high)/2;
            int num = guess(pick);
            if(num == 0){
                return pick;
            }
            else if(num > 0){
                low = pick + 1;
            }
            else{
                high = pick - 1;
            }
        }
        return -1;
    }
}
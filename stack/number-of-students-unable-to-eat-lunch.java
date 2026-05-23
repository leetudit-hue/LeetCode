class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int cSandwich = 0;
        int sSandwich = 0;
        for(int i = 0 ; i < students.length ; i++){
            if(students[i] == 0){
                cSandwich++;
            }
            else{
                sSandwich++;
            }
        }

        for(int i = 0 ; i < sandwiches.length ; i++){
            if(sandwiches[i] == 0 && cSandwich == 0){
                return sSandwich;
            }
            if(sandwiches[i] == 1 && sSandwich == 0){
                return cSandwich;
            }
            if(sandwiches[i] == 1){
                sSandwich--;
            }
            else{
                cSandwich--;
            }
        }
        return 0;
    }
}
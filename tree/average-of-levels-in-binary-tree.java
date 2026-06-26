
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
        List<Double>arr = new ArrayList<>();
        q.add(root);
        q.add(null);
        while(q.peek()!= null){
            double sum = 0;
            double n = 0;
            while(q.peek()!= null){
                TreeNode temp = q.poll();
                sum += temp.val;
                n++;
                if(temp.left!= null){
                    q.add(temp.left);
                }
                if(temp.right!= null){
                    q.add(temp.right);
                }
            }
            q.add(q.poll());
            arr.add(sum/n);
        }
        return arr;
    }
}
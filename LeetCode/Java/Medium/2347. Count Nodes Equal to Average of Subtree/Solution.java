class Solution {
    int ans = 0;

    public int[] preorder(TreeNode node){
        if(node == null) return new int[]{0, 0};

        int[] left = preorder(node.left);
        int[] right = preorder(node.right);

        int sum = left[0] + right[0] + node.val;
        int cnt = left[1] + right[1] + 1;

        if(sum / cnt == node.val){
            ans++;
        }
        return new int[]{sum, cnt};
    }

    public int averageOfSubtree(TreeNode root) {
        preorder(root);
        return ans;
    }
}
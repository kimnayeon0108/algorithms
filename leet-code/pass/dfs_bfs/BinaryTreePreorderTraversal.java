package pass.dfs_bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

    // 전위순회 루트 -> 왼쪽 전위 순회 -> 오른쪽 전위 순회
    List<Integer> list = new ArrayList<>();

    // stack 사용
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null) return list;

        dfs(root);

        return list;
    }

    void dfs(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()) {
            TreeNode n = stack.pop();
            if(n.right != null) {
                stack.push(n.right);
            }
            if(n.left != null) {
                stack.push(n.left);
            }
            list.add(n.val);
        }
    }

    // 재귀로 풀기
    public List<Integer> preorderTraversal2(TreeNode root) {

        if(root == null) return list;

        recursive(root);

        return list;
    }

    private void recursive(TreeNode node) {
        if(node == null) return;
        list.add(node.val);

        recursive(node.left);
        recursive(node.right);
    }

    public static void main(String[] args) {
        BinaryTreePreorderTraversal b = new BinaryTreePreorderTraversal();
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, three, null);
        TreeNode one = new TreeNode(1,null,two);
        b.preorderTraversal2(one);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


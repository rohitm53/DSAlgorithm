package trees;

import java.util.Stack;

public class BinaryTreeHandler {

    private TreeNode root;

    public BinaryTreeHandler(TreeNode root) {
        this.root = root;
    }


    public void inOrderCall(){
        inOrderTraverseRecursive(root);
    }

    private void inOrderTraverseRecursive(TreeNode root){

        if(root.left!=null){
            inOrderTraverseRecursive(root.left);
        }

        System.out.println(root.key);

        if (root.right!=null){
            inOrderTraverseRecursive(root.right);
        }
    }




    public void preorderCall(){
        preorderRecursive(root);
    }

    private void preorderRecursive(TreeNode root){

        System.out.println(root.key);
        if(root.left!=null){
            preorderRecursive(root.left);
        }
        if(root.right!=null){
            preorderRecursive(root.right);
        }
    }



    public void postOrderCall(){
        postOrderRecursive(root);
    }

    private void postOrderRecursive(TreeNode root){

        if(root.left!=null){
            postOrderRecursive(root.left);
        }

        if(root.right!=null){
            postOrderRecursive(root.right);
        }
        System.out.println(root.key);
    }

    public void inOrderTraverseIterative(){

        if(root==null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = root;
        while (currNode!=null || stack.size()>0){

            while (currNode!=null){
                stack.push(currNode);
                currNode=currNode.left;
            }

            currNode = stack.pop();
            System.out.println(currNode.key);

            currNode=currNode.right;
        }
    }

    public void preOrderIterative(){

        if(root==null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode currNode = stack.pop();
            System.out.println(currNode.key);

            if(currNode.right!=null){
                stack.push(currNode.right);
            }

            if(currNode.left!=null){
                stack.push(currNode.left);
            }

        }
    }

    public void postOrderIterative(){

        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> resultStack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode node = stack.pop();
            resultStack.push(node);

            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }

        while (!resultStack.isEmpty()){
            System.out.println(resultStack.pop().key);
        }

    }


}

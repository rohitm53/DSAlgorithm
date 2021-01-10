package trees;

public class BinaryTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right=new TreeNode(3);


        root.left.left = new TreeNode(4);

        BinaryTreeHandler handler = new BinaryTreeHandler(root);
//        handler.inOrderCall();
//        handler.inOrderTraverseIterative();

//        handler.preorderCall();
//        handler.preOrderIterative();


//        handler.postOrderCall();
        handler.postOrderIterative();

    }

}

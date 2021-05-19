package chapt25;

import java.io.Serializable;

public class BinaryTreeImpl<E> implements Serializable {
    private TreeNode root;

    // NODE CLASS STARTS NOW
    class TreeNode<E>{
        TreeNode r, l; //left and right child
        E element;     //node of the tree

        public TreeNode(E data)
        {
            element = data;
            l = null;
            r = null;
        }

        public TreeNode(TreeNode r, TreeNode l, E element) {
            this.r = r;
            this.l = l;
            this.element = element;
        }
    }
    //NODE CLASS ENDS HERE
}

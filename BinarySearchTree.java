// THIS IS A PROGRAM TO CREATE A BINARY SEARCH TREE BY INSERTING NODES AND DISPLAYING AN IN-ORDER TRAVERSAL OF THE TREE
package binarysearchtree;

/**
 *
 * @author vidushibhadola
 */
public class BinarySearchTree {
    class Node{
        Node left, right;
        int key;
        
        public Node(int item){
            key=item;
            left=right=null;
        } 
    }
    Node root;
    
    BinarySearchTree()
    {
        root = null;
    }
    void insert(int key)
    {
        root = insertRec(root,key);
    }
    Node insertRec(Node root, int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.key)
            root.left = insertRec(root.left,key);
        else if(key>root.key)
        root.right = insertRec(root.right, key);
        return root;
    }
    void inorder()
    {
       inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    
    public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);

        // TODO code application logic here
        tree.inorder();
    }
    
}

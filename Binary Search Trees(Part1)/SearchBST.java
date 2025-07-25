public class SearchBST {
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data= data;
        }
        
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key){
        if(root== null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        
        Node root= null;
        for(int val : values) {
            root = insert(root, val);
        } 
        
        if(search(root, 1)){
        System.out.println("Found");
        } else {
            System.out.println(" Not Found ");
        }
    }
}

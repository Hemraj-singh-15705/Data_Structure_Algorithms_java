import java.util.*;
public class PrintPathRoot2Leaf {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "  ");
        inOrder(root.right);
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }else if(root.data >= k1 && root.data <=k2 ){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void printRoot2leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root, Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
           root =  insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        // printInRange(root, 5, 15);

        // printRoot2leaf(root, new ArrayList<>());

        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }

    }
}

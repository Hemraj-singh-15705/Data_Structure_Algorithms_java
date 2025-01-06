import java.util.*;
public class MaxHeight {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return  Math.max(lh ,rh) + 1;
    }

        //count of nodes {  number of nodes }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = (count(root.left));
        int rightCount = (count(root.right));
        return leftCount + rightCount +1;
    }


        //Sum of all nodes


    public static int Sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);

        return leftSum + rightSum + root.data;
    }

    //Diameter 

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDim = diameter(root.left);
        int leftHt = height(root.left);
        int rightDim = diameter(root.right);
        int rightHt = height(root.right);
        int selfDim = leftHt + rightHt +1;
        return Math.max(selfDim ,Math.max(leftDim, rightDim));
    }

    public static Boolean isIdentical(Node node,Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot)){
            return false;
        }
        if(!isIdentical(node.right, subRoot)){
            return false;
        }
        return true;

    }

    public static Boolean isSubtree(Node root , Node subRoot){
        if(root == null){
            return true ;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static class Info{
        Node node;
        int hd ;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        //level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer , Node> map = new HashMap<>();

        int min = 0 ,max = 0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd , curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min  = Math.min(min,curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max  = Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i=min; i<=max; i++){
            System.err.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void Klevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + "  ");
            return ;
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }


    // lowest common ancestor approach ------->> 1st 


    // boolean getPath(Node root, int n, ArrayList<Node> path){
    //     if(root == null){
    //         return false;
    //     }
    //     path.add(root);

    //     if(root.data == n){
    //         return true;
    //     }

    //     boolean foundLeft = getPath(root.left, n, path);
    //     boolean foundRight = getPath(root.right, n, path);

    //     if(foundLeft || foundRight){
    //         return true;
    //     }

    //     path.remove(path.size()-1);
    //     return false;
    // }

    // public static Node lca(Node root, int n1 ,int n2){
    //     ArrayList<Integer> path1 = new ArrayList<>();
    //     ArrayList<Integer> path2 = new ArrayList<>();

    //     getPath(root, n1, path1);
    //     getPath(root, n2, path2);

    //     //last common ancestor 

    //     int i=0;
    //     for(; i<path1.size() && i<path2.size(); i++){
    //         if(path1.get(i) != path2.get(i)){
    //             break;
    //         }
    //     }
    //     Node lca = path1.get(i-1);
    //     return lca;
    // }






    // lowest common ancestor approach ------->> 2nd
    
    public static Node lca2(Node root, int n1, int n2){

        if(root == null ||root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        //leftVal and rightVal are not null 
        if(rightLca != null){
            return rightLca;
        }
        if(leftLca != null){
            return leftLca;
        }
        return root;
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);
         if(leftDist == -1 && rightDist == -1){
             return -1;
         }else if(leftDist== -1){
             return rightDist +1 ;
            }else {
                return leftDist +1;
            }
        }

        public static int minDist(Node root, int n1, int n2){
            Node lca = lca2(root, n1, n2);
            int d1 = lcaDist(lca, n1);
            int d2 = lcaDist(lca, n2);
            return d1 + d2;
        }
    public static void main(String[] args) {
        /*
         *              1
         *             / \
         *            2   3
         *           /\   /\
         *          4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new  Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(minDist(root, 4, 6));
        // int k = 3;
        // Klevel(root, 1, k);


        // topView(root);



              /*   Subtree 
                    2
                   /  \
                  4    5
             */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
       


        // System.out.print(count(root));
        // System.out.print(diameter(root));
        // System.out.println(isSubtree(root, subRoot));
    }
}

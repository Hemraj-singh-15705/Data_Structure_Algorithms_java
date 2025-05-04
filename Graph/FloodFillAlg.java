public class FloodFillAlg {
    
        public void helper(int [][] image, int sr, int sc,int color,boolean vis[][], int orgCol){
            if(sr <0 || sc < 0 || sr >= image.length ||sc >= image[0].length||
            vis[sr][sc] || image[sr][sc] != orgCol){
                return;
            }
            image[sr][sc] = color;
        }
        public int [][] floodFill(int [][] image, int sr, int sc,int color){
            boolean vis[][] = new boolean[image.length][image[0].length];
            helper(image,sr,sc,color,vis,image[sr][sc]);
            return image;
        }
        public static void main(String[] args) {

    }
}

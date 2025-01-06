public class sort_path {
    public static float Sortest_path(String path){
        int x =0,y=0;
        for(int i=0; i<path.length(); i++){
           
            int div = path.charAt(i);
            //south
            if(div == 's'){
                y--;
            }
            else if(div == 'e'){
                x++;
            }
            else if(div == 'w'){
                x--;
            }
            else{
                y++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return   (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "ns";
        System.out.println(Sortest_path(path));
    }
}

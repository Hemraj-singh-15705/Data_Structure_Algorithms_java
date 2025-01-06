import java.util.*;
public class convertion {
    public static void main(String args[])
    {
        float a=12.36f;
        int b=(int)a;
        System.out.println("Integer is "+ b);
        int c= (int)++a;
        int d=(int)a++;
        System.out.println("Pre Increament=" + c +"\nPost increament="+ d);
    }
}

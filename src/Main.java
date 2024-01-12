
import java.util.*;
class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an aaray:");
        int n = sc.nextInt();

        int[] a1 = new int[n];

        System.out.println("enter the element of an array:");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int max= Integer.MIN_VALUE;
        for (int i=0;i< a1.length;i++){
           if( a1[i]>max){
               max=a1[i];
           }
        }
        System.out.println(max);
        int min= Integer.MAX_VALUE;
        for (int i=0;i< a1.length;i++){
            if( a1[i]<min){
                min=a1[i];
            }
        }
        System.out.println(min);
        //for (int i = 0; i < a1.length; i++) {
          //  System.out.println(a1[i]);
        }
    }

import java.util.*;
public class LargestElement {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<5; i++) {
            arr[i]=obj.nextInt();
        }
        int max=arr[0];
        for(int i=1; i<5; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
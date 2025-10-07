import java.util.*;
class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations");
        int d = sc.nextInt();
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[n-d+i];
        }
        for(int i=n-d-1;i>=0;i--){
            arr[i+d] = arr[i];
        }
        for(int i=0;i<d;i++){
            arr[i] = temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
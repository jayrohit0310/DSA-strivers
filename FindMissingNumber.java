import java.util.*;
class findMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array : ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }   

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int i;
        for(i=0; i<n; i++) {
            if(arr[i] != i) {
                break;
            }
        }
        System.out.println("The missing number is : " + i);   
    }
}
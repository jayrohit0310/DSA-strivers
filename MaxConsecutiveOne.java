import java.util.*;

class maxConsecutiveOne {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int maxCount = 0;
        int currentCount = 0;
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int nums[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(nums[i] == 1) {
                currentCount++;
            } else {
                if(currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }
        System.out.println("The maximum number of consecutive 1's is: " + Math.max(maxCount, currentCount));
    }
}
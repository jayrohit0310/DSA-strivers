public class SecondLargest {
    public static void main(String args[]) {
        int arr[] = {11,22,33,44,55,66,77};
        int firstMax=arr[0];
        for(int i=1; i<7; i++) {
            if(arr[i]>firstMax) {
                firstMax=arr[i];
            }
        }
        int secondLargest=arr[0];
        for(int i=1; i<7; i++) {
            if(arr[i]==firstMax) {
                continue;
            } else {
                if(arr[i]>secondLargest) {
                    secondLargest=arr[i];
                }
            }
        }
        System.out.println(secondLargest);
    }
}
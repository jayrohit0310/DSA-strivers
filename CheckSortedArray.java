public class CheckSortedArray {
    static boolean sortedArray(int arr[]) {
        int cnt=0;
        if(arr[0]<arr[arr.length-1]) {
            cnt++;
        }
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                cnt++;
            }
        }
        if(cnt>1) {
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        int arr1[] = {4,5,1,2,3};
        int arr2[] = {2,1,3,4};
        boolean check1=sortedArray(arr1);
        boolean check2=sortedArray(arr2);
        System.out.println("Array 1 is sorted : " + check1);
        System.out.println("Array 2 is sorted : " + check2);
    }
}
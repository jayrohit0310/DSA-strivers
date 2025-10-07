public class LinearSearch {
    static int findElement(int arr[], int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {79,15,84,34,8};
        int target=8;
        int index=findElement(arr,target);
        if(index==-1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + index);
        }
    }
}
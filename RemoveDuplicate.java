public class RemoveDuplicate {
    public static void main(String args[]) {
        int arr[] = {0,1,1,1,2,2,3,4,5,5,9,9,15,15};
        int index=1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]!=arr[i-1]) {
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=0; i<index; i++) {
            System.out.println(arr[i]);
        }
    }
}
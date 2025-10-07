import java.util.*;
class FindUnion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 1st array:");
        int n=sc.nextInt();
        System.out.println("Enter size of 2nd array:");
        int m=sc.nextInt();

        int a[]=new int[n];
        int b[]=new int[m];
        System.out.println("Enter elements of 1st array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elements of 2nd array:");
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int j=0;j<m;j++){
            set.add(b[j]);
        }
        System.out.println("Union is:");
        for(Integer num:set){
            System.out.print(num+" ");
        }
    }
}
import java.util.*;

public class IfElse {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int marks = obj.nextInt();
        if(marks>=90) {
            System.out.println("Grade A");
        } else if(marks>=70 && marks<90) {
            System.out.println("Grade B");
        } else if(marks>=50 && marks<70) {
            System.out.println("Grade C");
        } else if(marks>=35 && marks<50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
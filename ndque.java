import java.util.Scanner;

public class ndque {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        int n=myobj.nextInt();
        double d=myobj.nextDouble();
        char ch=myobj.next().charAt(0);
        boolean b=myobj.nextBoolean();
        System.out.println("Before conversion of integer: "+ n);
        System.out.println("After conversion integer into double: "+ (double)n);
        System.out.println("Before conversion of character: "+ ch);
        System.out.println("After conversion of character into integer : "+ (int)ch);
        System.out.println(d);
        System.out.println(b);

    }
}

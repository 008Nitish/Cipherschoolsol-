import java.util.Scanner;

class grade{
  public static void main(String args[]){
    Scanner myobj=new Scanner(System.in);
    int n=myobj.nextInt();
    if(n>=90){
      System.out.println("Grade A");
    }
    else if(n<=90 && n>=80){
      System.out.println("Grade B");
    }
    else if(n<=80 && n>=70){
      System.out.println("Grade C");
    }
    else if(n<=70 && n>=60){
      System.out.println("Grade D");
    }
    else if(n<=60){
      System.out.println("Grade F");
    }
  }
};
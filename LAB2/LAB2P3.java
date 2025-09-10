import java.util.Scanner;

class LAB2P3{
     public static void main(String...args){
           Scanner S=new Scanner(System.in);
           int a=S.nextInt();
           int b=S.nextInt();
           
           String op=S.next();
           
           String str= switch(op){
                case "++" -> "hello";
                case "--", "=", "-" -> "not good";
                default -> "sorry";
            };
            
           System.out.println("Result is : "+ str);
      }
}

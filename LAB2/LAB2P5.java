import java.util.Scanner;

class LAB2P5{
      public static void main(String...args){
           Scanner s = new Scanner(System.in);
           int a = s.nextInt();
           int count=0;
           for(int i=2;i<a;i++){
               if(a%i==0){
                  count=0;
                  break;
               }
               else
                 count++;
            }
           if(count==0)
              System.out.println("not a prime number");
           else
              System.out.println("it is a prime number");
     }
}    
             
                 
           
           

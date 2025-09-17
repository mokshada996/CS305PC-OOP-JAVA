import java.util.Scanner;
class LAB3P5{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		int a =s.nextInt();
		LAB3P5 l= new LAB3P5();
		LAB3P5 l1= new LAB3P5(16);
		LAB3P5 l2= new LAB3P5("b");
		LAB3P5 l3= new LAB3P5(10,"b");
		//l.show();l1.show(10);l2.show("String");l3.show(10,"String");
	}
	LAB3P5(){
		System.out.println("constructor without params");
	}
	LAB3P5(int x){
		System.out.println("constructor with one param:"+ x);
	}
	LAB3P5(String s){
		System.out.println("constructor with string:"+s);
	}
	LAB3P5(int x,String s){
		System.out.println("constructor with two params:"+ x +" "+ s);
	}
	
}
	

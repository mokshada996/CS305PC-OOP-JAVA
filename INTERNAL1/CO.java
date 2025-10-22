import java.util.Scanner;
class CO{
	public static void main(String[] args){
		int a[]={1,5,2,5,3};
		int count=0;
		System.out.print("enter the target number:");
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
		for(int i=0;i<5;i++){
			if(a[i]==target){
				count++;
			}
		}
		System.out.println(count);
	}
}

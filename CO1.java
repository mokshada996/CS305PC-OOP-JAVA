import java.util.Scanner;

class CO1{
	public static void main(String[] args){
		CO1 c = new CO1();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements:");
		for(int j =0;j<size;j++){ 
			arr[j]= sc.nextInt(); 
		}
		
		c.counter(arr);	
		
	}
	
	void counter(int a[]){
		int count=0;
		System.out.print("enter the target number:");
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
		for(int i=0;i<a.length;i++){
			if(a[i]==target){
				count++;
			}
		}
		System.out.println(count);
	}
}

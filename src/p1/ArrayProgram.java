package p1;

public class ArrayProgram {

	public static void main(String[] args) {

		//find sum of all number of array
		//find sum of all even number of array
		//find factorial of a number
		
	/*	int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;*/
		int a[]= {10,20,35,45,50};
		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.println(a[i]);
//			}
//			
//		}
		//sum of all elements of array
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of all elements of array: "+sum);
		
		//sum of all even numbers  of array
		sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}	
		}
		System.out.println("sum of all even elements of array: "+sum);
		
		
		//5 = 1*2*3*4*5
		int mul=1;
		int n=10;
		for(int i=1;i<=n;i++) {
			mul=mul*i;
		}
		System.out.println("factoraial of 10 is "+ mul);
	}

}

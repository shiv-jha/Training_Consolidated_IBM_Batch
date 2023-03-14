package p2;

public class AccessModifierExample {

	public static void main(String[] args) {

		A obj = new A();
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.a);
		obj.callme();
	}
	
}

class A{
	private int x=10;
	public int y=20;
	int z=30;
	protected int a=40;
	public void callme() {
		System.out.println(x);
	}
}
	

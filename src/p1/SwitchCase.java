package p1;

public class SwitchCase {

	public static void main(String[] args) {

		int marks=31;
		int x=marks/10;  
		String grade="";
		switch(x) {
			case 9:
				grade="O";
				break;
			case 8:
				grade="E";
				break;
			case 7:
				grade="A";
				break;
			case 6:
				grade="B";
				break;
			case 5:
				grade="C";
				break;
			default:
				grade="f";
			}
		System.out.println("Grade obtained is "+ grade);
	}

}

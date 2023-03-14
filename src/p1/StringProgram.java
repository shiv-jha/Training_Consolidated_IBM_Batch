package p1;

public class StringProgram {

	public static void main(String[] args) {
		String str= "My first java program";
		String str2= "My second java program";
		System.out.println(str.contains("java"));
		System.out.println(str.substring(8));
		System.out.println(String.join(";",str, str2));
		System.out.println(str.replace("java","python"));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("m"));
		System.out.println(str.concat(str2));
		//System.out.println(str.split(" "));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.compareTo(str2));
		System.out.println(str.startsWith("My"));

		String xyz="madame";
		int left=0;
		int right=xyz.length()-1;
		boolean pal=true;
		while(left<right){
			if(xyz.charAt(left)!=xyz.charAt(right)) {
				pal=false;
			}
	
			left++;
			right--;
		}
		if(pal==true) {
			System.out.println("string is palindrum");
		}
		else {
			System.out.println("string is not palindrum");
		}
		
		String str3= "this is my java program";
		int wordcount=0;
		for(int i=0;i<str3.length();i++) {
			if(str3.charAt(i)==' ') {
				wordcount++;
			}
		}
		System.out.println("no of word is "+ (wordcount+1));
	}
	
	
	
	//write a program to find number of vowels in string
	//write a program to print reverse of string
	//write a program to find number of words in a string
	
	

}

package p1;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException , ArithmeticException {
		int balance=50;
		int month=0;
		int avg_balance=0;
		Thread.sleep(300);
		//avg_balance= balance/month;
		int amt=5000;
		int withdra_amt=7000;
		try {
			if(withdra_amt>amt) {
				throw new ArithmeticException("sorry , you have lesser balance");
			}
			else
			{
				avg_balance= amt/month;
				System.out.println("avg balance is "+ avg_balance);
			}
		}
		catch (Exception e) {
			System.out.println("hello");
		}
		/*try {
			avg_balance= balance/month;
			System.out.println("next line");
			System.out.println("avg balance is "+ avg_balance);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("you just started account , so avg balance is 0");
			System.out.println("avg balance is "+ avg_balance);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("you just started account , so avg balance is 0");
			System.out.println("avg balance is "+ avg_balance);
		}
		finally {
			System.out.println("Thank you for banking with us");
		}
		*/
		
		//finally
		

	}

}

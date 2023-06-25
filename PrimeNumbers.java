package assignments.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=13;
		boolean flag = false;
		for (int j=2;j<i;j++) {
			if(j%i==0) {
				flag=true;
				break;
			}
			if(flag == false) {
				System.out.println(i+" is a prime number");
			}
			else
			{
				System.out.println(i+" is not a prime number");
			}
		}
	}

}

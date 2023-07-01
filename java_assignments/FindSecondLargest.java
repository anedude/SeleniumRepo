package week1.java_assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		int len=data.length;
		Arrays.sort(data);
		System.out.println(data[len-2]);
	}

}

package week1.java_assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len=arr.length;
		System.out.println("length of the array is "+len);
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
			
		}
	}

}
	}
}

package optimization;

public class StrengthReduction {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,8};
		System.out.println(calc(arr));
	}
	
	public static int calc(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length; i++) {
			sum += arr[i];
		}
		return sum*sum;
	}
	
	public static int calcTotal(int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {

			sum += i*5;
		}
		return sum*sum;
	}
}

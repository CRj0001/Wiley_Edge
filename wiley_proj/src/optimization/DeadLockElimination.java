package optimization;

public class DeadLockElimination {
	
	public static void print(int val) {
		if(val > 0) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}
		
		System.out.println("eNd");
	}
	public static void main(String[] args) {
		print(5);
		print(0);
	}
}

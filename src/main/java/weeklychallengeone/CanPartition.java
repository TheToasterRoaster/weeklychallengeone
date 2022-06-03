package weeklychallengeone;

public class CanPartition {

	public boolean canPartition(int[] arr) {
		int prod = 1;
		
		for (int num: arr) {
			prod *= num;
		}
		
		for (int num: arr) {
			if (prod/num == num) {
				return true;
			}
		}
		
		
		return false;
	}
}

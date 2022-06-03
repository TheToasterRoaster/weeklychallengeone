package weeklychallengeone;

public class Driver {

	public static void main(String[] args) {
		ReorderDigits p = new ReorderDigits();
		CanPartition cp = new CanPartition();
		
		p.reorderDigits(new int[] {515, 341, 98, 44, 211}, "asc");
		p.reorderDigits(new int[] {515, 341, 98, 44, 211}, "desc");
		p.reorderDigits(new int[] {63251, 78221}, "asc");
		p.reorderDigits(new int[] {63251, 78221}, "desc");
		p.reorderDigits(new int[] {1, 2, 3, 4}, "asc");
		p.reorderDigits(new int[] {1, 2, 3, 4}, "desc");
		
		System.out.println(cp.canPartition(new int[] {2, 8, 4, 1}));
		System.out.println(cp.canPartition(new int[] {-1, -10, 1, -2, 20}));
		System.out.println(cp.canPartition(new int[] {-1, -20, 5, -1, -2, 2}));
	}

}

public class SearchDriver {

	public static void main(String[] args) {
		BinSearch binaryTest = new BinSearch();
		LinSearch linearTest = new LinSearch();

		int[] nums = new int[100000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 5 * i;
		}
		int index = binaryTest.binSearch((Comparable[]) nums, 34725);
		System.out.println(index + " ...should be 6946");
	}

}

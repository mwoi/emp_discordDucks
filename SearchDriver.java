/*discordDucks: Kartik Vanjani + Krrish, Gabriel Thompson + Iggy, Marcus Wu + Nat
APCS PD8
Lab03: Get Empirical
2021-12-21
Time Spent: xx hrs*/
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

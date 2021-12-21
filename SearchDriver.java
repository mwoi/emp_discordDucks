// discordDucks: Kartik Vanjani + Krrish, Gabriel Thompson + Iggy, Marcus Wu + Nat
// APCS PD8
// Lab03: Get Empirical
// 2021-12-21
// Time Spent: 3.5 hrs

import java.lang.System;

public class SearchDriver {

	public static long testBin(Comparable[] a, int target) {
		long start, end, diff;
		BinSearch b = new BinSearch();

		start = System.currentTimeMillis();
		b.binSearch(a, target);
		end = System.currentTimeMillis();
		diff = end - start;
		return diff;

	}

	public static long testLin(Comparable[] a, int target) {
                long start, end, diff;
                LinSearch l = new LinSearch();

                start = System.currentTimeMillis();
                l.linSearch(a, target);
                end = System.currentTimeMillis();
                diff = end - start;
                return diff;

	}

	public static void fullTest(Comparable[] nums, int numTests) {
		int targetIndex, target;
		int[] binaryTimes = new int[numTests];
		int[] linearTimes = new int[numTests];
		int binaryTotal = 0;
		int linearTotal = 0;
		int binaryMin = 999999;
		int binaryMax = 0;
		int linearMin = 999999;
		int linearMax = 0;

		for (int i = 0; i < numTests; i++) {
                        targetIndex = (int) (Math.random() * (nums.length - 1));
                        target = (int) nums[targetIndex];
                        binaryTimes[i] = (int) testBin(nums, target);
			binaryTotal += binaryTimes[i];
                        linearTimes[i] = (int) testLin(nums, target);
			linearTotal += linearTimes[i];

			if (linearTimes[i] > linearMax) { linearMax = linearTimes[i]; }
			if (linearTimes[i] < linearMin) { linearMin = linearTimes[i]; }
			if (binaryTimes[i] > binaryMax) { binaryMax = binaryTimes[i]; }
			if (binaryTimes[i] < binaryMin) { binaryMin = binaryTimes[i]; }
                }

		System.out.println("------------------------------------");
		System.out.println("  Array Size: " + nums.length);
		System.out.println("  # of tests: " + numTests + "\n");
		System.out.println("  Average BinSearch time: " + (double) binaryTotal / numTests + "ms");
		System.out.println("  Average LinSearch time: " + (double) linearTotal / numTests + "ms\n");
		System.out.println("  BinSearch time range: [" + binaryMin + "ms, " + binaryMax + "ms]");
		System.out.println("  LinSearch time range: [" + linearMin + "ms, " + linearMax + "ms]");
		System.out.println("------------------------------------");
	}

	public static Comparable[] createAscendingArray(int n) {
		Comparable[] a = new Comparable[n];
		for (int i = 1; i < n; i++) {
			a[i - 1] = i;
		}
		return a;
	}

	public static void main(String[] args) {
		Comparable[] nums;

		nums = createAscendingArray(100);
		fullTest(nums, 100);

                nums = createAscendingArray(500);
                fullTest(nums, 100);

                nums = createAscendingArray(10_000);
                fullTest(nums, 100);

                nums = createAscendingArray(1_000_000);
                fullTest(nums, 100);

                nums = createAscendingArray(10_000_000);
                fullTest(nums, 100);

                nums = createAscendingArray(25_000_000);
                fullTest(nums, 100);

                nums = createAscendingArray(50_000_000);
                fullTest(nums, 100);

	}

}

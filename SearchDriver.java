// discordDucks: Kartik Vanjani + Krrish, Gabriel Thompson + Iggy, Marcus Wu + Nat
// APCS PD8
// Lab03: Get Empirical
// 2021-12-21
// Time Spent: 4.4 hrs

import java.lang.System;
import java.util.*;

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

		for (int i = 0; i < numTests; i++) {
                        targetIndex = (int) (Math.random() * (nums.length - 1));
                        target = (int) nums[targetIndex];
                        binaryTimes[i] = (int) testBin(nums, target);
			binaryTotal += binaryTimes[i];
                        linearTimes[i] = (int) testLin(nums, target);
			linearTotal += linearTimes[i];
                }

		long worstCaseBin = testBin(nums, (int) nums[nums.length - 1]);
		long worstCaseLin = testLin(nums, (int) nums[nums.length - 1]);

		System.out.println("------------------------------------");
		System.out.println("  Array Size: " + nums.length);
		System.out.println("  # of tests: " + numTests + "\n");
		System.out.println("  Average BinSearch time: " + (double) binaryTotal / numTests + "ms");
		System.out.println("  Average LinSearch time: " + (double) linearTotal / numTests + "ms\n");
		System.out.println("  BinSearch worst case scenario: " + worstCaseBin + "ms");
		System.out.println("  LinSearch worst case scenario: " + worstCaseLin + "ms");
		System.out.println("------------------------------------");
	}

	public static Comparable[] createAscendingArray(int n) {
		Comparable[] a = new Comparable[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		return a;
	}

	public static void main(String[] args) {
		Comparable[] nums;

		nums = createAscendingArray(100);
		System.out.println(Arrays.toString(nums));
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

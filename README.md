# LAB02 by Team discordDucks

## DA TEAM (in order of lsat nombre)
 - [Gabriel Thompson](https://www.github.com/gthompson30)
 - [Kartik Vanjani](https://www.github.com/NYG-Kartik)
 - [Marcus Wu](https://www.github.com/mwoi)

## Tests Performed
 - We create 7 arrays of consecutive ascending numbers 1 to n, with n = 100, 500, 10,000, 1,000,000, 10,000,000, 25,000,000, and 50,000,000 respectively. For example, one array is 1, 2, 3... 98, 99, 100.
 - For each array, we choose 100 random items in the array, and time how long binary search and linear search take to find each chosen item. We calculate the average, min, and max of these times.
    - These calculated values represent *how* fast binary search and linear search were at searching the array.

## Results

| Array Size      | Avg. BinSearch Time | Avg. LinSearch Time | BinSearch Time Range | LinSearch Time Range |
| ----------- | ----------- | --- | --- | --- |
| 100      | 0.0ms       | 0.0ms | [0ms, 0ms] | [0ms, 0ms] |
| 500   | 0.0ms        | 0.01ms | [0ms, 0ms] | [0ms, 1ms] |
| 10,000   | 0.0ms        | 0.03ms | [0ms, 0ms] | [0ms, 1ms] |
| 1,000,000   | 0.0ms        | 1.05ms | [0ms, 0ms] | [0ms, 2ms] |
| 10,000,000   | 0.01ms        | 9.05ms | [0ms, 1ms] | [0ms, 18ms] |
| 25,000,000   | 0.0ms        | 24.43ms | [0ms, 0ms] | [0ms, 47ms] |
| 50,000,000   | 0.02ms        | 45.75ms | [0ms, 1ms] | [0ms, 92ms] |

These conclusions show that binary search is a significantly more efficient algorithm. The linear search time increases dramatically in each row (seemingly proportionally to the array size), whereas the binary search time stays very near to zero the entire time.

This makes logical sense, as for an array size of 50,000,000, it should only take binary search up to 26 or so "divisions" of the array to find the answer. However, for linear search up to 50 million iterations to find the answer. Given this, it is actually somewhat strange that the average time for binary search isn't **lower**. However, it fluctuates very little, and the differences are fractions of a millisecond, so it is reasonably safe to assume that the binary search time is within a margin of error of 0.

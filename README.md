# LAB03 by Team discordDucks

## DA TEAM (in order of lsat nombre)
 - [Gabriel Thompson](https://www.github.com/gthompson30)
 - [Kartik Vanjani](https://www.github.com/NYG-Kartik)
 - [Marcus Wu](https://www.github.com/mwoi)

## Tests Performed
 - We create 7 arrays of consecutive ascending numbers 1 to n, with n = 100, 500, 10,000, 1,000,000, 10,000,000, 25,000,000, and 50,000,000 respectively. For example, one array is 1, 2, 3... 98, 99, 100.
 - For each array, we choose 100 random items in the array, and time how long binary search and linear search take to find each chosen item. We calculate the average, min, and max of these times. We also search for the last item and time this. This gives us the worst-case scenario for each algorithm for each array size.
    - These calculated values represent *how* fast binary search and linear search were at searching the array.
    - Although it's not going to be exactly accurate, the "max" value will roughly show the worst case scenario.

## Results

Here are the results from each of the seven arrays:
| Array Size  | Avg. BinSearch Time | Avg. LinSearch Time | BinSearch Worst-case | LinSearch Worst-case |
| ----------- | ------------------- | ------------------- | -------------------- | -------------------- |
| 100         | 0.0ms               | 0.0ms               | 0ms                  | 0ms                  |
| 500         | 0.0ms               | 0.0ms               | 0ms                  | 0ms                  |
| 10,000      | 0.0ms               | 0.03ms              | 0ms                  | 1ms                  |
| 1,000,000   | 0.0ms               | 0.60ms              | 0ms                  | 1ms                  |
| 10,000,000  | 0.0ms               | 7.45ms              | 0ms                  | 15ms                 |
| 25,000,000  | 0.01ms              | 20.61ms             | 0ms                  | 41ms                 |
| 50,000,000  | 0.01ms              | 41.47ms             | 0ms                  | 82ms                 |

Each row represents one of the seven arrays we tested. The columns show (in order) how long binary search took on average, how long linear search took on average, how long binary search took in the worst case, and how long linear search took in the worst case. In both binary search and linear search, the worst case was the last item.

Raw results (as they appeared in the terminal):
```
-------------------------------------
  Array Size: 100
  # of tests: 100

  Average BinSearch time: 0.0ms
  Average LinSearch time: 0.0ms

  BinSearch worst case scenario: 0ms
  LinSearch worst case scenario: 0ms
-------------------------------------
-------------------------------------
  Array Size: 500
  # of tests: 100

  Average BinSearch time: 0.0ms
  Average LinSearch time: 0.0ms

  BinSearch worst case scenario: 0ms
  LinSearch worst case scenario: 0ms
-------------------------------------
-------------------------------------
  Array Size: 10000
  # of tests: 100

  Average BinSearch time: 0.0ms
  Average LinSearch time: 0.03ms

  BinSearch worst case scenario: 0ms
  LinSearch worst case scenario: 1ms
-------------------------------------
-------------------------------------
  Array Size: 1000000
  # of tests: 100

  Average BinSearch time: 0.0ms
  Average LinSearch time: 0.6ms

  BinSearch worst case scenario: 0ms
  LinSearch worst case scenario: 1ms
-------------------------------------
-------------------------------------
  Array Size: 10000000
  # of tests: 100

  Average BinSearch time: 0.0ms
  Average LinSearch time: 7.45ms

  BinSearch worst case scenario: 0ms
  LinSearch worst case scenario: 15ms
-------------------------------------
-------------------------------------
  Array Size: 25000000
  # of tests: 100

  Average BinSearch time: 0.01ms
  Average LinSearch time: 20.61ms

  BinSearch worst case scenario: 0ms
  LinSearch worst case scenario: 41ms
-------------------------------------
-------------------------------------
  Array Size: 50000000
  # of tests: 100

  Average BinSearch time: 0.01ms
  Average LinSearch time: 41.47ms

  BinSearch worst case scenario: 0ms
  LinSearch worst case scenario: 82ms
-------------------------------------
```

## Conclusions

These conclusions show that binary search is a significantly more efficient algorithm. The linear search time increases dramatically in each row (roughly proportionally to the array size), whereas the binary search time stays very near to zero the entire time. These trends are true for both the average and the worst case.

This makes logical sense, as for an array size of 50,000,000, it should only take binary search up to 26 or so "divisions" of the array to find the item it's looking for. However, it could take linear search up to 50 million iterations to find the item it's looking for. Given this, it is actually somewhat strange that the average time for binary search isn't **lower**. However, the average it fluctuates very little, with these differences being fractions of a millisecond, so it is safe to assume that the binary search time is within a margin of error of 0. This is confirmed by the worst-case scenario, as in single trials for the worst case, binary search consistently takes 0ms.

It's hard to come to any strong conclusions about binary search because there's so few data points, and the only non-zero times are clear outliers. The only thing that we *can* confidently say about it is that it is much faster than linear search.

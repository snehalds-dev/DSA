## Order of growth
- Suppose we have two algorithms => 
  - Algo1 takes f(n) time, Algo2 takes g(n) time.
  - n is the input size.
- We say f(n) grows faster than g(n) if =>
  - For large value of n, g(n) / f(n) => 0
  - i.e. As the input size gets bigger and bigger, f(n) takes much more time than g(n).

### How to find order of growth
- Given, n >= 0, f(n) >= 0 and g(n) >= 0
- Ignore the lower order terms
- Ignore the constants.
- Eg:  4n<sup>2</sup> + 3n + 100  => n<sup>2</sup>
- Eg: 100 n Log n + 3n + 100 Log n  + 2 => n Log n

### Order of Growth
>
> From **slowest** to **fastest**:
>
> $$
 c < \log\log n < \log n < n^{1/3} < n^{1/2} < n < n\log n < n^2 < n^2\log n < n^3 < n^4 < 2^n < n^n
> $$
>
> **Here, `c` is a constant.**
>


### Asymptotic Analysis
- Drawbacks of comparing 2 algo wrt running time:
  - It might be possible that for some inputs, the first algorithm performs better than the second. And for some inputs second performs better. 
  - It might be possible that for some inputs, the first algorithm performs better on one machine, and the second works better on another machine for some other inputs.
- Asymptotic analysis evaluates an algorithm’s performance based on input size, ignoring actual running time.
- It is machine independent.
- It is the best general method for analyzing algorithms, even though it is not perfect.
- It ignores constant factors, so two algorithms with the same asymptotic complexity (e.g., 1000 n*logn vs 2 n*logn) cannot be directly compared for practical speed.


### Time Complexity
- Instead of measuring actual time required to execute a particular code, Time Complexity considers how many times each statement executes. 
- We measure rate of growth over time with respect to the input size.
- Eg: 
```
System.out.println(Hello World!)  => O(1) => Constant time

for(int i=0; i<n; i++) {
    System.out.println(Hello World!)
}

=> O(n) => Linear time, as stmt executed n times.
```

### Space complexity
- Here, we have 2 concepts: Auxiliary space, Space complexity
- Auxiliary Space is the extra space or temporary space used by an algorithm.
- The space Complexity of an algorithm is the total space taken by the algorithm wrt the input size. 
  - It includes both Auxiliary space and space used by input. 
- Eg.
  - For 1-D array => TC: O(n)
  - For 2-D array => TC: O(n<sup>2</sup>)
  - For recursive calls, Stack space also counts.
- Note:  Space complexity depends on a variety of things such as the programming language, the compiler, or even the machine running the algorithm.

### Big O Notation (Worst case/ Upper bound)


### Theta Notation (Average case/ both upper and lower bound)

### Omega Notation (Best case/ Lower bound)
### Recursion
- The process in which a function calls itself directly or indirectly is called recursion.
-  and The corresponding function is called a recursive function.
- A recursive program stops at a base condition. There can be 1 or more base conditions in a program.
- The idea is to represent a problem in terms of one or more smaller problems, and add one or more base conditions that stop the recursion.

#### Steps to Implement Recursion
1. **Step1 - Define a base case:** Identify the simplest (or base) case for which the solution is known or trivial. This is the stopping condition for the recursion, as it prevents the function from infinitely calling itself.
2. **Step2 - Define a recursive case:** Define the problem in terms of smaller subproblems. Break the problem down into smaller versions of itself, and call the function recursively to solve each subproblem.
3. **Step3 - Ensure the recursion terminates:** Make sure that the recursive function eventually reaches the base case, and does not enter an infinite loop.
4. **Step4 - Combine the solutions:** Combine the solutions of the subproblems to solve the original problem.

#### Need of Recursion / Advantages?
- Recursion helps in solving complex problems by breaking them into smaller subproblems. 
- It works as a basis for Dynamic Programming and Divide and Conquer algorithms. 
- Certain problems can be solved quite easily using recursion like Tower of Hanoi, Tree traversal

#### When does Stack Overflow error occur in recursion? 
- If the base case is not reached or not defined, then the stack overflow may occur
- When the base case is not reached, the continuous recursion consumes memory on the function call stack. If the system's memory is exhausted due to these unending function calls, a stack overflow error occurs.

#### Difference between direct and indirect recursion
- A function is called direct recursive if it makes a recursive call to itself within its own body. 
- An indirect recursive function is one that calls another function, and that other function, in turn, calls the original function either directly or through other functions. This creates a chain of recursive calls involving multiple functions.

#### How memory is allocated in recursion?
- When any function is called from main(), the memory is allocated to it on the stack. 
- A recursive function calls itself, the memory for a called function is allocated on top of memory allocated to the calling function and a different copy of local variables is created for each function call. 
- When the base case is reached, the function returns its value to the function by whom it is called and memory is de-allocated and the process continues.

#### Disadvantages of recursion
- Not every recursive program can be written iteratively and vice versa is also true.
- Recursive programs typically have more space requirements and also more time to maintain the recursion call stack.
- Recursion can make the code more difficult to understand and debug, since it requires thinking about multiple levels of function calls.

#### Time Complexity Analysis of Recursive Functions
- Many recursion algorithm complexity analysis leads to a recurrence relation. 
- A recurrence relation expresses the running time for an input of size n in terms of the running time for smaller input sizes. 
- Eg: in Merge Sort, the array is divided into two halves, each half is sorted recursively, and the results are then merged. 
- This leads to the recurrence relation T(n) = 2T(n/2) + cn , where the cn represents the time required to merge the two sorted halves.
- Three common methods used to solve recurrence relations:
  - Substitution Method : We guess the form of the solution and prove it using mathematical induction
  - Recurrence Tree Method : This method represents the recurrence as a tree and computes the total cost by summing the cost at each level
  - Master Theorem : The Master Theorem provides a direct way to solve divide-and-conquer recurrences of the form:
    - T(n) = aT(n/b) + f(n)
    - a: No.of subproblems
    - n/b: Size of each subproblem
    - f(n) is the cost of work done outside the recursive calls (dividing the problem and combining results)
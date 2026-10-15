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

#### Need of Recursion?
- Recursion helps in solving complex problems by breaking them into smaller subproblems. 
- It works as a basis for Dynamic Programming and Divide and Conquer algorithms. 
- Certain problems can be solved quite easily using recursion like Tower of Hanoi, Tree traversal

#### When does Stack Overflow error occur in recursion? 
- If the base case is not reached or not defined, then the stack overflow may occur
- To be continued
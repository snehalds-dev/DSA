## Input Output in Java

### Input:
- Import Scanner class
  - import java.util.Scanner;
- Create Scanner object
  - Scanner sc = new Scanner(System.in);
- Take input
  - int age = sc.nextInt();
  - float height = sc.nextFlaot();
  - String name = sc.next();
  - char letter = sc.next.charAt(0);

### Output:
- System.out.println() => Print and cursor go on newline
- System.out.print() => Print and stay on same line


## Conditional Statements

### If Statement

```
if(Condition) {
    //code
}
```

### If-Else Statement
```
if(Condition) {
    // code
} 
else {
    //code
}
```

### Else-If Ladder
- If-Else-If statement
```
if(Condition1) {
    //code
}
else if(Condition2) {
    //code
}
else {
    //code
}
```

- Nested-if statement
```
if(Condition1) {
    if(Condition2) {
        //code
    }
    else {
        //code
    }
}
else {
    if(Condition3) {
        //code
    }
    else {
        //code
    }
}
```

### Switch Statement
- A switch expression must evaluate to a constant value. This can include constants or arithmetic operations.
- Java switch supports only following data types:
  - int, String, char, short, byte, enum, Wrapper types(Integer, Character, Byte, Short).
- The break statement is optional, but recommended to prevent fall-through. 
- The default case is optional but useful for handling unexpected values
```
switch(expression) {
case v1 : //code
          break;
          
case v2 : //code
          break;
          
default : //code
}
```

### Ternary operator
- Nested ternary operator can also be used.
- It simplifies If-else blocks.
```
(condition) ? true : false;
```


## Loops

### For loops
- It is used when the number of iterations is known in advance.
- Initialization; Condition; Updation
- Types of For loop
```
// 1. Basic for loop 

for(int i=0; i<n; i++) {
    //code
}
```

``` 
// 2. For-Each loop
// Used to iterate directly over elements of collections.

for(int num: nums) {
  //code
}
```

```
// 3. For loop with multiple variables

for(int i=0,j=10; i<5 && j>0; i++,j--) {
    //code
}

```

```
// 4. Infinite For loop

for(;;) {
    //code
}
```

``` 
// 5. Nested for loop
for(int i=0; i<n; i++) {
  for(int j=0; j<i; j++) {
    //code
  }
}
```

``` 
// 6. For loop with Step/Stride
// Gives control over the increment

for(int i=0; i<=n; i+=2) {
  //code
}
```

### While Loops
- It  executes a block of code as long as a specified condition remains true.
- It is useful when the number of iterations is not known beforehand.
- Use cases of while loop:
  - Input validation: repeatedly ask for input until user provides valid value.
  - Processing data: Traverse array until condition is met.
  - State Machines: Execute logic repeatedly until a state change occurs.
  - Batch Processing: Process multiple tasks (files, records, etc.) until all items are handled.
  - Event Handling: Continuously monitor events like sensor data or network requests.

``` 
int i =0;               //Initialization
while(i < 10) {         //Condition
  
  //code
  i++;                  // Increment or Decrement
  
}
```

``` 
\\ Infinite while loop
while(true) {
  
  //code
  if(specificCondition) {
    break;
  }
}
```

### Applications of Infinite loops
- Server applications : The server shouldn't stop after processing one request. It keeps accepting requests until the server is shut down.
- Operating-system / background processes : A background service may continuously monitor something until service is stopped.
- User input / menu-driven programs : You can continuously show a menu until the user chooses Exit.
- Embedded systems : Some devices need to continuously perform their primary task.
  - A controller might continuously read temperature and adjust a cooling system.
- Event loops : Programs that continuously wait for events can use this concept(Event-driven systems)


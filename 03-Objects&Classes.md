## Object Oriented Programming

- Object-Oriented Programming concepts like classes and objects help structure the data and related operations in a clear and manageable way.
- Combines data (variables) and operations (functions) within a single structure.
- Improves reusability and organization of data. 
- Supports modular programming => Break complex problems into subproblem and create classes for each subproblem in system.
- Makes it easier to represent real-world structures like: Stack (push, pop), Queue (enqueue, dequeue) and Linked List (nodes with data + next pointer)

### Class
- A class is a blueprint or template used to create objects.
- It consists of 2 parts:
  - Data members (Attributes) => Properties or characteristics of an object. They store information related to the object.
  - Member functions/ Methods => Defines the actions or behaviors that an object can perform.
- Eg. class Employee =>
  - Attributes: EmpId, Name, Age, Salary, Dept
  - Methods: displayDetails(), calculateBonus();

### Object
- An object is an instance of a class. It represents a real-world entity created using the class blueprint.
- Stores actual data for attributes and allows to call methods defined in the class.
- Multiple objects can be created from same class.
- Eg. Employee e1 = new Employee();
  - e1.EmpId = 102;
  - e1.Dept = 'HR'
  - e1.salary = 12000
  - e1.displayDetails();

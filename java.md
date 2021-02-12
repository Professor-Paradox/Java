**Java Guide**

Created by Sun Microsystems in 1991 and later acquired by Oracle(in 2020 it's popularity is stable[no major changes or disruptions])

**Index**
- [Java](#java)
  - [Uses of Java](#uses-of-java)
  - [Java features](#java-features)
    - [Comments](#comments)
    - [Naming Conventions](#naming-conventions)
    - [types of variables](#types-of-variables)
    - [Strongly Typed](#strongly-typed)
    - [Command-line Arguments](#command-line-arguments)
  - [Data Types](#data-types)
    - [Primitive](#primitive)
    - [Non-Primitive](#non-primitive)
    - [Casting](#casting)
  - [Operators](#operators)
    - [Arithmetic Operators](#arithmetic-operators)
      - [Increments/Decrements:](#incrementsdecrements)
    - [Relational Operators](#relational-operators)
    - [Logical Operators](#logical-operators)
    - [Assignment Operators](#assignment-operators)
    - [BitWise Operators](#bitwise-operators)
    - [Misc Operators](#misc-operators)
    - [? Operator](#operator)
  - [Control Flow](#control-flow)
    - [Selection Statements](#selection-statements)
      - [If Statement](#if-statement)
      - [If...else statement](#ifelse-statement)
      - [Nested if statement](#nested-if-statement)
      - [Switch statement](#switch-statement)
    - [Iterative(loop) Statements](#iterativeloop-statements)
      - [While loop](#while-loop)
      - [For loop](#for-loop)
      - [Do...while loop](#dowhile-loop)
      - [For-each](#for-each)
    - [Jump Statements](#jump-statements)
      - [Break statement](#break-statement)
      - [Continue statement](#continue-statement)
      - [return statement](#return-statement)
  - [Class](#class)
    - [Methods](#methods)
    - [Passing Parameters](#passing-parameters)
    - [Method OverLoading](#method-overloading)
    - [Method Overriding](#method-overriding)
    - [This Keyword](#this-keyword)
    - [Static Keyword](#static-keyword)
    - [Stack and Heap Memory](#stack-and-heap-memory)
    - [Array](#array)
    - [garbage collection](#garbage-collection)
    - [finalize()](#finalize)
  - [Objects](#objects)
    - [Constructors](#constructors)
    - [Object class](#object-class)
    - [Abstraction](#abstraction)
      - [Abstract](#abstract)
    - [Encapsulation](#encapsulation)
    - [Inheritance](#inheritance)
      - [multiple](#multiple)
      - [multilevel](#multilevel)
    - [Polymorphism](#polymorphism)
    - [Dynamic Method Dispatch](#dynamic-method-dispatch)
    - [Recursion](#recursion)
    - [final](#final)
    - [Variable Arguments](#variable-arguments)
  - [Packages](#packages)
    - [interfaces](#interfaces)
  - [Exception Handling](#exception-handling)
    - [try and catch](#try-and-catch)
    - [multiple catch](#multiple-catch)
    - [throws](#throws)
  - [Multithreading](#multithreading)
    - [Main Thread](#main-thread)
    - [Thread](#thread)
    - [Synchronization](#synchronization)
  - [Enum,AutoBoxing](#enumautoboxing)
    - [Wrappers](#wrappers)
    - [Autoboxing](#autoboxing)
  - [I/O](#io)
    - [Reading/writing to Console/Files](#readingwriting-to-consolefiles)
  - [Applets](#applets)
    - [instanceof](#instanceof)
  - [Generic](#generic)



# Java
## Uses of Java

---

1. Android Development(Java uses JVM[Java Virtual Machine],Android uses[Dalvik Virtual Machine] the class files are converted to Dalvik Executables[dex] )
2. Server Apps(backend of server to process requests and return results)
3. Web Application(for front end and back end of a service)
4. Software Tools(IDE's)
5. J2ME(non smart-phone applications)
6. Embedded Systems(real low space for executing process in iot/smart devices)

## Java features

---

- Object Oriented

  In Java, everything is an Object.

- Platform Independent

  Java is compiled into platform-independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.

  Code-->byte code(jvm readable)-->binary code(converted by jvm of machine)

- Secure

  1. since code is run in jvm(a virtual machine), the actual host machine won't be affected

  2. java doesn't have pointers, and restricts access to out-of-bound arrays [a array of 5 items has a size of 5 and index range of (0,1,2,3,4). C language takes the input of index 5,6 etc which result in bufferoverflow errors, java takes only till index of 4 and index of negative or 5,6, etc result in a outofbounds exception]
  3. which in turn is secure(can't crash the code with buffer-over flow exploits)

- Architecture-neutral

  Java compiler generates an architecture-neutral object file format(byte code), with the presence of Java runtime system, this byte code is understandable by jvm and then converts to architecture specific code

- Portable

  The compiler in Java is written in ANSI C with a clean portability boundary, which is a POSIX subset. The source code and byte code is platform independent so it is very much portable

- Robust

  1. Automatic memory management and garbage collection
  2. Strong type checking
  3. runtime error checking at compile time

- Multithreaded

  programs can perform many tasks simultaneously. Execution of two of more parts of code with max use of cpu.Process inside [light-weight process(threads)]

- Interpreted

  The compiled code(.class file) is converted to machine native code using a interpreter this makes it easy to execute code once compiled.

- High Performance

  Even with use of interpreter there is a chance of executing same code hundreds of times so a Just-In-Time compiler takes care of this type of code and gives interpreter only the code that is non-redundant, which increases the overall performance

- Distributed

  Java is designed for the distributed environment of the internet.

- Dynamic
  When a languages takes inputs and extends it's code in runtime it is dynamic, so java takes other classes that are not their in compile time and add's them into it's codebase for execution


### Comments

1. single line comments are done using //
2. multiple line comments are done with /_ and _/


### Naming Conventions

- every floating point value in java is by default of double data type

| Case             | Usage                   |
| ---------------- | ----------------------- |
| camelCaseLetter  | Variable,Function       |
| PascalCaseLetter | Classname,Interfacename |
| ALLCAPS          | Constants               |

### types of variables

1. Instance Variables:
   - The variables in the class level are instance variables, these are unique to each object/instance.
   - these variables can be accessed only by using object(object.variable)
2. Static variables
   - variables with keyword static are created only once and used multiple times(memory saving and one time modification)
   - also called class variables or fields
3. local variables
   - variables inside a method are local variables and can't be accessed outside them.

Ex: class student{  
 int age,roll;[instance variable, as each student can have unique age,roll numbers]  
 string name;  
 static string college;[same for all the instances/object]  
 int add(int x , int y){(local variables x,y can't access out of method)  
 return x+y;  
 }  
 main(){  
 student s = new student();  
 s.age,s.roll,s.name;(unique for each object so instance variables)  
 syso(x,y);[can't print x,y since they are inside a method so called local variables]  
 }  
 }

### Strongly Typed

Variable Declare/Initialization:

- Since java is a Strong typed language/Static Type language each and every variable needs to declared(to know at compile time)  
  `int x;`
- after Declaring we can Initialize the variable with a literal value  
  `x = 10;`
- we can do all this in a single line  
  `int x = 10;`  
  `<datatype/variableDeclaration> <variableInitialization> <assignmentOperator> <literalValue>;`

### Command-line Arguments 
Command-line arguments are the data given to the program directly after their name when it is executed.  
they are used to perform operations on terminal.  
this is done with use of string args[](this args is the arguments you are giving in the terminal)

Ex: java programname inputs

> java hello.class one two three
## Data Types
### Primitive

| Data type                 | keyword | size(byte=8bit) | Limits                           |
| ------------------------- | ------- | --------------- | -------------------------------- |
| byte                      | byte    | 1               | -128 to 127                      |
| short                     | short   | 2               | -32,768 to 32,767                |
| integer                   | int     | 4               | -2,147,483,648 to 2,147,483, 647 |
| long                      | long    | 8               | -9,223,372,036,854,775,808 to    |
| 9,223,372,036,854,775,807 |
| float                     | float   | 4               |
| double                    | double  | 8               |
| character                 | char    | 2               |
| boolean                   | boolean | NA              |

short 2 bytes
int 4 bytes
long 8 bytes  
float 4 bytes approximately ±3.40282347E+38F (6-7 significant decimal digits)  
Java implements IEEE 754 standard  
double 8 bytes approximately ±1.79769313486231570E+308 (15 significant decimal digits)  
char 2 byte 0 to 65,536 (unsigned)  
boolean not precisely defined true or false

### Non-Primitive

| Data type | keyword |
| --------- | ------- |
| string    |         |
| array     |         |

### Casting

> some times the datatypes needs to be converted into other datatypes then we use a techinique called type Casting

- Two types:

  - Implicit Type Casting:

    When small sized datatype is being put into a large datatype(ex: int(4 bytes) into double(8 bytes)).  
     The programming languages converts it automatically this process is called implicit type casting.

  - Explicit Type Casting:

    When a large datatype needs to be put inside a small datatype we the programmer have to specify it manually(ex: double(8 bytes) into int(4 bytes) we use this syntax)  
     `(datatypename)variable`  
     ex: `(int)5.8979`

## Operators

---

---

### Arithmetic Operators

> These are normal Mathematical Operators used in algebra

| Operator | Description                                        | Syntax                   | Example |
| -------- | -------------------------------------------------- | ------------------------ | ------- |
| +        | Adds two operands/variables                        | operand Operator operand | a + b   |
| -        | Subtracts two operands/variables                   | operand Operator operand | a - b   |
| \*       | Multiplies two operands/variables                  | operand Operator operand | a \* b  |
| /        | Divides two operands/variables                     | operand Operator operand | a / b   |
| %        | performs Modulus[returns the reminder of division] | operand Operator operand | a % b   |
| ++       | Increments(adds) one to the variable               | operand Operator         | a++     |
| --       | Decrements(substracts) one from the variable       | operand Operator         | a--     |

#### Increments/Decrements:  
> a++ and ++a perform same operation in different order

> a++ is post increment so the operation with variable is done first, then after that operation variable is incremented

> ++a is pre increment so the variable is incremented before operation and used in it

---

### Relational Operators

> These Operators are used to Check the relation of variables,they return true if relation is true, else returns false

| Operator | Description                                           | Syntax               | Example |
| -------- | ----------------------------------------------------- | -------------------- | ------- |
| <        | Less Than                                             | variable < variable  | a < b   |
| >        | Greater Than                                          | variable > variable  | a > b   |
| ==       | Equal to                                              | variable == variable | a == b  |
| !=       | Not Equal to                                          | variable != variable | a != b  |
| <=       | Less than or equal to                                 | variable <= variable | a <= b  |
| >=       | greater than or equal to(true if one of them is true) | variable >= variable | a >= b  |

---

### Logical Operators

> gives the output of True or False based on given condition  
> Unless specified all the variables and methods are True

| Operator | Description                                              | Syntax                 | Example  |
| -------- | -------------------------------------------------------- | ---------------------- | -------- |
| &&(AND)  | Returns True if Both values are true, else returns false | variable && variable   | A && B   |
| \|\|(OR) | Return True if Atleast one of the variable is True       | variable \|\| variable | A \|\| B |
| !(NOT)   | Return False If true,returns true if false               | !variable              | !A       |

---

### Assignment Operators

> these operators are used to reduce the size of code(short hand notations)

| Operator            | Description                                 | Syntax                     | Example                                     |
| ------------------- | ------------------------------------------- | -------------------------- | ------------------------------------------- |
| =                   | Equal to(assigns the variable given value ) | variable = value           | a = 5                                       |
| +=, -=, \*=, /=, %= | used to reduce full length operation syntax | variable operator variable | A (+,-,\*,/,%)= B =====> A = A(+,-,\*,/,%)B |

---

### BitWise Operators

> These Operators are done on a variables value on bit-by-bit basis

| Operator | Description                                            | Syntax                              | Example                               |
| -------- | ------------------------------------------------------ | ----------------------------------- | ------------------------------------- |
| &,\|,^,~ | AND,OR,XOR,NOT                                         | variable operator variable          | A (&,\|,^,~) B                        |
| <<       | left shift(shifts the bits to left by specified number | variableName << numberOfBitsToShift | A=01 11 01 so A << 2 becomes 11 01 00 |
| >>       | left shift(shifts the bits to left by specified number | variableName >> numberOfBitsToShift | A=01 11 01 so A >> 2 becomes 00 01 11 |

---

### Misc Operators

> some Operators that are non categorized

| Operator   | Description                                                   | Syntax                                                          | Example                |
| ---------- | ------------------------------------------------------------- | --------------------------------------------------------------- | ---------------------- |
### ? Operator
| ? :        | Conditional Operator(ternary Operator)                        | variable = (Condition) ? value if true : value if false         | z = (a==1) ? 20 : 30   |
| instanceof | checks if the object is of a certain class(true,false output) | ( Object reference variable ) instanceof (class/interface type) | name instanceof String |

---

---
## Control Flow
### Selection Statements

> These Statements have condition to check(True or False) and then some statements to execute based on output

#### If Statement

An if statement consists of a boolean expression followed by one or more statements.

> if( Condition//x < 20 ) {

        (Code to execute)
        System.out.print("Hello");
    }

#### If...else statement

An if statement with an (optional)else statement, that executes when the boolean expression is false.

> if( condition//x < 20 )

    {
      (Execute when true)
        System.out.print("Hello");
    }
    else
    {
      (Execute when False)
        System.out.print("Not Hello");
    }

An If else can have an optional "Else If", This works just like an If but can be used to test various conditions in sequence.
Once a condition is satified all the other else if and else conditions are not checked.

> x=20
> if( x == 10 )
> {

         System.out.print("Value of X is 10");
      }
      else if( x == 20 )
      {
         System.out.print("Value of X is 20");
      }
      else if( x == 30 )
      {
         System.out.print("Value of X is 30");
      }

#### Nested if statement
  
 You can use one if or else if statement inside another if or else if statement(s).

> if( x == 30 )
> {

         if( y == 10 )
         {
            System.out.print("X = 30 and Y = 10");
         }

}

#### Switch statement
 A switch statement allows a variable to be checked with a list of values in the code.  
 When a break statement is reached, the switch terminates.(if no break is present the code continues to next line instead of exiting).  
 optional default case is used, so when non of the case's match this case can be executed for the switch statement.

> switch(grade)  
>  {

    case 'A' :
      System.out.println("Excellent!");
      break;
    case 'B' :
    case 'C' :
      System.out.println("Well done");
      break;
    case 'D' :
      System.out.println("You passed");
    case 'F' :
      System.out.println("Better try again");
      break;
    default :
      System.out.println("Invalid grade");

### Iterative(loop) Statements

A loop statement allows us to execute a statement or group of statements multiple times.

#### While loop

Executes the Statements if the condition
is true (infinite times), unless it is false.

> while( condition // x < 20 )  
>  {

    System.out.print("value of x : " + x );
    x++;//increment
    System.out.print("\n");

}

#### For loop

    Execute Statements Multiple times and defines
    he variable that controls the loop.


> for(int x = 10//initialization; x < 20//condition; x = x + 1//increment)  
>  {

    System.out.print("value of x : " + x );
    System.out.print("\n");

}

> Enhanced For loop:  
>  Used to traverse arrays  
>  For(declaration:expression)  
>  //statements

> int [] numbers = {10, 20, 30, 40, 50};

    for(int x : numbers )
    {
        System.out.print( x );
        System.out.print(",");
    }

#### Do...while loop

    Like a while statement, except that it tests
    the condition at the end of the loop body(after running once).

> do  
>  {

    System.out.print("value of x : " + x );
    x++;
    System.out.print("\n");

}while( x < 20//condition );

#### For-each
### Jump Statements
Loop Control Statements Change the flow of execution, any objects and contents created in here are destroyed when the flow ends.

#### Break statement 
 Terminates the loop or switch statement  
 and transfers execution to the statement immediately following the loop or switch.

> break;

#### Continue statement  
 Causes the loop to skip the remainder of its body
and retest the condition nearest(start execution from beginning of loop)

> continue;

#### return statement



## Class

Java is Basically a Objected Oriented Programming Language, Here everything is an object.

**Class**
A Class in general is a data type.
It is a blue print with rules and guidelines.(used to create objects)
This contains the data that it takes and the code performed on that data.
When you define a class, you declare its exact form and nature.

EX: blue print of a chair,building,location.

> Class classname{code}

### Methods

A Java method is a collection of statements that are grouped
together to perform an operation.

**Can;t create method inside a method in java.**

> Ex: main(){int add(int x,int y){return x+y;}}[not possible]  
> int add(int x , int y ){return x+y;}main(){add(5,4)}[possible]

**Method Creation**

> modifier returnType nameOfMethod (Parameter List)  
> {  
>  // method body  
> }

> public static int add(int a, int b)  
> {  
>  a = 10;  
>  b = 20;  
>  return a+b;  
> }

- modifier − access type of method(optional)

- returnType − datatype of return value if any(void -> nothing to return)

- nameOfMethod − This is the method name.

- Parameter List − the number of parameters, their data type, order of list are really important.(optional).

- method body − Contains the statements to execute.

**Method Calling**

For using a method, it should be called.

Method with code is known as **Called method**. Code that runs the Method is known as **Calling Method**.

> Called method
> int add(a,b){
> return a+b;
> }

> Calling method
> add(5,6);

When a program uses methods, the flow moves around.

- first the calling method gives control to called method
- the called method executes it's code
- then returns the control to calling method when one of two happen
  - the return statement is executed.
  - code reaches method closing brace.

**The void Keyword**
The void keyword allows us to create methods which do not return a value.

### Passing Parameters

    In java, the methods can have optional parameters, these can be given to the called method(function) in two ways.

1. By Value

   the value of a variable is given to the called method and is then copied to different variable (in another memory location.(all primitive datatypes use pass by value)

   > swapFunction(a, b);  
   > public static void swapFunction(int a, int b)  
   > {  
   > System.out.println("Before swapping(Inside), a = " + a + " b = " + b);  
   > // Swap n1 with n2  
   > int c = a;  
   > a = b;  
   > b = c;  
   > }

2. By Reference
   In java only non-primitive datatypes use pass by reference (it's not real pass-by-reference as in you don't use the address syntax like in c).  
   Here the address of the variable is given to the called method. so any changes done are reflected in actual variable.

   > int [] arr={1,2,3}  
   > changecontent(arr)  
   > changecontent(int[] ar){  
   >  ar[0]=5;  
   > }

### Method OverLoading

- Overloading occurs when two or more methods in one class have the same method name but different parameters.
- Overloading is a compile-time concept.
- Compiler identifies different Method based on their method signature(method name and method parameters)

> public void bark(){  
>  System.out.println("woof ");}  
>  //overloading method  
>  public void bark(int num){  
>  if(num ==1 ){  
>  System.out.println("boow");}}

### Method Overriding

- Overriding means having two methods with the same method name and parameters (i.e., method signature).
- Overriding is a run-time concept
- here this keyword is used to differentiate

### This Keyword  
this(keyword)is used as a reference to the object of the current class, used inside(only) of a objects(instance) method or a constructor.  
Using this(keyword) members(variable,methods,constructors) of a class are accessed.

Major use:  
Differentiate the instance variables from local method variables if they have same names, within a constructor or a method.  
can't use inside a static method or class.

> EX:class test{

     int x ,y;(instance variables)
     public test(){(replacing default constructor)
       x=10; y=20;
     }
     public test(int a){x=a;}(don't need this since different names)
     public test(int x,int y){(new constructor with parameters)
        this.x=x;
        this.y=y;(this.x,this.y are instance(object) variable/parameters, x,y are local variable of current constructor)

}

### Static Keyword
Static is used for memory management. We put static before the variable,method,class that are same for multiple instances.  
We don't have to create object to access static classes.

Accessing static content:

| X                               | static/class method/variable | instance/object method/variable |
| ------------------------------- | ---------------------------- | ------------------------------- |
| static/class method/variable    | Direct access                | access with object              |
| instance/object method/variable | direct access                | direct access                   |

> int x,y; void m2(){print(x); print(z);}  
> static int z; static void m1(){print("m1"); print(z);}  
> static main(){m1(); object.m2();}

EX:Instead of creating a new college object for every student we create one static object(that can be used/changed just once for all) and memory won't be wasted.

### Stack and Heap Memory  
When we run the java file jvm takes some memory from os and reserves it and converts some of it to stack and remaining to heap.(if run out shows stackoverflow error and outofmemorye error)

Stack is a Last In First Out Memory space.This is static memory

- here the data is stored in frames(only methods),and variables are given space while declaring.
- the entire method in method in method are stored in order and removed by jvm after their execution.
- the variables are local variables(int a),reference variables(classname objectname) contains the address of object in heap

Heap is a Dynamic Memory. Here data is stored only the file and can be changed.

- Objects,instance variables are stored here
- after their use the data is removed by java garabage collector

### Array
An array is a collection of elements of same data type

using arrays

> dataType[] arrayReferenceVar = new dataType[arraySize];//once given the array size can't change
> ways of accessing:  
> int x[]={1,2,3,4,5};// x size is 5  
> int x[] = new int[5];  
> int[] x = new int[5];  
> int x[] = new int[]{variables}

### garbage collection

### finalize()



## Objects

An Object is an instance of the class with it's unique way of working.
An object can be different from another object which uses same class.

EX: Chairs building from a blueprint, constructing multiple buildings from a single blueprint.

> classname objectreference = new classname();  
> use with  
>  objectreference.classstuff

> code example  
> class calc{  
>  int x,y,z;  
>  void perform(){z=x+y}  
> }  
> main(){  
>  calc obj = new calc();  
>  obj.x=3;  
>  obj.y=4;  
>  obj.perform();  
>  system.out.println(obj.z)}

### Constructors  
Every object in java is created(initialization of variables for objects) with help of a constructor. when their are additional parameters needed we can manually create more constructors.

> classname(parameters);[constructor]  
> EX: class box{  
>  int x,y,z;  
> }

this will have a default box()(looks like a method but is a constructor, and initializes the variables x,y,z to default values 0,0,0.).

> box(){  
>  x=10;  
>  y=20;  
>  z=30;  
> }

here the new constructor box() is used instead of default one.  
so every time a new object of box class is created they use the new constructor/with parameters(if given) and skips the default one.  
all the new objects have these new values(10,20,30).  
when a new constructor is created the default one will no longer be created so we have to create that too.

### Object class
### Abstraction
#### Abstract 

### Encapsulation  
access modifiers are a way of giving permission to read/write/access the variable/method/class(code in general)
in OOPS the code is made private so no other class can access it. and some code is made public to be accessed by any class.
When making code private the operation should be planned.

We use Methods as public and variables as private and mostly use methods to perform all the operation.
Ex: giving a value to doors=4 is done with object.setdoors(4), and to take the value of doors object.getdoors().

### Inheritance 
the concept of taking features from already writen code and extending it's use is inheritance.
the base,super,parent one is the beginning java file and the new java file is the derived,sub,child class.
Ex:

> class one{add()}  
>  class two extends one{ sub()}  
>  class three extends two{ mul()}  
>  three obj = new three();  
>  obj.add,obj.sub,obj.mul

the child class's object can access all the methods of parent classes.

a child can't extend two parents due to ambiguty problems. so java doesn't support multiple inheritance.

in oops the child class method will override the parent class method.(method overriding)
we use **super** keyword to access methods and variables of parent/super class

**Class inside a Class:**
When having a class inside a class we use objects to access them.
We access a class usually with one object,but to access internal class we use the object reference -of outer class and create object for inner class.

> EX:out class{inner class}
> out objout = new out()
> out.inner objin = new objout.inner()
#### multiple 
#### multilevel

### Polymorphism
The word "poly" means many and "morphs" means forms.  
There are two types of polymorphism in Java: '
compile-time polymorphism and runtime polymorphism.  
We can perform polymorphism in java by method overloading and method overriding.

### Dynamic Method Dispatch
The process of using a parent class reference to access a child class object.

### Recursion
### final
### Variable Arguments
Instead of writing redundant code for different length of parameters we can use var args.
(...)
ex: add(x,y,z,a,c,b) //instead of multiple methodoverloading, we use varargs(array).

> add( int ... a)  
> for(int i: a)  
>  sum =sum + i;  
> return sum

## Packages
### interfaces
## Exception Handling
### try and catch
### multiple catch
### throws
## Multithreading
### Main Thread
### Thread
### Synchronization
## Enum,AutoBoxing
### Wrappers
### Autoboxing
## I/O
### Reading/writing to Console/Files
## Applets
### instanceof
## Generic

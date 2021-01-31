**Java Guide**

Created by Sun Microsystems in 1991 and later acquired by Oracle(in 2020 it's popularity is stable[no major changes or disruptions]).This document uses OpenJdk 14.

**Index**
- [Java](#java)
  - [Uses of Java](#uses-of-java)
  - [Compiler vs Interpreter](#compiler-vs-interpreter)
    - [Compiled](#compiled)
    - [Interpreted](#interpreted)
  - [Java features](#java-features)
    - [Comments](#comments)
    - [Naming Conventions](#naming-conventions)
    - [Types of variables](#types-of-variables)
    - [Strongly Typed Language](#strongly-typed-language)
    - [Stack and Heap Memory](#stack-and-heap-memory)
    - [Command-line Arguments](#command-line-arguments)
  - [Data Types](#data-types)
    - [Primitive](#primitive)
    - [Non-Primitive](#non-primitive)
      - [String](#string)
      - [Variable Arguments](#variable-arguments)
      - [Array](#array)
    - [Casting](#casting)
    - [Escape sequences](#escape-sequences)
    - [Math class](#math-class)
  - [Operators](#operators)
    - [Arithmetic Operators](#arithmetic-operators)
      - [Increments/Decrements:](#incrementsdecrements)
    - [Relational Operators](#relational-operators)
    - [Logical Operators](#logical-operators)
    - [Assignment Operators](#assignment-operators)
    - [BitWise Operators](#bitwise-operators)
    - [Misc Operators](#misc-operators)
      - [? Operator](#-operator)
      - [instanceof](#instanceof)
    - [Scanner](#scanner)
  - [Control Flow](#control-flow)
    - [Selection Statements](#selection-statements)
      - [If Statement](#if-statement)
      - [If...else statement](#ifelse-statement)
      - [Nested if statement](#nested-if-statement)
      - [Switch statement](#switch-statement)
    - [Iterative(loop) Statements](#iterativeloop-statements)
      - [For loop](#for-loop)
      - [For-each](#for-each)
      - [While loop](#while-loop)
      - [Do...while loop](#dowhile-loop)
    - [Jump Statements](#jump-statements)
      - [Break statement](#break-statement)
      - [Continue statement](#continue-statement)
      - [return statement](#return-statement)
  - [Clean Code](#clean-code)
  - [Debugging](#debugging)
  - [Class](#class)
    - [Terminology](#terminology)
    - [Methods](#methods)
      - [Passing Parameters](#passing-parameters)
      - [Method OverLoading](#method-overloading)
      - [Method Overriding](#method-overriding)
      - [Method Chaining](#method-chaining)
    - [Anonymous classes](#anonymous-classes)
    - [Static Keyword](#static-keyword)
    - [Garbage Collection](#garbage-collection)
    - [finalize()](#finalize)
  - [Objects](#objects)
    - [Constructors](#constructors)
    - [This Keyword](#this-keyword)
    - [Final](#final)
    - [Object class](#object-class)
    - [Encapsulation](#encapsulation)
      - [Access modifier](#access-modifier)
      - [Getters and Setters](#getters-and-setters)
      - [Coupling](#coupling)
    - [Abstraction](#abstraction)
      - [Abstract](#abstract)
      - [Interface](#interface)
        - [Interface Evolution](#interface-evolution)
    - [Inheritance](#inheritance)
      - [Multiple Inheritance](#multiple-inheritance)
      - [Multilevel Inheritance](#multilevel-inheritance)
      - [Super](#super)
      - [Nested Class](#nested-class)
      - [IS-A Relation](#is-a-relation)
    - [Polymorphism](#polymorphism)
      - [Compile-time](#compile-time)
      - [Run-time](#run-time)
      - [Object Casting](#object-casting)
        - [UpCasting](#upcasting)
        - [DownCasting](#downcasting)
      - [Static Binding](#static-binding)
      - [Dynamic Binding](#dynamic-binding)
      - [instanceOf](#instanceof-1)
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
  - [Generic](#generic)
  - [Recursion](#recursion)
  - [Packages](#packages)



# Java
Java is a programming used to develop front-end,back-end applications,API's etc., Is really wide spread and is the standard language learnt by many programming beginners. 
## Uses of Java
1. Android Development(Java uses JVM[Java Virtual Machine],Android uses[Dalvik Virtual Machine] the class files are converted to Dalvik Executables[dex] )
2. Server Apps(backend of server to process requests and return results)
3. Web Application(for front end and back end of a service)
4. Software Tools(IDE's)
5. J2ME(non smart-phone/feature phone applications)
6. Embedded Systems(real low space for executing process in iot/smart devices)

## Compiler vs Interpreter
There are two types of programming languages compiled,interpreted.
### Compiled
In World War 2,computers were mainly used to crack encryption.After the war,computers are used in industries,companies,institutions.                 
Those Main frames used plug boards,punch cards,analog switches to take instructions,and perform a specific operation.                   
This was tedious,after invention of transistor,binary code replaced analog programming.Still to calculate a trignometric equation it would take an hour to code it in binary.(0's 1's as code).                  

So developers invented an **Assembler**,a mediator that stores most commonly used blocks of binary code,and  reuse it with just few commands.                  
Ex:mov a b(will be replaced by the assembler to 30 lines of binary code,that the machine will compute)              
For a time this was easier than binary coding(machine coding),many lanuguages which used this philosophy are **Assembly languages**,they all had a assembler built for use.These assembly languages are device specific and any change of device,version,cpu would need an entire code rebase.                 
FORTRAN(Formula Translation) was good example,the code was 20x times shorter than machine/assembly code.     
COBOL(Common Business Oriented Language) was invented to address platform independency,a compiler for each machine is created first,then cobol source code is given to that *cobol compiler* to execute.             
So despite the architecture the code will run the same.                        

| year | language |
| ---- | -------- |
| 1957 | fortran  |
| 1958 | algol    |
| 1959 | cobol    |
| 1970 | pascal   |

Higher level computations were tough with assembly level programming. New programming languages like C,fortran,cobol gave better abstraction.      
>(Note:their are compiled languages before C,but C made it better.)

These compiled languages take user source code(written in english like syntax),then analyze it and compile it to a assembly or machine level code that the machine can understand.           
Compilation process is done only once but may take from minutes to hours.      
Once done the output can be run very fast,since instructions(machine code) are directly fed to cpu.       
But for different architectures,Operating systems,Cpu's the source code have to be recompiled over and over.          
Can't use single compiled program in multiple devices(C language creates .out file in linux,.exe file in windows,not interchangable)          

| year | language    |
| ---- | ----------- |
| 1972 | c           |
| 1972 | smalltalk   |
| 1980 | c++         |
| 1984 | matlab      |
| 1986 | objective-c |

Java revolutionized this by creating a mediator in between,to make code portable and secure.      
The program is first compiled into a mediator code called **byte code** that contains the instructions understood by JVM only.            
The java virtual machine has a interpreter built for the specific System it runs in.So the byte code(compiled java code) will then be interpreted to the machine code line by line.takes a bit of performance hit,but is loads better for end user/developer.            
That's why C is faster,java is ubiquotous.              
From that point onwards every new programming language introduced tries to use the previous languages and improve on top of it.           

| year | language   |
| ---- | ---------- |
| 1990 | python     |
| 1993 | R          |
| 1995 | Ruby       |
| 1995 | Java       |
| 1995 | php        |
| 1995 | javascript |
| 2001 | c#         |
| 2006 | powershell |
| 2009 | go         |
| 2011 | kotlin     |
| 2014 | swift      |

**Speed comparision**     
Below table shows the execution time in milliseconds,lower the time the better performance.Same logic is run in different popular languages,code is precompiled.

| language | execution time |
| -------- | -------------- |
| C        | 6              |
| C++      | 7              |
| Java     | 15             |
| python   | 1100           |

### Interpreted
To mitigate compilation time problem some interpreted languages came to existence.          
Interpreter works in different order than a compiler.        
Source code is directly given to the interpreter which then converts it to respected machine code line by line.                 
No compilation is done,but needs long execution time.To make this code protable we just copy the source code into a new machine,and give the code to that machine's interpreter.A risk here is that the source code is exposed to user to tinker/alter with.              
Python is the most used Interpreted language in 2020.                 


## Java features

* <u>Object Oriented</u>           
In Java, everything is an Object.Extends the power of functional programming.           

* <u>Platform Independent</u>           
Java is compiled into platform-independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.   
>Code-->byte code(jvm readable)-->binary code(converted by jvm of machine)          

* <u>Secure</u>
  1. Since code is run in jvm(a virtual machine), the actual host machine won't be affected incase of a bad execution.
  2. Java doesn't have pointers, and restricts access to out-of-bound arrays.In an array of 5 items with size of 5 and index range of (0,1,2,3,4),java takes only till index of 4 and index of negative or 5,6, etc result in a outofbounds exception.           
  Where as C language takes the input of index 5,6 etc which result in bufferoverflow errors.Which in turn makes java secure(can't crash the code with buffer-over flow exploits).

* <u>Architecture-neutral</u>         
Java compiler generates an architecture-neutral object file format(byte code).With the presence of Java runtime system, this byte code is understandable by jvm and then converts to architecture specific code

* <u>Portable</u>        
The compiler in Java is written in ANSI C with a clean portability boundary, which is a POSIX subset. The source code and byte code is platform independent so it is very much portable.The End user pc needs JRE(Java Runtime Environment) for this protable code to run.

* <u>Robust</u>              
  1. Automatic memory management and garbage collection
  2. Strong type checking
  3. runtime error checking at compile time
  
* <u>Multithreaded</u>                   
Programs can perform many tasks simultaneously.Execution of two of more parts of code with max use of cpu.Threads are the small/light-weight Process inside a program's process.

* <u>Interpreted</u>          
The compiled code(.class file) is converted to machine native code using a interpreter this makes it easy to execute code once compiled.

* <u>High Performance</u>              
Even with use of interpreter there is a chance of executing same code hundreds of times so a Just-In-Time compiler takes care of this type of code and gives interpreter only the code that is non-redundant, which increases the overall performance.

* <u>Distributed</u>                
Java is designed for the distributed environment of the internet.

* <u>Dynamic</u>                   
When a language takes inputs and extends it's code in runtime it is dynamic, so java takes other classes that are not their in compile time and add's them into it's codebase for execution.


### Comments
Code inside the comments is ignored by the compiler     
1. Single line comments are done using //
2. Multiple line comments are done with /* and */

### Naming Conventions
A good naming choice/conventions makes the code better maintainable in future.   

| Case             | Used for                | Example        |
| ---------------- | ----------------------- | -------------- |
| camelCaseLetter  | Variable,Function       | xYZ,addValue() |
| PascalCaseLetter | Classname,Interfacename | Main,Api       |
| ALLCAPS          | Constants               | PI,CONSTANT    |
                                                             
### Types of variables

-------
Depending on the location of variable in a java program they are of different types.
1. Instance Variables:
   - The variables in the class level are instance variables, these are unique to each object/instance.
   - These variables can be accessed only by using object i.e,(object.variable)
2. Static variables
   - Variables with keyword static are created only once and used multiple times(memory saving and one time modification)
   - also called class variables or fields
3. Local variables
   - variables inside a method are local variables and can't be accessed outside them.

Ex: class Student{        
 int age,roll;------->[instance variable, as each student can have unique age,roll numbers]        
 string name;        
 static string COLLEGE;-------->[same for all the instances/object]        
 void add(){ ---------->(local variables, x,y can't access out of method)        
 int x,y;        
 }        
 main(){        
 Student s = new Student();        
 s.age,s.roll,s.name;----------->(instance variables,unique for each object)        
 System.out.println(x,y);------->[can't print x,y,local variables since they are inside a method]        
 }        
 }      

### Strongly Typed Language

-----
Variable Declare/Initialization:
- Since java is a Strong/Static typed language each and every variable needs to declared(to know at compile time)  
  `int x;`
- after Declaring we can Initialize the variable with a literal value  
  `x = 10;`
- we can do both at the same time  
  `int x = 10;`  
  `<datatype> <variableDeclaration> <assignmentOperator> <variableInitialization/literalValue>;`
- a strong typed language needs to be structured and all the information of different types of variables,classes,objects needs to known at compile time. This is time consuming for developers to take care about each and every type,but is very fast on execution compared to dynamic type language.

### Stack and Heap Memory  
When we run a java program, jvm takes some memory from os and reserves it.Jvm then converts some of it to stack and remaining to heap.(if the current memory runs out,a stackoverflow error or outofmemory error is raised)

Stack is Last In First Out Memory space.This is static memory
- Stack stores data in the format of frames, stack only stores methods and variables.
- entire code inside a method is stored in stack,after program execution is done, method is removed by garbage collector.
- stack stores local variables(int a) and it's value.and reference variable.
- When an object of a class is created,the object is stored in heap,while the address of the object is stored in stack.that's why class declaration is called reference variable(holds the address reference of object). 

Heap is a Dynamic Memory. Here data is stored and modified.
- Objects,instance variables are stored here
- after their use the data is removed by java garabage collector

### Command-line Arguments 
To give input to the java program while executing we use command-line arguments,these are the additional data passed to program.                        
We give the arguments after the program name.                                         
The String args[] in the main method is the declaration of command line arguments.This takes 0 or more parameters as input.                    
Ex: java programname inputs
> java hello.class one two three

## Data Types
To define which type of data to store in a variable we use data types.Data types in java are classified into two types.

### Primitive
Predefined java data types are primitive data types,all these data types have a class associated to it.

| Data type | keyword | size(byte=8bit) | Limits                                                  |
| --------- | ------- | --------------- | ------------------------------------------------------- |
| byte      | byte    | 1               | -128 to 127                                             |
| short     | short   | 2               | -32,768 to 32,767                                       |
| integer   | int     | 4               | -2,147,483,648 to 2,147,483, 647                        |
| long      | long    | 8               | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | float   | 4               | 3.4e-38 to 3.4e+38, 7 decimal digits                    |
| double    | double  | 8               | 1.7e-308 to 1.7e+308,15 decimal digits                  |
| character | char    | 2               | Unicode values in single quotes                         |
| boolean   | boolean | NA              | True/False                                              |

- by default every integer value is of type int,to use long we specify l/L at end of long variable.
- by default every decimal value is of type double, to use float we specify f/F at end of float variable.
- long numbers with more digits are troublesome to read,so we can use _ to separate values.Ex:2_147_483_648.
- char values are single characters inside single quotes,string values are in double quotes.
- To make a variable constant,(accessible) by all methods, we make it final.
### Non-Primitive
- Non-primitive data types are called *reference types* because they refere to objects.
- these are defined by the programmer,can be null.All types have same memory size,since they are all reference variables.

| Data type | keyword   |
| --------- | --------- |
| string    | String    |
| array     | []        |
| Class     | class     |
| Interface | interface |

In java everything is a class, so all data types are also classes.          
There is a class for every data type(int,byte,char,String.,etc).They are called **wrapper classes**,and has useful methods.               
We can create a object to use those data types.or use their respective short hand notations.               
Classes and interfaces are also data types that are user defined.          
#### String
Strings are commonly used in any programming language,in java we have a string class dealing with strings.Any thing in double quotes is a string.   
Strings are immutable i.e, can't change them,so any method that modifies string gives a new string.

*Syntax:*         
`String variablename/referencename = new String(content in quotations);`             
This is the actual way of using strings but their is a shorthand notation for this.         
`String referencename = "content";`       
>Ex: String name = "raj";   
**methods**      
Their are predefined methods in string class that are used to manipulate the data.Some of them are
1. *tostring*
2. Concatenate: we concatenate multiple strings,values together using + sign.
  >Ex: "test"+x+"hi"
3. *endswith* checks if the string ends with specific word.
4. *startswith* checks if the string starts with specific word.
5. *length* shows the length of characters inside a string
6. *indexof* shows the index of given character/string inside a string.
7. *replace* replaces characters with new characters.
8.  *touppercase* makes all characters to upper case
9.  *tolowercase* makes all characters to lowercase
10. *trim* removes whitespace before and after string. 

#### Variable Arguments
Instead of writing redundant code for different length of parameters we can use var args.
(...)
ex: add(x,y,z,a,c,b) //instead of multiple methodoverloading, we use varargs(array).

> add( int ... a)  
> for(int i: a)  
>  sum =sum + i;  
> return sum
#### Array
Arrays are one of data structures in java. An array is a homogeneous collection of elements.   
Once created the size can't be increased.Can't access index larger than the size of array.If we  do java compiler raises an [Exception](#exception-handling)      
For any methods related to arrays we can use the Array class.          
We create an array with many different syntaxs.                
Syntax:      
>datatype[] variablename = {values};           
>datatype variablename[] = {values};     

this is the most simple and widely used array syntax.       
>Ex: int[] x = {1,2,3,4,5};

Syntax:                
>datatype[] variablename = new datatype[arraysize];      
>variablename[0] = value;         

this is the actual java syntax by creating a object.
>Ex: int[] x = new int[5];         
>int[0]=1;          

* the most common way of retrieving values in an array is by using a for loop,but from java 5 they added for each loops to make it easy.

>Syntax:       

'for(int i : arrayname){     
  print(i);          
}'           
This is easy as we don't have to keep track of index's which means less error's.
**multidimensional arrays**
Just as single dimensional arrays,we use multidimensional arrays.               
syntax:       
>int[][] x = {{1,2,3},{1,2,3}};      

Depending on the need of dimensions we use this.

### Casting
Type casting is the method of converting variable of one data type to another data type.
- Two types of Casting:         
  * *Implicit Type Casting*:                                                                
      Process of converting small data type into large data type is implicit type casting.done automatically by Java.              
    byte-->Short-->char-->int-->long-->float-->double.                 
    Ex: long type variable with int value will be converted to long. int x= 1234; long y =x(implicit type casting is done).  
     
  * *Explicit Type Casting*:    
    Process of converting a large datatype into small datatype is explicity type casting. done by putting the type at the beginning of variable.      
    double-->float-->long-->int-->char-->short-->byte.        
    syntax:`(datatypename)variable`  
     ex: int x=`(int)5.8979f`

### Escape sequences
To include special characters that have meaning to java compiler. we use escape sequences.
we use escape sequences to give meaning.       
Some escape sequences are   

| escape character | output                            |
| ---------------- | --------------------------------- |
| \\               | used to indicate escape character |
| \\"              | prints quotes                     |
| \\n              | prints a new line                 |
| \\t              | prints a tab space                |
| \\\\             | prints a backslash                |

### Math class
There are some predefined methods in math class that can be used to enhance mathematical operations in java.     
* *round* rounds the float value to nearest integer
* *ceil* gives the maximum integer value of a floating number , 1.2 ceil is 2
* *floor* gives the minimum integer value of a floatin number, 1.2 floor is 1
* *random* gives a random floating number between 0 and 1
* *pow* raises a value by given power.
**numberformat**       
In java to represent an number as currency we use predefined method in numberformat class.          
Ex: numberformat currency = numberformat.getcurrencyinstance();           
string x=currency.format(11234515);             
returns a value in dollar format.    

## Operators

---

### Arithmetic Operators

> These are normal Mathematical Operators used in algebra

| Operator | Description                                        | Syntax                   | Example |
| -------- | -------------------------------------------------- | ------------------------ | ------- |
| +        | Adds two operands/variables                        | operand Operator operand | a + b   |
| -        | Subtracts two variables                            | operand Operator operand | a - b   |
| \*       | Multiplies two variables                           | operand Operator operand | a \* b  |
| /        | Divides two variables                              | operand Operator operand | a / b   |
| %        | performs Modulus[returns the reminder of division] | operand Operator operand | a % b   |
| ++       | Increments(adds) one to the variable               | operand Operator         | a++     |
| --       | Decrements(substracts) one from the variable       | operand Operator         | a--     |

**Precedency**        
(),*,/,+,- is the order of precedency for arithmetic expressions.     
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

> Checks If given condition is true/false 
> Unless specified all the variables and methods are True

| Operator | Description                                              | Syntax                 | Example  |
| -------- | -------------------------------------------------------- | ---------------------- | -------- |
| &&(AND)  | Returns True if Both values are true, else returns false | variable && variable   | A && B   |
| \|\|(OR) | Return True if Atleast one of the variable is True       | variable \|\| variable | A \|\| B |
| !(NOT)   | Return False If true,returns true if false               | !variable              | !A       |

---

### Assignment Operators

> these operators are used to reduce the size of code(short hand notations)

| Operator | Description                                 | Syntax              | Example          |
| -------- | ------------------------------------------- | ------------------- | ---------------- |
| =        | Equal to(assigns the variable given value ) | variable = value    | a = 5            |
| +=       | short hand for a+b                          | variable+=variable  | a+=b-->(a=a+b)   |
| -=       | short hand for a-b                          | variable-=variable  | a-=b-->(a=a-b)   |
| \*=      | short hand for a\*b                         | variable\*=variable | a\*=b-->(a=a\*b) |
| /=       | short hand for a/b                          | variable/=variable  | a/=b-->(a=a/b)   |
| %=       | short hand for a%b                          | variable%=variable  | a%=b-->(a=a%b)   |

---

### BitWise Operators

> These Operators are used to perform bit-by-bit transformations on variables

| Operator | Description                                              | Syntax                              | Example                               |
| -------- | -------------------------------------------------------- | ----------------------------------- | ------------------------------------- |
| &        | AND                                                      | variable & variable                 | A & B                                 |
| \|       | OR                                                       | variable \| variable                | A \| B                                |
| ^        | XOR                                                      | variable ^ variable                 | A ^ B                                 |
| ~        | NOT                                                      | variable ~ variable                 | A ~ B                                 |
| <<       | left shift(shifts the bits to LEFT by specified number   | variableName << numberOfBitsToShift | A=01 11 01 so A << 2 becomes 11 01 00 |
| >>       | Right shift(shifts the bits to RIGHT by specified number | variableName >> numberOfBitsToShift | A=01 11 01 so A >> 2 becomes 00 01 11 |

---

### Misc Operators

> some Operators that are non categorized


#### ? Operator          
| Operator | Description                            | Syntax                                                  | Example              |
| -------- | -------------------------------------- | ------------------------------------------------------- | -------------------- |
| ? :      | Conditional Operator(ternary Operator) | variable = (Condition) ? value if true : value if false | z = (a==1) ? 20 : 30 |

#### instanceof
| Operator       | Description                                                   | Syntax                                                          | Example                            |
| -------------- | ------------------------------------------------------------- | --------------------------------------------------------------- | ---------------------------------- |
| **instanceof** | checks if the object is of a certain class(true,false output) | ( Object reference variable ) instanceof (class/interface type) | employeename **instanceof** String |

---
---

### Scanner
To take user input we use scanner class.          
Syntax:          
>Scanner scanner = new Scanner(System.in);
>int age = scanner.nextInt();---->takes int value.

To take string input we use nextLine();
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
if( x == 10 )          
{          
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
{        
if( y == 10 )        
{        
   System.out.print("X = 30 and Y = 10");        
}        
}        

#### Switch statement
A switch statement allows a variable to be checked with a list of values in the code.  
When a break statement is reached, the switch terminates.(if no break is present the code continues to next line instead of exiting).  
An optional default case can be put.This default case will run if none of the switch cases are matched.      

> switch(grade)        
{      
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


#### For loop
Execute Statements Multiple times and defines the variable that controls the loop.
> for(int x = 10//initialization; x < 20//condition; x = x + 1//increment)           
{         
System.out.print("value of x : " + x );         
System.out.print("\n");         
}     

#### For-each
**Enhanced For loop:**
Used to traverse arrays,the datatype inside for should be same as the array datatype.Introduced in java 5.        
>For(declaration:expression)          
//statements          
  
> int [] numbers = {10, 20, 30, 40, 50};            
for(int x : numbers ){            
System.out.print(x+",");                     
}            

#### While loop

Executes the Statements if the condition
is true (infinite times), unless it is false.We use when we don't know how many times the code needs to loop. When we know the specific number we use for.       

> while( condition // x < 20 )          
{        
System.out.print("value of x : " + x );        
x++;//increment        
System.out.print("\n");        
}        

#### Do...while loop
Like a while statement, except that it tests
the condition at the end of the loop body(after running once).

> do            
{          
System.out.print("value of x : " + x );          
x++;          
System.out.print("\n");          
}while( x < 20//condition );          
          

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
return a object,datatype,variable,class.Any thing that was declared.

## Clean Code
The code we write should be clean and simple,easily understandable for others(with comments).        
The code should be self explanatory i.e, the methods,variables names should be meaningful and the program should be a story to read and navigate.       
When some one new reads our code and understands it with out the need of comments then that is a professional code.       
In java the code is structured across objects,so keep the classes meaningful and only methods that are related to it.        
A method should do only one task really good,atmost 30 lines in a method.If it grows bigger extract code that is repeated or is possible to create another method.     
For additional details go [here](./CleanCode.md).


## Debugging
There are two types errors java rises.
1. Compile-time errors
  Errors detected by compiler are called compile time errors,This are mostly syntax errors. 
  Easy to encounter and fix.Editors are helpful in this matter. 
2. Runtime errors
  Errors that occur while the code is executing are called runtime errors. They should be logged and debugged.
  Hard to find and fix as they come out at run time.Fixed with a debugger.  


-----
-----

## Class

### Terminology
| usage term           | Meaning                                              |
| -------------------- | ---------------------------------------------------- |
| Declaration          | telling compiler this is a new member                |
| Initialization       | assigning some value to a member                     |
| Method               | function/block of code                               |
| Method call          | statement that triggers a method to execute          |
| Called method        | method that is being run                             |
| Class                | group of multiple methods,java byte code file        |
| Class/Static members | Static Variables,methods in a class,no object needed |
| Package              | group of classes                                     |
| Library              | group of packages                                    |
| Parameters           | the positional variables in a method definition      |
| Arguments            | actual values in method call                         |
| Access modifier      | Permission to access a member                        |
| Return type          | data type a method can/should return                 |
| Instance/object      | A derivation of class to use                         |
| Instance members     | variable,methods,constructors inside an object       |
| Local variables      | variables inside a method                            |
| Fields               | another name for Static variables,instance variables |


Java is a Objected Oriented Programming Language, Here everything is an object.

**Class**
A Class is a user defined data type.           
It is a blue print with rules and guideline used to create objects.             
When you define a class, you declare its exact form and nature.          
A class contains the data needed by objects and the code/method performed on that data.        

| Class   |
| ------- |
| Data    |
| Methods |

EX: blue print of a chair,building,device.          
Syntax:      
> Class classname{code}


### Methods
A Java method is a collection of statements that are grouped together to perform an operation.         
**Can't create method inside a method in java.**
> Ex: main(){        
> int add(int x,int y)       
> {return x+y;} }----->not possible       
          
> int add(int x , int y ){return x+y;}         
>  main(){add(5,4)}--->[possible]       

**Method Creation**          
We use the following syntax to create methods.      
> modifier returnType nameOfMethod (Parameter List)        
> {         
> // method body          
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
- Parameter List(optional) − takes certain number of parameters, of specified data types.These parameters are identified by their positional order.
- method body − Contains the statements to execute.

**Method Calling**           
For using a method, it should be called.                       
Method containing code is known as **Called method**.                     
Statement that runs the Method is known as **Calling Method**.                     

> Called method               
> int add(a,b){               
> return a+b;               
> }               

> Calling method               
> add(5,6);               

When a program uses methods, the flow moves around.
- first the calling method gives control to called method
- the called method executes it's code
- then returns the control to calling method
  - the return statement is executed,if present.    

**The void Keyword**                
The void keyword allows us to create methods which do not return a value.            

#### Passing Parameters
**parameters**                
the variables in method declaration         
**arguments**             
values in method call.

>Ex:add(a,b) a,b--> parameters      
>add(3,5) -->3,5 arguments.  

Two ways of passing parameters
1. By Value       
When parameters are passed by value,we use it as a regular variable.        
Consider this            
we copy the parameter into a new variable,then these two variables are independent after copying.          
A change in one variable won't effect another.       
all primitive variables work on pass by value principal.     
> swapFunction(a, b);  
> public static void swapFunction(int a, int b)  
> {  
> int x = a;----->copying 
> int y = b;----->copying
> x++;y++;------>independent with a,b.    
> }       

2. By Reference             
When a reference is passed,it is dependent on actual object.        
all non-primitive data types are passed by reference only.              
it's not real pass-by-reference as iyou don't use the address syntax like in c.           
in the below example,the array reference/address is passed as a parameter,so any change done with this reference affects the original array.       
> int [] arr={1,2,3} 
> changecontent(arr)---->passing reference  
> changecontent(int[] ar){  
>  ar[0]=5; ------>arr={5,2,3}original array was changed.    
> }

#### Method OverLoading
- Overloading is having two or more methods with the same method name but different parameters.
- Overloading is a compile-time concept.
- Compiler identifies different Method based on their method signature(method name and method parameters)
- recommended not to make too many overloaded methods,become ugly overtime,less maintainable.   
> public void bark(){  
>  System.out.println("woof ");}  
>  //overloading method  
>  public void bark(int num){  
>  if(num ==1 ){  
>  System.out.println("boow");}}

#### Method Overriding
- Overriding means having two methods with the same method name and parameters (i.e., method signature).
- Overriding is a run-time concept,used with inheritance.Override a parent methods in child class.            
- **this** keyword is used to differentiate between methods.     
- **@override** is an annotation used to specify compiler the method is being overridden.  

>Ex:     
Class parent{     
  void test(){hi}---->default method     
}     
class child{     
  @override     
  void test(){bye}----->overridden method     
}     
main(){child c = new child();     
c.test();----->calls method depending on class reference,decides at run-time.     
}     

| OverLoading          | OverRiding                 |
| -------------------- | -------------------------- |
| Same method name     | Same method name           |
| Different parameters | Same parameters            |
| Compile-time         | Run-time                   |
| Used with any method | Used with inherited method |


#### Method Chaining
Instead of using multiple instances,statements to perform a task, we can get it done with single statement,with help of method chaining.        
Here the methods are executed normally,as if they are used seperately.       
if any data is needed they will take from the output of previous method.      
Ex: getvalue().format().tostring(); 

### Anonymous classes
There are situations where we create a class,just to use a single method in it.This is not memory efficient.             
So We use anonymous classes,here we give the actual method we need after the object.and use the object normally.     
can't reuse this method with other objects.Anonymous classes,methods are one off.        
Ex:
>class object = new object(){         
  method().... code ....         
};            
object.method();      

### Static Keyword
Static is used for memory management. We put static before the variable,method,class that are same for all instances/objects.           
We don't have to create object to access static members,Constant across the class.       

Accessing static content:      
Static member is class level,instance member is object level.  

| X                        | Access                                           |
| ------------------------ | ------------------------------------------------ |
| static method/variable   | Can access other static methods only             |
| instance method/variable | Can access other Static methods,instance methods |
| static method/variable   | Can access instance method with object           |

Ex:                    
>class test{             
static met(){code};------->static method             
add(){code};------->instance method             
public static void main(){             
  met();------->accessible             
  add();-------->can't acccess             
  new test().add();------->can access             
}}                  


EX:Instead of creating a new college object for every student we create one static object(that can be used/changed just once for all) and memory won't be wasted.


### Garbage Collection
Since java is static typed and uses stack and heap memory,we have to be specify which type uses what data and give memory for that to use.     
But we don't have to deallocate memory.            
java has a tool called garbage collection, which frees memory from both stack and heap,following below conventions.      
1. Memory in stack is freed as soon as the method,variable execution ends.      
2. So all the references of objects are freed as soon as their execution stops.   
3. Memory in heap is freed by garbage collector if it doesn't have any references.  

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
Constructor is used to perform initialization of a object,this means it gives all the variables,methods inside the class to the object.       
In java the compiler will create a default constructor,to create an object.      
Rules:
- Constructor has the same name as class,case sensitive.
- Constructor doesn't have a return type.
- Will get called automatically when we create an object. 
- When user defines a constructor,the default one will not be created by the compiler.    
- default constructor doesn't have any arguments,Overloaded constructors can have arguments.
- The default constructor initializes all default values to a variable,i.e, null to reference types,0 to integers and so on.  

Syntax:
> classname(parameters){code};[constructor]                

> EX: class box{  ---->class              
>  int x,y,z;                
> box(){}---->constructor/default one hidden              
> box(string,int){code;}--->overloaded constructor              
> }              
> box b = new box();---->constructor call              
> box b = new box("abc",1234);---->constructor call              

Depending on the constructor called,we can perform custom operations,like assign values to variables during object creation itself.    
We use this to reduce coupling.   

### This Keyword  
Story time:     
Conside this code block
>Ex: x=10,y=20;       
>method(a,b){x = a,y=b;}           

Here all variables are unique,local variables and instance variables are easily distinguisable.       
But to make code easy to read, make the flow ressemble a story,we use meaningful names,some times the variables,method names have to repeated.    
>x=10,y=20;              -->instance variable               
>method(x,y){x=x,y=y;}              -->local variable                   

Here java compiler can't tell local variable from instance variable,ambiguity problem.       

To solve this we use **this**.**this** is a java keyword that tells the compiler,to use the object in it's place.Consider example          

> EX:class test{        
int x ,y;-------->instance variables               
public test(){x=10; y=20;}                         
public test(int a){x=a;}-------->no need of **this**                 
public test(int x,int y){ ---------->local variables                             
this.x=x;                 
this.y=y;----------->this.x,this.y are instance variables                                
}                 

<b>this(keyword) is used as a reference to current object(instance of class).</b>       
Can't use inside a static method or class.Since **this** references to an object.      
In the above code when we say this.x,java compiler replaces that to object.x.     
So only works when a object is created. 

### Final
An method,variable,class that is declared final cannot be changed.        
Once created can't be modified.used for constant variables,or stop inheritance for a class.

### Object class
Object class is the base class for all objects. 
Java compiler extends all classes with object class.Has some useful methods to use/override.     

methods inside object class      
1. toString(): return the string representation of object and hashcode
2. hashcode(): returns the integer converted hashcode of object address.
3. equals(obj): checks if two objects have same address.

### Encapsulation  
Encapsulation is the process of keeping the data and methods in a single unit/object.   
An example would be giving a capsule that has everything it needs inside it.Like a tablet.       
What we do inside it a encapsulated class doesn't effect any other class using it.       
This is the first major Object Oriented concept.Since every class is essentially a capsule,that can be then abstracted.            

* Encapsulation helps abstraction,As abstraction is hiding underlying code,we use encapsulation to actually hide that data.  
* We hide the implementation methods,and show the method that performs operation to user.Hence encapsulated and abstracted.      
>Ex:public mathAdd(a,b){code;add(a,b);show(a,b);}   
private add(a,b){code};       
private show(a,b){code};           
* Isolating the methods,variables that are not needed for other classes.makes class clean and less coupled with other classes.

#### Access modifier
Access modifier are the permission a user/method/class have.      
So depending on the permission/access it defines,the code flow changes.        
There are multiple access modifiers,they are:

| modifer       | Detail                                                              |
| ------------- | ------------------------------------------------------------------- |
| **public**    | Can access everywhere                                               |
| **protected** | Can access inside a package,and outside package through inheritance |
| **default**   | Can only access inside a package(default implementaion)             |
| **private**   | Can only access inside a class                                      |

We use different access modifers in different places,for making code better Object Oriented.         
Java preferred Access for various parts of code.    

| X            | Access         | Prefer           |
| ------------ | -------------- | ---------------- |
| Variables    | All            | Private          |
| method       | All            | Public/Private   |
| constructor  | All            | Public/Protected |
| class        | Default/public | Public           |
| Nested class | All            | Private/Public   |

In the above table different parts of code can have different type of access allowed by default.     
To make our code Encapsulated and less Coupled,we use prefered access modifers.    

#### Getters and Setters
* To make sure the data format is as we need it,we can perform data validation.But we can't perform data validation on variables,only inside a method.
* So we use Access modifier to define the permission,then perform data validation inside a method.  
* This is done by making variables private and modifing them through methods.
* The method that sets the value is setter,the method that gets the value is getter.
>Ex:private int x;---->private variable                
public void setx(int x){---->setting value to variable                
  this.x=x                
}                
public int getx(){------> returning value when called.                
  return x;                
}                
* now we can perform data validation inside setter and getter method if needed.     
 
#### Coupling
The process of having dependencies on other classes,packages is called coupling.         
The more dependencies,the more coupled that class is.      
We use encapsulation to make our class,less coupled as possible.      
This makes code better maintainable,since doesn't rely on other classes.   

### Abstraction
Abstraction is the process of hiding unneccesary details, and providing only useful methods/functions to user.        
We hide the logic and only give implementation, to operate on.              
Method are a part of abstraction.              
>Ex:int add(a,b){     
>if(a>0 && b>0)       
>{ somemethod();          
>  return a+b;}}            

and we can access this method with just a method call add(2,3),but we don't know if the method uses an *if* statement or a for loop or any logic,we just know that it will add two variables and return a integer.                
Makes code better organised and maintainable.        
Instead of knowing every method involved in a calculation,we hide them all,then provide user with a essential and useful method.            


#### Abstract 
Above example is simple abstraction,but to make code organized in large scale, java has abstract classes and Interfaces.used with **abstract** keyword.                 
Syntax:           
abstract method();      
abstract class{}       

1. Java abstraction is more used with inheritance,and provides better structure and code flow.
2. An **abstract method** is a empty method that doesn't have a logic in it. the child class can override this method and implement it's own logic,used mainly to create a predefined structure.So whatever the logic user needs can be implemented while retaining the existing code structure.            
  * abstract methods can only be written inside an abstract class.   
  
  Syntax:
  >abstract method();         

  inside a inherited class.         
  >@override---->override tells the compiler it's an method override        
  method(){           
    logic}                 

      
3. An **abstract class** can have both abstract and non-abstract methods.Used for inheritance and provides a class level structure.  

  >Ex:              
  abstract class{---------->defining a class as abstract              
    abstract method();-------->declaring a abstract method              
    method2(){--------->creating a normal method              
      some code              
    }              
  }              

  >anotherclass extends class{-------->inheriting a abstract class              
    @override------------->notifing compiler of the override              
    method(){some logic}------>implementing the abstract method.              
    method2();------->calling the existing method.              
  }              

4. A Class that inherites an abstract class should override the abstract methods in it.If won't override then, a compiler error is raised.   
5. Can't use abstract classes to create objects.   
    
#### Interface
An interface is a full abstract class,in this all methods,variables are by default abstract.        
Used to implement multiple inheritance in java.       
* we use **implements** keyword to use interface in another class.
* can implement multiple interfaces at once,separating with a comma. 
* can't use interfaces to create objects.
* should override the abstract methods in interface.if not a compiler error is raised. 

  >Ex:                
  public interface test{--------->creating a interface                
    public void set();}-------->creating a abstract method                
    public train implements test{--------->using a interface in another class                
    @override--------->overriding an abstract method                
    public void set(){                
    code------->internal logic                
    }                
  }                

##### Interface Evolution
Interfaces where changed over time,to add new features while retaining backwards compatibility of older code bases.   
In java 1.0 an interface can only have  
1. *public final static variable*/also called constants
>interface somename{  
>	public static final String variable ="value";}    

2. *public abstract returntype method*/should override 
>interface somename{   
public abstract void method();}   

  In java 8.0 interface can also have     
3. *public default returntype method*   
These are used to create new methods without changing exisiting codebase,can ,but don't have to implement in class.
>interface name{-------->interface      
public default int method(){code}}------>default method with logic      
class somename implements name{     
object.method();------->method call     
@override     
public int method(){somenewcode}------->can override the default method       
object.method();}-------->overridden method call     

4. *public static returntype method*  
  These are static methods that can be accessed only with interface name.
>interface name{      
public static method(){code}}----->static method,same as static method in class     
class somename implements name{     
name.method();}-------->calling with interface name         
  
  From java 9.0 interface can have
5. private methods
  All the above methods from java 9 have private implementations,except abstract.       
  Can only be used inside interface,used to reuse code across multiple interfaces,just like classes
>interface name{    
public default int method(){    
method2();    
method3();}   
private int method2(){code}   
private static int method3(){code}    
}   

### Inheritance 
Inheritance is extending existing class with a new class. 
The starting class is called parent/base/super class,the extended class is called child/sub class.       
Child class is derived from parent class.     

Ex:            
> class one{add()}              
>  class two extends one{ sub()}              
>  class three extends two{ mul()}              
>  three obj = new three();              
>  obj.add,obj.sub,obj.mul            

* The child class's object can access all the methods of parent classes.     
* A child can't extend two parents due to ambiguty problems. so java doesn't support multiple inheritance.
* In oops the child class method will override the parent class method.(method overriding),we use **super** keyword to access methods and variables of parent/super class

#### Multiple Inheritance 
Multiple inheritance is concept of having two parents and extending both.      
In Java multiple inheritance is disabled.The reason of explanation was to avoid ambiguity.    
* consider two classs with method add(),and child class uses method add(),then java compiler doesn't know which add() method to access from two classes.     
* We use Interface to get multiple inheritance.    
* Here two Interfaces can have same method add(),since interfaces don't contain logic/code. It doesn't matter which interface we are taking add() from.    
* While using interface we have to implement the logic in child class.
Ex:
>interface first{add();}           
>interface second{add();}           
>class example implements first,second{-------->multiple inheritance.           
  add(){logic}------------>logic of method           
}           
* Multiple inheritance is enabled in python,there the method logic is present in classes.
* They solve by specifying which classes method to use.
>Ex:             
class Class3():----------->new class             
  def m(self): ------------>method in class             
    print("In Class3")             
class Class2(): -------->new class             
  def m(self): ---------->method in class             
    print("In Class2")              
class Class4(Class3, Class2): --------->child class with multiple inheritance             
  pass------->no code             
obj = Class4() -------->object of child class             
obj.m() -------->accessing first inherited parent method/Class 3 will be printed.             
Class2.m(obj)------>accessing method of specific class,so no ambiguity.             

#### Multilevel Inheritance
In java multilevel inheritance is having child,grand-child,grand-grand-child classes.can have many levels of sub classes to one parent class.             
Object Class is the Parent class of all user defined classes.               
>Ex:         
class 1{}------>parent class         
class 2 extends 1-------->child class         
class 3 extends 2 ----------->grand-child class         
class 4 extends 3------->great-grand-child class         

* Every Class should have a default constructor with no parameters,Inheritance won't work without constructors in parent classes.      
* If we wan't we can call the constructor of parent class with super keyword.         


#### Super
To invoke ,variables,methods,constructors of parent class in sub class we use super keyword.      
Remember objects of child class can access parent class methods,But Classes should use super keyword.    
>Ex:  
class train{----------->base class  
 train(int x){---------->constructor  
    System.out.println("inside train"); 
 }}       
class train2 extends train{---------->child class     
train2(){---------->constructor        
   super(5);------------>invoking parent class constructor  
   System.out.println("inside train2"); 
}}  
train2 t = new train2();-------->creating child class object. 

* **super** can be used to invoke/use methods/variables/constructor of immediate parent class,can't access grand father's members.
* **super()** should be the first statement in constructor.
* in the above example the child class object is created,super() is invoked so parent's constructor is ran first,then the child constructor is invoked.    
* java compiler puts super() by default,hidden.  

#### Nested Class
**Class inside a Class:**        
When having a class inside a class,we use objects to access internal class.     
Here the internal class is treated like a method.        
We access a class usually with one object,but to access internal class we use the object reference -of outer class and create object for inner class.           

> EX:out class{inner class}            
> out objout = new out()            
> out.inner objin = new objout.inner()            

#### IS-A Relation
We say two classes/objects have inheritance in plain language by saying,class A is-a class B.     
Example:Animal-->mammal-->Dog-->pup,here we say every     
1. pup is a dog
2. dog is a mammal
3. mammal is a animal     
But not every   
4. animal have to be a mammal
5. mammal have to be a dog
6. dog have to be a pup 
  
### Polymorphism    
The word "poly" means many and "morphs" means forms.Polymorphism is the concept of a single object doing multiple things/works depending on the context.              
* We use parent class reference and child class object to perform polymorphism
* It is mostly method overloading and method overriding,but done with respect to objects.   
Syntax:
>class objectreference = new class();------>regular object creation     
>Parentclass objectreference = new childclass();----> polymorphism.     
>Animal abc = new Dog();----->upcasted object.     

** Rules:**
1. The methods/variables(members) in parent class are inherited by child classes,this is inheritance.
2. When using parent reference type and child object,as given in syntax.We can only access the members of parent class and overridden members in child class. 
3. Any extra members in child class can't be accessed,throws a compile error.
4. To access those members inside the child class,we have to use Downcast.

**Advantages**    
1. Don't have to care what type of class or method the user implements,can just take the reference of parent class and work on that.

* here we create a class and extend it with multiple classes,that provide dynamic polymorphism.
* The cashregister method doesn't care about methods,it accepts a payment object,and applies the charge method.
* This way it is easy for the user/developer to make a single method/object perform multiple operations depending on the context.This is the power of polymorphism. 

>Ex:               
public class test {---------> default class                
   public static void cashRegister(pay p){-------->method taking payment reference                
      System.out.println("processing payment ");                     
      p.charge(15);---------->calling method inside the object                
      if(p instanceof card)------->checking if the object is of specific class                
         ((card)p).cashBack();---------->downcasting object to call a method                
   }public static void main(String[] args) {                     
   pay payment= new card();------->upcasting child class object                
   cashRegister(payment);--------->calling above method                
}                     
}                     
class pay{--------->parent class                
   void charge(int x){}-------->method defined,providing structure                
}                     
class card extends pay{--------->child class                
   @Override---------->overridden method with annotation for compiler                
   void charge(int x){---------->overridden method                
      System.out.println("deducted "+x+" dollars from your card ");   ------>custom logic                  
   }                     
   void cashBack(){--------->child specific method                
      System.out.println("providing cashback for purchase");                     
   }                     
}                     
class money extends pay{---------->child class of pay                
   @Override                     
   void charge(int x){--------->overridden method                
      System.out.println("paid"+x+"in cash");                     
   }                     
}     
  

There are two types of polymorphism in Java:      
1. **compile-time** polymorphism
2. **runtime** polymorphism.

#### Compile-time        
Here the flow of our project/code is resolved at compile time,also called static polymorphism.                    
[Method Overloading](#method-overloading) is compile-time polymorphism.          

#### Run-time
When the flow of our project/code is resolved at run-time,it is Run-time polymorphism, also called **Dynamic polymorphism**.             
[Method Overriding](#method-overriding) is Dynamic polymorphism.            

#### Object Casting
**Story**      
In java when we create a object by `class obj = new class();`,in this obj object we will have all the methods,variables of class. 
So an inherited class will have all the variables,methods both overridden,overloaded of parent and child class inside it.   
So as the inheritance levels grow the size of last child object increases,since it will have all  data,methods of classes above it. 

>So instead of referring them with just their own classname and object name,Polymorphism was introduced to create a structure for object handling.       

A parent reference can accept objects of all it's children classes.   
Depending on the need of object we cast the reference either Upcast or DownCast.  
This helps massively in code maintainance,optimization as we have less references and objects to keep track of.Makes code readable.     
##### UpCasting
Upcasting is casting to supertype,Downcasting is casting to subtype.    
Upcasting is done by default.   

As stated above an object of child class will have all members of parent and extra child members in it.       
So in **upcasting** the child object will still have all those members,just not accessible due to parent reference type.       
But in **down casting** the object is of parent,so it doesn't have child methods,so can't add new data to an object after creating.      
Data and methods are put inside the object while it is created with **new**.Any thing after that is just modification operations.     

Syntax:   
`classname reference = new childclass();`        
this is the default implementation of polymorphism,it is upcasting.        

##### DownCasting
Downcasting is done by    
Syntax:   
`classname reference = (classname(objectname));`------->explicit conversion   
`(classname(objectname)).method();`------->direct method call,when needed.   

Downcasting should be done carefully,or a **ClassCastException** is raised. 
Which means couldn't covert the current object into specified class,maybe it's not related. 
So we use **instanceOf**,to verify.

#### Static Binding
* Static binding is when the compiler knows,which member of class is being accessed by which member/class,at compile time.         
* members declared with static,final,private create static binding members,since they can't be overridden and their details are known at compile time.        
* When a parent class reference is used with static binding,the members of parent class are accessed.      
Ex:animal abc = new dog();  
members of abc are given priority in static binding.         


#### Dynamic Binding
* Dynamic Binding is when the relation between members is found at runtime.      
* Compiler doesn't know which method to use at compile time,since it only uses reference variables,not objects.
* method overridding is Dynamic Binding.

#### instanceOf
used to check if an object belongs to a class,filters runtime errors, implements polymorphism.  
Syntax:   
>objectreference instanceof Class





## Exception Handling
Null pointer Exception:
When a non-primitive/reference variables is not initialized it will have a value of null.Which means nothing,either a object,string or array etc.,            
But if we try to access the methods related to those classes then we will get an exception,because we are trying to access methods of an object that doesn't exist.                      
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

## Generic
## Recursion



## Packages
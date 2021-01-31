- [History And Evolution Java](#history-and-evolution-java)
  - [Why Java was Invented?](#why-java-was-invented)
  - [What is Java?](#what-is-java)
  - [Java version History](#java-version-history)
    - [Java 1.0 features](#java-10-features)
    - [Java 1.2 features](#java-12-features)
    - [Java 1.3 features](#java-13-features)
    - [Java 1.4 features](#java-14-features)
    - [Java 1.5 features](#java-15-features)
    - [Java 1.6 features](#java-16-features)
    - [Java 1.7 features](#java-17-features)
    - [Java 1.8 features](#java-18-features)
    - [Java 9 features](#java-9-features)
    - [Java 10 features](#java-10-features-1)
    - [Java 11 features](#java-11-features)
    - [Java 12 features](#java-12-features-1)
    - [Java 13 features](#java-13-features-1)
    - [Java 14 features](#java-14-features-1)
    - [Java 15 features](#java-15-features-1)
  - [C vs C++ vs Java](#c-vs-c-vs-java)
  - [Features of Java](#features-of-java)
    - [Simple](#simple)
    - [Object Oriented](#object-oriented)
    - [Robust](#robust)
    - [Multithreaded](#multithreaded)
    - [Architecture Neutral](#architecture-neutral)
    - [Interpreted](#interpreted)
    - [Distributed](#distributed)
    - [Dynamic](#dynamic)
- [Installation](#installation)
  - [Installation of Java](#installation-of-java)
  - [Installation of IDE](#installation-of-ide)
- [Overview](#overview)
  - [Hello World! Program](#hello-world-program)
  - [Compiling and Executing](#compiling-and-executing)
  - [Structure of Java Program](#structure-of-java-program)
  - [Execution Process](#execution-process)
    - [Stack and Heap](#stack-and-heap)
  - [JDK,JRE,JVM](#jdkjrejvm)
  - [JVM Architecture](#jvm-architecture)
  - [Two Paradigms](#two-paradigms)
    - [Procedural Paradigm](#procedural-paradigm)
    - [Object Oriented Paradigm](#object-oriented-paradigm)
  - [Code Block](#code-block)
  - [Static Typed Language](#static-typed-language)
  - [Keywords](#keywords)
  - [Identifiers](#identifiers)
    - [Naming Conventions](#naming-conventions)
  - [White Spaces](#white-spaces)
  - [Separators](#separators)
  - [Comments](#comments)
    - [Single Line](#single-line)
    - [Multi Line](#multi-line)
- [Procedural Programming](#procedural-programming)
  - [Variables](#variables)
    - [Scope](#scope)
  - [Data Types](#data-types)
    - [Primitive](#primitive)
      - [Integers](#integers)
        - [byte](#byte)
        - [short](#short)
        - [int](#int)
        - [long](#long)
      - [Decimals](#decimals)
        - [float](#float)
        - [double](#double)
      - [Characters](#characters)
      - [Boolean](#boolean)
    - [Non-Primitive](#non-primitive)
      - [Array](#array)
      - [String](#string)
      - [Classes](#classes)
    - [Type Casting](#type-casting)
      - [Implicit](#implicit)
      - [Explicit](#explicit)
  - [Unicode System](#unicode-system)
  - [Operators](#operators)
    - [Arithmetic Operators(+,-,*,/,%,++,--)](#arithmetic-operators---)
    - [Relational Operators(<,>,<=,>=,==,!=)](#relational-operators)
    - [Logical Operators(&&,||,!)](#logical-operators)
    - [Assignment Operator](#assignment-operator)
    - [? Operator](#-operator)
    - [Operator Precedence](#operator-precedence)
  - [Reading Console Input](#reading-console-input)
  - [Writing Console Output](#writing-console-output)
    - [Control Flow](#control-flow)
      - [Selection Statements](#selection-statements)
        - [if](#if)
        - [switch](#switch)
      - [Iterative Statements](#iterative-statements)
        - [while](#while)
        - [do while](#do-while)
        - [for](#for)
        - [for each](#for-each)
      - [Jump Statements](#jump-statements)
        - [break](#break)
        - [continue](#continue)
        - [return](#return)
      - [Nested Statements](#nested-statements)
      - [Exercises](#exercises)
        - [Math Problems](#math-problems)
        - [Star Patterns](#star-patterns)
    - [Methods](#methods)
      - [Method with Zero Parameters](#method-with-zero-parameters)
      - [Method with One or More Parameters](#method-with-one-or-more-parameters)
      - [Void Method](#void-method)
      - [Non-Void Method](#non-void-method)
      - [Recursion](#recursion)
- [Object-Oriented Programming](#object-oriented-programming)
  - [What is OOP?](#what-is-oop)
  - [Why Use OOP?](#why-use-oop)
  - [Class](#class)
  - [Object](#object)
    - [Declaration (Class varName)](#declaration-class-varname)
    - [new (Instantiation)](#new-instantiation)
    - [Constructor (Initialization)](#constructor-initialization)
  - [Garbage Collection](#garbage-collection)
  - [finalize()](#finalize)
  - [Access Modifiers](#access-modifiers)
    - [public](#public)
    - [protected](#protected)
    - [default](#default)
    - [private](#private)
    - [Access modifier vs Access specifier](#access-modifier-vs-access-specifier)
  - [Non Access Modifiers](#non-access-modifiers)
    - [Final](#final)
    - [Static](#static)
    - [Non-Static](#non-static)
    - [Abstract](#abstract)
    - [Synchronized](#synchronized)
    - [Transient](#transient)
- [Inheritance](#inheritance)
  - [IS A relation](#is-a-relation)
  - [HAS A relation (Aggregation)](#has-a-relation-aggregation)
  - [Association](#association)
  - [Composition](#composition)
  - [Single Level Inheritance](#single-level-inheritance)
  - [Multi-Level Inheritance](#multi-level-inheritance)
  - [Hierarchical Inheritance](#hierarchical-inheritance)
  - [Multiple Inheritance](#multiple-inheritance)
  - [Hybrid Inheritance](#hybrid-inheritance)
  - [Why Multiple and Hybrid Inheritance, Not supported by Java?](#why-multiple-and-hybrid-inheritance-not-supported-by-java)
  - [this](#this)
  - [super](#super)
  - [final](#final-1)
  - [this vs super](#this-vs-super)
  - [this() vs super()](#this-vs-super-1)
- [Polymorphism](#polymorphism)
  - [Compile Time Polymorphism](#compile-time-polymorphism)
    - [Method Overloading](#method-overloading)
    - [Constructor Overloading](#constructor-overloading)
    - [Operator Overloading](#operator-overloading)
  - [Run Time Polymorphism](#run-time-polymorphism)
    - [Method Overriding](#method-overriding)
    - [Constructor Overriding](#constructor-overriding)
    - [instanceOf](#instanceof)
  - [Overloading vs Overriding](#overloading-vs-overriding)
- [Abstraction](#abstraction)
  - [Abstract Method](#abstract-method)
  - [Abstract Class](#abstract-class)
  - [Interface](#interface)
  - [Abstract Class vs Interfaces](#abstract-class-vs-interfaces)
  - [Changes to Interfaces](#changes-to-interfaces)
- [Encapsulation](#encapsulation)
  - [Getters](#getters)
  - [Setters](#setters)
  - [Java Bean Class](#java-bean-class)
  - [Encapsulation vs Abstraction](#encapsulation-vs-abstraction)
- [Object Class](#object-class)
  - [Default Methods](#default-methods)
- [Dynamic Method Dispatch](#dynamic-method-dispatch)
- [Object Casting](#object-casting)
  - [UpCasting](#upcasting)
  - [DownCasting](#downcasting)
  - [Why to use Object Casting?](#why-to-use-object-casting)
- [Inner Classes](#inner-classes)
- [Lambda Functions](#lambda-functions)
- [Static Block](#static-block)
- [Command Line Arguments](#command-line-arguments)
- [Packages](#packages)
  - [Creating Packages](#creating-packages)
  - [Importing packages](#importing-packages)
- [Exception Handling](#exception-handling)
  - [Exception Types](#exception-types)
  - [Built-in Exceptions](#built-in-exceptions)
  - [try-catch Block](#try-catch-block)
  - [finally](#finally)
  - [Nested Try Statements](#nested-try-statements)
  - [Custom Exceptions](#custom-exceptions)
    - [throw](#throw)
    - [throws](#throws)
  - [final vs finally vs finalize](#final-vs-finally-vs-finalize)
- [MultiThreading](#multithreading)
  - [Thread Model](#thread-model)
  - [Synchronization](#synchronization)
  - [Main thread](#main-thread)
  - [Create Thread](#create-thread)
    - [Thread Class](#thread-class)
    - [Runnable Interface](#runnable-interface)
  - [Deadlock](#deadlock)
- [Wrapper Classes](#wrapper-classes)
  - [Boxing](#boxing)
  - [Unboxing](#unboxing)
  - [Auto Boxing](#auto-boxing)
  - [Auto UnBoxing](#auto-unboxing)
- [Annotations](#annotations)
- [Generics](#generics)
  - [Why use Generics](#why-use-generics)
  - [Type Safety](#type-safety)
  - [Generic Method](#generic-method)
  - [Generic Constructor](#generic-constructor)
  - [Generic Interface](#generic-interface)
- [Java Lang Package](#java-lang-package)
  - [System](#system)
  - [Math](#math)
  - [ClassLoader](#classloader)
  - [Iterable](#iterable)
  - [Readable](#readable)
- [Arrays](#arrays)
  - [One Dimensional Arrays](#one-dimensional-arrays)
  - [Two and More Dimensional Arrays](#two-and-more-dimensional-arrays)
  - [Array Programming Exercises](#array-programming-exercises)
- [Java Util Package](#java-util-package)
  - [String Class](#string-class)
    - [Literals](#literals)
    - [Concatenation](#concatenation)
    - [String Methods](#string-methods)
  - [StringBuffer](#stringbuffer)
  - [StringBuilder](#stringbuilder)
  - [String Programming Exercises](#string-programming-exercises)
  - [Collection Interface](#collection-interface)
    - [List Interface](#list-interface)
      - [ArrayList Class](#arraylist-class)
      - [LinkedList Class](#linkedlist-class)
    - [Set Interface](#set-interface)
      - [HashSet Class](#hashset-class)
      - [LinkedHashSet Class](#linkedhashset-class)
      - [TreeSet Class](#treeset-class)
    - [Queue Interface](#queue-interface)
      - [PriorityQueue Class](#priorityqueue-class)
      - [Dequeue Interface](#dequeue-interface)
        - [ArrayDequeue Class](#arraydequeue-class)
  - [Iterators with Collections](#iterators-with-collections)
  - [Map Interface](#map-interface)
    - [Hashtable Class](#hashtable-class)
    - [SortedMap Interface](#sortedmap-interface)
      - [Navigable Interface](#navigable-interface)
        - [TreeMap Class](#treemap-class)
    - [HashMap Class](#hashmap-class)
      - [LinkedHashMap Class](#linkedhashmap-class)
  - [Date Class](#date-class)
  - [Calendar Class](#calendar-class)
  - [TimeZone Class](#timezone-class)
  - [Random Class](#random-class)
  - [Formatter Class](#formatter-class)
  - [Scanner Class](#scanner-class)
  - [Regex Class](#regex-class)
  - [Jar Class](#jar-class)
- [Java I/O Package](#java-io-package)
  - [File class](#file-class)
  - [Byte Stream Classes](#byte-stream-classes)
    - [InputStream & OutputStream](#inputstream--outputstream)
    - [FileInputStream & FileOutputStream](#fileinputstream--fileoutputstream)
    - [PrintStream](#printstream)
  - [Serialization](#serialization)
    - [ObjectInput](#objectinput)
    - [ObjectOutput](#objectoutput)
  - [Networking](#networking)
    - [URLConnection](#urlconnection)
    - [HttpURLConnection](#httpurlconnection)
    - [URL](#url)
    - [Cookies](#cookies)
    - [Server Sockets](#server-sockets)
  - [Applet Class](#applet-class)
    - [Applet Architecture](#applet-architecture)
    - [HTML Applet](#html-applet)
  - [Event Handling](#event-handling)
    - [Event Model](#event-model)
    - [Event Class](#event-class)
    - [Event Listener Interfaces](#event-listener-interfaces)
- [JavaDoc tool](#javadoc-tool)
- [Uses of Java](#uses-of-java)
- [Java Compiled or Interpreted?](#java-compiled-or-interpreted)
- [Java features](#java-features)
  - [Comments](#comments-1)
  - [Naming Conventions](#naming-conventions-1)
  - [Strongly-Typed Language](#strongly-typed-language)
  - [Stack and Heap Memory](#stack-and-heap-memory)
  - [Command-line Arguments](#command-line-arguments-1)
- [Data Types](#data-types-1)
  - [Primitive Data Types](#primitive-data-types)
  - [Non-Primitive](#non-primitive-1)
    - [String](#string-1)
    - [Array](#array-1)
- [Variables](#variables-1)
  - [Scope](#scope-1)
    - [Local Scope](#local-scope)
    - [Global Scope](#global-scope)
  - [Local Variables](#local-variables)
  - [Global Members](#global-members)
    - [Static Members](#static-members)
    - [Non-Static Members](#non-static-members)
    - [Variable Arguments](#variable-arguments)
  - [Casting](#casting)
  - [Escape sequences](#escape-sequences)
  - [Math class](#math-class)

## History And Evolution Java

In 1991 in Silicon Valley in a Software company called **Sun Microsystems**, there was an idea to develop a product, that can interact with TV and VCR on a network with a touch-based handheld device.

- This touch device was later named **Star 7**.
- Its goal was to record TV shows to VCR, play movies from VCR to TV.
- Control all this with **Star 7** while sitting on the couch.  
- It is Kind of like smart tv today, but in 1991.  

The team members involved in this project are

- James Gosling
- Patrick Naughton
- Chris Wrath
- Ed Frank
- Mike Sheridan.

The team Decided, the product should have the following features.

- Follow the Object-Oriented Paradigm
- Platform Independent Development
- Secure Implementation
- Multi-Threaded Platform
- Easy to use codebase

Originally C++ was considered for this project, but it lacks some of the features they needed, like platform-independent, easy to use.  

So after some discussion, they decided to extend C++ with their implementation for the project.  
But this seemed more work than they thought.  

After another discussion, the development team decided to create their own language for this project.  
It was called **GreenTalk** and the team was called **GreenTeam**. The Source files had a **.gt** extension.  

This was developed using C and C++.  
After a while, the language was renamed from GreenTalk to **Oak**, the name of the tree outside of the **GreenTeams** office.  

In 1993 after developing the product they named it **Star 7** and demonstrated it to the telecom network officials for approval.  
But this product was ahead of its time. The product was **rejected**.  
![Star 7](./../../img/JavaGreenProject.jpg)

Then the **GreenTeam** had to do something with their product.  
It was in 1993, the time period when the internet was still raising, more and more businesses and home users are adopting it.  

At that time the web consisted only of static HTML pages.  
This was mostly used by scientists and researchers for documenting and publishing their work.  

Oak was already a good Platform(with JVM) for communicating in a network of heterogeneous devices.  

Internet is also a network of heterogeneous devices communicating, just on a very very large scale than oak was designed for.  
Ex: Linux device talking to windows server, mac device talking to Linux server, PowerPC device speaking to a windows server.  

So they started working on making webpages dynamic, consider this at the time even a button click was great and pictures moving is just awesome.  

Oak was later **renamed Java**, as it was already trademarked by **Oak technologies**. Meaning coffee, that is why the java logo is a **cup of coffee**.

The GreenTeam started working on using Java for webpages. This was done using **applets**.

- On clicking a relevant link the client browser *downloads an applet* and executes it on their own pc.
- Since java is architecture-neutral it can run on any pc with a *JRE installed*
- It is secure to run these files if any *malicious code* was executing only *JRE will crash* but the system won't get affected.
- It was the days of scripting and phishing so this was a huge deal of added security for home users.

After some work, in 1994 they created their own browser that can support java Applets and called it **WebRunner** but later changed it to **HotJava** to link with the whole coffee thing.  

They then demonstrated this to the general public and press, even though the demo failed to work fully, the crowd was pleased that we can make content dynamic and everybody wanted to implement it.  

In 1995 **Netscape company** agreed to use Java natively in their **Netscape Navigator browser**.  
This was a big deal for sun microsystems. This made java reach a farther audience.  
**Netscape navigator** was the **top** browser in the **the 1990s**, similar to how chrome is today.  

In 1996 **Java API** containing many pre-built functions, was released to the general public which increased the usage of Java even more.  

From then on Java kept improving and adding new features in every major release and providing bug fixes and security patches for older versions.

In Time Java was faded out of the web world by flash and javascript as they are even lighter to work with and don't need preinstalled Software like Java Runtime.  
As of **2010** Java was completely **gone from the web world**, but endured in another industry, the **smartphone world**.

In 2008 **Google** released the **Android Operating System** which was built using Java.  
Now over 3 billion devices use Java.  

In 2020 Java is being used in Android Smart Phones, Desktop Applications, Backend for web Applications(not frontend), IoT devices, Wireless sensors, Security Cameras, Smart Tv's, Wearables, etc.  

Java release cycle used to be a slow process, they used to release major updates every 2 years, but this changed after some time with some releases taking 5 years.  
Ex: Java 6 was released in 2006 and Java 7 was released in 2011.  

In 2010 **Oracle** acquired **Sun MicroSystems**.  
In 2017 Oracle decided to Change its release cycle period to 6 months and provide security patches for LTS versions for paid business users.  

Oracle started developing two Java JDKs.

1. **OpenJDK** with all the latest features and libraries.
2. **OracleJDK** with OpenJDK and additional proprietary libraries and with paid support for Business users.

That's the reason many companies started developing their own Java versions of OpenJDK. And Contributing to OpenJDK.  

In 2020 it is not important which JDK you install to practice Java, as both OpenJDK and OracleJDK are free for personal development and testing.  

**But OracleJDK requires a Paid license for Deploying to Production Environment.**

So it is best in **my opinion** to start working with OpenJDK instead of OracleJDK but the choice is yours.  
The guide is the same for both JDKs, but the actual Development and codebase and support changes between them.

There are three JDK versions that you may come across in 2020.  

Java 8 released in 2014 but still being used, Oracle extended its security support till 2030 for paid customers.  
Java 11 is the latest LTS that is used in enterprise-level projects.  
Java 15 is the current non-LTS version that can be used. With support till March 2021.

My recommendation is to install an LTS version i.e Java 11 or Java 8 of either OpenJDK or OracleJDK.  

| JDK version  | OpenJDK (Support) | OracleJdk(Support) |
| ------------ | ----------------- | ------------------ |
| JDK 8  (LTS) | May 2026          | December 2030      |
| JDK 11 (LTS) | October 2024      | September 2026     |
| JDK 15       | March 2021        | March 2021         |

Pick one version and stick to it till you need to switch.  
Learn the new features in that specific JDK or version.  
First set up the environment and get to learning.  


### Why Java was Invented?  

Sun Micro systems wanted to develop a software for tv's at the time to make them accept touch controls and multimedia options which were not invented yet.  

They named the project Oak 

They followed five principles while developing the programming language
1. should implement object oriented paradigm
2. same program can be executed on multiple Operating Systems. 
3. Built in support for computer network handling
4. can execute remote scripts securely.
5. easy to use by taking best parts of other programming languages



### What is Java?

Java is an Object-Oriented Programming language and a platform used to develop various applications.  

**Platform**: A hardware or software environment which can run a program is called a Platform, As java contains Java Run Time Environment and an API it is a platform. 

There are 4 editions of java

1. Java Standard Edition (Java SE)
    - This is the standard java library with all the needed packages and tools.
2. Java Enterprise Edition (Java EE)
   - This is the Enterprise platform of java which is used to develop web applications.
   - Works on top of Standard edition  
3. Java Micro Edition (Java ME)
   - Used to develop applications for mobile, sensors, embedded systems, micro controls etc,.
4. Java FX
   - Used to develop Internet applications. 
   - Runs consistently across multiple devices desktops, mobiles, tvs etc.


### Java version History

Java has undergone several changes from it's initial public release in 1996. 
Lot of useful classes and packages were added to standard library.  

Java Version First Two versions are called JDK 1.0, JDK 1.1.  

But in 1998 java released three versions of java jdk.

- Java 2 Standard Edition
- Java 2 Enterprise Edition
- Java 2 Micro Edition

And the naming scheme of jdk also changed to j2se 1.2, j2ee 1.2, j2me 1.2.  

In java 5 the versioning scheme was changed again.  
instead of continuing trend of 1.X like 1.2,1.3,1.4. 
They shifted to plain numbers 5,6, so on.  
so the version is j2se 5.  

In java 6 the naming of java changed again, this is for better only.  
the java naming convention from j2se 5 changed to java 6,java 7, java 8, java 9, so on.  

Java 8,Java 11, Java 17(UpComing) are the LTS, Long Term Support Versions. 
they are updated with security patches for longer period of times, then other java versions.  

In 2020 even though java 11 LTS, java 15 versions are available Software Companies are using java 8 for their projects.  

Java 11 is the latest LTS version supported till 2026.
While Java 17 is the next Major LTS version being planned by Oracle. released in 2021

| Java Version         | Release Date       | Security Support Till |
| -------------------- | ------------------ | --------------------- |
| JDK 1.0              | JANUARY     1996   | -                     |
| JDK 1.1              | FEBRUARY    1997   | -                     |
| J2SE 1.2             | DECEMBER    1998   | -                     |
| J2SE 1.3             | MAY         2000   | -                     |
| J2SE 1.4             | FEBRUARY    2002   | FEBRUARY     2013     |
| J2SE 5.0             | SEPTEMBER   2004   | APRIL        2015     |
| JAVA SE 6            | DECEMBER    2006   | DECEMBER     2018     |
| JAVA SE 7            | JULY        2011   | JULY         2022     |
| **JAVA SE 8 (LTS)**  | **MARCH     2014** | **DECEMBER   2030**   |
| JAVA SE 9            | SEPTEMBER   2017   | MARCH        2018     |
| JAVA SE 10           | MARCH       2018   | SEPTEMBER    2018     |
| **JAVA SE 11 (LTS)** | **SEPTEMBER 2018** | **SEPTEMBER  2026**   |
| JAVA SE 12           | MARCH       2019   | SEPTEMBER    2019     |
| JAVA SE 13           | SEPTEMBER   2019   | MARCH        2020     |
| JAVA SE 14           | MARCH       2020   | SEPTEMBER    2020     |
| JAVA SE 15           | SEPTEMBER   2020   | MARCH        2021     |
| JAVA SE 16           | MARCH       2021   | SEPTEMBER    2021     |
| **JAVA SE 17 (LTS)** | **SEPTEMBER 2021** | **SEPTEMBER  2030**   |



#### Java 1.0 features

#### Java 1.2 features

#### Java 1.3 features

#### Java 1.4 features

#### Java 1.5 features

#### Java 1.6 features

#### Java 1.7 features

#### Java 1.8 features

#### Java 9 features

#### Java 10 features

#### Java 11 features

#### Java 12 features

#### Java 13 features

#### Java 14 features

#### Java 15 features

### C vs C++ vs Java

### Features of Java

#### Simple

#### Object Oriented

#### Robust

#### Multithreaded

#### Architecture Neutral

#### Interpreted

#### Distributed

#### Dynamic

## Installation

### Installation of Java

### Installation of IDE

## Overview

### Hello World! Program

### Compiling and Executing

### Structure of Java Program

### Execution Process

#### Stack and Heap

### JDK,JRE,JVM

### JVM Architecture

### Two Paradigms

#### Procedural Paradigm

#### Object Oriented Paradigm

### Code Block

### Static Typed Language

### Keywords

### Identifiers

#### Naming Conventions

### White Spaces

### Separators

### Comments

#### Single Line

#### Multi Line

## Procedural Programming

### Variables

#### Scope

### Data Types

#### Primitive

##### Integers

###### byte

###### short

###### int

###### long

##### Decimals

###### float

###### double

##### Characters

##### Boolean

#### Non-Primitive

##### Array

##### String

##### Classes

#### Type Casting

##### Implicit

##### Explicit

### Unicode System

### Operators

#### Arithmetic Operators(+,-,*,/,%,++,--)

#### Relational Operators(<,>,<=,>=,==,!=)

#### Logical Operators(&&,||,!)

#### Assignment Operator

#### ? Operator

#### Operator Precedence

### Reading Console Input

### Writing Console Output

#### Control Flow

##### Selection Statements

###### if

###### switch

##### Iterative Statements

###### while

###### do while

###### for

###### for each

##### Jump Statements

###### break

###### continue

###### return

##### Nested Statements

##### Exercises

###### Math Problems

###### Star Patterns

#### Methods

##### Method with Zero Parameters

##### Method with One or More Parameters

##### Void Method

##### Non-Void Method

##### Recursion

## Object-Oriented Programming

### What is OOP?

### Why Use OOP?

### Class

### Object

#### Declaration (Class varName)

#### new (Instantiation)

#### Constructor (Initialization)

### Garbage Collection

### finalize()

### Access Modifiers

#### public

#### protected

#### default

#### private

#### Access modifier vs Access specifier

### Non Access Modifiers

#### Final

#### Static

#### Non-Static

#### Abstract

#### Synchronized

#### Transient

## Inheritance

### IS A relation

### HAS A relation (Aggregation)

### Association

### Composition

### Single Level Inheritance

### Multi-Level Inheritance

### Hierarchical Inheritance

### Multiple Inheritance

### Hybrid Inheritance

### Why Multiple and Hybrid Inheritance, Not supported by Java?

### this

### super

### final

### this vs super

### this() vs super()

## Polymorphism

### Compile Time Polymorphism

#### Method Overloading

#### Constructor Overloading

#### Operator Overloading

### Run Time Polymorphism

#### Method Overriding

#### Constructor Overriding

#### instanceOf

### Overloading vs Overriding

## Abstraction

### Abstract Method

### Abstract Class

### Interface

### Abstract Class vs Interfaces

### Changes to Interfaces

## Encapsulation

### Getters

### Setters

### Java Bean Class

### Encapsulation vs Abstraction

## Object Class

### Default Methods

## Dynamic Method Dispatch

## Object Casting

### UpCasting

### DownCasting

### Why to use Object Casting?

## Inner Classes

## Lambda Functions

## Static Block

## Command Line Arguments

## Packages

### Creating Packages

### Importing packages

## Exception Handling

### Exception Types

### Built-in Exceptions

### try-catch Block

### finally

### Nested Try Statements

### Custom Exceptions

#### throw

#### throws

### final vs finally vs finalize

## MultiThreading

### Thread Model

### Synchronization

### Main thread

### Create Thread

#### Thread Class

#### Runnable Interface

### Deadlock

## Wrapper Classes

### Boxing

### Unboxing

### Auto Boxing

### Auto UnBoxing

## Annotations

## Generics

### Why use Generics

### Type Safety

### Generic Method

### Generic Constructor

### Generic Interface

## Java Lang Package

### System

### Math

### ClassLoader

### Iterable

### Readable

## Arrays

### One Dimensional Arrays

### Two and More Dimensional Arrays

### Array Programming Exercises

## Java Util Package

### String Class

#### Literals

#### Concatenation

#### String Methods

### StringBuffer

### StringBuilder

### String Programming Exercises

### Collection Interface

#### List Interface

##### ArrayList Class

##### LinkedList Class

#### Set Interface

##### HashSet Class

##### LinkedHashSet Class

##### TreeSet Class

#### Queue Interface

##### PriorityQueue Class

##### Dequeue Interface

###### ArrayDequeue Class

### Iterators with Collections

### Map Interface

#### Hashtable Class

#### SortedMap Interface

##### Navigable Interface

###### TreeMap Class

#### HashMap Class

##### LinkedHashMap Class

### Date Class

### Calendar Class

### TimeZone Class

### Random Class

### Formatter Class

### Scanner Class

### Regex Class

### Jar Class

## Java I/O Package

### File class

### Byte Stream Classes

#### InputStream & OutputStream

#### FileInputStream & FileOutputStream

#### PrintStream

### Serialization

#### ObjectInput

#### ObjectOutput

### Networking

#### URLConnection

#### HttpURLConnection

#### URL

#### Cookies

#### Server Sockets

### Applet Class

#### Applet Architecture

#### HTML Applet

### Event Handling

#### Event Model

#### Event Class

#### Event Listener Interfaces

## JavaDoc tool

**Java Guide**
> Created by Sun Microsystems in 1991 and later acquired by Oracle(in 2020 it is still popular[no major changes or disruptions]).This document uses OpenJDK 11(LTS).


Java is a *general purpose* programming that implements *Object Oriented* Programming Paradigm and is a *Write Once Run Anywhere*(WORA) Language.  

- **General purpose**: because we can use the language for building almost anything.
- **Object Oriented**: because everything in java is an object.  
- **WORA**: because we can take the compiled code called **byte code** and run it on any machine with a JVM installed.

## Uses of Java

Java is a general-purpose language we can build many things with it. Some of the uses of java are

1. Android Development
    - Java uses JVM[Java Virtual Machine], it takes byte code as input and performs execution.
    - Android uses[Dalvik Virtual Machine], it takes .dex files as input and performs execution.  

2. Server Apps
    - Servers are the machines that take a request from the user, process it, and return a result to the end-user.  
    - Java is used here to execute business logic.  

3. Web Application
    - In web development, java is used for the back-end.  

4. Software Tools
    - Many general tools can be built using java.  

5. J2ME(Java 2 Micro Edition)
    - This edition of java is used to develop software applications for non-smart-phones/feature phones.

6. Embedded Systems
    - Embedded Systems run on limited memory and computation power, Java can be used to create optimized code for these devices.  

## Java Compiled or Interpreted?  

Before Answering the above question let's divide the question into small parts and build to the actual answer.  

1. **What is Compilation?**  
    - Compilation is the process of converting the entire source code to machine-executable code at once.
    - Then executing it on the specific device.
    - The **advantage** of Compilation is **Faster** **Execution**.
    - The **disadvantage** of Compilation is Compiled Code is **Platform** **dependent**.Have to recompile for each platform.  
    - Ex: C is a Compiled language.  

2. **What is Interpretation?**  
    - Interpretation is the process of executing the source code directly in a line by line procedure.  
    - The **advantage** of Interpretation is **No Compilation** and **Platform independent**.  
    - The **disadvantage** of Interpretation is **Slower Execution** due to converting source code line by line.  
    - Ex: Python is an Interpreted Language.  

- If we are Clear of the above differentiation. Then we can understand the next question.  

**Is Java Compiled or Interpreted?**

Java is both a Compiled and Interpreted language.  

- Java takes the source code and compiles it to Intermediate Code called byte code.
- This byte code is then given to JVM which Interprets it and executes.
- The **advantage** of Java are  
  - **Portability** since we can execute the byte code on any machine with JVM.
    - **Platform Independent** as we can use the same byte code on any machine with a compatible JVM Interpreter.
- The **disadvantages** of java are
  - **JVM** is needed before executing byte code on it.  

![Java Execution](./../../img/JavaExecution.png)

More about these concepts is explained as we go further, most of these concepts will be clear once we start coding.  

## Java features

Java Supports many features that can be used in any application development process.  

Here are the features of Java with an explanation.  

- **Object Oriented**: In Java, everything is an Object, as it follows the Object-Oriented Programming Paradigm.  

- **Platform Independent**:
  - As Explained above Java converts given *source code to byte code*.  
  - This byte code can only be *understood by JVM*(Java Virtual Machine).
  - JVM should be pre-installed in the system for executing byte code.
  - JVM takes the byte code and interprets it into machine code.
  - So JVM is Platform Dependent, as it should know how to convert bytecode to machine code. *Built-in C and C++*.
  - Java is Platform Independent as it runs on any system with a JVM.
  - **Java(Platform Independent), JVM(Platform Dependent)**.

- **Secure**
  - As we are executing our code in *JVM*, which is a *virtual machine*.  
    - If the JVM gets infected it won't crash the host system.  
    - And Java hides away some details that are known to cause issues to programmers while developing. Like **Pointers**, **Memory Management**, **Buffer-OverFlow Exploits**.  

- **Architecture Neutral**: The Java Compiler generates an **Architecture-Neutral Byte code** that can be understood by JVM on any Architecture.  

- **Portable**  
  - Java Compiler is written in ANSI C which is a POSIX subset.  
  - This way byte code generated on one machine can be **executed on any platform** which contains the JRE(Java Runtime Environment).
  - JVM + System Class Files = JRE.

- **Robust**  
  - Automatic *Memory Management* and *Garbage collection* make the developer's life easy, so they can focus on business logic.  
    - **Strong type** checking, i.e variables, and methods are declared what type of data they can hold, before using them.
    - **Compile-Time checking**: Java compiler checks for errors that may arise during execution, at compile time only. This saves us from bugs that can crash our application during run-time.  

- **Multi-Threading**
  - In java, we can divide our program execution into two or more parts and execute them simultaneously on each CPU core.
  - This can make **use** of **maximum CPU** computation power.
  - To achieve this we convert our program into small, light-weight processes called **Threads** hence the name **Multi-Threading**

- **Interpreted**
  - Java is both a compiled and interpreted language.
  - Jvm takes the .class file(byte code) and interprets it to machine code.

- **High Performance**
  - In java, we are losing some performance by Interpreting our byte code. This is not much of a hit but noticeable.
  - To overcome this effect, JVM has a Program called **Just-In-Time compiler**, which takes the code that is repeated multiple times and converts it to machine code, and stores it for later use.
  - When executing JVM only converts non-redundant code and takes **redundant code from JIT**, this gives us back the performance we lost from Interpreting byte code.

- **Distributed**: Java is designed for the distributed environment of the internet. We can give the .class file to others and they can execute our application without any hassle.

- **Dynamic**
  - Java can take additional code as input while executing an application.
  - Here JVM takes additional needed class files during run time that is not available at compile time.
  - this behavior is called dynamic execution.

### Comments

In any programming language, we use comments to explain why and what we did with our code.  
This helps other developers and ourselves in the future to understand the logic we wrote easily.  
The major use of comments is to save buggy code for later use and **Documentation**.
Compiler/Interpreter Ignores comments while executing.

In Java we can write comments in Two ways:

1. Single line comments `//`, anything after it is commented out.
2. Multiple line comments `/* and */`, anything inside it is commented out.

### Naming Conventions

A good naming convention makes the codebase better maintainable.  

Many Naming Conventions can be used for our codebase.
But java follows three Conventions more, so we also follow them.  

| Case             | Used for                | Example                          |
| ---------------- | ----------------------- | -------------------------------- |
| camelCaseLetter  | Variable,Function       | xYZ,myNameIsLove,addTwoValue()   |
| PascalCaseLetter | Classname,Interfacename | Main,Api,MyCarAudi,MulTwoValue() |
| ALLCAPS          | Constants               | PI,CONSTANT                      |

### Strongly-Typed Language

-----

- Java is a Strong typed(Static typed) language, here every variable needs to be declared before using it. Ex:`int x;`  
- After Declaring a variable we can Initialize it with a value. Ex: `x = 10;`  
- For saving time and being efficient we declare and initialize a variable at the same time. Ex: `int x = 10;`  
- **Syntax** : `<datatype> <variableDeclaration> <assignmentOperator> <variableInitialization/Value>;`  
- The Major **drawback** of *strong typed language* is we have to declare the type of variables, classes, objects at compile time.
- This is time-consuming for developers to take care of every type, compared to dynamically typed languages like python.  
- The Major **advantage** of *Strong typed language* is that we can execute faster and debug faster as we know what type each variable or method should be.

### Stack and Heap Memory  

There are two types of Memory that we majorly take care of and learn about.  
They are Stack and Heap memory.

- Stack Memory is used for the execution of logic.
- Heap Memory is used for storing data needed for execution.

When we execute a java program, JVM takes some memory from os and reserves it.

JVM then converts some of it to the stack and the remaining to the heap.

- if the memory is used fully, a StackOverflow error or out-of-memory error is raised

**Stack**

Stack Memory follows Last In First Out Order for storing.

- This is static memory.
- Stack **stores** data in the format of **frames**
- Code inside a method is stored in the stack, after program execution is done, the method frame comes out of the stack.
- Stack is used for the execution of logic. Uses data in Heap for execution.

**Heap**  

Heap is a Dynamic Memory. Its main use is to store data needed for the execution.

- **Objects and Instance variables** are stored in Heap.
- When an object of a class is created, the object is stored in heap, while the address of the object is stored in the stack.
- That's why the class declaration is called a reference variable, which holds the address/reference of the object.
- Strings are stored in **String Pool Area**.
- Static data is stored in **Static Pool Area**.
- After their use, the data in the heap is removed by the java garbage collector.

### Command-line Arguments

**Arguments** are the **data** given to our program for execution.  
Command-line arguments are the **input** data given to our program **for execution**.  
These are rarely used nowadays as a lot of applications are built with GUI(Graphical User Interfaces).  

Using Command-Line Arguments:  

- We give the arguments after the program name.
- **String args[]** in the main method is the declaration of **command-line arguments**.
- This takes 0 or more parameters as input.
Ex:`java program inputs`, `java add one two three`.

## Data Types  

Java is a Static Typed Language, which means we have to declare the type of data stored in each variable or object during compile time.  

Data types are used to declare what type of data each variable can store.

In Java Data types are divided into two groups.

1. [Primitive](#primitive)
2. [Non-Primitive](#non-primitive)

### Primitive Data Types

Java Provides some predefined data types called Primitive data types.
These data types are commonly used and need a fixed amount of memory, so they are predefined by java.

In Java, everything is an object. And All Primitive data types have a Class belonging to them.
These Primitive classes are called [Wrapper Classes](#wrapper-classes).

| Class(Data type) | keyword | Bytes | Limits                                                  |
| ---------------- | ------- | ----- | ------------------------------------------------------- |
| Byte             | byte    | 1     | -128 to 127                                             |
| Short            | short   | 2     | -32,768 to 32,767                                       |
| Integer          | int     | 4     | -2,147,483,648 to 2,147,483, 647                        |
| Long             | long    | 8     | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| Float            | float   | 4     | 3.4e-38 to 3.4e+38, 7 decimal digits                    |
| Double           | double  | 8     | 1.7e-308 to 1.7e+308,15 decimal digits                  |
| Character        | char    | 2     | Unicode values in single quotes,Ex: `'A'`,`'+'`         |
| Boolean          | boolean | NA    | True/False                                              |

- In the above table all the primitive data types and their details are provided.

Rules:
There are some rules that Java follows while using Primitive Datatypes.

- All Numbers are by default of type *int*.
- All Decimal values are by default of type *double*.
- *long* variables need to specify l/L at the end of its value.Ex:`long num=12345134l;`,`long num2=151344151L;`.
- *float* variables need to specify f/F at the end of its value. Ex: `float num=1234.343f;`, `float num2=1234.23415F;`.
- *char* data should be enclosed in single quotes. Ex: `char ch='A';`, `char ch1='5';`.

Tips:

- Numbers with more digits are troublesome to read.Ex: `int x=1234151;`.
- In java we can use `_` to separate values, Compiler ignores them in variables.Ex: `int x=2_147_483_648`.
- To make a variable constant, i.e accessible by all methods, we make it static.

### Non-Primitive

All Data types that are not Predefined are Non-Primitive Data types.

- The size of Non-Primitive data types is not defined by java but provided by the Programmer.
- Non-primitive data types are called *reference types* because they refer to objects.
- All Non-Primitive types (or) reference types have the same memory size as they store the address of an object. Values can also be Null.
- String and Array Classes are given by java, but the Programmer should define the data and size.

| Class(Data Type) | keyword |
| ---------------- | ------- |
| String           | String  |
| Array            | []      |
| Class            | class   |

- Since Object stores a specific type of data we can say that a class is also a Non-Primitive Data type.
- We can create our own data types using classes. for example email, date, etc.  

#### String

Strings are commonly used in all programming languages, in different ways.

- In java, we have a **String** class dealing with strings.
- Strings should be enclosed in double-quotes. Ex: `String name="Some man";`
- Strings are immutable i.e, can't change them, so any method that modifies string gives a new string.

*Syntax:*
`String variable name/reference name = new String(content in quotations);`  
This is the actual way of using strings but there is a shorthand notation for this.
`String referencename = "content";`, Ex: `String name="raj";`.

Learn more about [Strings](#strings) after learning OOPs completely.

#### Array

Arrays are one of the **data structures** in java.  
An array is a **homogeneous collection of elements**.  

- In java, Array's size is fixed, Once created the size can't be increased or decreased.
- We create an array with many different syntaxes.
- **Syntax**:
  - `datatype[] variablename = values;`
  - `datatype variablename[] = {value,value,value,...};`
  - this is the most simple and widely used array syntax.
  - Ex: `int[] x = {1,2,3,4,5};`
- We access the elements of an array using the index of it, the index starts from 0.
- Ex: In above array x, its size is 5, `x[0]` will return 1,`x[3]` will return 4, but x[5] will raise an error as x[5] will search for the sixth element and our array's size is 5.
- Can't access index larger than the size of the array. If we  do java compiler raises an [Exception](#exception-handling)
- We will learn more about [Arrays](#arrays) after OOPS.

-----

## Variables  

A Variable is a memory location that stores certain data.  
Ex: `int x =15;` here x is given 4 bytes of memory by JVM and in that location 15 is stored.

In Java, Variables are of two types depending on the [Scope](#scope).  

1. [Local Variables](#local-variables)
2. [Global Variables](#global-members)

### Scope  

The region that can access a variable is called the scope of that variable.  

- Here the region can be a code block i.e a for block, if block, anything between two `{}` is a code block.
- A region can also be a method area, class area.
- Can only access a variable that is in scope.
- Can't access a variable outside of its scope.

```java
class Sample{ 
// class area start

    public static void add(){ 
        // method area start
        int x =10;

        for(int i=0;i<10;i++){ 
            // code block start
            System.out.println(i);
            // code block end
        }

        if(true){ 
            //code block start
            System.out.println(x);
            //code block end
        }

        // method area end
    }

    public static void main(String args[]){ 
        // method area start
        add();
        // method area end
    }

// class area end
} 
```

Scope is of two types:

1. [Local Scope](#local-scope) / Method level scope.
2. [Global Scope](#global-scope) / class level scope.

#### Local Scope

A variable is said to be in local scope if it is accessible only inside a method or a code block.

```java
class Sample{
    public static void main(String args[]){
        // will raise a compile time error saying can't find symbol x
        // since x is in local scope to add method we can't access it out of that scope
        System.out.println(x);
    }

    public static void add(){
        int x = 20; // x is in local scope to add method
        // will print x since it is accessible
        System.out.println(x);
    }
}
```

#### Global Scope

A variable is said to be in global scope if it is accessible by everything in a class.  

- Local Scope members(variables and methods) **can access** variables in the global scope.
- Global Scope members(variables and methods) **can't access** variables in the local scope.

```java
class Sample{
    static int x = 5;
    // x is in global scope
    public static void add(){
        // local scope 
        int y=10; 
        system.out.println(x);
    }
    public static void main(String args[]){
        System.out.println(x); // since in global scope can access
        System.out.println(y); // since in local scope of add method can't access
    }
}
```

### Local Variables  

Variables in the local scope are called local variables.  

- local variables can only be accessed inside the local scope.
- When we try to access local variables outside of their scope, the `Can't find Symbol:` error is raised.
- Initialization of the local variable is mandatory.
- Local Variables can be either default or final.

```java
class Sample{
    public static void main(String args[]){
        int x =10; // x is in local scope of main method so a local variable
        for(int i=0;i<10;i++>){
            // here i is in local scope of for block so it is also a local variable
            System.out.println(i);
        }
        System.out.println(i);
        // will raise a compile-time error since we are trying to access I out of its scope.
    }
}
```

### Global Members

Members in the global scope are called global Members.  

A member in a java class is a combination of both methods and variables.
Members = Methods + Variables.  

Java Being an Object-Oriented Paradigm we have two types of members.

1. [Static Members](#static-members) / Class Members
2. [Non-Static Members](#non-static-members) / Instance Members

```java
class Sample{
    static int x; // Static Global Variable
    float y; // Non-Static Global Variable
    public static void main(String args[]){
        // some code inside 
    }
}
```

#### Static Members

A Java Global Member that is declared with **Static** Keyword is a Static Member.

- These members are declared and initialized once per class. They are called **Class Members**
- All Static Members are **Stored only once** hence will have only one copy of data.
- These members being global, can be accessed by all other members of the class.
- During Execution All These members are **loaded to Static Pool Area** having the same name as the class name. This is done once per class file.
- **Initialization** of Static Variables is **, not mandatory**.
- They will be **given default values** depending on the data type of it.

| data type | default value      |
| --------- | ------------------ |
| byte      | 0                  |
| short     | 0                  |
| int       | 0                  |
| long      | 0                  |
| float     | 0.0                |
| double    | 0.0                |
| boolean   | false              |
| char      | '\u0000' (or) '\0' |
| String    | null               |
| Objects   | null               |

- For arrays, JVM gives default values of respective data types.

```java
class Sample{
    static int x;
    static float y;
    static String name;
    static char grade;
    static boolean isPass;
    public static void main(String args[]){
        // all above global variables are accessible 
        //default values of them are printed
        System.out.println(x+""+y+""+name+""+grade+""+isPass);
    }
}
```

#### Non-Static Members

- The variables in the class level are instance variables, these are unique to each object/instance.
- These variables can be accessed only by using an object i.e,(object. variable)

Ex: class Student
 int age,roll;------->[instance variable, as each student can have unique age,roll numbers]
 string name;
 static string COLLEGE;-------->[same for all the instances/object]
 void add() ---------->(local variables, x,y can't access out of method)
 int x,y;

 main()
 Student s = new Student();
 s.age,s.roll,s.name;----------->(instance variables,unique for each object)
 System.out.println(x,y);------->[can't print x,y,local variables since they are inside a method]

#### Variable Arguments

Instead of writing redundant code for different length of parameters, we can use var args.
(...)
ex: add(x,y,z,a,c,b) //instead of multiple methodoverloading, we use varargs(array).

> add( int ... a)  
> for(int i: a)  
> sum =sum + i;  
> return sum

### Casting

Typecasting is the method of converting a variable of one data type to another data type.

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

To include special characters that have meaning to the java compiler. we use escape sequences.
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

- *round* rounds the float value to the nearest integer
- *ceil* gives the maximum integer value of a floating number, 1.2 ceil is 2
- *floor* gives the minimum integer value of a floating number, 1.2 floor is 1
- *random* gives a random floating number between 0 and 1
- *pow* raises a value by given power.
- *number format**
In java to represent a number as currency, we use a predefined method in the number format class.
Ex: numberformat currency = numberformat.getcurrencyinstance();
string x=currency.format(11234515);
returns a value in dollar format.

```text
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

> These Operators are used to Check the relation of variables,they return true if a relation is true, else returns false

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

> these operators are used to reduce the size of code(shorthand notations)

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

> if( Condition//x < 20 )        
(Code to execute)       
System.out.print("Hello");       
       

#### If...else statement

An if statement with an (optional)else statement, that executes when the boolean expression is false.

> if( condition//x < 20 )             
             
  (Execute when true)             
    System.out.print("Hello");             
             
else             
             
  (Execute when False)             
    System.out.print("Not Hello");             
             

An If else can have an optional "Else If", This works just like an If but can be used to test various conditions in sequence.
Once a condition is satified all the other else if and else conditions are not checked.

> x=20          
if( x == 10 )          
          
   System.out.print("Value of X is 10");          
          
else if( x == 20 )          
          
   System.out.print("Value of X is 20");          
          
else if( x == 30 )          
          
   System.out.print("Value of X is 30");          
          

#### Nested if statement
  
 You can use one if or else if statement inside another if or else if statement(s).

> if( x == 30 )        
        
if( y == 10 )        
        
   System.out.print("X = 30 and Y = 10");        
        
        

#### Switch statement
A switch statement allows a variable to be checked with a list of values in the code.  
When a break statement is reached, the switch terminates.(if no break is present the code continues to next line instead of exiting).  
An optional default case can be put.This default case will run if none of the switch cases are matched.      

> switch(grade)        
      
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
         
System.out.print("value of x : " + x );         
System.out.print("\n");         
     

#### For-each
**Enhanced For loop:**
Used to traverse arrays,the datatype inside for should be same as the array datatype.Introduced in Java 5.        
>For(declaration:expression)          
//statements          
  
> int [] numbers = 10, 20, 30, 40, 50;            
for(int x : numbers )            
System.out.print(x+",");                     
            

#### While loop

Executes the statements if the condition
is true (infinite times), unless it is false.We use when we don't know how many times the code needs to loop. When we know the specific number we use for.       

> while( condition // x < 20 )          
        
System.out.print("value of x : " + x );        
x++;//increment        
System.out.print("\n");        
        

#### Do...while loop
Like a while statement, except that it tests
the condition at the end of the loop body(after running once).

> do            
          
System.out.print("value of x : " + x );          
x++;          
System.out.print("\n");          
while( x < 20//condition );          
          

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
> Class classnamecode


### Methods
A Java method is a collection of statements that are grouped together to perform an operation.         
**Can't create method inside a method in java.**
> Ex: main()        
> int add(int x,int y)       
> return x+y; ----->not possible       
          
> int add(int x , int y )return x+y;         
>  main()add(5,4)--->[possible]       

**Method Creation**          
We use the following syntax to create methods.      
> modifier returnType nameOfMethod (Parameter List)        
>          
> // method body          
>          

> public static int add(int a, int b)         
>         
>  a = 10;        
>  b = 20;         
>  return a+b;          
>       

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
> int add(a,b)               
> return a+b;               
>                

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
>   
> int x = a;----->copying 
> int y = b;----->copying
> x++;y++;------>independent with a,b.    
>        

2. By Reference             
When a reference is passed,it is dependent on actual object.        
all non-primitive data types are passed by reference only.              
it's not real pass-by-reference as iyou don't use the address syntax like in c.           
in the below example,the array reference/address is passed as a parameter,so any change done with this reference affects the original array.       
> int [] arr=1,2,3 
> changecontent(arr)---->passing reference  
> changecontent(int[] ar)  
>  ar[0]=5; ------>arr=5,2,3original array was changed.    
> 

#### Method OverLoading
- Overloading is having two or more methods with the same method name but different parameters.
- Overloading is a compile-time concept.
- Compiler identifies different Method based on their method signature(method name and method parameters)
- recommended not to make too many overloaded methods,become ugly overtime,less maintainable.   
> public void bark()  
>  System.out.println("woof ");  
>  //overloading method  
>  public void bark(int num)  
>  if(num ==1 )  
>  System.out.println("boow");

#### Method Overriding
- Overriding means having two methods with the same method name and parameters (i.e., method signature).
- Overriding is a run-time concept,used with inheritance.Override a parent methods in child class.            
- **this** keyword is used to differentiate between methods.     
- **@override** is an annotation used to specify compiler the method is being overridden.  

>Ex:     
Class parent     
  void test()hi---->default method     
     
class child     
  @override     
  void test()bye----->overridden method     
     
main()child c = new child();     
c.test();----->calls method depending on class reference,decides at run-time.     
     

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
>class object = new object()         
  method().... code ....         
;            
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
>class test             
static met()code;------->static method             
add()code;------->instance method             
public static void main()             
  met();------->accessible             
  add();-------->can't acccess             
  new test().add();------->can access             
                  


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
> class calc  
>  int x,y,z;  
>  void perform()z=x+y  
>   
> main()  
>  calc obj = new calc();  
>  obj.x=3;  
>  obj.y=4;  
>  obj.perform();  
>  system.out.println(obj.z)

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
> classname(parameters)code;[constructor]                

> EX: class box  ---->class              
>  int x,y,z;                
> box()---->constructor/default one hidden              
> box(string,int)code;--->overloaded constructor              
>               
> box b = new box();---->constructor call              
> box b = new box("abc",1234);---->constructor call              

Depending on the constructor called,we can perform custom operations,like assign values to variables during object creation itself.    
We use this to reduce coupling.   

### This Keyword  
Story time:     
Conside this code block
>Ex: x=10,y=20;       
>method(a,b)x = a,y=b;           

Here all variables are unique,local variables and instance variables are easily distinguisable.       
But to make code easy to read, make the flow ressemble a story,we use meaningful names,some times the variables,method names have to repeated.    
>x=10,y=20;              -->instance variable               
>method(x,y)x=x,y=y;              -->local variable                   

Here java compiler can't tell local variable from instance variable,ambiguity problem.       

To solve this we use **this**.**this** is a java keyword that tells the compiler,to use the object in it's place.Consider example          

> EX:class test        
int x ,y;-------->instance variables               
public test()x=10; y=20;                         
public test(int a)x=a;-------->no need of **this**                 
public test(int x,int y) ---------->local variables                             
this.x=x;                 
this.y=y;----------->this.x,this.y are instance variables                                
                 

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
>Ex:public mathAdd(a,b)code;add(a,b);show(a,b);   
private add(a,b)code;       
private show(a,b)code;           
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
public void setx(int x)---->setting value to variable                
  this.x=x                
                
public int getx()------> returning value when called.                
  return x;                
                
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
>Ex:int add(a,b)     
>if(a>0 && b>0)       
> somemethod();          
>  return a+b;            

and we can access this method with just a method call add(2,3),but we don't know if the method uses an *if* statement or a for loop or any logic,we just know that it will add two variables and return a integer.                
Makes code better organised and maintainable.        
Instead of knowing every method involved in a calculation,we hide them all,then provide user with a essential and useful method.            


#### Abstract 
Above example is simple abstraction,but to make code organized in large scale, java has abstract classes and Interfaces.used with **abstract** keyword.                 
Syntax:           
abstract method();      
abstract class       

1. Java abstraction is more used with inheritance,and provides better structure and code flow.
2. An **abstract method** is a empty method that doesn't have a logic in it. the child class can override this method and implement it's own logic,used mainly to create a predefined structure.So whatever the logic user needs can be implemented while retaining the existing code structure.            
  * abstract methods can only be written inside an abstract class.   
  
  Syntax:
  >abstract method();         

  inside a inherited class.         
  >@override---->override tells the compiler it's an method override        
  method()           
    logic                 

      
3. An **abstract class** can have both abstract and non-abstract methods.Used for inheritance and provides a class level structure.  

  >Ex:              
  abstract class---------->defining a class as abstract              
    abstract method();-------->declaring a abstract method              
    method2()--------->creating a normal method              
      some code              
                  
                

  >anotherclass extends class-------->inheriting a abstract class              
    @override------------->notifing compiler of the override              
    method()some logic------>implementing the abstract method.              
    method2();------->calling the existing method.              
                

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
  public interface test--------->creating a interface                
    public void set();-------->creating a abstract method                
    public train implements test--------->using a interface in another class                
    @override--------->overriding an abstract method                
    public void set()                
    code------->internal logic                
                    
                  

##### Interface Evolution
Interfaces where changed over time,to add new features while retaining backwards compatibility of older code bases.   
In java 1.0 an interface can only have  
1. *public final static variable*/also called constants
>interface somename  
> public static final String variable ="value";    

2. *public abstract returntype method*/should override 
>interface somename   
public abstract void method();   

  In java 8.0 interface can also have     
3. *public default returntype method*   
These are used to create new methods without changing exisiting codebase,can ,but don't have to implement in class.
>interface name-------->interface      
public default int method()code------>default method with logic      
class somename implements name     
object.method();------->method call     
@override     
public int method()somenewcode------->can override the default method       
object.method();-------->overridden method call     

4. *public static returntype method*  
  These are static methods that can be accessed only with interface name.
>interface name      
public static method()code----->static method,same as static method in class     
class somename implements name     
name.method();-------->calling with interface name         
  
  From java 9.0 interface can have
5. private methods
  All the above methods from java 9 have private implementations,except abstract.       
  Can only be used inside interface,used to reuse code across multiple interfaces,just like classes
>interface name    
public default int method()    
method2();    
method3();   
private int method2()code   
private static int method3()code    
   

### Inheritance 
Inheritance is extending existing class with a new class. 
The starting class is called parent/base/super class,the extended class is called child/sub class.       
Child class is derived from parent class.     

Ex:            
> class oneadd()              
>  class two extends one sub()              
>  class three extends two mul()              
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
>interface firstadd();           
>interface secondadd();           
>class example implements first,second-------->multiple inheritance.           
  add()logic------------>logic of method           
           
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
class 1------>parent class         
class 2 extends 1-------->child class         
class 3 extends 2 ----------->grand-child class         
class 4 extends 3------->great-grand-child class         

* Every Class should have a default constructor with no parameters,Inheritance won't work without constructors in parent classes.      
* If we wan't we can call the constructor of parent class with super keyword.         


#### Super
To invoke ,variables,methods,constructors of parent class in sub class we use super keyword.      
Remember objects of child class can access parent class methods,But Classes should use super keyword.    
>Ex:  
class train----------->base class  
 train(int x)---------->constructor  
    System.out.println("inside train"); 
        
class train2 extends train---------->child class     
train2()---------->constructor        
   super(5);------------>invoking parent class constructor  
   System.out.println("inside train2"); 
  
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

> EX:out classinner class            
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
public class test ---------> default class                
   public static void cashRegister(pay p)-------->method taking payment reference                
      System.out.println("processing payment ");                     
      p.charge(15);---------->calling method inside the object                
      if(p instanceof card)------->checking if the object is of specific class                
         ((card)p).cashBack();---------->downcasting object to call a method                
   public static void main(String[] args)                      
   pay payment= new card();------->upcasting child class object                
   cashRegister(payment);--------->calling above method                
                     
                     
class pay--------->parent class                
   void charge(int x)-------->method defined,providing structure                
                     
class card extends pay--------->child class                
   @Override---------->overridden method with annotation for compiler                
   void charge(int x)---------->overridden method                
      System.out.println("deducted "+x+" dollars from your card ");   ------>custom logic                  
                        
   void cashBack()--------->child specific method                
      System.out.println("providing cashback for purchase");                     
                        
                     
class money extends pay---------->child class of pay                
   @Override                     
   void charge(int x)--------->overridden method                
      System.out.println("paid"+x+"in cash");                     
                        
     
  

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




Java Documentation of code written.
1. Single Line comment: a single line comment is used to disable a single line of code after the comment. 
`//commented code`
2. Multi line comment: multi line comments are used to disable a block of code. 
java
/* multiple line 
of code this is disable 
System.out.println("hello world");
*/

3. javadoc: to provide documentation of our class and code we use javadoc format.This is more important as we build large applications and will require careful planning and explanation for easy access and understandability of end user/programmers.should be written before a class,method,interface we are documenting
java
/**
 * javadoc starting used to define the method/class/interface.
 * can be multiple lines but will be displayed in a single line
 * @author name used to give the author of this method/class/package
 * @version specifies the version of this method/class/package
 * @param parametervariable message to display for parameter usually we define the type/use of this variable
 * @param parametervariable2 can have multiple parameters and can explain all of them.
 * @return explain the type of return value,actual result for different inputs.
 * @exception exceptionname explains the exception that the method/class raises
 * @throws exceptionname same as exception
 * @deprecated name methods/classes that are deprecated 
 *  
 * Can use HTML tags for better use of javadoc 
 */
```

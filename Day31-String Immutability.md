# Java Strings - Chapter 3
# String Immutability (Explanation)

---

# What is Immutability?

**Immutable** means:

> **Once an object is created, it cannot be changed.**

For Java Strings:

- You cannot modify an existing String object.
- If you try to change it, Java creates a **new String object**.
- The original String always remains unchanged.

---

# Mutable vs Immutable

## Mutable Object

A mutable object can be modified after it is created.

Example:

```
Apple

↓

Modify

↓

Orange
```

The same object changes.

---

## Immutable Object

An immutable object cannot be modified.

```
Apple

↓

Try to Modify

↓

Create New Object

Orange
```

The original object remains exactly the same.

---

# Java String is Immutable

Example:

```java
String s = "Java";
```

The String object

```
Java
```

can never become

```
Java Programming
```

The existing object will never change.

---

# First Example

```java
public class Main {

    public static void main(String[] args) {

        String s = "Java";

        s.concat(" Programming");

        System.out.println(s);

    }

}
```

### Output

```
Java
```

---

# Why?

Let's execute it step by step.

---

## Step 1

```java
String s = "Java";
```

Memory

```
Stack

s
|
|
V

Heap

"Java"
```

---

## Step 2

```java
s.concat(" Programming");
```

Many beginners think Java changes

```
Java
```

to

```
Java Programming
```

That is incorrect.

Java creates a **new String object**.

Heap becomes

```
Java

Java Programming
```

---

## Step 3

Does variable `s` point to the new object?

**No.**

It still points to

```
Java
```

Memory

```
Stack

s
|
|
V

Java
```

---

## Step 4

```java
System.out.println(s);
```

Output

```
Java
```

---

# Important Rule

Most String methods return a **new String**.

If you do not store the returned String, nothing changes.

---

# Correct Way

```java
public class Main {

    public static void main(String[] args) {

        String s = "Java";

        s = s.concat(" Programming");

        System.out.println(s);

    }

}
```

### Output

```
Java Programming
```

---

# Memory Diagram

Before

```
Stack

s

↓

Java
```

After

```java
s = s.concat(" Programming");
```

Memory

```
Heap

Java

Java Programming

Stack

s

↓

Java Programming
```

The old object

```
Java
```

still exists.

If no variable points to it, it becomes eligible for **Garbage Collection**.

---

# Example 2

```java
String s = "Hello";

s = s + " World";

System.out.println(s);
```

Output

```
Hello World
```

---

# Internal Working

Step 1

```
Create

Hello
```

Step 2

```
Create

Hello World
```

Step 3

```
Update Reference
```

The original object

```
Hello
```

is never modified.

---

# Example 3

```java
String s = "abc";

s.toUpperCase();

System.out.println(s);
```

### Output

```
abc
```

---

# Why?

`toUpperCase()` returns a **new String**.

You ignored the returned value.

The variable `s` still points to

```
abc
```

---

# Correct Code

```java
String s = "abc";

s = s.toUpperCase();

System.out.println(s);
```

Output

```
ABC
```

---

# Example 4

```java
String s = "Java";

s.replace("J", "K");

System.out.println(s);
```

Output

```
Java
```

---

Correct

```java
String s = "Java";

s = s.replace("J", "K");

System.out.println(s);
```

Output

```
Kava
```

---

# Example 5

```java
String s = "Java";

s.substring(2);

System.out.println(s);
```

Output

```
Java
```

---

Correct

```java
String s = "Java";

s = s.substring(2);

System.out.println(s);
```

Output

```
va
```

---

# Example 6

```java
String s = "  Java  ";

s.trim();

System.out.println(s);
```

Output

```
  Java
```

(spaces remain)

---

Correct

```java
String s = "  Java  ";

s = s.trim();

System.out.println(s);
```

Output

```
Java
```

---

# String Methods That Return New Objects

These methods **never modify the original String**.

```
concat()

replace()

replaceAll()

substring()

trim()

strip()

toUpperCase()

toLowerCase()

repeat()

intern()
```

---

# Why is String Immutable?

This is one of the most important Java interview questions.

There are four major reasons.

---

# 1. Security

Suppose

```java
String password = "admin123";
```

Many parts of the application use this password.

If Strings were mutable,

someone could change

```
admin123
```

to

```
hacker123
```

The application could become unsafe.

Immutability prevents this.

---

# 2. String Constant Pool

Chapter 2 taught us

```java
String s1 = "Java";
String s2 = "Java";
```

Both variables point to the same object.

```
s1

↓

Java

↑

s2
```

Suppose Strings were mutable.

```java
s1 = s1.replace("J", "K");
```

If Java modified the original object,

then

```
s1

↓

Kava

↑

s2
```

Now `s2` unexpectedly changes too.

That would be a serious bug.

Instead Java creates a new object.

```
s1

↓

Kava


s2

↓

Java
```

Everything remains correct.

---

# 3. Thread Safety

Imagine two threads.

Both use

```java
String message = "Hello";
```

If one thread changes the String,

the other thread also sees the changed value.

With immutable Strings,

multiple threads can safely share the same object.

---

# 4. HashMap Performance

HashMap stores keys using the String's hash code.

Suppose

```
Java
```

is stored as a key.

If the String changes,

its hash code also changes.

The HashMap may no longer find the key.

Because Strings are immutable,

their hash code remains stable.

---

# Garbage Collection

Example

```java
String s = "Java";

s = "Python";

s = "Oracle";
```

Memory

```
Heap

Java

Python

Oracle
```

Current reference

```
s

↓

Oracle
```

The objects

```
Java

Python
```

are no longer referenced.

They become **eligible for Garbage Collection (GC)**.

Java automatically removes unused objects to free memory.

---

# Real-Life Example

Imagine a passport.

If your name changes,

the government does **not** erase the old passport.

Instead,

they issue a **new passport**.

The old passport remains unchanged.

Java Strings behave the same way.

---

# Common Beginner Mistakes

## Mistake 1

```java
String s = "Java";

s.concat("17");

System.out.println(s);
```

Output

```
Java
```

---

## Correct

```java
String s = "Java";

s = s.concat("17");

System.out.println(s);
```

Output

```
Java17
```

---

## Mistake 2

```java
String s = "abc";

s.toUpperCase();

System.out.println(s);
```

Output

```
abc
```

---

## Correct

```java
s = s.toUpperCase();
```

Output

```
ABC
```

---

# Interview Questions

## Q1. What is an immutable object?

An immutable object is an object whose state cannot be changed after it is created.

---

## Q2. Is String mutable?

No.

Java String is immutable.

---

## Q3. Does concat() modify the original String?

No.

It returns a new String.

---

## Q4. Does replace() modify the original String?

No.

It returns a new String.

---

## Q5. Why are Strings immutable?

- Security
- String Constant Pool optimization
- Thread Safety
- HashMap reliability

---

## Q6. What happens to the old String after reassignment?

If no reference points to it,

it becomes eligible for **Garbage Collection**.

---

# Summary

- String objects cannot be modified after creation.
- Every modification creates a new String object.
- The original String always remains unchanged.
- Most String methods return a new String.
- Always assign the returned String if you want the change.
- String immutability improves security, memory optimization, thread safety, and collection performance.

---

# Next Chapter

## Chapter 4 — Complete String Methods

Topics:

- length()
- charAt()
- substring()
- equals()
- compareTo()
- contains()
- indexOf()
- lastIndexOf()
- startsWith()
- endsWith()
- replace()
- split()
- join()
- repeat()
- trim()
- strip()
- toUpperCase()
- toLowerCase()
- isEmpty()
- isBlank()
- matches()

Each method will be explained with:

- Syntax
- Internal Working
- Multiple Examples
- Edge Cases
- Time Complexity
- Interview Questions
- Practice Programs

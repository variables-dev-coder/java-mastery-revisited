# Java Strings - Chapter 2
# String Memory, Heap, Stack & String Constant Pool (SCP)

---

# Why Should You Learn String Memory?

Many Java interview questions are based on how Strings are stored in memory.

For example:

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);
```

Output?

Many beginners think:

```
false
```

But the correct answer is:

```
true
```

Why?

Because of the **String Constant Pool (SCP)**.

---

# Java Memory Overview

Whenever a Java program runs, memory is mainly divided into different areas.

For Strings, the important ones are:

```
+----------------------+
|      Stack Memory    |
+----------------------+

+----------------------+
|      Heap Memory     |
|                      |
|  +----------------+  |
|  | String Pool    |  |
|  +----------------+  |
+----------------------+
```

---

# Stack Memory

Stack stores:

- Local variables
- Method calls
- Reference variables

Example:

```java
String name = "Java";
```

Stack stores only:

```
name
```

which is a reference (address), **not the actual String**.

Diagram:

```
Stack

+---------+
| name ---|------+
+---------+      |
                 |
                 |
```

---

# Heap Memory

Heap stores:

- Objects
- Arrays
- String objects

Example

```java
String name = "Java";
```

Actual data:

```
Java
```

is stored in Heap Memory.

---

# What is the String Constant Pool (SCP)?

The String Constant Pool is a special area inside the Heap Memory.

Its job is:

- Store String literals
- Avoid duplicate String objects
- Save memory
- Improve performance

Diagram

```
Heap

+-----------------------------------+
| String Constant Pool              |
|                                   |
| "Java"                            |
| "Python"                          |
| "Oracle"                          |
+-----------------------------------+
```

---

# String Literal

A String written inside double quotes is called a **String Literal**.

Example:

```java
String language = "Java";
```

Here:

```
"Java"
```

is a String Literal.

---

# Example 1

```java
String s1 = "Java";
```

Memory

```
Stack

+------+
| s1 --|------------------+
+------+                  |
                           |
Heap                       |
                           |
+--------------------------+
| String Pool              |
|                          |
| "Java"                   |
+--------------------------+
```

---

# Example 2

```java
String s1 = "Java";

String s2 = "Java";
```

Memory

```
Stack

+------+
| s1 --|---------+
+------+         |
                 |
+------+         |
| s2 --|---------+
+------+         |
                 |
                 |
Heap             |
                 |
+-------------------------------+
| String Pool                   |
|                               |
| "Java"                        |
+-------------------------------+
```

Notice:

Only **one object** is created.

Both variables point to the same object.

---

# Why?

Because Java checks the String Pool first.

Algorithm:

```
Does "Java" already exist?

YES

↓

Reuse existing object.
```

No duplicate object is created.

---

# Example 3

```java
String s1 = "Java";

String s2 = "Python";
```

Memory

```
Heap

+------------------------+
| String Pool            |
|                        |
| "Java"                 |
| "Python"               |
+------------------------+
```

Two different String literals create two different objects.

---

# Using new String()

Example

```java
String s1 = new String("Java");
```

Now Java creates:

1. String literal in SCP (if not already present)
2. New object in Heap

Memory

```
Stack

+------+
| s1 --|---------------------------+
+------+                           |
                                   |
Heap                               |
                                   |
+------------------------------+   |
| String Pool                  |   |
|                              |   |
| "Java"                       |   |
+------------------------------+   |
                                   |
                                   |
+------------------------------+   |
| New String Object            |<--+
| "Java"                       |
+------------------------------+
```

Now there are **two objects**.

---

# Why Two Objects?

Step 1

```
"Java"
```

goes to String Pool.

Step 2

```
new String()
```

forces Java to create another object.

---

# Example

```java
String s1 = "Java";

String s2 = new String("Java");
```

Memory

```
Stack

s1 ---------> SCP

s2 ---------> Heap Object

Heap

+----------------------+
| String Pool          |
|                      |
| "Java"               |
+----------------------+

+----------------------+
| Heap Object          |
|                      |
| "Java"               |
+----------------------+
```

---

# Example

```java
String s1 = new String("Java");

String s2 = new String("Java");
```

Memory

```
String Pool

"Java"

Heap

Object 1

"Java"

Object 2

"Java"
```

Total Objects

```
3
```

- One in SCP
- Two Heap Objects

---

# Reference Variable

Example

```java
String name = "Java";
```

```
name
```

does not contain:

```
Java
```

It contains only the reference (address).

Diagram

```
Stack

name

↓

0x101

↓

Heap

"Java"
```

---

# What Happens Internally?

```java
String s = "Java";
```

Java performs:

```
Check SCP

↓

Exists?

↓

No

↓

Create Object

↓

Store in SCP

↓

Reference stored in Stack
```

---

Second Time

```java
String s2 = "Java";
```

Java performs:

```
Check SCP

↓

Exists

↓

Reuse existing object

↓

Store reference only
```

No new object.

---

# Advantages of String Pool

- Saves memory
- Faster comparison
- Avoids duplicate objects
- Improves JVM performance

---

# Summary Table

| Statement | Objects Created |
|-----------|-----------------|
| `String s="Java";` | 1 (SCP) |
| `String s="Java"; String s2="Java";` | 1 |
| `new String("Java")` | 2 (if first time) |
| Two `new String("Java")` | 3 |

---

# Interview Questions

### Q1

```java
String s1="Java";
String s2="Java";
```

Objects?

Answer:

```
1
```

---

### Q2

```java
String s1=new String("Java");
```

Objects?

Answer:

```
2
```

---

### Q3

```java
String s1=new String("Java");
String s2=new String("Java");
```

Objects?

Answer:

```
3
```

---

### Q4

Where is String Literal stored?

Answer:

```
String Constant Pool (inside Heap Memory)
```

---

### Q5

Where is reference variable stored?

Answer:

```
Stack Memory
```

---

### Q6

Where is object stored?

Answer:

```
Heap Memory
```

---

# Common Mistakes

❌ Thinking the String is stored in the Stack.

✔️ Only the **reference** is stored in the Stack.

---

❌ Thinking every `"Java"` creates a new object.

✔️ String literals are reused from the **String Constant Pool**.

---

❌ Thinking `new String("Java")` uses only one object.

✔️ It creates a **new Heap object**, and the literal may also exist in the **String Constant Pool**.

---

# Key Takeaways

- **Stack** stores reference variables.
- **Heap** stores objects.
- **String Constant Pool (SCP)** is a special part of the Heap.
- String literals are reused to save memory.
- `new String()` always creates a new Heap object.
- Understanding the SCP is essential before learning `==`, `equals()`, `intern()`, and String immutability.

---

# Next Chapter

## Chapter 3 — String Immutability

We'll answer questions like:

- Why are Strings immutable?
- What happens when you modify a String?
- Why is immutability important?
- How does it improve security, performance, and thread safety?
- Memory diagrams for String modifications.

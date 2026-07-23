# Java Strings - Chapter 1
# Introduction to Strings (Zero → Hero)

---

# What is a String?

A **String** is a sequence of characters.

Example:

```java
String name = "Munna";
```

Here,

```
M
u
n
n
a
```

are individual characters.

Internally Java stores it like:

```
[M][u][n][n][a]
```

---

# Definition

> A String is an object of the `java.lang.String` class that represents a sequence of characters.

---

# Examples

```java
String language = "Java";
String city = "Mumbai";
String company = "OpenAI";
String number = "12345";
String empty = "";
```

---

# Everything Inside Double Quotes is a String

```java
"Hello"

"Java"

"123"

"ABCDE"

""

" "
```

Even if it contains only numbers:

```java
String age = "25";
```

It is **not** an integer.

---

# String vs Character

Character stores only one character.

```java
char ch = 'A';
```

String stores one or more characters.

```java
String str = "A";
```

Difference:

| Character | String |
|-----------|---------|
| Uses single quotes (' ') | Uses double quotes (" ") |
| Stores one character | Stores multiple characters |
| Primitive Data Type | Object |
| Example: `'A'` | Example: `"A"` |

Example:

```java
char c = 'M';

String s = "M";
```

Although both display `M`, they are completely different data types.

---

# Can String Store Spaces?

Yes.

```java
String fullName = "Mohammad Aziz";
```

Output

```
Mohammad Aziz
```

---

# Can String Store Numbers?

Yes.

```java
String roll = "101";
```

Output

```
101
```

Remember:

```
"101"
```

is text, not an integer.

---

# Can String Store Symbols?

Yes.

```java
String password = "@Java#123";
```

Output

```
@Java#123
```

---

# String is NOT a Primitive Data Type

Many beginners think String is primitive.

This is incorrect.

Primitive data types are:

```
byte

short

int

long

float

double

char

boolean
```

String is **not** in this list.

---

# String is a Class

String belongs to

```
java.lang.String
```

Every String is actually an object.

Example:

```java
String name = "Java";
```

Actually means:

```
Object of String class
```

---

# Why is String an Object?

Because it has methods.

Example:

```java
String language = "Java";

System.out.println(language.length());
```

Output

```
4
```

Primitive types cannot call methods.

---

# Package of String

String belongs to

```
java.lang.String
```

Since `java.lang` is imported automatically, we don't write:

```java
import java.lang.String;
```

---

# Ways to Create a String

## Method 1 (Recommended)

```java
String name = "Java";
```

Most commonly used.

---

## Method 2

```java
String name = new String("Java");
```

Both create String objects.

The memory difference will be covered in Chapter 2.

---

# Printing a String

```java
String city = "Mumbai";

System.out.println(city);
```

Output

```
Mumbai
```

---

# String Concatenation

Using `+` operator.

```java
String first = "Hello";

String second = "World";

System.out.println(first + second);
```

Output

```
HelloWorld
```

---

# Adding Space

```java
System.out.println(first + " " + second);
```

Output

```
Hello World
```

---

# Concatenating Variables

```java
String firstName = "Aziz";

String lastName = "Mondal";

System.out.println(firstName + " " + lastName);
```

Output

```
Aziz Mondal
```

---

# Concatenating String and Integer

```java
int age = 25;

System.out.println("Age = " + age);
```

Output

```
Age = 25
```

---

# String + Anything = String

Example 1

```java
System.out.println("Java" + 10);
```

Output

```
Java10
```

---

Example 2

```java
System.out.println(10 + "Java");
```

Output

```
10Java
```

---

Example 3

```java
System.out.println(10 + 20 + "Java");
```

Output

```
30Java
```

Explanation

```
10 + 20 = 30

30 + "Java"

= "30Java"
```

---

Example 4

```java
System.out.println("Java" + 10 + 20);
```

Output

```
Java1020
```

Explanation

```
"Java" + 10

= "Java10"

"Java10" + 20

= "Java1020"
```

---

# Escape Characters

Escape characters begin with backslash (`\`).

---

## New Line

```java
System.out.println("Hello\nWorld");
```

Output

```
Hello
World
```

---

## Tab Space

```java
System.out.println("Java\tPython");
```

Output

```
Java    Python
```

---

## Double Quotes

```java
System.out.println("He said \"Hello\"");
```

Output

```
He said "Hello"
```

---

## Backslash

```java
System.out.println("C:\\Users\\Aziz");
```

Output

```
C:\Users\Aziz
```

---

# Complete Example

```java
public class Main {

    public static void main(String[] args) {

        String firstName = "Aziz";
        String lastName = "Mondal";

        int age = 25;

        System.out.println(firstName + " " + lastName);

        System.out.println("Age = " + age);

        System.out.println("Learning Java Strings");

    }

}
```

Output

```
Aziz Mondal
Age = 25
Learning Java Strings
```

---

# Practice Programs

## Program 1

Print your name.

```java
public class Main {

    public static void main(String[] args) {

        String name = "Munna";

        System.out.println(name);

    }

}
```

---

## Program 2

Print your city.

```java
public class Main {

    public static void main(String[] args) {

        String city = "Mumbai";

        System.out.println(city);

    }

}
```

---

## Program 3

Print full name.

```java
public class Main {

    public static void main(String[] args) {

        String first = "Mohammad";
        String last = "Aziz";

        System.out.println(first + " " + last);

    }

}
```

---

## Program 4

Print age.

```java
public class Main {

    public static void main(String[] args) {

        int age = 25;

        System.out.println("Age = " + age);

    }

}
```

---

## Program 5

Use escape characters.

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Java\nSpring Boot");

        System.out.println("Java\tPython");

    }

}
```

---

# Summary

- String is a sequence of characters.
- String is an object of `java.lang.String`.
- String uses double quotes (`"`).
- Character uses single quotes (`'`).
- String is not a primitive data type.
- String can store letters, numbers, spaces, and symbols.
- `+` operator concatenates Strings.
- If one operand is a String, the result is always a String.
- Escape characters help format output.
- Common ways to create a String:
  - String literal
  - `new String()`

---

# Interview Questions

### Q1. Is String a primitive data type?

**Answer:** No. It is a class (`java.lang.String`).

---

### Q2. Which package contains the String class?

**Answer:**

```
java.lang
```

---

### Q3. Which quotes are used for String?

**Answer:**

```
Double Quotes (" ")
```

---

### Q4. Which quotes are used for char?

**Answer:**

```
Single Quotes (' ')
```

---

### Q5. Can String store numbers?

Yes.

```java
String number = "123";
```

It stores text, not numeric values.

---

### Q6. What is the output?

```java
System.out.println(10 + 20 + "30");
```

Output

```
3030
```

---

### Q7. What is the output?

```java
System.out.println("10" + 20 + 30);
```

Output

```
102030
```

---

### Q8. What is the output?

```java
System.out.println("Java" + 10 * 2);
```

Output

```
Java20
```

Explanation:

```
10 * 2 = 20

"Java" + 20

= Java20
```

---

# Next Chapter

## Chapter 2

**String Memory, Heap, Stack, String Constant Pool, and Object Creation**

Topics:

- Stack Memory
- Heap Memory
- String Literal
- String Object
- String Constant Pool (SCP)
- `new String()`
- Reference Variables
- Memory Diagrams
- Interview Questions
- Real-world Examples

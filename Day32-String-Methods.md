# Java Strings — Chapter 4
# Complete String Methods

> This chapter covers the most important methods of the Java `String` class with syntax, examples, output, important rules, and interview concepts.

---

# 1. Introduction

Java provides many built-in methods through the `String` class.

Example:

```java
String s = "Java";
```

We can perform many operations on this String:

```java
s.length();
s.charAt(0);
s.substring(1);
s.toUpperCase();
s.equals("Java");
```

String methods can be grouped into different categories:

```text
String Methods
│
├── Information
│   ├── length()
│   └── charAt()
│
├── Extraction
│   └── substring()
│
├── Comparison
│   ├── equals()
│   ├── equalsIgnoreCase()
│   └── compareTo()
│
├── Searching
│   ├── contains()
│   ├── indexOf()
│   └── lastIndexOf()
│
├── Checking
│   ├── startsWith()
│   ├── endsWith()
│   ├── isEmpty()
│   └── isBlank()
│
├── Transformation
│   ├── toUpperCase()
│   ├── toLowerCase()
│   ├── trim()
│   ├── strip()
│   ├── replace()
│   └── replaceAll()
│
├── Splitting / Joining
│   ├── split()
│   └── String.join()
│
└── Conversion
    ├── toCharArray()
    ├── getBytes()
    └── String.valueOf()
```

---

# 2. length()

## Purpose

`length()` returns the number of characters present in a String.

## Syntax

```java
string.length();
```

## Example

```java
public class Main {
    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.length());
    }
}
```

## Output

```text
4
```

Because:

```text
J a v a
0 1 2 3
```

There are 4 characters.

---

## Spaces Are Also Counted

```java
String s = "Java Programming";

System.out.println(s.length());
```

The space between `Java` and `Programming` is also counted.

---

## Important

`length()` returns an `int`.

```java
int length = s.length();
```

---

# 3. charAt()

## Purpose

`charAt()` returns the character at a particular index.

## Syntax

```java
string.charAt(index);
```

Java uses zero-based indexing.

Example:

```text
String: Java

Index:
J  a  v  a
0  1  2  3
```

---

## Example

```java
public class Main {
    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
    }
}
```

## Output

```text
J
v
```

---

## Getting Every Character

```java
String s = "Java";

for (int i = 0; i < s.length(); i++) {
    System.out.println(s.charAt(i));
}
```

Output:

```text
J
a
v
a
```

---

## Invalid Index

```java
String s = "Java";

System.out.println(s.charAt(4));
```

Valid indexes are:

```text
0
1
2
3
```

So index `4` is invalid.

This causes:

```text
StringIndexOutOfBoundsException
```

---

# 4. substring()

## Purpose

`substring()` extracts a portion of a String.

There are two commonly used forms.

---

## Form 1

```java
substring(start)
```

It starts from `start` and goes until the end.

---

## Example

```java
String s = "Java";

System.out.println(s.substring(2));
```

Output:

```text
va
```

Indexes:

```text
J  a  v  a
0  1  2  3
      ↑
```

Starting from index `2`:

```text
va
```

---

# Form 2

```java
substring(start, end)
```

Important:

> The `start` index is inclusive, but the `end` index is exclusive.

---

## Example

```java
String s = "Java";

System.out.println(s.substring(1, 3));
```

Indexes:

```text
J  a  v  a
0  1  2  3
   ↑  ↑
```

Index `1` is included.

Index `3` is excluded.

Output:

```text
av
```

---

## Important Rule

```text
substring(start, end)

start → included
end   → excluded
```

Think:

```text
[start, end)
```

---

# 5. equals()

## Purpose

`equals()` compares the content of two Strings.

## Syntax

```java
string1.equals(string2);
```

---

## Example

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

Output:

```text
true
```

---

## Different Content

```java
String a = "Java";
String b = "Python";

System.out.println(a.equals(b));
```

Output:

```text
false
```

---

# 6. == vs equals()

This is one of the most important Java String concepts.

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);
System.out.println(a.equals(b));
```

Output:

```text
false
true
```

Why?

```text
==

    ↓

Compares references
```

while:

```text
equals()

    ↓

Compares String content
```

---

# 7. equalsIgnoreCase()

## Purpose

Compares String content while ignoring uppercase/lowercase differences.

---

## Example

```java
String a = "Java";
String b = "JAVA";

System.out.println(a.equalsIgnoreCase(b));
```

Output:

```text
true
```

Without `equalsIgnoreCase()`:

```java
System.out.println(a.equals(b));
```

Output:

```text
false
```

---

# 8. compareTo()

## Purpose

`compareTo()` performs lexicographical comparison.

Think about dictionary ordering.

```text
Apple
Banana
Cat
Dog
```

---

## Example

```java
String a = "Apple";
String b = "Banana";

int result = a.compareTo(b);

System.out.println(result);
```

The result is negative because:

```text
Apple < Banana
```

---

## Understanding the Result

```text
result < 0
    ↓
First String comes before second String

result == 0
    ↓
Both Strings have the same content

result > 0
    ↓
First String comes after second String
```

---

## Equal Strings

```java
String a = "Java";
String b = "Java";

System.out.println(a.compareTo(b));
```

Output:

```text
0
```

---

## Important

Do not depend on the exact non-zero value.

Use:

```java
result < 0
result == 0
result > 0
```

---

# 9. contains()

## Purpose

Checks whether a String contains another sequence of characters.

## Syntax

```java
string.contains(sequence);
```

---

## Example

```java
String s = "I love Java";

System.out.println(s.contains("Java"));
```

Output:

```text
true
```

---

## Example

```java
String s = "I love Java";

System.out.println(s.contains("Python"));
```

Output:

```text
false
```

---

## Case Sensitive

```java
String s = "Java";

System.out.println(s.contains("java"));
```

Output:

```text
false
```

Because:

```text
Java != java
```

---

# 10. indexOf()

## Purpose

`indexOf()` returns the first occurrence of a character or String.

---

## Character Example

```java
String s = "Java";

System.out.println(s.indexOf('a'));
```

Output:

```text
1
```

String:

```text
J  a  v  a
0  1  2  3
```

There are two `a` characters.

`indexOf()` returns the first one.

---

## String Example

```java
String s = "I love Java";

System.out.println(s.indexOf("Java"));
```

It returns the starting index of `"Java"`.

---

## If Not Found

```java
String s = "Java";

System.out.println(s.indexOf("Python"));
```

Output:

```text
-1
```

Important:

```text
Found     → index
Not found → -1
```

---

# 11. lastIndexOf()

## Purpose

Returns the last occurrence of a character or String.

---

## Example

```java
String s = "Java";

System.out.println(s.lastIndexOf('a'));
```

Output:

```text
3
```

Because:

```text
J  a  v  a
0  1  2  3
         ↑
```

---

## Comparison

```text
indexOf()
    ↓
First occurrence

lastIndexOf()
    ↓
Last occurrence
```

---

## If Not Found

```java
String s = "Java";

System.out.println(s.lastIndexOf("Python"));
```

Output:

```text
-1
```

---

# 12. startsWith()

## Purpose

Checks whether a String starts with a specific prefix.

---

## Example

```java
String s = "Java Programming";

System.out.println(s.startsWith("Java"));
```

Output:

```text
true
```

---

## Example

```java
String s = "Java Programming";

System.out.println(s.startsWith("Python"));
```

Output:

```text
false
```

---

# 13. endsWith()

## Purpose

Checks whether a String ends with a specific suffix.

---

## Example

```java
String s = "Java Programming";

System.out.println(s.endsWith("Programming"));
```

Output:

```text
true
```

---

## Practical Example

Checking a file extension:

```java
String file = "report.pdf";

if (file.endsWith(".pdf")) {
    System.out.println("PDF file");
}
```

Output:

```text
PDF file
```

---

# 14. toUpperCase()

## Purpose

Converts letters to uppercase.

---

## Example

```java
String s = "java";

String result = s.toUpperCase();

System.out.println(result);
```

Output:

```text
JAVA
```

---

## Important

String is immutable.

Therefore:

```java
String s = "java";

s.toUpperCase();

System.out.println(s);
```

Output:

```text
java
```

The returned String was ignored.

Correct:

```java
s = s.toUpperCase();
```

---

# 15. toLowerCase()

## Purpose

Converts letters to lowercase.

---

## Example

```java
String s = "JAVA";

String result = s.toLowerCase();

System.out.println(result);
```

Output:

```text
java
```

---

# 16. trim()

## Purpose

Removes leading and trailing characters with code points less than or equal to U+0020.

For normal spaces, this means removing spaces at the beginning and end.

---

## Example

```java
String s = "   Java   ";

System.out.println(s.trim());
```

Output:

```text
Java
```

---

## Important

`trim()` does not remove spaces from the middle.

```java
String s = "   Java Programming   ";

System.out.println(s.trim());
```

Result:

```text
Java Programming
```

The middle space remains.

---

# 17. strip()

## Purpose

`strip()` removes leading and trailing Unicode whitespace.

Available since:

```text
Java 11
```

---

## Example

```java
String s = "   Java   ";

System.out.println(s.strip());
```

Output:

```text
Java
```

---

## trim() vs strip()

```text
trim()
    ↓
Uses an older, limited whitespace definition

strip()
    ↓
Unicode-aware whitespace handling
```

For normal spaces, both often produce the same result.

---

# 18. replace()

## Purpose

Replaces characters or literal character sequences.

---

## Character Replacement

```java
String s = "banana";

System.out.println(s.replace('a', 'o'));
```

Output:

```text
bonono
```

All matching `a` characters are replaced.

---

## String Replacement

```java
String s = "I love Java";

System.out.println(s.replace("Java", "Python"));
```

Output:

```text
I love Python
```

---

## Important

`replace()` treats its arguments literally.

It does not use regular expressions.

---

# 19. replaceAll()

## Purpose

`replaceAll()` uses a regular expression.

---

## Example

```java
String s = "Java123";

System.out.println(s.replaceAll("[0-9]", ""));
```

Output:

```text
Java
```

Here:

```text
[0-9]
```

means any digit from 0 to 9.

---

# replace() vs replaceAll()

```text
replace()
    ↓
Literal replacement

replaceAll()
    ↓
Regular-expression replacement
```

Example:

```java
String s = "Java123";

s.replace("123", "");
```

Literal replacement.

Whereas:

```java
s.replaceAll("[0-9]+", "");
```

uses regex.

---

# 20. split()

## Purpose

Splits a String into multiple parts and returns a String array.

---

## Example

```java
String s = "Java,Python,Oracle";

String[] arr = s.split(",");

for (String value : arr) {
    System.out.println(value);
}
```

Output:

```text
Java
Python
Oracle
```

---

## Important

`split()` takes a regular expression.

For example, a dot has special meaning in regex.

To split on a literal dot:

```java
String[] parts = "a.b.c".split("\\.");
```

Result:

```text
a
b
c
```

---

# 21. String.join()

## Purpose

Joins multiple Strings using a delimiter.

---

## Example

```java
String result =
        String.join("-", "Java", "Python", "Oracle");

System.out.println(result);
```

Output:

```text
Java-Python-Oracle
```

---

## split() vs join()

```text
split()

One String
    ↓
Many Strings
```

```text
join()

Many Strings
    ↓
One String
```

---

# 22. isEmpty()

## Purpose

Checks whether the String length is zero.

---

## Example

```java
String s = "";

System.out.println(s.isEmpty());
```

Output:

```text
true
```

---

## Space Is Not Empty

```java
String s = " ";

System.out.println(s.isEmpty());
```

Output:

```text
false
```

Because:

```text
" "
```

contains one character: a space.

---

# 23. isBlank()

## Purpose

Checks whether a String is empty or contains only whitespace.

Available since:

```text
Java 11
```

---

## Example

```java
String s = "   ";

System.out.println(s.isBlank());
```

Output:

```text
true
```

---

# isEmpty() vs isBlank()

```text
isEmpty()
    ↓
Length must be exactly 0
```

```text
isBlank()
    ↓
Empty OR whitespace only
```

Example:

```java
String s = "   ";

System.out.println(s.isEmpty());
System.out.println(s.isBlank());
```

Output:

```text
false
true
```

---

# 24. repeat()

## Purpose

Repeats a String a specified number of times.

Available since:

```text
Java 11
```

---

## Example

```java
String s = "Java ";

System.out.println(s.repeat(3));
```

Output:

```text
Java Java Java
```

---

# 25. matches()

## Purpose

Checks whether the entire String matches a regular expression.

---

## Example

```java
String s = "12345";

System.out.println(s.matches("[0-9]+"));
```

Output:

```text
true
```

Because the entire String contains only digits.

---

## Example

```java
String s = "123ABC";

System.out.println(s.matches("[0-9]+"));
```

Output:

```text
false
```

Because `ABC` is not a digit.

---

# 26. String.valueOf()

## Purpose

Converts a value into a String.

---

## Example

```java
int number = 100;

String s = String.valueOf(number);

System.out.println(s);
```

Output:

```text
100
```

---

## Another Example

```java
double price = 99.50;

String s = String.valueOf(price);

System.out.println(s);
```

Output:

```text
99.5
```

---

# 27. toCharArray()

## Purpose

Converts a String into a character array.

---

## Example

```java
String s = "Java";

char[] arr = s.toCharArray();

for (char c : arr) {
    System.out.println(c);
}
```

Output:

```text
J
a
v
a
```

---

## Why is toCharArray() Important?

It is frequently used in String coding problems.

Example:

```java
String s = "hello";

char[] arr = s.toCharArray();
```

Now:

```text
arr[0] = 'h'
arr[1] = 'e'
arr[2] = 'l'
arr[3] = 'l'
arr[4] = 'o'
```

---

# 28. getBytes()

## Purpose

Converts a String into a byte array using a character encoding.

Example:

```java
String s = "ABC";

byte[] arr = s.getBytes();

for (byte b : arr) {
    System.out.println(b);
}
```

For basic ASCII characters:

```text
65
66
67
```

---

## Recommended

When working with external systems, specify the character set explicitly:

```java
import java.nio.charset.StandardCharsets;

String s = "ABC";

byte[] arr = s.getBytes(StandardCharsets.UTF_8);
```

---

# 29. Important String Method Table

| Method | Purpose |
|---|---|
| `length()` | Returns number of characters |
| `charAt()` | Returns character at index |
| `substring()` | Extracts part of String |
| `equals()` | Compares content |
| `equalsIgnoreCase()` | Compares ignoring case |
| `compareTo()` | Lexicographical comparison |
| `contains()` | Checks whether text exists |
| `indexOf()` | Finds first occurrence |
| `lastIndexOf()` | Finds last occurrence |
| `startsWith()` | Checks beginning |
| `endsWith()` | Checks ending |
| `toUpperCase()` | Converts to uppercase |
| `toLowerCase()` | Converts to lowercase |
| `trim()` | Removes legacy leading/trailing whitespace |
| `strip()` | Removes Unicode-aware leading/trailing whitespace |
| `replace()` | Literal replacement |
| `replaceAll()` | Regex replacement |
| `split()` | String to array |
| `String.join()` | Joins Strings |
| `isEmpty()` | Checks length == 0 |
| `isBlank()` | Checks empty/whitespace-only |
| `repeat()` | Repeats String |
| `matches()` | Regex matching |
| `String.valueOf()` | Converts value to String |
| `toCharArray()` | Converts String to char array |
| `getBytes()` | Converts String to bytes |

---

# 30. Programming Examples

## Example 1 — Print Every Character

```java
public class Main {

    public static void main(String[] args) {

        String s = "Java";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
```

Output:

```text
J
a
v
a
```

---

# Example 2 — Reverse a String

```java
public class Main {

    public static void main(String[] args) {

        String s = "Java";

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
```

Output:

```text
avaJ
```

---

# Example 3 — Count a Character

```java
public class Main {

    public static void main(String[] args) {

        String s = "banana";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);
    }
}
```

Output:

```text
3
```

---

# Example 4 — Extract Username from Email

```java
public class Main {

    public static void main(String[] args) {

        String email = "munna@gmail.com";

        int position = email.indexOf('@');

        String username = email.substring(0, position);

        System.out.println(username);
    }
}
```

Output:

```text
munna
```

Important pattern:

```text
Find position
      ↓
Use substring()
      ↓
Extract required part
```

---

# Example 5 — Split a String

```java
public class Main {

    public static void main(String[] args) {

        String data = "Java,Python,Oracle";

        String[] languages = data.split(",");

        for (String language : languages) {
            System.out.println(language);
        }
    }
}
```

Output:

```text
Java
Python
Oracle
```

---

# Example 6 — Check File Extension

```java
public class Main {

    public static void main(String[] args) {

        String file = "report.pdf";

        if (file.endsWith(".pdf")) {
            System.out.println("PDF file");
        }
    }
}
```

Output:

```text
PDF file
```

---

# Example 7 — Check Palindrome

```java
public class Main {

    public static void main(String[] args) {

        String s = "madam";

        boolean palindrome = true;

        for (int i = 0; i < s.length() / 2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome);
    }
}
```

Output:

```text
true
```

---

# Example 8 — Count Vowels

```java
public class Main {

    public static void main(String[] args) {

        String s = "education";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u') {

                count++;
            }
        }

        System.out.println(count);
    }
}
```

Output:

```text
5
```

---

# 31. Important String Patterns

## Pattern 1 — Traverse a String

```java
for (int i = 0; i < s.length(); i++) {

    char ch = s.charAt(i);

}
```

This pattern is used in many String problems.

---

## Pattern 2 — Reverse Traversal

```java
for (int i = s.length() - 1; i >= 0; i--) {

    char ch = s.charAt(i);

}
```

Useful for:

- Reverse String
- Reverse words
- Palindrome
- Comparing from both ends

---

## Pattern 3 — Find Character

```java
for (int i = 0; i < s.length(); i++) {

    if (s.charAt(i) == 'a') {
        // found
    }
}
```

---

## Pattern 4 — Find Position

```java
int index = s.indexOf('@');
```

---

## Pattern 5 — Extract Part

```java
String result = s.substring(start, end);
```

---

# 32. Important Interview Differences

## `==` vs `equals()`

```text
==

→ Reference comparison


equals()

→ Content comparison
```

---

## `equals()` vs `equalsIgnoreCase()`

```text
equals()

→ Case-sensitive


equalsIgnoreCase()

→ Case-insensitive
```

---

## `indexOf()` vs `lastIndexOf()`

```text
indexOf()

→ First occurrence


lastIndexOf()

→ Last occurrence
```

---

## `replace()` vs `replaceAll()`

```text
replace()

→ Literal replacement


replaceAll()

→ Regular expression replacement
```

---

## `trim()` vs `strip()`

```text
trim()

→ Older limited whitespace definition


strip()

→ Unicode-aware whitespace
```

---

## `isEmpty()` vs `isBlank()`

```text
isEmpty()

→ length == 0


isBlank()

→ empty or whitespace-only
```

---

# 33. Interview Questions

## Question 1

What does `length()` return?

### Answer

The number of characters in the String.

---

## Question 2

What is the first index of a String?

### Answer

```text
0
```

---

## Question 3

What happens if `charAt()` receives an invalid index?

### Answer

It throws:

```text
StringIndexOutOfBoundsException
```

---

## Question 4

Is the end index included in `substring(start, end)`?

### Answer

No.

The end index is exclusive.

---

## Question 5

What does `indexOf()` return when the value is not found?

### Answer

```text
-1
```

---

## Question 6

Does `toUpperCase()` modify the original String?

### Answer

No.

String is immutable.

It returns a new String.

---

## Question 7

What is the difference between `==` and `equals()`?

### Answer

```text
==

Compares references.


equals()

Compares String content.
```

---

## Question 8

What is the difference between `replace()` and `replaceAll()`?

### Answer

```text
replace()

Literal replacement.


replaceAll()

Regular-expression replacement.
```

---

## Question 9

What is the difference between `isEmpty()` and `isBlank()`?

### Answer

```text
isEmpty()

Returns true only when length is 0.


isBlank()

Returns true when the String is empty
or contains only whitespace.
```

---

## Question 10

What does `substring(2)` do?

### Answer

It returns the String from index `2` to the end.

Example:

```java
String s = "Java";

System.out.println(s.substring(2));
```

Output:

```text
va
```

---

# 34. Chapter 4 Final Revision

```text
String
│
├── Information
│   ├── length()
│   └── charAt()
│
├── Extraction
│   └── substring()
│
├── Comparison
│   ├── equals()
│   ├── equalsIgnoreCase()
│   └── compareTo()
│
├── Searching
│   ├── contains()
│   ├── indexOf()
│   └── lastIndexOf()
│
├── Checking
│   ├── startsWith()
│   ├── endsWith()
│   ├── isEmpty()
│   └── isBlank()
│
├── Transformation
│   ├── toUpperCase()
│   ├── toLowerCase()
│   ├── trim()
│   ├── strip()
│   ├── replace()
│   └── replaceAll()
│
├── Splitting / Joining
│   ├── split()
│   └── String.join()
│
└── Conversion
    ├── String.valueOf()
    ├── toCharArray()
    └── getBytes()
```

---

# 35. What You Should Practice Now

Before moving to the next String chapter, practice these methods thoroughly:

```text
1. length()
2. charAt()
3. substring()
4. equals()
5. equalsIgnoreCase()
6. compareTo()
7. contains()
8. indexOf()
9. lastIndexOf()
10. startsWith()
11. endsWith()
12. toUpperCase()
13. toLowerCase()
14. trim()
15. strip()
16. replace()
17. split()
18. isEmpty()
19. isBlank()
20. toCharArray()
```

These methods form the foundation for almost every beginner-to-intermediate Java String problem.

---

# End of Chapter 4

Next:

```text
Chapter 5
StringBuilder & StringBuffer
```

Topics:

- Why StringBuilder is needed
- String concatenation performance
- `append()`
- `insert()`
- `delete()`
- `deleteCharAt()`
- `replace()`
- `reverse()`
- `setCharAt()`
- `capacity()`
- String vs StringBuilder
- StringBuilder vs StringBuffer
- Performance comparison
- Interview questions
- Coding problems

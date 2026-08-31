package revision_Arrays;

import java.util.ArrayList;

public class Example5 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
    }
}

/*
Why Integer instead of int?

Can't Write
-> ArrayList<int> list; // ❌

Instead:
-> ArrayList<Integer> list; // ✅

Because Java generics work with reference types, not primitive types.

Primitive:
---------
int
double
char
boolean

Wrapper classes:
----------------
Integer
Double
Character
Boolean

Java automatically performs autoboxing:
---------------------------------------

list.add(10);

Conceptually:
------------

int 10
 ↓
Integer object

And when retrieving:
--------------------

int x = list.get(0);

Java performs unboxing.

ArrayList operations
---------------------
Add
===
list.add(10);

Get
===
list.get(0);

Update
======
list.set(0, 100);

Remove
======
list.remove(0);

Size
====
list.size();

Notice:
------

Array:
------
arr.length

ArrayList:
----------
list.size()

Very important distinction.

Array vs ArrayList syntax
=========================

| Array                   | ArrayList               |
| ----------------------- | ----------------------- |
| `arr[0]`                | `list.get(0)`           |
| `arr[0] = 10`           | `list.set(0, 10)`       |
| `arr.length`            | `list.size()`           |
| Fixed size              | Dynamic size            |
| Primitive types allowed | Wrapper/reference types |
| `new int[10]`           | `new ArrayList<>()`     |


 */
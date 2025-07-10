# Don't Hide Constants

A lesson from Uncle Bok's "Clean Code" deserves more than an honorable 
mention. To me, this is a fundamental rule. The ever-present danger of magic
numbers is something that is seen far too much, and is far too preventable to
not be mentioned here.

## What is a constant?

A constant is, roughly speaking, a value that does not change. The latter part
of that definition is important. It enscribes a meaning into the variable 
given, in most languages, immutability is not enforced by default. The reason
such a value becomes constant is due to some fact by a given programmer.

Let's say we are a tax agency, and we have an app that calculates tax.
```java
class OdometerConverter {
    public static double milesToFeet(double miles) {
        return miles * 5280;
    }
}
```

While we can feel happy that this is an improvement from our previous code,
there is still work to be done. The number `5280` is a magic number. While it
may be apparent to some, it is not apparent to all. There enlies the problem.
Your code should be self documenting, and no PyDoc comment would be needed to
fix this problem. The magic number is imperative to the function. In fact,
it's half of the core functionality. It's value is the number of feet needed
to make one mile. This number will never change, and it is a constant.


The solution is to turn this into something with a name. The best way to do
this in this situation, is declaring some form of constant.

```java
class OdometerConverter {
    public static final int FEET_PER_MILE = 5280;
    
    public static double milesToFeet(double miles) {
        return miles * FEET_PER_MILE;
    }
}
```

You may say to yourself, if it never changes, then why pull it out? Because
`5280` is not a self-documenting. You may also say, "Why would I create a 
variable" and use up memory for the sake of self-documentation. Let's break
this down.

#### A. This variable uses very little memory.
A single variable that greatly increases the readability of your code is well
worth the few bytes of memory. 

#### B. Compilers and interpreters optimize this.
Most compilers and interpreters will see this constant, and easily optimize it
it to not use extra memory.

#### C. The garbage collector will take care of it.
The microsecond this variable is no longer needed, it will be collected by the
garbage collector and it will disappear from memory, just as if you used it as
a literal, magic number.



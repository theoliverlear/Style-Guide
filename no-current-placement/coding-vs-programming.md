# Coding versus Programming
The heart of the book relies on a crucial distinction, not based on semantics,
but an idea.

    Code is for computers. Programs are for people.

For the pedantic types, it is well noted that coding and programming are 
different in a definitional sense. However, I am not making a semantic point.

This book looks at these two terms as fundamentally different. The word code
can be derived from many things, but most notably, and relatedly to 
programming, is encoding. This is obfuscation of data for a given purpose. In
the purpose of computer science, the purpose is creating binary instructions
that electronic systems can understand. Except for a small, but deferentially
important, group of people, we are not dealing with "code" anymore. This is
what coding looked like in the early days of computing.
```binary
000101110101001001011010101000010101101010000000011010010010011111101000100100
010000110011110001001010000011110000011010101000011111000010101010010010100000
110000000101010101000010101010100111010001001000101010101010010001010101010000
000000010100101010111010101010100101010000010101111111111100010010100001011110
101010111110010010100000011010000010101010101010100011111101001111101101001000
```
This is truly code. It is encoded, and it is for computers.


What we are writing in modern times are programs. Programs are made by people,
for people. It is no mistake that programming is a much easier endeavor than
coding. This is because this is a domain without encoding. But, without the 
proper guidance, we can end up writing code that is not for people. I will 
show you throughout the book examples of how we encode meaning into our 
programs for the sake of computers, rather than people.

An important part of understanding programming is understanding people. Most
developers will tell you that you are writing a set of instructions for a
computer. I emphatically disagree. That is the work of coding, not 
programming. Programming is storytelling. It's a narrative. It's creative. 
It's eventful, and repetitive. A good program is like reading a book where the
more you read it, the more you understand it.

```java
import java.util.Random;

public class GameDungen {

    public static void triggerCreekNoise() {
        System.out.println("You hear a loud creek.");
    }

    public static boolean caveCreeks() {
        return new Random().nextBoolean();
    }

    public static void walkThroughDungeon() throws InterruptedException {
        final int secondInMillis = 1000;
        System.out.println("You walk through the dark dungeon.");
        Thread.sleep(secondInMillis)
        if (caveCreeks()) {
            triggerCreekNoise();
        } else {
            System.out.println("You hear nothing. It's quiet. Very quiet...");
        }
    }
}
```

The goal of this book is to teach you to stop writing code for computers, and
start writing programs that tell stories to people.
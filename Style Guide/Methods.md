# Methods

## What is a Method?
A method is a reusable block of code meant to perform an action. Methods are
generalized concepts and therefore there is a lot of ways to go about writing
a method -- and there is a lot todo when writing a good method.

## What is a Good Method?
A good method contains the following core components:
- A revealing name
- (Generally) a single action
- An obvious return type
- A clear and concise body

### A Revealing Name
A method should have a name which is indicative of what it does. This is 
perhaps the most important part of a method in many respects. A good name
will allow the reader to understand the purpose of the method without having 
to read the body of the method. This is extremely important because it 
acknowledges the fact that most code is read more than it is written and that
you respect the reader of your code. It also is an easy way to make your code
more readable without having to change the entirety of the body of the method.
It also saves time for the reader because if they don't have to jump between
the source method and then its use in the code, they can save time and
understand the code more quickly.

A common misconception is that a method name, like other names in code, should
be as short as possible. This is bad practice and unnecessary. A method name,
like other names, should reveal as the first priority. If the name is long,
that is fine -- though you should try to only meet the necessity.
#### Revealing Names Examples

##### Good Names Examples - The Login Object

Let's take the example of a Login object in Java which is created when a user
logs into a website. Their login information includes the time at which they
successfully logged in. Like most objects, the Login object has getters and
setters for its fields. Below shows a simple example of a setter which is
named well.

```java
public class Login {
    ...
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}

```
This is a good name because it...
- Reveals the purpose of the method
- Has a clear return type

##### Bad Names - The Login Object

This following code is an example of a method which is not well named.

```java
public class Login {
    ...
    public void setDT(String dt) {
        this.dt = dt;
    }
}
```
This is a bad name because it...
- Does not reveal the purpose of the method
- Abuse of acronyms

This example uses an acronym which is not well known. It is not readily 
apparent to the average reader what "DT" means. For context, a good acronym
would be "URL" or "HTML" because they are well known and are used in the
context of the field. It would not be an acronym which may be esoteric or
vague. A "DT" could mean "data type" or "down time" for example. The method is
written as a common setter because it meant to be an example which someone may
engage in commonly. Common mistakes are important in style because not only do
they contribute to a larger whole which would not be readable but also is bad
practice in isolation.

##### Good Names - The Subscription Object

Let's take another example of a Subscription object in Java which is created
alongside a user's account to denote their subscription to a service. One of
the fields of the Subscription object may be a tier.

```java
public class Subscription {
    String[] tiers = {"Free", "Pro", "Enterprise"};
    String currentTier;
    ...
    public void upgradeTier() {
        if (this.currentTier.equals(tiers[0])) {
            this.currentTier = tiers[1];
            System.out.println("You have upgraded to the Pro tier.");
        } else if (this.currentTier.equals(tiers[1])) {
            this.currentTier = tiers[2];
            System.out.println("You have upgraded to the Enterprise tier.");
        } else {
            System.out.println("You are already at the highest tier.");
        }
    }
}
```
This is a good name because it...
- Reveals the purpose of the method
- Has a clear return type

##### Bad Names - The Subscription Object

This following code is an example of a method which is not well named.

```java
public class Subscription {
    String[] tiers = {"Free", "Pro", "Enterprise"};
    String currentTier;
    ...
    public void upT() {
        if (this.currentTier.equals(tiers[0])) {
            this.currentTier = tiers[1];
            System.out.println("You have upgraded to the Pro tier.");
        } else if (this.currentTier.equals(tiers[1])) {
            this.currentTier = tiers[2];
            System.out.println("You have upgraded to the Enterprise tier.");
        } else {
            System.out.println("You are already at the highest tier.");
        }
    }
}
```
This is a bad name because it...
- Does not reveal the purpose of the method
- Abuse of terseness

This example uses a shortened version of multiple words, which may well not
work in a singular context but is confounded in succession. This is a bad name
becuase up on its own does not communicate much. What is being "upped"? Even 
if we are to take "up" as a truncated version of "upgrade", it is still not
readily apparent in the context of other alternatives. This could just as well
mean "update" or "upload". Then the word "T" is used as a shortened version of
"tier". What someone may see outside from the context of the Subscription
object is "upT" which is not revealing of anything. The user would be forced
to not only look at the method, but also the class structure itself with its
variables and other methods. **This is all done to avoid a longer method name
\- a necessary sacrifice for writing good code.**


## On Method Size Conventions
Some sources will put a limit on the number of lines a method should have. 
This can be a good idea in theory but in practice it can be difficult to
execute. The problem is that, since a method should generally do one thing, 
you'd imply that the method should be short. However, the single action of a
given method may require a lot of code. This is why it is important to not
limit ourselves to a number of _lines_ but rather to a number of 
**_actions_**.
This is the first commit for the style guide. Ideas, chapters, and examples are soon to come!

# this is the brainstorm section where I note my raw thoughts and ideas
# more structure is seen in the TableOfContents.md file

top of page comments
- name
- project name (perhaps the file name appended with a preceding pipe (|))
- version
- date modified
- (copyright citation ex Copyright: see LICENSE.md)
license in code vs license in repository

## WITH ANY PIECE OF INFORMATION, YOU HAVE TO GIVE IT BUT ALSO SAY WHY ITS IMPORTANT

common coding terms used-- a glossary of terms (perhaps an index too)
Variable names
Line width (79, 49) -- look up screen widths and max text space available fullscreen and half-screen
temporary local variables
order/structure of methods
commend header distinctions
try/catch vs throws (looping, exception handling)
maybe primitives vs objects ex String[] vs StringTokenizer
when to do comments inline vs newline
block comments vs brief, low visual cost comments
when to use keywords like "method" or "section" in comment heading? - What is
already implied
when should headings occur?
when to wrap a method with a poor name in a renamed method to make content more
readable

this of git branches like trying to work on a java code and you want to use one
part but the errors from another section stop you from using what you should be
able to use. git branches allow you to work on one section of code while another
section is being worked on. You can then merge the two branches together when
they wont have issues

when piece of code are commented out, there should be a reason why and it's 
either readily apparent like having test() method commented out with 
test2() under it. Otherwise, you should provide a reason of what the code is 
and why its commented out. What is the plan for it?

chapter: tools plugins, themes, colors, and features that can help readability

any example will be at least x.1 because x.0 is the introduction always
use java documentation or documentation in general for inspiration
the power of alignment

newline if else or else on end of if
a throwing tree might be indicative of a method doing too much
make meaningful distinctions
if your calling .matches() on a mat Matcher object, the name may be readily apparent by the context 
of the method name and the variable name

programming is an inherently human endeavor. The computers we type on to the languages we write
and the compilers we use are all from humans. We must understand the paradigm we are working in
is a human paradigm and that is why metaphorical thinking, like Steve McConnell's "Code Complete"
says, is important to programming readability.
the power of a metaphor and metaphorical (metaphysical?) thinking

the reader may read something and take it at face value while the studier will
stop and think of the implications of the statement. The studier will ask "why is this important"
while the reader takes it as given. The skimmer tends to look over contextualizing styling
cues while also benefiting from a general understanding the base styling provides


how much of the time will the user be in front of the code vs program independence
-- how do we account for these different situations (error handling)

Unplugged privilege: the advantage of having skills to independently or innately
solve problems without the advantate of plugged-in privileges
- Coding interviews advantage -- they have unplugged programming

Shining variable: a variable which is used as a focal point for a program -- why are they important
how do we handle them

the value of consistency and when to break it and why breaking it can add value
the exception can add just as much as the rule

keep in mind the keywords of the chapter and section when writing. reiterate without repeating (maybe)

acronym interactions with case style like JSON in a variable name of camel case
double tripple+ negatives (or positives) handling
what is the goal and what is the read purpose of the condition to choose between 
what makes sense to the concept and what handles programming flow best

chatGPT says "Remember, the primary purpose of comments is to communicate the intent and 
functionality of your code effectively. Special characters should be used sparingly and in a way that 
supports readability rather than distracting from it."

cite your sources, quotes, influences, examples, ect. 
"taking influence from {book} by {author}" it is best pracice to do {thing} this way
--example from {book} by {author}, chapter, page

readability is like a loading bar of readily apperent, the sections of readily 
apparent code all together creates a cohesive readable document
the use of the var keyword
fetch vs get keywords (getter setter vs web data vs otherwise)

how to handle boilerplate like headers styling like having curls on one line

clean code - style distinquishes excellence from compitence
cc - style is a process not a static endpoint
cc-- a clean shop floor reduces accidents, well organized increases productivity

the ultimate goal is to take a program with problems and make it into a program with less problems


style is built piece by piece

what is our pursuit? beauty? functionality? readability?

according to clean code consistent indenting one of strongest effect on low bug density

organizing library, imports, and directories
how people read -- up down left right and when thats not the case
capitalization and case consistency with purpose
retrieving a boolean before an action or durinng it like has enough money on the call or duing it
when naming variable based on what it is and how it will be used
if shortening a variable name, it should be readily apparent what it is with the new name
ex. g not readily apparent for graphics but graphics graphs may be better
ex connection can be shortened to conn 
for the most part, using named variables in loops, like while, are best to 
understand the conditions as opposed to having to direct each condition -- in short, it should give a general
idea where just while (true) does not
When to have spaces between things like methods() and keywords like while ()

err vs tErr where one terminates and the other does not
capitalizing all of url as when its a simple string it can be lower (camel case) whereas an object URL would be upper
the value of verbosity (repetition legitimizes) and the value
of terseness or succinct reiterate without repeating
shorter is not always better

When to printstacktrace (long and continues program) vs a named throw like a RuntimeException 
(specific and stops execution)
emergencies -— when to use system.exit()
Checking for outliers and how to add that to program without confusing boilerplate 
(separation, perhaps a (static?) Utilities class)

classes like relationships and how these relationships should work for different kinds of concepts


the anatomy of a comment, the scope implied by a comment, block vs inline comments (when and why)
when to have a new variable -- a new idea or concept, a new use case, 
general test naming structure, use common pracice of variables and methods testThing
and class and directories ThingTest

Long arguments list, when to press enter, and how/when to line up the entered code -- 
what artifacts do you base the indentation on

string set to null vs empty value "" -- possibly the expectation to be added
to is implied by the double "" while null may remain in nothingness

the difference in conventions between languages -- statically typed vs dynamically 
typed (names of variables, methods, classes, ect)

---python---
when to use underscore or snake case vs camel vs pascal (general methods, variables,
object orientation, classes and exceptions)
--javascript--
elements of HTML id/class into javascript (safe or different naming convention (what and why change or not))
--HTML--
when to use respective naming in ids and classes and how it connects code like javascript and its conventions
--CSS--
ordering of CSS selectors and how to organize them -- visual hierarchy vs similarity/relationship hierarchy
unique position as a typically split or half screen language (why the 49)
CSS deals with already declared variables -- how does that affect the code style
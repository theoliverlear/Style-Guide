Start making up (coining) terms and collecting common terms
If possible, link terms to their definitions in the text throughout the guide

My terms:

Readily apparent: something which is easily understood by the reader
- Where something self-contextualized or contextualized by immediate context 
like comments, variable names, method implications, hierarchy, and more.
- Ex. "In figure 4.2, we can see the conn variable is a variable with a truncated
name. Alone, this may not be readily apparent, but when we have the context of
a URL object and a HttpURLConnection object, we can infer that the conn variable
is short for connection and therefore becomes readily apparent."

Readable: a program which is readily apparent in the entire context of the
codebase
- Ex. "All together with the comments, the sectioning of the header comments,
and readily apparent variable names, the code is readable."
- Think of a textbook based on readability and its sections / examples as
readily apparent.

Stuttering variable: a variable which repeats implied or readily aparent
information.
- Ex. "the variable returnValueInteger is a stuttering variable because the
variable is implied as being returned in its being returned and value is a 
universal term for what a variable contains."

Spoiled variable: a variable which is used and mutated to the point where it
is no longer relevant to the variable's name or intended purpose.
- Ex. "the variable rawPageData is a spoiled variable because it has
been passed through the normalizeData() method and is no longer raw."

Flooding: when a program is written to operate functionally, then is refactored
to match the style guide afterwords.
- Ex. "In figure 4.2, we can see that the code is flooding. Except for the help
from a higher-level programmer, it would be extremely difficult to get anyone
other than the original author to understand the unstyled code."

Capacity: when a program is fully styled to match the style guide and any
additions would be considered over-styling.
- Ex. "In figure 4.2, we can see that the code is objectively not at capacity."

Opening: when a program is not fully styled to match the style guide and needs
additions to be considered fully styled.
- Ex. "In figure 4.2, there is an opening in the findSimilarWords() method."

Fertilizing: when a program is written to match the style guide at the same
time it is written to operate functionally.
- Ex. "In figure 4.2, we can see that the code is fertilized. The advantages
of fertilizing is a consistent understanding of the program at the detriment of
a delay in functionality."

Err-verbosia: using unnecessary or overly complex words, terms, or explanations,
typically in comments, that prevents the code from being readily apparent.
- The term itself is a reflection of the definition
- Ex. "In figure 4.2, we can see code that is err-verbosic. The term 
"super-paradigm interfacial downstream class-by struct" is err-verbosic because 
the particular phrasing is unnecessarily esoteric to describe the code. There
are more readily apparent terms or phrasing that can be used."

Blemish: when a part of the program is not styled, typically by other styled
code, and is apparent to the reader.
- Ex. "In figure 4.2, there is a blemish in the findSimilarWords() method 
because of bleeding on line 12 to 13."

Code consistency (uniform code): when a code is written in a way that is
consistent with the rest of the code.
- Ex. "Writing in uniform code is important because the human brain is trained
by repetition - it legitimizes.

Proficiency bias: when a programmer writes and styles code in a way that
is consistent by their standard of knowledge and they fail to account for
the lower standard of knowledge of other programmers.
- This is coupled with a lack of understanding of the intended audience and
a dismorphic idea of the code style for the intended audience.
- Ex. "In figure 4.2, we can see that the author of the code has a proficiency
biased. They skipped adding comments as to what the loop on line 42 does because
they have a distorted idea of the code's readability."

Deficiency bias: when a programmer writes and styles code in a way that is 
consistent by their standard of knowledge and they fail to account for the
higher standards of knowledge of other programmers.
- Ex. "We can see that the author of the code has a deficiency bias. They 
explained in detail for an enhanced-for loop does on line 42 because they have
a distorted idea of what adds to the code's readability."

Comment consistency (uniform comment): when a comment is uses terms and is 
written in a way that is consistent with the rest of the code.
- Ex. "With uniform comments, we can get a readily apparent idea that the 
function of the described code is the similar to the matching uniform code 
because the functions are overloaded."

Bleeding: when an aspect of code exceeds a style limit, such as a line width,
attribute alignment, or quotations alignment.
- Ex. "In figure 4.2, we can see that the code is bleeding. Here we would put
the bleeding code on a new line and indent the quotation marks to match the
starting point of the preceding code."

Caseloading: when a variable name in its individual context matches the style
but does not match the style of code when paired with its appropriate
concatenation principle.
- Ex. "In figure 4.2, we can see that the code is caseloading. The getter
naming convention is camelCase, but the variable name is screaming snake_case.
Concatenating the two obscures the goal of code consistency. As an alternative,
we refer to the hierarchy of concatenation principles."

Concatenation principle: the principle of concatenating concepts to produce
a concise variable.
- Ex. "In figure 4.2, we can see the concatenation principle in action. The
original concept variable is named rawPageData and the concatenated variable
on the next line which contains the same contents in a StringBuilder is named
rawPageDataBuilder. This is particualrly useful because we know the original
variable is a String from its declaration, and the key concept to understand to
make the code readily apparent is that its contents are a new type of String
object and so "Builder" is added to the title to provide only the necessary
concatenation."

Block comment: a comment which is used to describe a block of code, typically
a block of text itself
- Written in a longer form than an inline comment and covers more content
- Ex. "In figure 4.2, we can see that the code is block commented. The comment
describes lines 42-48 as they are encompassed in an if statement. The block
comment should closely associate a whole concept to the code it covers if the
block of code covers a whole concept."

Inline comment: a comment which is used to describe a single line, or small 
section of code, typically written on the same line as the describing code or 
directly above it.
- Ex. "In figure 4.2, we can see that a few lines are inline commented. The
comments describe unrelated lines of code that should not be considered as a
part of a whole concept. The bits which are important to explain are the 
exception to the block comment's encapsulation."

Style bargaining: adding styling for readability which increases the size of 
the code and reduces the immediate readability of the code in its size
- A code that could be written in 150 lines but takes 300 lines with all the
styling conformed to.
- Ex. "In figure 4.2, we can see the author took a conservative approach to 
style bargaining. The audience for the code is assumed to be coworkers who are
at a similar programming level and so the author did not add comments to common
concepts at the audiences' level of knowledge. The benefit of making the style
bargain is the code can be just as readable while being half the size - which 
in and of itself enhances readability."

Telephone (telephonic) name: a variable whose name is a reflection of another 
aspect of code which is replicated under a different name
- Ex. "In figure 4.2, we can see that the variable go_to_top_button is 
telephonic because when it is reflected in HTML, its ID is to-top-button. Both
variables refer to the same items, but can be mixed up with different names."

Loquacious styling: a program which is over-styled to the point of redundancy.
- Ex. "In figure 4.2, we can see that the code is loquaciously styled. There is
a thin heading for declaring variables, which, perhaps by deficiency bias, is
over-styled. The variable names are localized and have readily apparent names
so having a heading to show the variables are declared is loquacious styling."


Thin heading: a heading, typically a subservient heading, which is denoted with
the "-" character and represents a small but important change or sectioning of 
a concept.
- Thin headings are used for methods and / or internal operations of methods.
- Ex. "In figure 4.2, we can see that the code has thin headings. These
visually as well as textually separate code into sections while containing 
closely related, though unique, concepts into a single file. The retrieveData()
method has a heading designating the methods which imply the readily apparent
concept of the method - which is to retrieve data from a source. Other methods
have their own heading as they are different to the retrieving data concept,
but they still hold a close relationship to the concept that retrieving data 
helps complete."

Thick heading: a heading, typically a main heading, which is denoted with the
"=" character and represents a large change or sectioning of a concept.
- Thick headings are used for classes, nested classes, and / or sections which
share little to no relationship.
- Ex. "In figure 4.2, we can see that the code has thick headings. These designate
heavy changes in concepts and are used to separate large sections of code. The
nested class, PageData, is separated from the SportsGames class with a thick
heading. The methods which are used to retrieve data should be separated from
the sections dedicated to the main concept. The two remain in the same file,
while using a thick heading, to show the two are closely related while having
distinct purposes."


Reverse readability: when a program is written in a way that the styling takes
away from the readability of the code
- Ex. "In figure 4.2, though the code is not loquaciously styled, it has elements
of reverse readability. The code is written in a way that the comment styling
takes away from the readability of the code by over-correcting for proficiency 
bias."

Plugged-in privilege: the advantage of being able to quickly and easily access
resources which may turn code into being readily apparent when it would not
have been otherwise.
- Ex. "John has a plugged-in privilege because he has a 4k monitor and can run
programs like IntelliJ. He knows things like interfaces and generics whereas
Tyler does not because of his unplugged penalty."

Plugged-in programmer: a programmer who is able to quickly and easily access
resources which may turn code into being readily apparent when it may not
have been otherwise.
- Ex. "Finding the line length within a given file is easy for a plugged-in
programmer because they can use a code editor to find the line length. Someone
writing freehand code on a piece of paper would have to count the characters
in each line to find the line length."

Unplugged penalty: the disadvantage of not being able to quickly and easily
access resources which may turn code into being readily apparent when it would
not have been otherwise.
- Ex. "Tyler could not fertilize his program because he had an unplugged 
penalty. He was writing on a piece of paper and did not have access to a
computer - he couldn't afford to rent it for $15 an hour."

Screen (style) dysmorphia: the styling of code which is only viewed or understood by
one screen size case
- Includes the dismorphia of the code caused by a lack of context as to screen
splitting tendencies.
- Ex. "Since the code was written on a 4k monitor, it was not readily apparent
to the author how wordy the block comments were. This is an example of screen
dysmorphia. It was only revealed to the author when the code was viewed on a
1080p monitor and the comments where far too long."

Unplugged programmer: a programmer who does not have quick and easy access to
resources which may be readable with plugged-in, but is not otherwise.
- Those who use code editors or even text editors
- Those who do not have access to the internet or other resources
- Those who rely on outside forces to provide them with resources, such as 
relying on an internet cafe for internet access, having a shared computer, or
having a computer not strong enough to run IDEs
- Ex. "While there are many difficulties to being an unplugged programmer, the
unsung benefit is a strong foundation of logical and programming skills. The
lack of resources forces the programmer to rely on their own skills and while
they may learn slower, they learn more thoroughly. This is often the best way
to prepare for an interview in the programming field as the interview will\
often be unplugged."

Unplugged privilege: the advantage of having skills to independently or innately
solve problems without the advantate of plugged-in privileges
- Ex. "Because of Tyler's unplugged privilege, he was able to solve the problem
in his interview with Microsoft without the use of a computer. This is an 
important highlight of the benefits of being an unplugged programmer."


Solid (concise) variable: a variable which is defined in one line then used as its 
variable name in the immediate lines following.
- A replacement of an inline variable
- Typically used for temporary variables or arbitrary return values
- Ex. "In figure 4.2, we can see the return statement of the normalizeData()
method uses a solid variable. The variables name gives context as to what the
context of the return value is. The variable defined just before returning
called tokenizedData as a solid variable gives us the information that we are
returning tokens of data to use user where we would not have had that context
otherwise."

Shining variable: a variable which is used as a focal point for a program
- Ex. "In figure 4.2, we can see the shining variable of the program is the
userInput object. It is used over and over for the same purpose of reading in
user data - a main tenet of the grade book program."

Throw (throwing) tree: a long list of throws in a method signature -
- Typically, when the exceptions don't accurately describe the problematic 
elements of method and is multi-indented / multi-lined
- Ex. "In figure 4.2, we can see the method signature of the normalizeData()
is a throwing tree. It throws IOException, FileNotFoundException, and 
MalformedURLException. The main throw is IOException, and while that should
be handled in its own block, it is obscured as the main problem by the other
two exceptions which are rare to occur."

Directorysborg: an unstructured directory which is not contextualized by 
subdirectories or proper naming conventions
- Refers to smorgasbord, a compiled variety of things, and relates to the
unstructured nature of a directory with the colloquial term "borg" of 
smorgasbord.
- Ex. "The alternative is a directorysborg. Without using relative paths of 
sectioned directories, the programmer is forced to use unstructured files which
do not add context as to the role of the file and those it is related to."

Commentsborg: 1. a program which is not contextualized by given comment(s) and
often obscures or confuses the reader,
              2. over-commented to an unreadable degree
- Refers to smorgasbord, a compiled variety of things, and relates to the
unstructured nature of a directory with the colloquial term "borg" of 
smorgasbord.
- Ex. "The alternative is a commentsborg. Without spacing our block comments,
the programmer is forced to assume the sections of code which are related to
the block comment when there are distinct conceptual differences. The author 
cleaned up the commentsborg by spacing the block comments to their respective
sections of code and used inline comments to differentiate between related
and unrelated code."

Unrelatable iteration: a loop / iterator which is not readily apparent to the
reader what the purpose of the loop is and / or what it is iterating over
- When a loop uses values like i, j, k, ect. that do not offer context to an
iterable which requires context to understand
- May not always apply to i, j, k, ect. if the loop is readily apparent
- Ex. "In figure 4.2, we can see an unrelatable iteration. We can see the for
loop uses the variable i, but it is not readily apparent what the purpose of i
is meant for. It could be an index, a counter, or something else entirely. 
Instead of using i, we could use a more readily aparent variable name like
avgCounter."

Unrelatable variable: a variable which is not easily understood by the reader.
- Ex. "When tring to determine if something is a unrelatable variable, we can
simply ask ourselves, what is the variable and what is it used for? If we
cannot answer those questions by themselves or with readily apparent data,
then it is an unrelatable variable."
- Ex. 2 "Think of the character Greg in the first episode of Succession. He is
arrives at the party and is not introduced. He's called Craig becuase nobody
know who he was and why he was at the party. He is only relevent when it is
revealed his is the grandson of the owner of the company. Without that context,
Greg is Craig, and he is unrelatable -- an unbeknown nobody."


Highlighting blindness: a program whose code is readable without syntax highlighting
- Ex. "In figure 4.2, we can see the code is readable without syntax highlighting.
It sections and indents the bleeding text to the appropriate line underneath it
on the following line to show, via similar indentation, what the code relates to
and how it is a continuation of the text previous. This code takes into account 
highlighting blindness."
- Ex. 2 "When a user has highlighting blindness, they may easily mix up the
variables interestAPY and interestAPR. This is because the highlighting reveals
the difference of the variables via highlighting the entire word whereas with
highlighting blindness, it would be easy to mix up a single letter difference."

Common terms:

Local Variable: a variable which is only used in a single method
- Citation(s)

DRY: Don't Repeat Yourself
- Cita
- 0.+tion(s)

WET: Write Everything Twice
- Citation(s)

KISS: Keep It Simple Stupid
- Citation(s)

Snake case: a naming convention where words are separated by underscores
- Citation(s)

Camel case: a naming convention where words are separated by capitalization 
after the first word
- Citation(s)



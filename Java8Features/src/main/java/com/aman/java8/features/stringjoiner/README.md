# Java 8: String Joiner
Java added a new final class StringJoiner in java.util package. It is used to construct a sequence of characters separated by a delimiter. Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. You can also pass prefix and suffix to the char sequence.    

![String Joiner](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/String%20Joiner%20Java%208.jpg)   

## About Project
The project describes uses of **StringJoiner** class in different scenarios.  

## How to Run 
Compile and run using provided main class.  

## StringJoiner Constructors
| **Constructor** | **Description** |
| ------------- | --------------- |
| Public StringJoiner(CharSequence delimiter) | It constructs a StringJoiner with no characters in it, with no prefix or suffix, and a copy of the supplied delimiter. It throws NullPointerException if delimiter is null. |
| Public StringJoiner(CharSequence delimiter,CharSequence prefix,CharSequence suffix) | It constructs a StringJoiner with no characters in it using copies of the supplied prefix, delimiter and suffix. It throws NullPointerException if prefix, delimiter, or suffix is null. |

## StringJoiner Methods
| **Method** | **Description** |
| ------------- | --------------- |
| Public StringJoiner add(CharSequence newElement) | It adds a copy of the given CharSequence value as the next element of the StringJoiner value. If newElement is null,"null" is added. |
| Public StringJoiner merge(StringJoiner other) | It adds the contents of the given StringJoiner without prefix and suffix as the next element if it is non-empty. If the given StringJoiner is empty, the call has no effect. |
| Public int length() | It returns the length of the String representation of this StringJoiner. |
| Public StringJoiner setEmptyValue(CharSequence emptyValue) | It sets the sequence of characters to be used when determining the string representation of this StringJoiner and no elements have been added yet, that is, when it is empty. |
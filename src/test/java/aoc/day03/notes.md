# Jake's notes on AOC Day 3

## Approach

* Read the problem
* Broke the problem down into steps in human language (kind of pseudo code)
  1. Identify new lines with the carriage return key "\n" to break the string into rucksacks and store these
  2. Loop over each rucksack
    1. Identify the items in each compartment for the current rucksack
    2. ‘Checking algorithm‘
      1. Common item in each compartment
    3. Calculate current priority value and add to priority sum variable
  3. Return sum of priority values
* Start with the simplest test (High level test)
  * Break down string into rucksacks and return rucksack
* Add more low level tests
  * 

## Jake's learning notes

Arrange, Act, Assert (Given, When, then)
* Arrange
  * Given X input
* Act
  * When Y method called
* Assert (start with this, even though its the last thing)
  * Check Result against test value
* Generating code (e.g. tests) using alt+insert
* String indices  
  ```
  
        // "abcd"
        //  a   b   c   d
        // 0  1   2   3   4
        "abcd".substring(0,2); // "ab"
        "abcd".substring(0,3); // "abc"
        "abcd".substring(2,2); // ""
        "abcd".substring(0,1); // "a"
  ```
* Inline refactor
 
## To Do / Things explored

- [x] Markdown
- [x] Problem decomposition to ‘slice‘ the problem up
- [x] Overarching test
- [ ] Read plan to remember what the problem is (START HERE)
- [x] Write a test for the first task that we want to start with
- [ ] Start tackling task 2.2 from above
- [ ] Windows / UNIX newline
- [x] Names of Java collections / data structures (arrays, lists (e.g. arraylist, linkedlist), maps, sets)
- [ ] Purposes / characteristics of Java collections / data structures (arrays, lists (e.g. arraylist, linkedlist), maps, sets)
- [ ] List implementations
- [x] Run tests with IntelliJ not Gradle
- [ ] Look at using List.of(…)

## Markdown crib sheet

# Heading 1

## Heading 2

### Heading 3

* bullets
* bullets

1. Numbered list
2. Numbered list


# 💻 BridgeLabz-Training

## 🗓 Week 4 : Collections Framework in Java

## 📘 Section A : Training Learning Progress

### 🗓 Day 22 – Java Generics Fundamentals
**(Date: 16-Jan-2026)**
- Set up and revised the `java-collections-practice` branch structure.
```
BridgeLabz-Training/
│── java-collections-practice/
│ 	│── gcr-codebase/
|   |   └── CollectionsConcepts/
|   |       └── src/
|   |           └── com/
|   |               │── generics/
|   |               │── listinterface/
|   |               │── setinterface/
|   |               │── queueinterface/
|   |               │── mapinterface/
|   |               │── examples/
|   |               └── streams/
|   |               └── exceptionhandling/
|   |               └── annotations/
|   |               └── reflection/            
|   |
│ 	└── scenario-based-codebase/
└── README.md
```
- Learned Java Generics to ensure type safety and improve code reusability.
- Understood the purpose of Type Parameters (`T`, `E`, `K`, `V`) in generic programming.
- Implemented Generic Classes and Generic Methods for flexible designs.
- Applied Bounded Types using `extends` and `super` to restrict type usage.
- Used Wildcards (`?`, `? extends`, `? super`) for handling flexible collections.
- Followed Generics best practices such as avoiding raw types and maintaining readable code.
- 🔗 **Code Link:**  
👉 [Generics](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/generics)

---

### 🗓 Day 23 – Java Collections Framework (List, Set, Queue & Map)
**(Date: 17-Jan-2026)**

- Studied the architecture and hierarchy of the Java Collections Framework.
- Understood the roles of `Collection` and `Map` interfaces.
- Learned the **List Interface** and its implementations:
  - `ArrayList`
  - `LinkedList`
  - `Vector`
- Practiced common List operations:
  - Adding, removing, updating, and searching elements
  - Iteration using for-each loop, Iterator, and ListIterator
- Learned the **Set Interface** and its implementations:
  - `HashSet`
  - `LinkedHashSet`
  - `TreeSet`
- Understood how Sets handle uniqueness, ordering, and sorting.
- Learned the **Map Interface** and its implementations:
  - `HashMap`
  - `LinkedHashMap`
  - `TreeMap`
- Performed key-value operations:
  - Insertion, deletion, and retrieval of entries
  - Iteration using `entrySet()`, `keySet()`, and `values()`
- Learned the **Queue Interface** and its implementations:
  - `PriorityQueue`
  - `ArrayDeque`
- Practiced queue operations:
  - Enqueue, dequeue, peek, and poll
- Understood FIFO behavior and priority-based processing.
- Studied internal working, real-time use cases, and performance considerations.
- Practiced practical examples using List, Set, Queue, and Map.
- Committed and pushed all changes.
- 🔗 **Code Link:**  
👉 [List, Set, Queue & Map](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/collectionsframework)

---

### 🗓 Day 24 – Java I/O Streams
**(Date: 19-Jan-2026)**

- Studied the architecture of Java I/O Streams and stream-based data processing.
- Covered both Byte Streams and Character Streams for file handling.
- Learned and implemented:
  - `FileInputStream`, `FileOutputStream`
  - `FileReader`, `FileWriter`
  - `BufferedInputStream`, `BufferedOutputStream`
  - `BufferedReader`, `BufferedWriter`
- Understood Object Streams including:
  - `ObjectInputStream`, `ObjectOutputStream`
  - Serialization and deserialization concepts
- Practiced working with in-memory streams:
  - `ByteArrayInputStream`, `ByteArrayOutputStream`
- Used bridge streams for character encoding:
  - `InputStreamReader`, `OutputStreamWriter`
- Applied best practices such as buffering and try-with-resources.
- Solved practical problems like file copy, serialization, and efficient large-file reading.
- Committed and pushed all work.
- 🔗 **Code Link:**  
👉 [Java I/O Streams](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/javastreams)

---

### 🗓 Day 25 – Exception Handling
**(Date: 20-Jan-2026)**

- Studied Java exception handling concepts and exception hierarchy.
- Differentiated between checked and unchecked exceptions.
- Implemented exception handling using `try`, `catch`, `finally`, and multiple catch blocks.
- Practiced handling common runtime exceptions.
- Used nested `try-catch` blocks for detailed error handling.
- Applied `throw` and `throws` for exception creation and propagation.
- Designed custom exceptions for business rule enforcement.
- Used try-with-resources for automatic resource management.
- Solved scenario-based exception handling problems.
- Committed and pushed all work.
- 🔗 **Code Link:**  
👉 [Exception Handling](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/exceptionhandling)

### 🗓 Day 26 – Regex & JUnit Testing  
**(Date: 21-Jan-2026)**
- Studied Java Regular Expressions and `java.util.regex` API.
- Worked with `Pattern` and `Matcher` classes.
- Practiced regex metacharacters and quantifiers.
- Implemented validations for:
  - Email addresses
  - Password strength
  - Phone numbers
- Used regex operations:
  - `find()`, `matches()`, `replaceAll()`
- Extracted structured data:
  - Dates, hashtags, domain names
- Learned JUnit fundamentals and testing lifecycle.
- Used JUnit 5 annotations:
  - `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll`
- Implemented:
  - Parameterized tests and repeated tests
  - Exception testing using `assertThrows`
- Applied assertion APIs:
  - `assertEquals`, `assertTrue`, `assertAll`
- Followed Arrange-Act-Assert (AAA) testing pattern.
- Created structured test classes and automated test execution.
- Committed and pushed all work.
- 🔗 **Code Link:**  
👉 [Regex](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/regex) <br>
👉 [JUnit Testing](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/testing)

### 🗓 Day 27 – Annotations & Reflection  
**(Date: 22-Jan-2026)**
- Studied Java annotations and their practical usage.
- Implemented standard annotations:
  - `@Override`, `@Deprecated`, `@SuppressWarnings`
- Created custom annotations with attributes and defaults.
- Built repeatable annotations using `@Repeatable`.
- Retrieved annotation metadata at runtime using Reflection API.
- Implemented field and method validation using annotations.
- Simulated role-based access control with custom annotations.
- Built annotation-driven utilities:
  - JSON mapping
  - Caching mechanisms
- Practiced Java Reflection fundamentals:
  - Inspecting classes, fields, methods, and constructors
  - Dynamic object creation and method invocation
- Accessed private and static members using Reflection.
- Implemented advanced Reflection use cases:
  - Execution-time logging
  - JSON generation
  - Dependency injection simulation
- Solved scenario-based problems and committed work.
- 🔗 **Code Link:**  
👉 [Annotations](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/annotations) <br>
👉 [Reflection](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-code-base/JavaCollectionsProblem/src/com/reflection)

---
## 🧩 Section B : Scenario-Based Problems Progress

### 🗓 Day 28 – Scenario-Based Practice  
**(Date: 23-Jan-2026)**
- Solved **5** scenario-based problems.
- Focused on logical thinking and real-world problem solving.
- Committed and pushed all solutions.
- 🔗 **Code Links:**  
👉 [Scenario Based Problems](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/scenario-based/JavaCollectionsScenarioProblem/src/com/day1)

### 🗓 Day 29 – Scenario-Based Practice  
**(Date: 24-Jan-2026)**
- Solved **5** scenario-based problems.
- Focused on logical thinking and real-world problem solving.
- Committed and pushed all solutions.
- 🔗 **Code Links:**  
👉 [Scenario Based Problems](https://github.com/Harshit-Jain01/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/scenario-based/JavaCollectionsScenarioProblem/src/com/day2)



---

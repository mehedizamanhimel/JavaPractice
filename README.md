# JavaPractice

A personal Java practice repository containing algorithm exercises, data structure demos, and example programs.

## Project Structure

- `src/`
  - `MainClass.java` — main entry point that exercises many practice classes.
  - `ConceptPractice/` — concept-focused examples for statements, operators, loops, and file handling.
  - `LeetCode/` — LeetCode-style problem implementations and practice methods.
  - `basicPractice/` — basic Java practice examples for loops, switch statements, and collections.
  - `com/hackerrank/` — HackerRank practice class examples.
  - `problems/` — problem-solving examples such as Fibonacci, Codility tests, and math problems.

## Highlights

- Array and string manipulation examples
- Recursion and search/sort exercises
- Object-oriented practice with constructors and inheritance
- Algorithm practice via LeetCode-style methods
- Custom utility classes such as `ArrayTasks`, `StringOperations`, `HashMapClass`, and more

## Build & Run

This project is Maven-compatible. Use these commands from the repository root:

```bash
mvn clean package
java -jar target/JavaPractice-1.0-SNAPSHOT.jar
```

Or run directly with Maven:

```bash
mvn exec:java
```

If you prefer to compile and run without Maven:

```bash
find src -name '*.java' > sources.txt
javac -d out @sources.txt
java -cp out MainClass
```

## Notes

- `MainClass` is the primary driver used to run examples across multiple practice classes.
- The `src/` directory contains both top-level classes and package-based source directories.
- Both Maven and direct `javac` compilation are supported.

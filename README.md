# JavaPractice

A personal Java practice repository containing algorithm exercises, data structure demos, and example programs.

## Project Structure

- `src/main/java/`
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
find src/main/java -name '*.java' > sources.txt
javac -d out @sources.txt
java -cp out MainClass
```

## Notes

- `MainClass` is the primary driver used to run examples across multiple practice classes.
- `src/main/java/` contains both default-package classes and package-based source directories.
- Both Maven and direct `javac` compilation are supported.

## Testing

Unit tests use JUnit 5 and live in `src/test/java/`, mirroring the source packages.

```bash
mvn test      # run the tests
mvn verify    # run the tests and enforce the coverage minimum (JaCoCo)
```

- Coverage report: `target/site/jacoco/index.html`. The build fails if line coverage drops
  below `coverage.minimum` in `pom.xml` (currently 90%).
- Console output of the tests goes to `target/surefire-reports/*-output.txt` instead of the build log.
- Tests for default-package classes must also be in the default package (Java cannot import from it).
  In those files, import `java.util.List` explicitly. A test for the project's own `List` class
  must *not* import it (see `ListClassTest`).
- `testsupport.ConsoleCapture` is a JUnit extension that captures `System.out` and feeds `System.in`,
  for methods that print or read with `Scanner`.
- `DemoMethodsSmokeTest` runs every no-argument demo method and fails if one throws or hangs.

### Continuous integration

`.github/workflows/unit-tests.yml` runs `mvn verify` on every push to any branch and on pull requests.
Failing tests are annotated on the commit or PR, and the test and coverage reports are uploaded as
the `test-reports` artifact. To block merges on red tests, mark the **JUnit tests (Java 17)** check
as required in the repository's branch protection settings.

Optional local check before pushing:

```bash
git config core.hooksPath scripts/git-hooks   # runs `mvn test` before every git push
```

### Known gaps

These methods have no tests yet because their intended behaviour is unclear or they are unfinished:

- `ArrayTasks`: `boopal`, `kthSmallest`, `intersection`, `solution(int[])`
- `CodilityTest`: `solution3`, `solution(int, int)` (stubs)
- `Tree_Operations.sortedArrayToBST_108` (stub; `javax.swing.tree.TreeNode` cannot be built as a binary tree)
- `Recurssion.result` recurses forever when either argument is not positive
- `ConceptPractice.FileSystem` always opens `new File("")`, so every method throws `FileNotFoundException`


---

---

## 🚀 Performance-Oriented Design

### ✅ Why Not Use `String + String`?
Every `str1 + str2` creates a **new String object**, which leads to:
- 🔁 O(n²) time in loops
- 🧠 High memory churn (GC overhead)

Time complexity: O(n)

Space complexity: O(n) (size of the resulting string)

Instead, we use:

### 🔧 `StringBuilder`: A Mutability Hero
- **Time Complexity (append):** O(1) amortized
- **Space Efficiency:** Only one buffer reused
- **Thread Safety Not Needed:** Better than `StringBuffer` for single-threaded tasks

- 🧪 Space Complexity
Auxiliary Space: O(1) (only one StringBuilder)

Output Space: O(n²) characters for the full triangle

🧠 Note: Space usage grows linearly in each row, but is highly memory-efficient due to buffer reuse.

---

## 📂 Project Structure

```plaintext
.
├── Utils.java              # Contains the optimized repeat() method
└── TrianglePattern.java    # Main logic for building triangle pattern


## 🔍 What This Code Demonstrates

### ✨ Clean Code Practices

- ✅ **Modularization**: Logic to repeat strings is separated in a `Utils` class.
- ✅ **Reusability**: The `repeat()` method can be reused in any pattern problem.
- ✅ **Descriptive Naming**: Classes and variables have self-explanatory names.
- ✅ **Single Responsibility**: Each class and method does one job well.
- ✅ **Comments Included**: Helpful inline comments aid junior developers and reviewers.

---

## 🧱 Key Concepts Used

- **Custom String Repetition Function** (for Java 8 and below)
- **Efficient String Handling with `StringBuilder`**
- **Loop-based Pattern Construction**
- **User Input with `Scanner`**

---

## 💡 Code Breakdown

### 🧰 `Utils.java`
```java
public class Utils {
    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder(); // A mutable sequence of characters.
        for (int i = 0; i < times; i++) {
            sb.append(str); // Appending the string 'n' times
        }
        return sb.toString(); // Convert to final string
    }
}

### Data Types in Java

In Java, data types specify the size and type of values that can be stored in a variable. Java is a strongly typed language, which means every variable must be declared with a data type. Java data types are categorized into two types:

1. **Primitive Data Types**
2. **Reference/Object Data Types**

### Primitive Data Types

Java has eight built-in primitive data types, which are divided into four categories:

#### 1. **Integer Types**
- **`byte`**:
    - **Size**: 1 byte (8 bits)
    - **Range**: -128 to 127
    - **Usage**: Useful for saving memory in large arrays, where memory savings are important.
- **`short`**:
    - **Size**: 2 bytes (16 bits)
    - **Range**: -32,768 to 32,767
    - **Usage**: Also used to save memory in large arrays.
- **`int`**:
    - **Size**: 4 bytes (32 bits)
    - **Range**: -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,647)
    - **Usage**: Default data type for integral values unless there is a need for a larger range.
- **`long`**:
    - **Size**: 8 bytes (64 bits)
    - **Range**: -2^63 to 2^63-1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
    - **Usage**: Used when a wider range than `int` is needed. Add 'L' or 'l' suffix to denote a long value (e.g., `123456789L`).

#### 2. **Floating-Point Types**
- **`float`**:
    - **Size**: 4 bytes (32 bits)
    - **Range**: Approximately ±3.40282347E+38F (6-7 significant decimal digits)
    - **Usage**: Used to save memory in large arrays of floating-point numbers. Add 'F' or 'f' suffix to denote a float value (e.g., `3.14F`).
- **`double`**:
    - **Size**: 8 bytes (64 bits)
    - **Range**: Approximately ±1.79769313486231570E+308 (15 significant decimal digits)
    - **Usage**: Default data type for decimal values, usually used for more precise calculations.

#### 3. **Character Type**
- **`char`**:
    - **Size**: 2 bytes (16 bits)
    - **Range**: 0 to 65,535 (Unicode characters)
    - **Usage**: Used to store a single character/letter or ASCII values. Enclosed in single quotes (e.g., `'A'`).

#### 4. **Boolean Type**
- **`boolean`**:
    - **Size**: 1 bit (not precisely defined, JVM dependent)
    - **Values**: `true` or `false`
    - **Usage**: Used for simple flags that track true/false conditions.

### Declaring and Initializing Variables

To declare a variable in Java, you specify the data type followed by the variable name. Optionally, you can initialize the variable with a value at the time of declaration.

**Syntax:**
```java
dataType variableName;          // Declaration
dataType variableName = value;  // Declaration with Initialization
```

**Examples:**
```java
int age = 25;           // Integer variable
float pi = 3.14F;       // Floating-point variable
char grade = 'A';       // Character variable
boolean isJavaFun = true; // Boolean variable
```

### Variable Naming Rules
- Variable names are case-sensitive.
- The name must begin with a letter (a-z, A-Z), dollar sign (`$`), or underscore (`_`).
- Subsequent characters can be letters, digits (0-9), dollar signs, or underscores.
- Cannot be a Java keyword (e.g., `int`, `class`).

### Example Usage:
```java
public class Main {
    public static void main(String[] args) {
        int count = 10;            // Integer
        double salary = 55000.50;  // Double
        char grade = 'A';          // Character
        boolean isEligible = true; // Boolean
        
        System.out.println("Count: " + count);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Eligible: " + isEligible);
    }
}
```

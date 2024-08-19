### Operators in Java

Operators are special symbols in Java that perform operations on variables and values. Java provides several types of operators, which can be broadly categorized into:

1. **Arithmetic Operators**
2. **Relational Operators**
3. **Logical Operators**
4. **Bitwise Operators**

### 1. Arithmetic Operators

Arithmetic operators are used to perform basic mathematical operations.

| Operator | Description       | Example        |
|----------|-------------------|----------------|
| `+`      | Addition          | `a + b`        |
| `-`      | Subtraction       | `a - b`        |
| `*`      | Multiplication    | `a * b`        |
| `/`      | Division          | `a / b`        |
| `%`      | Modulus (remainder) | `a % b`        |
| `++`     | Increment (adds 1) | `a++` or `++a` |
| `--`     | Decrement (subtracts 1) | `a--` or `--a` |

**Example:**
```java
int a = 10;
int b = 5;
int sum = a + b; // 15
int diff = a - b; // 5
int prod = a * b; // 50
int quot = a / b; // 2
int rem = a % b; // 0
```

### 2. Relational Operators

Relational operators are used to compare two values and determine the relationship between them. The result of a relational operation is a boolean value (`true` or `false`).

| Operator | Description         | Example    |
|----------|---------------------|------------|
| `==`     | Equal to             | `a == b`   |
| `!=`     | Not equal to         | `a != b`   |
| `>`      | Greater than         | `a > b`    |
| `<`      | Less than            | `a < b`    |
| `>=`     | Greater than or equal to | `a >= b` |
| `<=`     | Less than or equal to | `a <= b` |

**Example:**
```java
int a = 10;
int b = 5;
boolean result1 = a > b; // true
boolean result2 = a == b; // false
```

### 3. Logical Operators

Logical operators are used to perform logical operations, typically with boolean values.

| Operator | Description                    | Example               |
|----------|--------------------------------|-----------------------|
| `&&`     | Logical AND (both true)        | `a && b`              |
| `||`     | Logical OR (either true)       | `a || b`              |
| `!`      | Logical NOT (inverts boolean)  | `!a`                  |

**Example:**
```java
boolean x = true;
boolean y = false;
boolean result1 = x && y; // false
boolean result2 = x || y; // true
boolean result3 = !x;     // false
```

### 4. Bitwise Operators

Bitwise operators are used to perform bit-level operations on integer types (`byte`, `short`, `int`, `long`).

| Operator | Description         | Example  |
|----------|---------------------|----------|
| `&`      | Bitwise AND         | `a & b`  |
| `|`      | Bitwise OR          | `a | b`  |
| `^`      | Bitwise XOR         | `a ^ b`  |
| `~`      | Bitwise NOT         | `~a`     |
| `<<`     | Left shift          | `a << 2` |
| `>>`     | Right shift         | `a >> 2` |
| `>>>`    | Unsigned right shift | `a >>> 2` |

**Example:**
```java
int a = 5;  // 0101 in binary
int b = 3;  // 0011 in binary

int result1 = a & b;  // 0001 (1 in decimal)
int result2 = a | b;  // 0111 (7 in decimal)
int result3 = a ^ b;  // 0110 (6 in decimal)
int result4 = ~a;     // 1010 (two's complement of 5)
int result5 = a << 1; // 1010 (10 in decimal, left shift by 1)
int result6 = a >> 1; // 0010 (2 in decimal, right shift by 1)
```

### Combining Operators
Operators can be combined in expressions. Java follows the precedence and associativity rules to determine the order of evaluation.

**Example:**
```java
int a = 10;
int b = 5;
int c = 20;
boolean result = (a > b) && (c > a); // true
```

### Understanding Precedence
Operator precedence determines how operators are parsed relative to each other. Operators with higher precedence are evaluated before operators with relatively lower precedence.

For example:
```java
int a = 10 + 20 * 2; // Result is 50, because * has higher precedence than +
```

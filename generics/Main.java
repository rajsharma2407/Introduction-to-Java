package generics;

// Generic class definition
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        // Using Box with String type
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        System.out.println("String value: " + stringBox.getValue());

        // Using Box with Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(123);
        System.out.println("Integer value: " + integerBox.getValue());
    }
}

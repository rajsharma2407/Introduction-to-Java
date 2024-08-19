package OOPS;

abstract class TestClass {
    abstract void someMethod();
    void anotherMethod(){
    }
}

interface TestInterface{
    void someMethod();
    default void anotherMethod(){

    }
}
class Abstraction extends TestClass{
    @Override
    void someMethod(){
        System.out.print("some method");
    }
    public static void main(String args[]){

    }
}


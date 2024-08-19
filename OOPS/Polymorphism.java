package OOPS;

class Test{
    int add(int x, int y){
        return x+y+1;
    }
}

public class Polymorphism extends Test{
    @Override
    int add(int x, int y){
        return x+y;
    }
    int add(int x, int y, int z){
        return x+y+z;
    }
    public static void main(String args[]){
        Test test = new Test();
        System.out.println(test.add(2,3));
    }
}

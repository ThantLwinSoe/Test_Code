public class ConstructorInheri {

    public static void main(String [] args) {

    }
}

class SuperClass {

    private String name;
    private int age;

    SuperClass(String name) {
        this.name = name;
    }

    SuperClass(int age) {
        this.age = age;
    }

    String getName() {
        return this.name;
    }

}

// if parents class have constructor 
// must be write in the ChildClass
// don't forget

class ChildClass extends SuperClass {

    // private String name;
    //  private int age;

    ChildClass(String name) {
        super(name);
    }

    ChildClass(int age) {
        super(age);
    }

}
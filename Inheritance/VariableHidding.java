class Parent {
    int i = 10;
    int j = 20;

    void show() {
        System.out.println(i+ "+"+ j);
        System.out.println(i+j);
    }
}
class Child extends Parent{

    int i = 30;
    int j = 40;

    public void show() {

        System.out.println(i + "+" + j);
        System.out.println(i+j);
    }

}

class TestHidding {

    public static void main() {
       
        // if you build object with Polymophic 
            Parent obj = new Child();
        // This i value is 10 form the parent class
            obj.i; 
        // show() method will output 30+40 = 70 
        // Because of the scope child object does not know i from the parent
            obj.show();
        
        // Parent type change to Child Type
            Child obj2 = (Child) obj;
            obj.i;
            obj.show();
        // it's all work normal
    }

}
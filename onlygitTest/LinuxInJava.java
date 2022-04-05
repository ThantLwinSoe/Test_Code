public class LinuxInJava {

    String name;
    int age;

    LinuxInJava (String name) {
        this.name = name;
    }

    LinuxInJava (int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String [] args) {

        System.out.println("Name :" + new LinuxInJava("Thant Lwin Soe").getName());
        System.out.println("Age : " + new LinuxInJava(28).getAge());
    }

}
package Test;

import org.w3c.dom.ls.LSOutput;

public class Person1111 {
    String name;
    int age;

    Person1111(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person1111 pp = new Person1111("John", 25);
        System.out.println(pp.name);
        System.out.println(pp.age);


        Person1111 pk = new Person1111("Alice", 30);
        System.out.println(pk.name);
        System.out.println(pk.age);

    }
}


package Test;

public class student3 {

    String name;
    int Rollnos;
    char section1;

    student3(String name, int Rollnos, char section1) {
        this.name = name;
        this.Rollnos = Rollnos;
        this.section1 = section1;
    }

    void display() {
        System.out.println(name);
        System.out.println(Rollnos);
        System.out.println(section1);
    }

    public static void main(String[] args) {
        student3 S3 = new student3("BOB", 101, 'A');
        S3.display();

    }
}


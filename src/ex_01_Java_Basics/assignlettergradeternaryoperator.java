package ex_01_Java_Basics;

public class assignlettergradeternaryoperator {
    static void main(String[] args) {
        int marks = 78;
        String grade = (marks >= 90) ? "A" :
                        (marks >= 75) ? "B" :
                        (marks >= 60) ? "C" :
                        (marks >= 40) ? "D" : "F";
        System.out.println("The marks  is :" + marks);
        System.out.println("The grade is :"+grade);
    }
}
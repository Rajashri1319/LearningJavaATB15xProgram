package ENUM;

enum ExecutionType{AUTOMATION , MANUAL}

public class Demo6 {
    public static void main(String[] args) {
        ExecutionType one = ExecutionType.MANUAL;
        System.out.println("First execution type is :"+one);
        ExecutionType two = ExecutionType.AUTOMATION;
        System.out.println("second Execution Type is :"+two);
    }
}

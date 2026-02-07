package ENUM;

// Step 1: Create enum (fixed values)
enum TestStatus {
    PASS,
    FAIL,
    SKIP
}

// Step 2: Test case class
class TestCase {

    // variable of enum type
    TestStatus status;

    // constructor
    TestCase(TestStatus status) {
        this.status = status;
    }

    // method to print test result
    void printResult() {
        System.out.println("Test Case Status: " + status);
    }
}

// Step 3: Main class
class EnumDemo {

    public static void main(String[] args) {

        // creating test case with PASS status
        TestCase tc1 = new TestCase(TestStatus.PASS);
        tc1.printResult();

        // creating test case with FAIL status
        TestCase tc2 = new TestCase(TestStatus.FAIL);
        tc2.printResult();
    }
}


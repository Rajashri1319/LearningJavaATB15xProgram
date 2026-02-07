package ENUM;


import java.security.PublicKey;

enum Enviorment {DEV , QA , PRD}
public  class TestEnum {
    public static void main(String[] args) {
        Enviorment env =Enviorment.QA;
        System.out.println("Executing Tests on :"+env);
        Enviorment env1 = Enviorment.PRD;
        System.out.println("Second exceuting env is :"+env1);
    }

}
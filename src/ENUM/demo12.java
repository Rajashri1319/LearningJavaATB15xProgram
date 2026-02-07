package ENUM;


enum LoginResults{
    PASS , FAIL}

 class demo12 {
     public static void main(String[] args) {
         String LogResults1;
         LoginResults res = LoginResults.PASS;
         System.out.println("Login Results is :" + res);

         LoginResults res1 = LoginResults.FAIL;
         System.out.println("Login Results is :" + res1);
     }
 }

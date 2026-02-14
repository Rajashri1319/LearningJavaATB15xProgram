package Test;

abstract class Employeee {
    public abstract double CalculateSalary();
    }

class manager extends Employeee
{
   double salary;
   double Bonus;
   manager(double salary , double Bonus){
       this.salary = salary;
       this.Bonus = Bonus;
    }
    @Override
    public double  CalculateSalary(){
       return  salary+Bonus;
    }
}
class devloper extends Employeee {
    double hourlyrate;
    double hoursworked;

    devloper(double hourlyrate, double hours) {
        this.hourlyrate = hourlyrate;
        this.hoursworked = hours;
    }

    @Override
    public double CalculateSalary() {
        return hourlyrate * hoursworked;
    }
}
class testmain{
    public static void main(String[] args) {
        Employeee M = new manager(60000 , 10000);
        Employeee D = new devloper(50 , 160);
        System.out.println("Manager Salary : "+ M.CalculateSalary() );
        System.out.println("Devloper salary :"+ D.CalculateSalary());
    }

}

package deenn.com;

public class Accountant extends Employee {

    public static String paySalary(Employee employee) {
        String out = "";
        switch (employee.getRank()) {
            case "CEO" -> {
                employee.setSalary(500_000.00);
                out = "Dear " + employee.getName() + " your salary has been paid\n cheers";
            }
            case "Middle" -> {
                employee.setSalary(300_500.00);
                out  = "Dear " + employee.getName() + " your salary of "+employee.getSalary()+ " have been paid\n cheers";
            }
            case "Junior" -> {
                employee.setSalary(150_000.00);
                out  = "Dear " + employee.getName() + " your salary of "+employee.getSalary()+ " have been paid\n cheers";
            }

            default ->  System.out.println("");
        }
        return  out;
    }
}

package deenn.com;

public class FinanceGuy extends Person {

    public FinanceGuy(String name, int id, String email, String rank) {
        super(name, id, email, rank);
    }
    public static void paySalary() {
        System.out.println("paid salary");
    }
}

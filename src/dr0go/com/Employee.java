package dr0go.com;

public class Employee extends Person{
    private double Salary;
    private String rank;
    private int role;
    private int WorkRate;
    private int query = 0;
    private String offense = "";

    public int getQuery() {
        return query;
    }

    public void setQuery(int query) {
        this.query = query;
    }

    public String getOffense() {
        return offense;
    }

    public void setOffense(String offense) {
        this.offense = offense;
    }

    public Employee(){}

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getWorkRate() {
        return WorkRate;
    }

    public void setWorkRate(int workRate) {
        WorkRate = workRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Salary=" + Salary +
                ", rank=" + rank +
                ", role=" + role +
                ", WorkRate=" + WorkRate +
                '}';
    }
}

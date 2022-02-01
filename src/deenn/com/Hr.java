package deenn.com;
import java.util.Iterator;
import java.util.List;
public class Hr extends Employee{

    public Hr(){}

    /*
    * HR class
    * Methods
    * Receive applicant(): public
    * Conduct interviews(): public
    * Send applicant(): public
    * */
    public void addQuery(Employee employee) {
        if (!employee.getOffense().isEmpty() && !employee.getOffense().equalsIgnoreCase("Harassment"))
            employee.setQuery(employee.getQuery() + 1);
        else if(employee.getWorkRate() < 50)
            employee.setQuery(employee.getQuery() + 1);
    }
    public void addOffense(Employee employee, String offense) {
        employee.setOffense(offense);
    }
    public static List<Applicants> receiveApplication(List<Applicants> applicants){
// filter list and return
        Iterator it = applicants.iterator();
        while (it.hasNext()){
            var applicant = (Applicants) it.next();
            if (!applicant.isGraduate()){
                it.remove();
            }
        }
        return applicants;
    }


}

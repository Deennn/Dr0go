package deenn.com;

import java.util.List;

public interface iCeo {
    public List<Employee> hire(List<Applicants> applicants);
    public  String fire(Employee employee);
}

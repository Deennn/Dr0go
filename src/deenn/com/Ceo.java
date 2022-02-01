package deenn.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ceo extends Employee implements iCeo{
    private List<Employee> employees;
    private int vacancies = 10;

    public int getVacancies() {
        return vacancies;
    }

    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }

    @Override
    public List<Employee> hire(List<Applicants> applicants) {
        employees = new ArrayList<>();

        Iterator it = applicants.iterator();
        while (it.hasNext()){
            Applicants applicant = (Applicants) it.next();
            if (vacancies > 0 && applicant.getQualification().equalsIgnoreCase("msc"))
            {
                // user prompt
                Employee employee = new Employee();

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter rank: ");
                String rank = scan.nextLine();
                employee.setRank(rank);


                employee.setName(applicant.getName());
                employee.setEmail(applicant.getEmail());
                employee.setQualification(applicant.getQualification());
                employee.setGender(applicant.getGender());
                employee.setGraduate(applicant.isGraduate());

                employees.add(employee);
                vacancies -= 1;
                System.out.println("Congratuations\nDear "+ employee.getName() +" You have been hired as a " + employee.getRank() +" at Dr0go group of company\ncheers" );
            }

        }
        return  employees;
    }
    @Override
    public  String fire(Employee employee) {
        String fired = "Good work, keep it up";
        if(employee.getQuery() < 2 && !employee.getOffense().equalsIgnoreCase("Harassment")){
            employee.setQuery(employee.getQuery() + 1);
        }else{
            fired = employee.getName()+ " Your are fired from Dr0go group of company";
            setVacancies(getVacancies() + 1);
        }

        return fired;
    }
}

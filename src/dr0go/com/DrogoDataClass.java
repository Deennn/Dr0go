package dr0go.com;
import java.util.ArrayList;
import java.util.List;

public class DrogoDataClass {


    public static List<Applicants> getDrogodata(){
       List<Applicants> dataList = new ArrayList();

        Applicants app1 = new Applicants();
        app1.setName("Amlustapha");
        app1.setId("101");
        app1.setEmail("musty@gmail.com");
        app1.setGraduate(true);
        app1.setReadyForInterview("");
        app1.setQualification("Msc");
        app1.setGender("Male");

        Applicants app2 = new Applicants();
        app2.setName("Peter ");
        app2.setId("102");
        app2.setEmail("peteru@gmail.com");
        app2.setGraduate(false);
        app2.setReadyForInterview("");
        app2.setQualification("olevel");
        app2.setGender("Male");


        Applicants app3 = new Applicants();
        app3.setName("lawal ");
        app3.setId("103");
        app3.setEmail("lawal@gmail.com");
        app3.setGraduate(true);
        app3.setReadyForInterview("");
        app3.setQualification("Msc");
        app3.setGender("Male");

        Applicants app4 = new Applicants();
        app4.setName("loveth ");
        app4.setId("104");
        app4.setEmail("loveth@gmail.com");
        app4.setGraduate(true);
        app4.setReadyForInterview("");
        app4.setQualification("Bsc");
        app4.setGender("Female");

        Applicants app5 = new Applicants();
        app5.setName("Bueze ");
        app5.setId("105");
        app5.setEmail("bueze@gmail.com");
        app5.setGraduate(true);
        app5.setReadyForInterview("");
        app5.setQualification("Msc");
        app5.setGender("Male");

        dataList.add(app1);
//        dataList.add(app2);
//        dataList.add(app3);
        dataList.add(app4);
//        dataList.add(app5);
        return dataList;
    }

    public static Employee getEmployee(){


  Employee emp1 = new Employee();
  emp1.setName("Lawal Deenn");
  emp1.setId("101");
  emp1.setEmail("lawal@gmail.com");
  emp1.setGraduate(true);
  emp1.setOffense("Harassment");
  emp1.setQualification("bsc");
  emp1.setGender("Male");
  emp1.setRank("Junior");
     return emp1;
    }
}

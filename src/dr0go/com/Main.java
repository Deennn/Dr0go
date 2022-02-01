package dr0go.com;
import java.util.Scanner;

public class Main {

    public static int appMenu(Scanner scan){
        System.out.println("1. CEO");
        System.out.println("2. HR");
        System.out.println("3. Accountant");
        System.out.println("4. Applicant");

        return Integer.parseInt(scan.nextLine());
    }
    public static int ceoMenu(Scanner scan){
        System.out.println("1. Hire Applicants");
        System.out.println("2. Fire Employee");
        System.out.println("3. 0 to exit");
        return Integer.parseInt(scan.nextLine());
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean choose = true;
        int choice;
        int ceochoice;

        while (choose){
             choice = appMenu(scan);
            switch (choice){
                case 1: {
                    Ceo ceo = new Ceo();

                     ceochoice = ceoMenu(scan);
                    if (ceochoice == 1){
                        var hired = ceo.hire(DrogoDataClass.getDrogodata());

                        choose = false;
                    }else if( ceochoice == 2){
                        var fired = ceo.fire(DrogoDataClass.getEmployee());
                        System.out.println(fired);
                        choose = false;
                    }else{
                        ceochoice = ceoMenu(scan);
                    }

                }
                break;
                case 2:{

                    System.out.println("HR under construction");
                }
                break;
                case 3: {
                    var pays = Accountant.paySalary(DrogoDataClass.getEmployee());
                    System.out.println(pays);
                }
                break;
                case 4: {
                    Applicants app = new Applicants();
                    var applicant = app.apply();
                }
                break;
                default:
                    System.out.println("Sorry you dont have access to this system");
            }
        }
    }
}


















//        Scanner scan = new Scanner(System.in);
//        List<Applicants> applicants = new ArrayList<>();
//        Ceo ceo = new Ceo();
//        Hr hr = new Hr();
//        Applicants app = new Applicants(scan);
//        var applicant = app.apply();
//        applicants.add(applicant);
//       var newList = hr.receiveApplication(applicants);
//       var hired = ceo.hire(newList);
//       Iterator it = hired.iterator();
//       while (it.hasNext()){
//           var emp = (Employee) it.next();
//           Accountant.paySalary(emp);
//
//

//    }



//        System.out.println(ceo.hire(newList));
//        System.out.println(ceo.fire(emp1));
//        System.out.println(ceo.fire(emp2));


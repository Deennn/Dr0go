package dr0go.com;

import java.util.Scanner;

public class Applicants extends Person{
    private Scanner scan = new Scanner(System.in);

    public Applicants apply(){
        System.out.println("Enter name: ");
        this.setName(scan.nextLine());

        System.out.println("Enter Email");
        this.setEmail(scan.nextLine());

        System.out.println("Enter Qualification");
        this.setQualification(scan.nextLine());

        System.out.println("Enter your gender");
        this.setGender(scan.nextLine());

        System.out.println("Are you a graduate?");
        this.setGraduate(scan.nextBoolean());

        System.out.println("Congratulation " + this.getName() + ", you've successfully applied to Dr0go group of company");

        return  this;


    }
}

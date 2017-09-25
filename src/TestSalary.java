import java.util.*;
public class TestSalary {

    public static void  main(String args[]){
        Technician technician = new Technician();
        Scanner input = new Scanner(System.in);
        double cumulativeMonthlySalaries = 0;
        char choice ;
        int counter = 1;
        boolean exit = false;
        do {

            System.out.print("Employee Name: ");
            String employeeName = input.nextLine();
            technician.setName(employeeName);
            System.out.print("Employee Address: ");
            String address = input.nextLine();

            technician.setAddress(address);
            System.out.print("Basic Salary (RM): ");
            double basicSalary = input.nextDouble();

            technician.setBasicSalary(basicSalary);
            System.out.println("Month Salary(RM): "+ (int) technician.getMonthlySalary());
            cumulativeMonthlySalaries = cumulativeMonthlySalaries + technician.getMonthlySalary();
            System.out.println("Spend your money wisely " + technician.getName() + "!! Have a nice day");
            System.out.println();
            System.out.println();
            System.out.print("Do you want to enter details of another employee (Y/N): ");
            input.nextLine();
            choice = input.nextLine().charAt(0);

            if(choice == 'N' || choice == 'n'){
                exit = true;
            } else if (choice == 'Y' || choice == 'y'){
                counter++;
            } else {
                exit = false;
            }

        } while(!exit);

        System.out.println("Average monthly Salary (RM) "+ cumulativeMonthlySalaries / counter );
    }
}

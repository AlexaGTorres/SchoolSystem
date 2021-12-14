import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);

        //Teachers last names
        System.out.println ("Enter 2 teachers' last names and press enter after each.");
        String lastNameT1 = input.nextLine();
        String lastNameT2 = input.nextLine();

        //Teachers salaries
        System.out.println ("Enter 2 salaries for the teachers and press enter after each.");
        int salaryT1 = input.nextInt();
        int salaryT2 = input.nextInt();

        //Students first names
        System.out.println("Enter 2 students' first names and press enter after each.");
        String firstNameS1 = input.next();
        String firstNameS2 = input.next();

        //Create
        Student student1 = new Student (firstNameS1);
        Student student2 = new Student (firstNameS2);

        Teacher teacher1 = new Teacher (lastNameT1, salaryT1);
        Teacher teacher2 = new Teacher (lastNameT2, salaryT2);

        //List
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        School vvhs = new School(teacherList, studentList);

        List<String> tList = new ArrayList<>();
        tList.add(lastNameT1);
        tList.add(lastNameT2);


        List<String> sList = new ArrayList<>();
        sList.add(firstNameS1);
        sList.add(firstNameS2);

        System.out.println ("Which student should pay fees?");
        String studentFeesPay = input.next();

        if (sList.contains(studentFeesPay))
        {
            if (studentFeesPay.equals(firstNameS1))
            {
                System.out.println ("How much should the student pay for fees.");
                int fees1 = input.nextInt();
                student1.payFees(fees1);
            }
            else if (studentFeesPay.equals(firstNameS2))
            {
                System.out.println ("How much should the student pay for fees.");
                int fees2 = input.nextInt();
                student2.payFees(fees2);
            }
        }
        else
        {
            System.out.println ("Invalid");
        }

        System.out.println ("VVHS has earned $" + vvhs.getTotalMoneyEarned());//Test

        System.out.println ("Enter a teacher that should get paid.");
        String pay1 = input.next();

        teacher1.getSalary();
        teacher2.getSalary();

        if (tList.contains(pay1))
        {
            if (pay1.equals(lastNameT1))
            {
                teacher1.receiveSalary(teacher1.getSalary());
            }
            else if (pay1.equals(lastNameT2))
            {
                teacher2.receiveSalary(teacher2.getSalary());
            }
        }
        else
        {
            System.out.println ("Invalid");
        }

        System.out.println (vvhs.getTotalMoneyEarned() + vvhs.getTotalMoneySpent());

    }//End main
    
}//End class Driver

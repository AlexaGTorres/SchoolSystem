import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver
{
    public static void main (String [] args)
    {
        Teacher Rioux = new Teacher ("Rioux", 12345, 400);
        Teacher Caza = new Teacher ("Caza", 9485745, 150);
        Teacher Martinez = new Teacher ("Martinez", 39857564, 420);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Rioux);
        teacherList.add(Caza);
        teacherList.add(Martinez);

        Student Alexa = new Student ("Alexa", 910939437, 11);
        Student Lily = new Student ("Lily", 910934895, 10);
        Student Bibian = new Student ("Bibian", 910939485, 9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Alexa);
        studentList.add(Lily);
        studentList.add(Bibian);

        School vvhs = new School(teacherList, studentList);

        Bibian.payFees(2000);
        Lily.payFees(5000);

        System.out.println (Rioux.getSalary());
        System.out.println ("VVHS has earned $" + vvhs.getTotalMoneyEarned());

        System.out.println ("School pays salary...");

        Rioux.receiveSalary(Rioux.getSalary());
        System.out.println ("VVHS has paid a salary and now has $" + vvhs.getTotalMoneyEarned());

        Martinez.receiveSalary(Martinez.getSalary());
        System.out.println ("VVHS has paid a salary and now has $" + vvhs.getTotalMoneyEarned());

        Student[] studentList1 = new Student[3];

        studentList1[0] = Alexa;
        studentList1[1] = Lily;
        studentList1[2] = Bibian;

        Arrays.sort(studentList1);

        System.out.println ("Student names in alphabet order: ");
        for (int i = 0; i < studentList1.length; i++)
        {
            System.out.print (studentList1[i] + " ");
        }
    }//End main
    
}//End class Driver

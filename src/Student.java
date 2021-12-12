public class Student implements Comparable<Student>
{
    //Variables
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Constructor
    public Student (String name, int id, int grade)
    {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000; //Fees for every student $30,000
    }//End constructor Student

    //Getters
    public int getID ()
    {
        return id;
    }

    public String getName ()
    {
        return name;
    }

    public int getGrade ()
    {
        return grade;
    }

    public int getFeesPaid ()
    {
        return feesPaid;
    }

    public int getFeesTotal ()
    {
        return feesTotal;
    }

    public int getRemainingFees ()
    {
        return feesTotal - feesPaid;
    }

    public void setFees (int fees)
    {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }//Paying feeds

    public void payFees (int fees)
    {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    @Override
    public int compareTo(Student other)
    {
        int compareResult = this.name.compareTo(other.name);

        return compareResult;
    }

    public String toString ()
    {
        return this.name;
    }
}//End class Student

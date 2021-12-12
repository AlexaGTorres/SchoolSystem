public class Teacher
{
    private int id;
    private String lastName;
    private int salary;
    private int salaryEarned;

    public Teacher (String lastName, int id, int salary)
    {
        this.id = id;
        this.lastName = lastName;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getID ()
    {
        return id;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public int getSalary ()
    {
        return salary;
    }

    public void setSalary (int salary)
    {
        this.salary = salary;
    }

    public void receiveSalary (int salary)
    {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

}//End class Teacher

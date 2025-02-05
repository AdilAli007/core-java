public class ImtiazMarket implements Market, Employee {
    @Override
    public void empName() {
        System.out.println("Employee Name: John");
    }

    @Override
    public void empNo() {
        System.out.println("Employee No: John123");
    }

    @Override
    public void salary() {
        System.out.println("Employee Salary: 50000");
    }

    @Override
    public void name() {
        System.out.println("Market Name: "+ImtiazMarket.name);
    }

    @Override
    public void address() {
        System.out.println("Address: Near Iqra University Khi Sindh");
    }

    @Override
    public void totalBranches() {
        System.out.println("Total Branches: Multiple Branches");
    }
}

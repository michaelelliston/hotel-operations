public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;


    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {

    }

    public double getTotalPay() {
        double overtimePayRate = this.getPayRate() * 1.4;
        return (getRegularHours() * getPayRate()) + (getOvertimeHours() * overtimePayRate);
    }

    public int getRegularHours() {
        if (this.hoursWorked < 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getPayRate() {
        return this.payRate;
    }

    public int getOvertimeHours() {
        return this.hoursWorked - 40;
    }
}
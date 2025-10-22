import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double timePunchedIn;
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("H.m");


    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public double getTotalPay() {
        double overtimePayRate = this.getPayRate() * 1.4;
        if (this.getOvertimeHours() > 0) {
            return (this.getRegularHours() * this.getPayRate()) + (this.getOvertimeHours() * overtimePayRate);
        } else {
            return (this.getRegularHours() * this.getPayRate());
        }
    }

    public double getRegularHours() {
        if (this.hoursWorked < 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getPayRate() {
        return this.payRate;
    }

    public double getOvertimeHours() {
        return this.hoursWorked - 40;
    }

    public void punchTimeCard(LocalTime time, boolean isPunchingIn) {

        String formattedTime = time.format(dateTimeFormatter);

        if (isPunchingIn) {
            double punchInTime = Double.parseDouble(formattedTime);
            System.out.println("You have punched in at " + punchInTime + ", welcome!");
            this.timePunchedIn = punchInTime;
        } else {
            double punchOutTime = Double.parseDouble(formattedTime);
            System.out.println("You have punched out at " + punchOutTime + ", thank you! Your shift has been recorded.");
            this.hoursWorked = hoursWorked + (punchOutTime - timePunchedIn);
        }
    }

    public void punchTimeCard(boolean isPunchingIn) {
        LocalTime time = LocalTime.now();
        String formattedTime = time.format(dateTimeFormatter);

        if (isPunchingIn) {
            double punchInTime = Double.parseDouble(formattedTime);
            System.out.println("You have punched in at " + punchInTime + ", welcome!");
            this.timePunchedIn = punchInTime;
        } else {
            double punchOutTime = Double.parseDouble(formattedTime);
            System.out.println("You have punched out at " + punchOutTime + ", thank you! Your shift has been recorded.");
            this.hoursWorked = hoursWorked + (punchOutTime - timePunchedIn);
        }
    }

    public String getName() {
        return this.name;
    }
}
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double timePunchedIn;


    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {

    }

    public double getTotalPay() {
        double overtimePayRate = this.getPayRate() * 1.4;
        return (getRegularHours() * getPayRate()) + (getOvertimeHours() * overtimePayRate);
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

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
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
}
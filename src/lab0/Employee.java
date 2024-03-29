package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        if(daysVacation <= 0 || daysVacation >= 29 ){
            System.out.println("Invaild amount of time off");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.length() <= 0 || firstName.length() >= 15 ){
            System.out.println("First name is either to long or to short.");
        }else{
        this.firstName = firstName;
        }
    }

    public Date getHireDate() {
        return hireDate;
    }
private Date earlyDate = new Date();
private Date lateDate = new Date();

    public void setHireDate(Date hireDate) {
        if(hireDate.before(earlyDate) || hireDate.after(lateDate) ){
            System.out.println("Invaild hire date.");
        }else{
        this.hireDate = hireDate;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.length() <= 0 || lastName.length() >= 15 ){
            System.out.println("Last name is either to long or to short.");
        }else{
        this.lastName = lastName;
        }
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn == null || firstName.length() != 9 ){
            System.out.println("Invalid ssn");
        }else{
        this.ssn = ssn;
        }
    }
    
    
}

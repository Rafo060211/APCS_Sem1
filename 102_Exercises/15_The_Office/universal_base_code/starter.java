/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee Dwight = new Employee(1984, ("Dwight"), ("Schrute"), 4416.66);
		Dwight.employeeToString();
		Employee Jim = new Employee(2474, ("Jim"), ("Halpert"), 4416.66);
		Jim.employeeToString();
		Employee Pam = new Employee(2011, ("Pam"), ("Beesley"), 2250);
		Pam.employeeToString();
		Employee TimmyTammyTommy = new Employee(1234, ("TimmyTammyTommy"), ("JR"), 4321);
		TimmyTammyTommy.employeeToString();
		
		System.out.println("--------------------- Prices after RAISES ---------------------");
		System.out.println("");
		
		Dwight.raiseSalary(15);
		Jim.raiseSalary(15);
		Pam.raiseSalary(15);
		TimmyTammyTommy.raiseSalary(15);
	
		Dwight.employeeToString();
		double annual =	Dwight.getAnnualSalary();
		System.out.println("annual salary of Dwight is " +annual);
		Jim.employeeToString();
		Jim.getAnnualSalary();
		double annual1 =	Jim.getAnnualSalary();
		System.out.println("annual salary of Jim is" +annual1);
		Pam.employeeToString();
		Pam.getAnnualSalary();
		double annual2 =	Pam.getAnnualSalary();
		System.out.println("annual salary of Pam is " +annual2);
		TimmyTammyTommy.employeeToString();
		TimmyTammyTommy.getAnnualSalary();
		double annual3 =	TimmyTammyTommy.getAnnualSalary();
		System.out.println("annual salary of TimmyTammyTommy is " +annual3);
		
		
		
	
	}
}

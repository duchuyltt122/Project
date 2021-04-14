package btmang;

import java.util.*;

class Employee {
	int EmpId;
	String Name;
	int Salary;
	int SalaryGrading;
	int BenefitGrading;

	Employee() {
		this.EmpId = 0;
		this.Name = "";
		this.Salary = 0;
		this.SalaryGrading = 0;
		this.BenefitGrading = 0;
	}

	void CalSalary() {
		this.Salary = 100 * (1 + this.SalaryGrading + this.BenefitGrading);
	}

	void input() {
		Scanner objSc = new Scanner(System.in);
		System.out.println("Nhap id nhan vien:");
		this.EmpId = objSc.nextInt();
		objSc.hasNextLine();
		System.out.println("Nhap ten nhan vien:");
		this.Name = objSc.nextLine();
		System.out.println("Nhap SalaryGrading:");
		this.SalaryGrading = objSc.nextInt();
		System.out.println("Nhap BenefitGrading:");
		this.BenefitGrading = objSc.nextInt();
	}

	void output() {
		System.out.println("EmpId:" + this.EmpId + "	Name:" + this.Name + "	Salary:" + this.Salary + "	Benefit:"
				+ this.BenefitGrading);
	}

}

public class mang1 {

	public static void inputlist(Employee [] list) {
				for(int i=0;i<list.length;i++) {
					System.out.println("Employee "+(i+1)+":");
					list[i]=new Employee();
					list[i].input();
				}
			}

	public static void outputlist(Employee [] list) {
			for(int i=0;i<list.length;i++)
				list[i].output();
		}

	public static void sortsalary(Employee[] list) {
		Employee tmp = new Employee();
		int n = list.length;
		int i, j;
		for (i = n - 1; i >= 0; i--)
			for (j = 1; j <= i; j++) {
				if (list[j - 1].Salary > list[j].Salary) {
					tmp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = tmp;
				}
			}
		System.out.println("Sap xep luong tang dan:");
		outputlist(list);
		System.out.println("Sap xep luong giam dan:");
		for (i = n - 1; i >= 0; i--)
			list[i].output();
	}

	public static void sumsalary(Employee[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum = sum + list[i].Salary;
		}
		System.out.println("Sum Salary:" + sum);
	}

	public static void highestsalary(Employee[] list) {
		Employee tmp = new Employee();
		tmp.Salary = 0;
		for (int i = 0; i < list.length; i++)
			if (list[i].Salary > tmp.Salary)
				tmp = list[i];
		System.out.println("Nguoi co luong cao nhat: ");
		tmp.output();
	}

	public static void lowestsalary(Employee[] list) {
		Employee tmp = new Employee();
		tmp.Salary = list[0].Salary;
		for (int i = 1; i < list.length; i++)
			if (list[i].Salary < tmp.Salary)
				tmp = list[i];
		System.out.println("Nguoi co luong thap nhat: ");
		tmp.output();
	}

	public static void main(String[] args) {
		Employee[] list = new Employee[10];
		inputlist(list);
		outputlist(list);

	}

}
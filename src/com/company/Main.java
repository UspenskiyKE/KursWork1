package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] employees=new Employee[10];

        Employee worker1=new Employee("Иван","Иванович", "Иванов","1",40000);
        employees[0]=worker1;
        Employee worker2=new Employee("Иван","Алексеевич", "Петров","1",38800);
        employees[1]=worker2;
        Employee worker3=new Employee("Владимир","Петрович", "Игнатьев","3",41000);
        employees[2]=worker3;
        Employee worker4=new Employee("Никита","Александрович", "Селиванов","4", 42000);
        employees[3]=worker4;
        Employee worker5=new Employee("Оксана","Сергеевна", "Владимирова","2",44000);
        employees[4]=worker5;
        Employee worker6=new Employee("Мария","Ивановна", "Кочепасова","5",40000);
        employees[5]=worker6;
        Employee worker7=new Employee("Михаил","Петрович", "Андреев","5",38000);
        employees[6]=worker7;
        Employee worker8=new Employee("Людмила","Петровна", "Милованова","4",41000);
        employees[7]=worker8;
        Employee worker9=new Employee("Максим","Николаевич", "Самсонов","1",50000);
        employees[8]=worker9;
        Employee worker10=new Employee("Геннадий","Владимирович", "Свиридов","2",47000);
        employees[9]=worker10;

        EmployeeList(employees);
        System.out.println();

        double salaryExpenses=MonthSalaryExpenses(employees);
        System.out.println("Совокупные затраты на зарплату в месяц: "+salaryExpenses+" рублей.");
        System.out.println();

        MinSalaryEmployee(employees);
        System.out.println();

        MaxSalaryEmployee(employees);
        System.out.println();

        double arithmeticMean=ArithmeticMeanSalary(employees);
        System.out.println("Средняя (по сотрудникам) зарплата в месяц: "+arithmeticMean+" рублей.");
        System.out.println();

        AllEmployeesFio(employees);


    }
    public static void EmployeeList(Employee[] employeeList) {
        System.out.println("Код сотрудника:  "+"Фамилия:  "+"Имя:  "+"Отчество:  "+"Отдел:  "+"Зарплата:");
        for (int i = 0; i < employeeList.length; i++) {
            System.out.println( employeeList[i].getId()+"  "+employeeList[i].getLastName()+"  "+employeeList[i].getFirstName()+"  "+employeeList[i].getMiddleName()+"  "+employeeList[i].getDepartment()+"  "+employeeList[i].getSalary());
        }

    }
    public static double MonthSalaryExpenses(Employee[] employeeList) {
        double s=0;
        for (int i = 0; i < employeeList.length; i++) {
            s+=employeeList[i].getSalary();
        }
        return s;
    }
    public static void MinSalaryEmployee(Employee[] employeeList) {
        double minSalary=employeeList[0].getSalary();
        String minSalaryFIO="";
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i].getSalary() < minSalary) {
                minSalary=employeeList[i].getSalary();
                minSalaryFIO=employeeList[i].getLastName()+" "+employeeList[i].getFirstName()+" "+employeeList[i].getMiddleName();
            }
        }
       System.out.println(" Сотрудник с минимадьной зарплатой: "+minSalaryFIO);
    }
    public static void MaxSalaryEmployee(Employee[] employeeList) {
        double maxSalary=employeeList[0].getSalary();
        String maxSalaryFIO="";
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i].getSalary() >maxSalary) {
                maxSalary=employeeList[i].getSalary();
                maxSalaryFIO=employeeList[i].getLastName()+" "+employeeList[i].getFirstName()+" "+employeeList[i].getMiddleName();
            }
        }
        System.out.println(" Сотрудник с максимальной зарплатой: "+maxSalaryFIO);
    }
    public static double ArithmeticMeanSalary(Employee[] employeeList) {
        double ams=MonthSalaryExpenses(employeeList)/ employeeList.length;
        return ams;
    }
    public static void AllEmployeesFio(Employee[] employeeList) {
        System.out.println("Список сотрудников организации: ");
        String FIO="";
        for (int i = 0; i < employeeList.length; i++) {
            FIO=employeeList[i].getLastName()+" "+employeeList[i].getFirstName()+" "+employeeList[i].getMiddleName();
            System.out.println(FIO);
        }

    }
}

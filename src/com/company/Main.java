package com.company;

public class Main {

   public static Employee[] employees=new Employee[10];


    public static void main(String[] args) {
	// write your code here
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





        employeeList(employees);
        System.out.println();

        double salaryExpenses=monthSalaryExpenses(employees);
        System.out.println("Совокупные затраты на зарплату в месяц: "+salaryExpenses+" рублей.");
        System.out.println();

        minSalaryEmployee(employees);
        System.out.println();

        maxSalaryEmployee(employees);
        System.out.println();

        double arithmeticMean=arithmeticMeanSalary(employees);
        System.out.println("Средняя (по сотрудникам) зарплата в месяц: "+arithmeticMean+" рублей.");
        System.out.println();

        allEmployeesFullNames(employees);


    }
    public static String employeeListHeading() {
        return "Код сотрудника:  "+"Фамилия:  "+"Имя:  "+"Отчество:  "+"Отдел:  "+"Зарплата:";
    }


    public static void employeeList(Employee[] employeeList) {
        System.out.println(employeeListHeading());
        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(employeeList[i]);
        }

    }

    public static double monthSalaryExpenses(Employee[] employeeList) {
        double totalSalary=0;
        for (int i = 0; i < employeeList.length; i++) {
            totalSalary+=employeeList[i].getSalary();
        }
        return totalSalary;
    }

    public static void minSalaryEmployee(Employee[] employeeList) {
        double minSalary=employeeList[0].getSalary();
        String minSalaryFIO="";
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i].getSalary() < minSalary) {
                minSalary=employeeList[i].getSalary();
                minSalaryFIO=employeeList[i].getFullName();
            }
        }
       System.out.println("Сотрудник с минимальной зарплатой: "+minSalaryFIO);
    }

    public static void maxSalaryEmployee(Employee[] employeeList) {
        double maxSalary=employeeList[0].getSalary();
        String maxSalaryFIO="";
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i].getSalary() >maxSalary) {
                maxSalary=employeeList[i].getSalary();
                maxSalaryFIO=employeeList[i].getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: "+maxSalaryFIO);
    }

    public static double arithmeticMeanSalary(Employee[] employeeList) {
        return monthSalaryExpenses(employeeList)/ employeeList.length;
    }

    public static void allEmployeesFullNames(Employee[] employeeList) {
        System.out.println("Список сотрудников организации: ");
        String fullName="";
        for (int i = 0; i < employeeList.length; i++) {
            fullName=employeeList[i].getLastName()+" "+employeeList[i].getFirstName()+" "+employeeList[i].getMiddleName();
            System.out.println(fullName);
        }

    }
}

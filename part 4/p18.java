import java.util.*;

class Member {
    public String name;
    public int age;
    public long phone_no;
    public String address;
    public long salary;

    public void get_salary() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your salary:");
        salary = s.nextLong();
    }

    void print_salary() {
        System.out.println("Your salary is " + salary);
    }
}

class Employee extends Member {
    public String specialization;

    void get_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.nextLine();  
        System.out.println("Enter your contact no.:");
        phone_no = sc.nextLong();
        sc.nextLine(); 
        System.out.println("Enter your address:");
        address = sc.nextLine();
        System.out.println("Enter your specialization:");
        specialization = sc.nextLine();
        get_salary();
    }

    void put_details() {
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your contact no. is " + phone_no);
        System.out.println("Your address is " + address);
        System.out.println("Your specialization is " + specialization);
        print_salary();
    }
}

class Manager extends Member {
    public String department;

    void get() {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sh.nextLine();
        System.out.println("Enter your age:");
        age = sh.nextInt();
        sh.nextLine();  
        System.out.println("Enter your contact no.:");
        phone_no = sh.nextLong();
        sh.nextLine();  
        System.out.println("Enter your address:");
        address = sh.nextLine();
        System.out.println("Enter your department:");
        department = sh.nextLine();
        get_salary();
    }

    void put() {
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your contact no. is " + phone_no);
        System.out.println("Your address is " + address);
        System.out.println("Your department is " + department);
        print_salary();
    }
}

public class p18 {
    public static void main(String[] args) {
        Employee E = new Employee();
        Manager M = new Manager();
        E.get_details();
        E.put_details();
        M.get();
        M.put();
    }
}

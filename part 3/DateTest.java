import java.util.Scanner;

class Date {
     int month;
     int day;
     int year;

    Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

     int getMonth() {
        return month;
    }

     void setMonth(int month) {
        this.month = month;
    }

     int getDay() {
        return day;
    }

     void setDay(int day) {
        this.day = day;
    }

     int getYear() {
        return year;
    }

     void setYear(int year) {
        this.year = year;
    }

     void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day:");
        int day = scanner.nextInt();
		System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();

        Date date = new Date(month, day, year);

        System.out.println("Date: ");
        date.displayDate();
    }
}

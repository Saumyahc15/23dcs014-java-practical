import java.util.Scanner;

class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean isDelayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isDelayed = false;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void checkFlightStatus() {
        if (isDelayed) {
            System.out.println("Flight " + flightNumber + " to " + destination + " is delayed.");
        } else {
            System.out.println("Flight " + flightNumber + " to " + destination + " is on time.");
        }
    }

    public void delayFlight() {
        isDelayed = true;
        System.out.println("Flight " + flightNumber + " to " + destination + " has been delayed.");
    }

    public void resumeFlight() {
        isDelayed = false;
        System.out.println("Flight " + flightNumber + " to " + destination + " is back on schedule.");
    }
}

public class AirplaneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter flight number:");
        String flightNumber = scanner.nextLine();
        System.out.println("Enter destination:");
        String destination = scanner.nextLine();
        System.out.println("Enter departure time:");
        String departureTime = scanner.nextLine();

        Airplane airplane = new Airplane(flightNumber, destination, departureTime);

        while (true) {
            System.out.println("Do you want to check flight status? (yes/no)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                airplane.checkFlightStatus();
            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Do you want to delay the flight? (yes/no)");
                String delayChoice = scanner.nextLine();

                if (delayChoice.equalsIgnoreCase("yes")) {
                    airplane.delayFlight();
                } else if (delayChoice.equalsIgnoreCase("no")) {
                    System.out.println("Do you want to resume the flight? (yes/no)");
                    String resumeChoice = scanner.nextLine();

                    if (resumeChoice.equalsIgnoreCase("yes")) {
                        airplane.resumeFlight();
                    } else if (resumeChoice.equalsIgnoreCase("no")) {
                        System.out.println("Exiting...");
                        break;
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

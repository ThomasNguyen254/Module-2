package CaseStudy;

import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 6) {
            System.out.println("------Furama Resort Management------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.out.println("Thank you for using Furama Resort Management!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
        scanner.close();
    }

    public static void employeeManagement() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            switch (choice) {
                case 1:
                    //Display list employees
                    break;
                case 2:
                    //Add new employee
                    break;
                case 3:
                    //Edit employee
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
        scanner.close();
    }

    public static void customerManagement() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            switch (choice) {
                case 1:
                    //Display list employees
                    break;
                case 2:
                    //Add new employee
                    break;
                case 3:
                    //Edit employee
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
        scanner.close();
    }

    public static void facilityManagement() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            switch (choice) {
                case 1:
                    //Display list employees
                    break;
                case 2:
                    //Add new employee
                    break;
                case 3:
                    //Display list facility maintenance
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
        scanner.close();
    }

    public static void bookingManagement() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 6) {
            switch (choice) {
                case 1:
                    //Add new booking
                    break;
                case 2:
                    //Display list booking
                    break;
                case 3:
                    //Create new contracts
                    break;
                case 4:
                    //Display list contracts
                    break;
                case 5:
                    //Edit contracts
                case 6:
                    //System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
        scanner.close();
    }

    public static void promotionManagement() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 3) {
            switch (choice) {
                case 1:
                    //Display list customers use service
                    break;
                case 2:
                    //Display list customers get voucher
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
        scanner.close();
    }

}

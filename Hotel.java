
import java.util.*;

public class Hotel {
    private Manager manager;
    private Receptionist receptionist;

    public Hotel(Manager manager, Receptionist receptionist) {
        this.manager = manager;
        this.receptionist = receptionist;
    }

    public void displayMainMenu() {
        System.out.println("====== Hotel Management System ======");
        System.out.println("1. Login as Manager");
        System.out.println("2. Login as Receptionist");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
    }

    public void displayReceptionistMenu() {
        System.out.println("====== Receptionist Module ======");
        System.out.println("1. Check-in a new guest");
        System.out.println("2. Check-out guest");
        System.out.println("3. Search booking");
        System.out.println("4. Search Guest");
        System.out.println("5. Modify a Booking");
        System.out.println("6. Display Available rooms");
        System.out.println("7. Display all Bookings");
        System.out.println("8. Log out");
        System.out.print("Enter your choice : ");
    }

    public void displayManagerMenu() {
        System.out.println("====== Manager Module ======");
        System.out.println("1. Add new room");
        System.out.println("2. Remove room");
        System.out.println("3. Search Room");
        System.out.println("4. Display all rooms");
        System.out.println("5. Add Staff Member");
        System.out.println("6. Remove Staff Member");
        System.out.println("7. Search Staff Member");
        System.out.println("8. Log out");
        System.out.print("Enter your choice : ");

    }

    public boolean managerLogin() {

    }

    public boolean receptionistLogin() {

    }

    public void checkInGuest() {
        // calls the method in receptionist
    }

    public void checkOutGuest() {
        // calls the method in receptionist
    }

    public void searchBooking() {

    }

    public void searchGuest() {

    }

    public void modifyBooking() {

    }

    public void displayAvailableRooms() {

    }

    public void displayAllBookings() {

    }


    // Manager methods
    public void addRoom() {

    }

    public void removeRoom() {

    }

    public void searchRoom() {

    }

    public void displayRooms() {

    }

    public void addStaff() {

    }

    public void removeStaff() {

    }

    public void searchStaff() {

    }




    public void run() {
        boolean exit = false;

        while(!exit) {
            displayMainMenu();
            int choice = Input.sc.nextInt();

            switch (choice) {
                case 1:
                    // Manager Module
                    boolean logout = false;
                    System.out.println("Sucessfully Logged in as Manger!\n");
                    while(!logout) {
                        displayManagerMenu();
                        int mChoice = Input.sc.nextInt();

                        switch (mChoice) {
                            case 1: addRoom(); break;
                            case 2:removeRoom();break;
                            case 3:searchRoom();break;
                            case 4:displayRooms();break;
                            case 5:addStaff();break;
                            case 6:removeStaff();break;
                            case 7:searchStaff();break;
                            case 8:logout = true;break;
                            default:
                                System.out.println("Invalid choice. Try Again...");
                                break;
                        }
                    } 
                    
                    break;
                
                // Receptionist module
                case 2:
                    System.out.println("Login Succesfull as Receptionist");
                    logout = false;

                    while (!logout) {
                        displayReceptionistMenu();
                        int rChoice = Input.sc.nextInt();
                        switch (rChoice) {
                            case 1:checkInGuest();break;
                            case 2:checkOutGuest();break;
                            case 3:searchBooking();break;
                            case 4:searchGuest();break;
                            case 5:modifyBooking();break;
                            case 6:displayAvailableRooms();break;
                            case 7:displayAllBookings();break;
                            case 8:logout = true;break;
                            default:
                                System.out.println("Invalid choice. Enter Again...");
                                break;
                        }
                    }
                default:
                    break;
            }
        }
    }
 
}


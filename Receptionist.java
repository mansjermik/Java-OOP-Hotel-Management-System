import java.util.*;
class Receptionist extends Employee{
    private String receptID;

    public Receptionist(String name, int contactNumber, double Salary, String receptID) {
        super(name, contactNumber, Salary);
        this.receptID = receptID;
    }

    public void checkIn(){
        System.out.println("Enter Guest Details : ");
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter contact Number : ");
        int contact = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter total family Members : ");
        int familyMember = sc.nextInt();
        sc.nextLine();

        Guest guest = new Guest(name, contact, familyMember); // we will need to add this guest to hotel...
        // Hotel.add(guest);
    }

    public void checkOut(){
        System.out.println("Enter name of guest : ");
        String name = sc.nextLine();
        // Hotel.remove(name);
    }

    public void modifyGuestInBooking(int roomNumber, Guest newGuest) {
    for (Booking b : bookings) {
        if (b.getRoomNumber() == roomNumber) {
            b.setGuests(newGuest); 
            System.out.println("Guest in room " + roomNumber + " updated successfully.");
            return;
        }
    }
        System.out.println("Booking for room " + roomNumber + " not found.");
    }

    public void searchRoom(){
        System.out.println("Enter Room Number : ");
        int roomNumber = sc.nextInt();
        Room room = Hotel.searchRoom(roomNumber);
        if(room != null){
            System.out.println("Room with Room Number " + roomNumber + " is found");
            System.out.println(room);
        } else {
         System.out.println("Room with Room Number " + roomNumber + " is not found! ");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Receptionist) || obj == null) {
            return false;
        }
        Receptionist recp = (Receptionist) obj;
        return receptID.equals(recp.receptID);
   
    }
}
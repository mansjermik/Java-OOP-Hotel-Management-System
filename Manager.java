import java.util.*;
public class Manager extends Employee{
    private String managerID;
    private ArrayList<Room> rooms;
    private ArrayList<Staff> staff;

    public Manager(String name, int contactNumber, double Salary, String managerID) {
        super(name, contactNumber, Salary);
        this.managerID = managerID;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public void removeRoom(int roomNumber , boolean status){
        rooms.removeIf((r) -> 
                r.getRoomNumber() == roomNumber & r.getStatus() == status);
        
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addStaff(Staff s){
        staff.add(s);
    }

    public void removeStaff(String name, String staffID) {
        boolean found = false;

        for (Staff s : staff) {
            boolean nameMatch = s.getName().equalsIgnoreCase(name);
            boolean idMatch = s.getStaffID().equalsIgnoreCase(staffID);

            if (nameMatch && idMatch) {
                staff.remove(s);
                System.out.println(" Staff Member removed successfully: " + name + " (" + staffID + ")");
                found = true;
                break;
            }
            else if (nameMatch) {
                System.out.println("Name matches but ID does NOT match!");
                found = true;
            }
            else if (idMatch) {
                System.out.println(" ID matches but Name does NOT match!");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Staff Member found with name '" + name + "' or ID '" + staffID + "'");
        }
    }

    public void searchStaff(String name, String staffID) {
        boolean found = false;

        for (Staff s : staff) {
            boolean nameMatch = s.getName().equalsIgnoreCase(name);
            boolean idMatch = s.getStaffID().equalsIgnoreCase(staffID);

            if (nameMatch && idMatch) {
                System.out.println("Staff Member FOUND: Name and ID both match.");
                found = true;
                System.out.println("Staff Member details : ");
                System.out.println(s);
                break;
            }
            else if (nameMatch) {
                System.out.println("Name matches but ID does NOT match!");
                found = true;
                System.out.println("Staff Member details : ");
                System.out.println(s);
            }
            else if (idMatch) {
                System.out.println("ID matches but Name does NOT match!");
                found = true;
                System.out.println("Staff Member details : ");
                System.out.println(s);
            }
        }

        if (!found) {
            System.out.println("Employee NOT found !");
        }

    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Manager) || obj == null) {
            return false;
        }
        Manager m = (Manager) obj;
        return managerID.equals(m.managerID);
        
    }
}

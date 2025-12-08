import java.util.*;
public class Manager extends Employee{
    private String managerID;
    private Employee employees;
    private ArrayList<Room> rooms;
    private ArrayList<Staff> staff;

    public Manager(String name, int contactNumber, double Salary, String managerID) {
        super(name, contactNumber, Salary);
        this.managerID = managerID;
    }

    public void addRoom(Room add){
        rooms.add(add);
    }

    public void removeRoom(int roomNumber , boolean status){
        rooms.removeIf((r) -> 
                r.getRoomNumber() == roomNumber & r.getStatus() == status);
        
    }

    public void addEmployee(Employee emp){
        // employees.
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Manager) || obj == null) {
            return false;
        }
        Manager m = (Manager) obj;
        return managerID.equals(m.managerID);
        
    }
}

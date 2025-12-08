public class Booking {
    private Room room;
    private Guest guests;
    
    public Booking() {
    }

    public Booking(Room room, Guest guests) {
        this.room = room;
        this.guests = guests;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuests() {
        return guests;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setGuests(Guest guests) {
        this.guests = guests;
    } 
    
}

public class House {
    private String location;
    private String flat_no;
    private int rent;

    private String room_color;

    public House(String location, String flat_no, int rent, String room_color) {
        this.location = location;
        this.flat_no = flat_no;
        this.rent = rent;
        this.room_color = room_color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFlat_no() {
        return flat_no;
    }

    public void setFlat_no(String flat_no) {
        this.flat_no = flat_no;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }


    public String getRoom_color() {
        return room_color;
    }

    public void setRoom_color(String room_color) {
        this.room_color = room_color;
    }



    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", flat_no='" + flat_no + '\'' +
                ", rent=" + rent +
                ", room_color='" + room_color + '\'' +
                '}';
    }
}

public class Vehicle {
    private String number, owner, type, time;

    public Vehicle(String number, String owner, String type, String time) {
        this.number = number;
        this.owner = owner;
        this.type = type;
        this.time = time;
    }

    public String getNumber() { return number; }
    public String getOwner() { return owner; }
    public String getType() { return type; }
    public String getTime() { return time; }
}

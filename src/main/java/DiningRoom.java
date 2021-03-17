import java.util.ArrayList;

public class DiningRoom {

    private ArrayList<Guest> guest;
    private String name;

    public DiningRoom(String name) {
        this.guest = new ArrayList<Guest>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

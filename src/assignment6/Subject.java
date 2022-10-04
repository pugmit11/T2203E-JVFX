package assignment6;

public class Subject {
    int id;
    String Name;

    public Subject(int id, String name) {
        this.id = id;
        Name = name;
    }

    public Subject() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
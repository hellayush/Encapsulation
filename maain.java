class Student {
    private String name;
    private int id;
    private String add;

    public Student(String name, int id, String add) {
        this.name = name;
        this.id = id;
        this.add = add;
    }

    public void disp() {
        System.out.println("Name is " + name);
        System.out.println("ID is " + id);
        System.out.println("Address is " + add);
    }
}

public class maain {
    public static void main(String[] args) {
        Student obj = new Student("Ayush", 12, "LKO");
        obj.disp();
    }
}

package ra;

public class Student {
    private int id;
    private String username;

    public Student() {

    }

    public Student(int id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}

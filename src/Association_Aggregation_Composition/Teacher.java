package Association_Aggregation_Composition;

public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach(Student student) {
        System.out.println(
                name + " is teaching " + student.getName()
        );
    }
}

package Association_Aggregation_Composition;

public class AssociationMain {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Rahul");

        Student student = new Student("Munna");

        teacher.teach(student);
    }
}

package revision4;

public class StudentMain {

        static void changeName(Student student) {
            student.name = "Rahul";
        }

        public static void main(String[] args) {

            Student s = new Student();

            s.name = "Munna";

            changeName(s);

            System.out.println(s.name);
        }
}

package revision_String;

public class StringBuilderPractice26To30 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("java");

        // 26. append()
        sb.append(" Developer");

        System.out.println("After append: " + sb);


        // 27. insert()
        sb.insert(0, "Programming ");

        System.out.println("After insert: " + sb);


        // 28. delete()
        sb.delete(0, 12);

        System.out.println("After delete: " + sb);


        // 29. deleteCharAt()
        sb.deleteCharAt(4);

        System.out.println("After deleteCharAt: " + sb);


        // 30. setCharAt()
        sb.setCharAt(0, 'J');

        System.out.println("After setCharAt: " + sb);
    }
}

package revision3;

public class RemoveWhitespace {

    public static void main(String[] args) {

        String str = "Java is\tawesome";

        String result = str.replaceAll("\\s+", "");

        System.out.println(result);
    }
}

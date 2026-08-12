package revision3;

public class MaskPhone {

    public static void main(String[] args) {

        String phone = "1234567890";

        String result = phone.substring(0, 6).replaceAll("[0-9]", "*")
                + phone.substring(6);

        System.out.println(result);
    }
}

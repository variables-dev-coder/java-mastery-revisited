package revision3;

public class CleanPhoneNumber {

    public static void main(String[] args) {

        String phone = "+91-98765-43210";

        String cleaned = phone.replaceAll("[^0-9]", "");

        System.out.println("Original : " + phone);
        System.out.println("Cleaned  : " + cleaned);
    }
}

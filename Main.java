import java.security.MessageDigest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hash = md.digest(text.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }

            String result = sb.toString();

            System.out.println("SHA-1: " + result);
            System.out.println("Length: " + result.length());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
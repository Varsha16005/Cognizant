import java.util.Scanner;

public class TestFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter document type (Word/PDF/Excel): ");
        String docType = sc.nextLine();

        try {
            Document doc = Factory.createDocument(docType);
            doc.open();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

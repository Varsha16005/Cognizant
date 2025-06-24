import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class ProductSearch {

    public static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.print("Enter product name to search: ");
        String searchName = sc.nextLine();

        int linearIndex = linearSearch(products, searchName);
        System.out.println("Linear Search: " + 
            (linearIndex >= 0 ? products[linearIndex].productName + " found at index " + linearIndex : "Not found"));

        int binaryIndex = binarySearch(products, searchName);
        System.out.println("Binary Search: " + 
            (binaryIndex >= 0 ? products[binaryIndex].productName + " found at index " + binaryIndex : "Not found"));

        sc.close();
    }
}

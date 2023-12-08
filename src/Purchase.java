import java.util.Scanner;

class Purchase extends SuperMarket implements iPurchaceData {
    String productCode;
    String productName;
    double productPrice;
    int quantity;
    double totalPayment;

    Purchase(String marketName, String cashier) {
        super(marketName, cashier);
    }

    @Override
    public void inputPurchaseData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kode Barang   : ");
        productCode = scanner.nextLine();
        System.out.print("Nama Barang   : ");
        productName = scanner.nextLine();
        System.out.print("Harga Barang  : ");
        productPrice = scanner.nextDouble();
        System.out.print("Jumlah Beli   : ");
        quantity = scanner.nextInt();

        // Menghitung total bayar
        totalPayment = productPrice * quantity;
        scanner.close();
    }

    @Override
    public void displayPurchaseData() {
        System.out.println("------------------------");
        System.out.println("TOTAL BAYAR   : " + totalPayment);
        System.out.println("------------------------");
    }
    
}
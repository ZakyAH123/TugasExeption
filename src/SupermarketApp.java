public class SupermarketApp {
    public static void main(String[] args) {

        Customer customer = new Customer("", "", "SuperMart", "");
        customer.displaySupermarketInfo();
        System.out.println("-----DATA PELANGGAN-----");

        customer.inputCustomerData();

        Purchase purchase = new Purchase("SuperMart", "John");
        System.out.println("--DATA PEMBELIAN BARANG-");
        purchase.inputPurchaseData();

        purchase.displayPurchaseData();
    }
}

abstract class SuperMarket {
    String supermarketName;
    String cashier;

    SuperMarket(String name, String cashier) {
        this.supermarketName = name;
        this.cashier = cashier;
    }

    void displaySupermarketInfo() {
        System.out.println("-------ACIAK CORE-------");
        System.out.println("========================");
        System.out.print("Kasir    : " + cashier);
        System.out.println("\n========================");
    }
}
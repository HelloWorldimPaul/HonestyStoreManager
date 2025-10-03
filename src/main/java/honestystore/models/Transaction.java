package honestystore.models;

public class Transaction {

    private int id;
    private String userName;
    private String productName;
    private int quantity;
    private double amount;
    private String type;
    private String date;

    public Transaction(int id, String userName, String productName, int quantity, double amount, String type, String date) {
        this.id = id;
        this.userName = userName;
        this.productName = productName;
        this.quantity = quantity;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

}

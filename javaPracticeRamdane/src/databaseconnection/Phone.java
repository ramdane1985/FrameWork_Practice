package databaseconnection;

public class Phone {
    private int id;
    private String phoneBrand;
    private String phoneSize;
    private int phonePrice;

    public Phone(int id, String phoneBrand, String phoneSize, int phonePrice) {
        this.id = id;
        this.phoneBrand = phoneBrand;
        this.phoneSize = phoneSize;
        this.phonePrice = phonePrice;
    }

    public int getId() {return id;}

    public String getPhoneBrand() {return phoneBrand;}

    public String getPhoneSize() {return phoneSize;}

    public int getPhonePrice() {return phonePrice;}
}

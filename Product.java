public class Product {

    // encapsulation
    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;

    // Final yalnızca constuctor'da set edilebilir demek. O yüzden metodlarımda sıkıntı yaşanıyor
    // Private yapınca rahatladı. Sadece ve sadece bu classın içinde kullanılabilir! Benim classıma başkasının erişebilmesini engelliyorum.
    public Product(){

    }

    public Product (int id, String name, double unitPrice, String detail,double discount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public double getUnitPriceAfterDiscount() {
        return this.unitPrice - (this.unitPrice * this.discount / 100);
    }

}

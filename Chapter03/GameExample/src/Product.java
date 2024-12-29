public class Product {

    private int id;
    private String name;
    private double price;
    private String packageDetail;
    private String period;

    public Product(){
        System.out.println("Ben calistim.");
    }

    public Product(int id,String name, double price,String packageDetail,String period){
        this.id = id;
        this.name = name;
        this.price = price;
        this.packageDetail = packageDetail;
        this.period = period;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPackageDetail() {
        return packageDetail;
    }

    public void setPackageDetail(String packageDetail) {
        this.packageDetail = packageDetail;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

}

public class Chapter03 {
    public static void main(String[] args){
/*        Product product1 = new Product(1,"Lenovo v15",3000,"Computer",10);
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V20");
        product2.setDetail("16 GB Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

        Product[] products = {product1,product2};

        for(Product product: products){
            System.out.println(product.getName());
        }
        double result = product2.getUnitPriceAfterDiscount();

        System.out.println(product2.getDetail());


        // INHERITANCE
        // Customer customer1 = new Customer();
        // customer1.companyName = "";  Patladım, Customer'im bireysel! Bunun için her bir Class yalnızca kendi işini yapacak şekilde ayırdık!
        IndividualCustomer halil = new IndividualCustomer();
        CorporateCustomer trendyol = new CorporateCustomer();
        SyndicateCustomer enessen = new SyndicateCustomer();
        // OC --> Open Closed, ben yeni bir özellik eklersem mevcut kodlarımı değiştirmeyeceğim!
        halil.customerNumber="12345";
        trendyol.customerNumber="6789";
        enessen.customerNumber = "1011";
        Customer[] customers = {halil,trendyol,enessen};

        CustomerManager customerManager = new CustomerManager();
        customerManager.addMultiple(customers);*/

        // ---------- INHERITANCE Level 2 --------------
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new EmailLogger());

    }
}

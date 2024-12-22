public class Chapter02 {
public static void main(String[] args){

    Product product1 = new Product();
    Product product2 = new Product();
    product1.setName("Lenovo V15");
    product1.setId(3);
    product1.setUnitPrice(300);
    product1.setDetail("Computer");

    product2.setName("Acer");
    product2.setId(4);
    product2.setUnitPrice(1000);
    product2.setDetail("Computer");

    Product[] products = {product1,product2};

/*    for(Product product: products){
        System.out.println(product.name);
        System.out.println(product.detail);
    }

    Category category1 = new Category();
    category1.id=3;
    category1.description="Oyunlar";
    category1.order=3;
    category1.name="Eğlence";

    Category category2 = new Category(1,"Beyaz Eşya",1,"A++");
    Category category3 = new Category(2,"Elektronik",2,"A");


    Category[] categories = {category1,category2,category3};

    for(Category category: categories){
        System.out.println(category.name);
    }*/

    ProductManager productManager = new ProductManager();
    productManager.addToCart(product1);
    productManager.addToCart(product2);




}


}

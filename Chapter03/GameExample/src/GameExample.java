public class GameExample {
    public static void main(String[] args)
    {
        Product product1 = new Product(1,"Performance 1 Ay",340,"1440P QHD, 60FPS, GeForce RTX On","1 Ay");
        product1.setName("Premium 1 Ay");
        Product product2 = new Product(2,"Performance 3 Ay",600,"1440P QHD, 60FPS, GeForce RTX On","3 Ay");
        Product product3= new Product(3,"Performance 6 Ay",1400,"1440P QHD, 60FPS, GeForce RTX On","6 Ay");

        Product[] products = {product1,product2,product3};
        for(Product product: products){
            System.out.println(product.getName());
        }
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
    }
}
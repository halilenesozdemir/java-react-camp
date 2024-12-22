public class CustomerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber + "eklendi");
    }
    // Ben hangi Customer tipinde bir veri gönderirsem göndereyim, Customer classi kendisini extends eden classların referansını tutuyor ve ayırt edebiliyor.
    // Şu anda Customer sınıfının ortak fieldlerina erişebiliyorum, yukarıdaki bilgiyi bilmem şu anlık kafi! İlerleyen zamanlarda diğer fieldlar için neler yapılması gerektiğinden de bahsedilecek!
    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
            System.out.println(customer.customerNumber);
        }
    }
}

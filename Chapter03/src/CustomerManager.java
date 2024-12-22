public class CustomerManager {
    // Sen bana baseClass'ı ver çünkü diğer loggerlar buradan extends ediyor! Referansını tutuyor.
    public void add(Logger logger){
        System.out.println("Müşteri eklendi");
        // Yönetim dedi ki dosyaya da loglama yapılabilecek
        // Bir iş yapan sınıf başka bir iş yapan sınıfı kullanacaksa asla ve asla somut sınıftan gidilmez(İş yapan sınıf == Somut sınıf);
        // Bir kodun içerisinde başka bir iş yapan sınıf newleniyorsa o koddan ileriye dönük hayır gelmez.
        logger.log();
    }
}

public class LogManager {

    // Dirty Code : Yönetim dedi veritabanına loglamayı ya da email loglamasını kaldır, ne yapacaksın?
    // Birbirinin alternatifi olan kod blokları if ile yönetilmez, yönetilmemeli!!!


    public void log(int logType){
        if(logType == 1){
            System.out.println("Veritabanına loglandı.");
        } else if(logType == 2){
            System.out.println("Dosyaya loglandı.");
        } else {
            System.out.println("Email loglandı.");
        }

    }
}


// 1 - Database,
// 2- File
// 3- Email

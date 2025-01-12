public class Utils {
    public static void runLoggers(Logger[] loggers, String message){

        if(loggers != null){
            for(Logger logger : loggers){
                logger.log(message);
            }
        }
    }

    public static void runLoggers(Logger logger,String message){
        if (logger != null) {
            logger.log(message);
        }
    }


}

package lesson15;

public class Exceptions06BrowserConnection {
    public static void main(String[] args) throws InterruptedException {

        String response = "Web Application";
        System.out.println("==============================");
        System.out.println("Opening browser");
        Thread.sleep(3000);
        System.out.println("==============================");
        System.out.println("Trying to create connection");
        Thread.sleep(3000);
        Thread.sleep(3000);

        try {
            System.out.println("Try to open web location...");
            Thread.sleep(3000);
            if (response.equals(null)){
                throw new NullPointerException();
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }

        finally {
            Thread.sleep(3000);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Closing connection");
            System.out.println("==============================");
            Thread.sleep(3000);
            System.out.println("Closing browser....");
            System.out.println("==============================");
            Thread.sleep(3000);
            System.out.println("Browser was closed, bye!");
        }
    }
}

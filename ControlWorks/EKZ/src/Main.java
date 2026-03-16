public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation synoptic = new WeatherStation();

        synoptic.registerObserver(new Client("Phone"));
        synoptic.registerObserver(new Client("ESP32"));

        System.out.println(" [Req] - Cache is clear");
        synoptic.work();

        System.out.println(" [Req] - 2 sec");
        Thread.sleep(2000);
        synoptic.work();

        System.out.println(" [Req] - 4 sec more");
        Thread.sleep(4000);
        synoptic.work();

    }
}
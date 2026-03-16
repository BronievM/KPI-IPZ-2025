public class RealService implements Service{
    @Override
    public String getData() {
        System.out.println("[S] > Request of data");
        return "[W]: Sunny, +13";
    }
}

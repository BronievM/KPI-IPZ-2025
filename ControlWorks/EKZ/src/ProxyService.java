public class ProxyService  implements Service{
    private RealService realService;
    private String cachedData;
    private long lastTime;

    @Override
    public String getData() {
        if (cachedData == null || System.currentTimeMillis() - lastTime < 2000) {
            if (realService == null){
                realService = new RealService();
            }
            cachedData = realService.getData();
            lastTime = System.currentTimeMillis();
        }
        else
        {
            System.out.println("[Proxy] > return of saved data");
        }
        return cachedData;
    }
}

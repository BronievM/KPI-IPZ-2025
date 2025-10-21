public class Class2 implements Interface2 {
    private Class1 c1 = new Class1();
    @Override
    public int method1() {
        return c1.method1();
    }
    @Override
    public String method2() { return "*"; }
}

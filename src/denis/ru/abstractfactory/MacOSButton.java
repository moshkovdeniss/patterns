package denis.ru.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint MacOs button");
    }
}

package denis.ru.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint windows button");
    }
}

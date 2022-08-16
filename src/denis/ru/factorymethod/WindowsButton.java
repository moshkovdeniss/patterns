package denis.ru.factorymethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Click Windows button");
    }
}

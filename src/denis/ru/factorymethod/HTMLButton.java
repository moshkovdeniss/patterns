package denis.ru.factorymethod;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Html button");
    }

    @Override
    public void onClick() {
        System.out.println("Click Html button");
    }
}

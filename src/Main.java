import denis.ru.abstractfactory.Application;
import denis.ru.abstractfactory.MacOSFactory;
import denis.ru.abstractfactory.WindowsFactory;
import denis.ru.builder.CarBuilder;
import denis.ru.factorymethod.Dialog;
import denis.ru.factorymethod.HTMLDialog;
import denis.ru.factorymethod.WindowsDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        dialog = new HTMLDialog();
        runLogic();
        Application app = createApp();
        app.paint();

        CarBuilder carBuilder = new CarBuilder();
    }

    static void runLogic() {
        dialog.renderWindow();
    }

    static Application createApp() {
        return new Application(new WindowsFactory());
    }
}
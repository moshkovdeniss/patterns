package denis.ru.abstractfactory;

public class MacOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Paint MacOsCheckBox");
    }
}

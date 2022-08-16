package denis.ru.abstractfactory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Paint windows checkbox");
    }
}

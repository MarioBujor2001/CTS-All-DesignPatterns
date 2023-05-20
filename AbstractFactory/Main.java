package abstractFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory<WindowsButton, WindowsMenu> windowsFactory = new WindowsGUIFactory();
        WindowsButton button = windowsFactory.createButton();
        WindowsMenu menu = windowsFactory.createMenu();
    }
}

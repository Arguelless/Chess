import window.Window;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            Window ventana = new Window();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
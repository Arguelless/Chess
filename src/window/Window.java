package window;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JPanel tablero;


    private int cantidadBotones = 64;
    private JButton[][] casillas = new JButton[8][8]; //Matriz bidimensional para guardar las casillas (Botones)



/*
* import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de GridPanel");
        JPanel panel = new JPanel(new GridLayout(8, 8)); // GridLayout con 8 filas y 8 columnas

        JButton[][] buttons = new JButton[8][8]; // Matriz bidimensional para almacenar los botones

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton button = new JButton("(" + i + "," + j + ")");
                button.addActionListener(new ButtonClickListener(i, j)); // Listener personalizado para cada botón
                buttons[i][j] = button;
                panel.add(button);
            }
        }

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    static class ButtonClickListener implements ActionListener {
        private int row;
        private int column;

        public ButtonClickListener(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public void actionPerformed(ActionEvent event) {
            System.out.println("Se hizo clic en el botón (" + row + "," + column + ")");
        }
    }
}

* */

    public Window() {

        tablero = new JPanel(new GridLayout(8,8));



    }



}

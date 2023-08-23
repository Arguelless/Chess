package window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {
    private JPanel tablero;
    private int contador = 0;

    private JButton[][] casillas = new JButton[8][8]; //Matriz bidimensional para guardar las casillas (Botones)
    private Color clarito = new Color(203, 255, 161);
    private Color oscuro = new Color(82, 128, 29);

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

    public Window() throws IOException {
        Image pawnw = ImageIO.read(new File("src/images/pawnw.png"));
        Image pawnb = ImageIO.read(new File("src/images/pawnb.png"));
        Image rookw = ImageIO.read(new File("src/images/rookw.png"));
        Image rookb = ImageIO.read(new File("src/images/rookb.png"));
        Image horsew = ImageIO.read(new File("src/images/horsew.png"));
        Image horseb = ImageIO.read(new File("src/images/horseb.png"));
        Image bishopw = ImageIO.read(new File("src/images/bishopw.png"));
        Image bishopb = ImageIO.read(new File("src/images/bishopb.png"));
        Image queenw = ImageIO.read(new File("src/images/queenw.png"));
        Image queenb = ImageIO.read(new File("src/images/queenb.png"));
        Image kingw = ImageIO.read(new File("src/images/kingw.png"));
        Image kingb = ImageIO.read(new File("src/images/kingb.png"));





        tablero = new JPanel(new GridLayout(8, 8)); // GridLayout con 8 filas y 8 columnas



        ActionListener moverFicha = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contador % 2 == 0){
                    casillas[0][0].setBackground(Color.gray);

                }
                else {
                    casillas[0][0].setBackground(clarito);

                }
                contador ++;

            }
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton button = new JButton(i + "," + j);
                button.addActionListener(new ButtonClickListener(i, j)); // Listener personalizado para cada botón
                if (i % 2 == 0 && j % 2 == 0) {
                    button.setBackground(clarito);
                    button.addActionListener(moverFicha);
                } else if (i % 2 != 0 && j % 2 != 0) {
                    button.setBackground(clarito);
                    button.addActionListener(moverFicha);
                }else {
                    button.setBackground(oscuro);
                    button.addActionListener(moverFicha);
                }
                button.setText("");
                casillas[i][j] = button;
                tablero.add(button);
            }
        }
// Piece establishment
        for (int i = 0; i < 8; i++) {
            casillas[1][i].setIcon(new ImageIcon(pawnb));
            casillas[6][i].setIcon(new ImageIcon(pawnw));
        }

        // black
        casillas[0][0].setIcon(new ImageIcon(rookb));
        casillas[0][7].setIcon(new ImageIcon(rookb));
        casillas[0][1].setIcon(new ImageIcon(horseb));
        casillas[0][6].setIcon(new ImageIcon(horseb));
        casillas[0][2].setIcon(new ImageIcon(bishopb));
        casillas[0][5].setIcon(new ImageIcon(bishopb));
        casillas[0][3].setIcon(new ImageIcon(queenb));
        casillas[0][4].setIcon(new ImageIcon(kingb));

        // white

        casillas[7][3].setIcon(new ImageIcon(queenw));
        casillas[7][4].setIcon(new ImageIcon(kingw));
        casillas[7][7].setIcon(new ImageIcon(rookw));
        casillas[7][0].setIcon(new ImageIcon(rookw));
        casillas[7][1].setIcon(new ImageIcon(horsew));
        casillas[7][6].setIcon(new ImageIcon(horsew));
        casillas[7][2].setIcon(new ImageIcon(bishopw));
        casillas[7][5].setIcon(new ImageIcon(bishopw));




        this.add(tablero);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);


    }
    static class ButtonClickListener implements ActionListener {
        private int row;
        private int column;

        public ButtonClickListener(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public void actionPerformed(ActionEvent event) {



        }
    }

    }

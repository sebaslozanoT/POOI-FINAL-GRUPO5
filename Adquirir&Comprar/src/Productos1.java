import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Productos1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("PRODUCTOS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(400, 300);

        //  fondo de la ventana
        ImageIcon img = new ImageIcon("src/recursos/imagenfondo.imagen de fondo.jpeg");
        JLabel backgroundLabel = new JLabel(img);
        frame.getContentPane().add(backgroundLabel);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("INVENTORY");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Lemon Jelly", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        // centrar verticalmente la JTextArea
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);

        JTextArea descriptionTextArea = new JTextArea();
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(new Font("Lemon Jelly ", Font.PLAIN, 23));
        descriptionTextArea.setText("PAMPERS\n "
                + "1 Paquete : S/ 46.80\n" +
                "12 Paquetes : S/ 561.60 \n" +
                "24 Paquetes : S/ 1,123.20");

        // alineación vertical
        descriptionTextArea.setAlignmentY(Component.CENTER_ALIGNMENT);

        JScrollPane scrollPane = new JScrollPane(descriptionTextArea);
        panel.add(scrollPane);

        JLabel totalLabel = new JLabel(" Paquete por unidad : S/46,80", SwingConstants.CENTER);
        totalLabel.setFont(new Font("American Typewriter", Font.BOLD, 14));
        panel.add(totalLabel, BorderLayout.SOUTH);

        ImageIcon imageIcon = new ImageIcon("src/recursos/image1.png");
        JLabel imageLabel = new JLabel(imageIcon);

        //tamaño preferido del JLabel
        imageLabel.setPreferredSize(new Dimension(500, 500));

        panel.add(imageLabel, BorderLayout.EAST);

        //  la categoría
        String[] categorias = {"Bebes", "Comestibles", "bebidas", "Mascotas"};
        JComboBox<String> categoriaComboBox = new JComboBox<>(categorias);
        panel.add(categoriaComboBox, BorderLayout.WEST);

        // la cantidad
        SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 99, 1);
        JSpinner cantidadSpinner = new JSpinner(spinnerModel);
        panel.add(cantidadSpinner, BorderLayout.CENTER);

        JButton nextButton = new JButton("Siguiente");
        nextButton.setFont(new Font("Lemon Jelly", Font.PLAIN, 14));
        nextButton.setSize(100, 50);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nextButton, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createAndShowGUI2(); 
                frame.dispose(); 
            }
        });
    }

    private static void createAndShowGUI2() {
        JFrame frame = new JFrame("PRODUCTOS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(400, 300);

        // fondo de la ventana
        ImageIcon img = new ImageIcon("src/recursos/imagenfondo.jpeg");
        JLabel backgroundLabel = new JLabel(img);
        frame.getContentPane().add(backgroundLabel);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("INVENTORY");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Lemon Jelly", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        // centrar verticalmente la JTextArea
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);

        JTextArea descriptionTextArea = new JTextArea();
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(new Font(" Lemon Jelly ", Font.PLAIN, 14));
        descriptionTextArea.setText("BABYSEC\n "
                + "1 Paquete : S/ 51.99\n" +
                "12 Paquetes : S/ 623.60 \n" +
                "24 Paquetes : S/ 1,247.20");

        // alineación vertical
        descriptionTextArea.setAlignmentY(Component.CENTER_ALIGNMENT);

        JScrollPane scrollPane = new JScrollPane(descriptionTextArea);
        panel.add(scrollPane);

        JLabel totalLabel = new JLabel(" Paquete por unidad : S/51,99", SwingConstants.CENTER);
        totalLabel.setFont(new Font("Lemon Jelly", Font.BOLD, 14));
        panel.add(totalLabel, BorderLayout.SOUTH);
        
        ImageIcon imageIcon = new ImageIcon("src/recursos/imagen22.png");
        JLabel imageLabel = new JLabel(imageIcon);

        //tamaño preferido del JLabel
        imageLabel.setPreferredSize(new Dimension(450, 550));

        panel.add(imageLabel, BorderLayout.EAST);



        // la categoría
        String[] categorias = {"Bebes", "Comestibles", "bebidas", "Mascotas"};
        JComboBox<String> categoriaComboBox = new JComboBox<>(categorias);
        panel.add(categoriaComboBox, BorderLayout.WEST);

        // la cantidad
        SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 99, 1);
        JSpinner cantidadSpinner = new JSpinner(spinnerModel);
        panel.add(cantidadSpinner, BorderLayout.CENTER);

 
        JButton nextButton = new JButton("Siguiente");
        nextButton.setFont(new Font("Lemon Jelly", Font.PLAIN, 14));
        nextButton.setSize(100, 50);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nextButton, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createAndShowGUI3(); 
                frame.dispose(); 
            }
        });
    }


    private static void createAndShowGUI3() {
        JFrame frame = new JFrame("PRODUCTOS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(400, 300);

        // fondo de la ventana
        ImageIcon img = new ImageIcon("src/recursos/imagenfondo.jpeg");
        JLabel backgroundLabel = new JLabel(img);
        frame.getContentPane().add(backgroundLabel);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("INVENTORY");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Lemon Jelly", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        //  centrar verticalmente la JTextArea
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);

        JTextArea descriptionTextArea = new JTextArea();
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(new Font(" Lemon Jelly ", Font.PLAIN, 14));
        descriptionTextArea.setText("HUGGIES\n "
                + "1 Paquete : S/ 42.99\n" +
                "12 Paquetes : S/ 515.88 \n" +
                "24 Paquetes : S/ 1,031.79");

        // alineación vertical
        descriptionTextArea.setAlignmentY(Component.CENTER_ALIGNMENT);

        JScrollPane scrollPane = new JScrollPane(descriptionTextArea);
        panel.add(scrollPane);

        JLabel totalLabel = new JLabel(" Paquete por unidad : S/42,99", SwingConstants.CENTER);
        totalLabel.setFont(new Font("Lemon Jelly", Font.BOLD, 14));
        panel.add(totalLabel, BorderLayout.SOUTH);

        ImageIcon imageIcon = new ImageIcon("src/recursos/imageN3.png");
        JLabel imageLabel = new JLabel(imageIcon);

        //  tamaño preferido del JLabel
        imageLabel.setPreferredSize(new Dimension(600, 600));

        panel.add(imageLabel, BorderLayout.EAST);

        //  la categoría
        String[] categorias = {"Bebes", "Comestibles", "bebidas", "Mascotas"};
        JComboBox<String> categoriaComboBox = new JComboBox<>(categorias);
        panel.add(categoriaComboBox, BorderLayout.WEST);

        //  la cantidad
        SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 99, 1);
        JSpinner cantidadSpinner = new JSpinner(spinnerModel);
        panel.add(cantidadSpinner, BorderLayout.CENTER);

   
        JButton nextButton = new JButton("Siguiente");
        nextButton.setFont(new Font("Lemon Jelly", Font.PLAIN, 14));
        nextButton.setSize(100, 50);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nextButton, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createAndShowGUI4(); 
                frame.dispose(); 
            }
        });
    }


    private static void createAndShowGUI4() {
         JFrame frame = new JFrame("PRODUCTOS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(400, 300);

        // fondo de la ventana
        ImageIcon img = new ImageIcon("src/recursos/imagenfondo.jpeg");
        JLabel backgroundLabel = new JLabel(img);
        frame.getContentPane().add(backgroundLabel);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("INVENTORY");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Lemon Jelly", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        // centrar verticalmente la JTextArea
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);

        JTextArea descriptionTextArea = new JTextArea();
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(new Font(" Lemon Jelly ", Font.PLAIN, 14));
        descriptionTextArea.setText("NINET\n "
                + "1 Paquete : S/ 54.33\n" +
                "12 Paquetes : S/ 651.60 \n" +
                "24 Paquetes : S/ 1,303.20");

        // alineación vertical
        descriptionTextArea.setAlignmentY(Component.CENTER_ALIGNMENT);

        JScrollPane scrollPane = new JScrollPane(descriptionTextArea);
        panel.add(scrollPane);

        JLabel totalLabel = new JLabel(" Paquete por unidad : S/54,33", SwingConstants.CENTER);
        totalLabel.setFont(new Font(" Lemon Jelly", Font.BOLD, 12));
        panel.add(totalLabel, BorderLayout.SOUTH);

        ImageIcon imageIcon = new ImageIcon("src/recursos/imagen07.png");
        JLabel imageLabel = new JLabel(imageIcon);

        // tamaño del JLabel
        imageLabel.setPreferredSize(new Dimension(600, 600));

        panel.add(imageLabel, BorderLayout.EAST);

        //   la categoría
        String[] categorias = {"Bebes", "Comestibles", "bebidas", "Mascotas"};
        JComboBox<String> categoriaComboBox = new JComboBox<>(categorias);
        panel.add(categoriaComboBox, BorderLayout.WEST);

        // JSpinner para la cantidad
        SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 99, 1);
        JSpinner cantidadSpinner = new JSpinner(spinnerModel);
        panel.add(cantidadSpinner, BorderLayout.CENTER);

        JButton nextButton = new JButton("Siguiente");
        nextButton.setFont(new Font("Lemon Jelly", Font.PLAIN, 14));
        nextButton.setSize(100, 50);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nextButton, BorderLayout.SOUTH);
     frame.getContentPane().add(panel);
        frame.setVisible(true);

         } 
}

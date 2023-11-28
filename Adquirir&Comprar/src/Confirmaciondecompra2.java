import javax.swing.*;
import java.awt.*;

public class Confirmaciondecompra2 extends JFrame {

    public Confirmaciondecompra2() {
        setTitle("Confirmación de Compra");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        ImageIcon imagen1 = new ImageIcon("src/recursos/image1.png");
        ImageIcon imagen2 = new ImageIcon("src/recursos/imagen23.png");

        Image img1 = imagen1.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        Image img2 = imagen2.getImage().getScaledInstance(300, 350, Image.SCALE_SMOOTH);

        ImageIcon imagenRedimensionada1 = new ImageIcon(img1);
        ImageIcon imagenRedimensionada2 = new ImageIcon(img2);

        JLabel textoImagen1 = new JLabel("Pampers\n" + "12 Paquetes : S/ 561.60 ");
        JLabel textoImagen2 = new JLabel("Huggies\n" + "6 Paquetes : S/ 257.94");

        Font font = new Font("Arial", Font.PLAIN, 24);
        textoImagen1.setFont(font);
        textoImagen2.setFont(font);

        JPanel panelImagenes = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        panelImagenes.add(new JLabel(imagenRedimensionada1), gbc);

        gbc.gridy++;
        panelImagenes.add(Box.createVerticalStrut(20), gbc);

        gbc.gridy++;
        panelImagenes.add(textoImagen1, gbc);

        gbc.gridy = 0;
        gbc.gridx = 1;
        panelImagenes.add(Box.createHorizontalStrut(20), gbc);

        gbc.gridy = 0;
        gbc.gridx = 2;
        panelImagenes.add(new JLabel(imagenRedimensionada2), gbc);

        gbc.gridy++;
        panelImagenes.add(Box.createVerticalStrut(20), gbc);

        gbc.gridy++;
        panelImagenes.add(textoImagen2, gbc);

        panel.add(panelImagenes, BorderLayout.CENTER);

        JLabel textoInferior = new JLabel("Total: S/819.54");

        textoInferior.setFont(new Font("Arial", Font.BOLD, 32));

        JButton siguienteButton = new JButton("Siguiente");

        siguienteButton.setFont(new Font("Arial", Font.PLAIN, 20));

        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.add(Box.createVerticalGlue(), BorderLayout.CENTER); // Espaciado vertical
        panelInferior.add(textoInferior, BorderLayout.NORTH);
        panelInferior.add(siguienteButton, BorderLayout.SOUTH);

        panel.add(panelInferior, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Confirmaciondecompra2());
    }
}

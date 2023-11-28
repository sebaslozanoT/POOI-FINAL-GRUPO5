import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comprar3 {

    private static JTextField numeroTarjetaField;
    private static JTextField ubicacionField;
    private static JPasswordField contraseñaField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame(" Confirmación de compra");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            JLabel confirmacionLabel = new JLabel("Confirmación de la compra");
            confirmacionLabel.setFont(new Font("Arial", Font.BOLD, 20));

            JLabel tipoPagoLabel = new JLabel("Tipo de pago:");
            tipoPagoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            JComboBox<String> tipoPagoCombo = new JComboBox<>(new String[]{"Tarjeta", "Contratarjeta"});

         JLabel numeroTarjetaLabel = new JLabel("Número de tarjeta:");
            numeroTarjetaLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            numeroTarjetaField = new JTextField();
            numeroTarjetaField.setColumns(23); 
            panel.add(numeroTarjetaLabel);
            panel.add(numeroTarjetaField);

            JLabel contraseñaLabel = new JLabel("Contraseña:");
            contraseñaLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            contraseñaField = new JPasswordField();
            contraseñaField.setColumns(23); 
            panel.add(contraseñaLabel);
            panel.add(contraseñaField);

            JLabel ubicacionLabel = new JLabel("Ubicación:");
            ubicacionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            ubicacionField = new JTextField();
            ubicacionField.setColumns(23); 
            panel.add(ubicacionLabel);
            panel.add(ubicacionField);

            JLabel imagenLabel = new JLabel();
            ImageIcon imagenIcon = new ImageIcon("src/recursos/imagen5.png");
            imagenLabel.setIcon(imagenIcon);

            JLabel totalLabel = new JLabel("Total : S/819.54");

            JButton comprarButton = new JButton("Comprar");

            JLabel mensajeEntregaLabel = new JLabel("Tu pedido llegará en un plazo de 7 días hábiles, por favor estar atento a la entrega.");
            mensajeEntregaLabel.setFont(new Font("Arial", Font.PLAIN, 16));

            comprarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "¡Gracias por su compra!");
                }
            });

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 2;
            panel.add(confirmacionLabel, gbc);

            gbc.gridy++;
            gbc.gridwidth = 1;
            panel.add(tipoPagoLabel, gbc);
            gbc.gridx++;
            panel.add(tipoPagoCombo, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            panel.add(numeroTarjetaLabel, gbc);
            gbc.gridx++;
            panel.add(numeroTarjetaField, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            panel.add(contraseñaLabel, gbc);
            gbc.gridx++;
            panel.add(contraseñaField, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            panel.add(ubicacionLabel, gbc);
            gbc.gridx++;
            panel.add(ubicacionField, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            gbc.gridwidth = 2;
            panel.add(imagenLabel, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            gbc.gridwidth = 2;
            panel.add(mensajeEntregaLabel, gbc);

            gbc.gridy++;
            panel.add(totalLabel, gbc);

            gbc.gridy++;
            panel.add(comprarButton, gbc);

            frame.getContentPane().add(panel);
            frame.setVisible(true);
        });
    }
}

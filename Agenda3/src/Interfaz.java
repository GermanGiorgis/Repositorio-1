
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

 class AgendaResponsive extends JFrame implements ActionListener {
    private JTextField nombreField, apellidoField, dniField, mailField;
    private JButton guardarButton, mostrarButton;
    private JTextArea textArea;
    private ArrayList<Contacto> contactos;

    public AgendaResponsive() {
        // Configuración de la ventana
        setTitle("Agenda");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Paneles
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel displayPanel = new JPanel(new BorderLayout());

        // Campos de texto
        nombreField = new JTextField(10);
        apellidoField = new JTextField(10);
        dniField = new JTextField(10);
        mailField = new JTextField(10);

        // Botones
        guardarButton = new JButton("Guardar");
        mostrarButton = new JButton("Mostrar");

        // Área de texto para mostrar contactos
        textArea = new JTextArea(10, 20);
        textArea.setEditable(false);

        // Añadir componentes a los paneles
        inputPanel.add(new JLabel("Nombre:"));
        inputPanel.add(nombreField);
        inputPanel.add(new JLabel("Apellido:"));
        inputPanel.add(apellidoField);
        inputPanel.add(new JLabel("DNI:"));
        inputPanel.add(dniField);
        inputPanel.add(new JLabel("Mail:"));
        inputPanel.add(mailField);

        buttonPanel.add(guardarButton);
        buttonPanel.add(mostrarButton);

        displayPanel.add(new JLabel("Contactos:"), BorderLayout.NORTH);
        displayPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Añadir paneles a la ventana
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(displayPanel, BorderLayout.SOUTH);
        getContentPane().add(mainPanel);

        // Inicializar la lista de contactos
        contactos = new ArrayList<>();

        // Agregar listeners a los botones
        guardarButton.addActionListener(this);
        mostrarButton.addActionListener(this);

        pack();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guardarButton) {
            String nombre = nombreField.getText();
            String apellido = apellidoField.getText();
            String dni = dniField.getText();
            String mail = mailField.getText();

            // Guardar el contacto en la lista
            contactos.add(new Contacto(nombre, apellido, dni, mail));

            // Limpiar campos de texto
            nombreField.setText("");
            apellidoField.setText("");
            dniField.setText("");
            mailField.setText("");
        } else if (e.getSource() == mostrarButton) {
            // Mostrar todos los contactos en el área de texto
            textArea.setText("");
            for (Contacto contacto : contactos) {
                textArea.append(contacto.toString() + "\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AgendaResponsive().setVisible(true);
        });
    }
}


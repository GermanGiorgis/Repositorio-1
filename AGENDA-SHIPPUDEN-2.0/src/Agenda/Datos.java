package Agenda;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Datos {

    DefaultTableModel dtm = new DefaultTableModel();

    public void MostrarDatos(Connection BaseDeDatos, javax.swing.JTable tbl) {
        dtm.addColumn("Dni");
        dtm.addColumn("Nombre");
        dtm.addColumn("Apellido");       
        dtm.addColumn("Telefono");
        dtm.addColumn("Mail");
        tbl.setModel(dtm);
        try {
            PreparedStatement ps = BaseDeDatos.prepareStatement("SELECT*FROM contactos");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[5];
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                dtm.addRow(fila);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos "+e.getMessage());
        }
    }

}

package Formulario;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
* @author UnADM
*/
public class Conexion {
    public static void inserta(int id, String nom, String paterno, String materno, String departamento, String sucursal, String nivel, String puesto, String sueldo) throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dpo2", "admin", "78xVbZQ(*[ZSsRom"); 
                Statement st = conexion.createStatement()) {
                String insercion="INSERT INTO dpo2.empleados VALUES ('"+id+"','"+nom+"','"+paterno+"','"+materno+"','"+departamento+"','"+sucursal+"','"+nivel+"','"+puesto+"','"+sueldo+"');";
                st.executeUpdate(insercion);
                JOptionPane.showMessageDialog(null, "Insercion correcta", "OK", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error de insercion", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }

    public static void buscar (String id, String nom, String paterno, String materno){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dpo2", "admin", "78xVbZQ(*[ZSsRom"); 
        Statement st = conexion.createStatement(); {
        String consulta="SELECT * FROM dpo2.empleados WHERE idempleados='"+id+"' && NombreEmpleado='"+nom+"' && ApellidoPaterno='"+paterno+"' && ApellidoMaterno='"+materno+"';";
                ResultSet rs=null;
                rs = st.executeQuery( consulta );
                
                if (rs != null && rs.next()){
                    JOptionPane.showMessageDialog(null, "Usuario encontrado", "OK", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No hay coincidencias, verifique la ortografia", "Error", JOptionPane.ERROR_MESSAGE);
                }
                rs.close();
                st.close();
                conexion.close();
            
            }
    }
            catch (HeadlessException | ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null, "Validacion incorrecta", "Error", JOptionPane.ERROR);
            }
    }
    
    public static DefaultTableModel mostrarRegistros(String id){
        String []  nombresColumnas = {"ID","Nombre","Apellido paterno", "Apellido Materno","Departamento","Sucursal","Nivel academico","Puesto","Sueldo Bruto"};
        String [] registros = new String[9];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dpo2", "admin", "78xVbZQ(*[ZSsRom"); Statement st = conexion.createStatement()) {
                String consulta="SELECT * FROM dpo2.empleados WHERE idempleados='"+id+"';";
                
                ResultSet rs=null;
                rs = st.executeQuery( consulta );
                
                while(rs.next())
                {
                    registros[0] = rs.getString("idempleados");
                    registros[1] = rs.getString("NombreEmpleado");
                    registros[2] = rs.getString("ApellidoPaterno");
                    registros[3] = rs.getString("ApellidoMaterno");
                    registros[4] = rs.getString("Departamento");
                    registros[5] = rs.getString("Sucursal");
                    registros[6] = rs.getString("NivelAcademico");
                    registros[7] = rs.getString("Puesto");
                    registros[8] = rs.getString("SueldoBruto");
                    modelo.addRow(registros);
                }
                rs.close();
            }
        
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error "+e);
        }
        return modelo;
    }
    
    }

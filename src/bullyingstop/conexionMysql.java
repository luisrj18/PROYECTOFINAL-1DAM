package bullyingstop;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexionMysql {
    
    Connection cn;                                                              //creo variable tipo Connection cn
    
    public Connection conectar() {                                              //con el metodo conectar
        try {                                                                   //creamos try/catch para conectarnos a mysql
            Class.forName("com.mysql.jdbc.Driver");
            cn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstopbullying","dbstopbullying","123456789");   //metemos la ruta para conectarnos a la BBDD
            System.out.println("CONECTADO");                                  //si logra conectarse nos imprime en consola CONECTADO
        }catch (Exception e) {
            System.out.println("ERROR" + e);                                    //en el caso contrario imprimirá ERROR
        }
        return cn;    
    }
}


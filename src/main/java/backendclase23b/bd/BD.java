package backendclase23b.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
    private static final String DRIVER="org.h2.Driver";
    private static final String URL="jdbc:h2:~/clase18b";
    private static final String USER="sa";
    private static final String PASS="sa";

    private static final String CREATE_DOMICILIOS_TABLE = "drop table if exists domicilios; create table domicilios(id int auto_increment primary key, calle varchar(100) not null, numero int not null, localidad varchar(100) not null, provincia varchar(100) not null)";
    private static final String CREATE_PACIENTES_TABLE ="drop table if exists pacientes; create table pacientes( id int auto_increment primary key, apellido varchar(100) not null, nombre varchar(100) not null, dni int not null, fecha date not null, domicilio_id int not null, email varchar(100) not null)";

    private static final String SQL_PACIENTE1="insert into domicilios (calle, numero, localidad, provincia) values('calle 1', 484, 'Salta Capital', 'salta'); insert into pacientes (apellido, nombre, dni, fecha, domicilio_id, email) values ('fulanito', 'cosme', 584, '2022-08-25', 1, 'mail@mail.com')";

    public static Connection getConnection() throws Exception{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USER,PASS);
    }

    public static void crearTablas() throws Exception{
        Connection connection= getConnection();
        Statement statement= connection.createStatement();
        statement.execute(CREATE_DOMICILIOS_TABLE);
        statement.execute(CREATE_PACIENTES_TABLE);
        statement.execute(SQL_PACIENTE1);
    }
}

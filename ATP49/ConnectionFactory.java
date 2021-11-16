import java.lang.invoke.ClassSpecializer.Factory;

import javax.sql.DataSource;

public class ConnectionFactory {
    private DataSource dataSource;

    public ConnectionFactory(){
        ComboPooledDataSource pool = new ComboPooledSource();
        //
    }
}

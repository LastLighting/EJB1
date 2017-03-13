package dao;


import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DAO {

    Logger logger;
    Connection connection;
    @Resource(name = "ManJNDI")
    DataSource dataSource;

    public DAO() {
    }

    public void toConnection() {
        InitialContext initialContext = null;
        try {
            initialContext = new InitialContext();
            dataSource = (DataSource) initialContext.lookup("java:comp/env/ManJNDI");
            connection = dataSource.getConnection();
        }
        catch (SQLException sqlException) {
            logger.warning("Ошибка подключения к БД");
        }
        catch (NamingException namingException) {
            logger.warning("Что-то с неймингами");
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        }
        catch (SQLException sqlExceprion) {
            logger.warning("Тут как бы уже наши полномочия этого всё");
        }
    }
}


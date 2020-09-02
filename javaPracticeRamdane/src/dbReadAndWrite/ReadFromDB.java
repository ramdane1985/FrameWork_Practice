package dbReadAndWrite;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReadFromDB {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet= null;


    public static void main(String[] args) throws Exception{
        readDataBase("movie","id","genre");

    }

    public static List<String>readDataBase(String tableName,String columnName1,String columnName2) throws Exception {
        List<String> data =new ArrayList<>();
        try{
            connectToSqlDatabase();// it will connect with DataBase
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from" + tableName);
            data = getResultSetData(resultSet, columnName1,columnName2);
            //System.out.println(data);

            for (String dt:data) {
                System.out.print(dt + " ");
            }
        }catch(ClassNotFoundException  e){
            throw e;
        } finally {
            close();
        }
        return data;
    }


    public static Connection connectToSqlDatabase() throws IOException,SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        // To load all the property from Properties file
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");

        Class.forName(driverClass);
        connect = DriverManager.getConnection(url, userName, password);
        System.out.println("Database is connected");
        return connect;
    }

    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/secret.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }
    private static List<String> getResultSetData(ResultSet resultSet, String columnName1, String columnName2) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while (resultSet.next()) {
            String itemName1 = resultSet.getString(columnName1);
            String itemName2 = resultSet.getString(columnName2);
            dataList.add(itemName1);
            dataList.add(itemName2);
        }
        return dataList;
    }

    private static void close() throws Exception {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
           // readDataBase ("car","model","year");

        }
    }

}





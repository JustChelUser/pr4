package sqlapp;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.sqlite.JDBC;

public class exampledb {
	
	  	private static String url1 = "jdbc:sqlite:D:/Other/Downloads/SQLiteStudio/exampledb";
	    private static exampledb instance = null;
	    public static synchronized exampledb getInstance() throws SQLException {
	        if (instance == null)
	            instance = new exampledb();
	        return instance;
	    }
	  	private Connection connection;
	    private exampledb() throws SQLException {
	        DriverManager.registerDriver(new JDBC());
	        this.connection = DriverManager.getConnection(url1);
	    }
	    public  static int insert(users users) {
	    	try{
	            Class.forName("org.sqlite.JDBC").getDeclaredConstructor().newInstance();
	            try (Connection conn = DriverManager.getConnection(url1))
	            { 
	                String sql = "INSERT INTO users (Name, Surname, Patronymic, City, Street, Telnumber, Email, Wifi_router,MobileInternet,TV,Password,Tarif,UrgentCall) Values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
	                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
	                    preparedStatement.setString(1, users.getName());
	                    preparedStatement.setString(2, users.getSurname());  
	                    preparedStatement.setString(3, users.getPatronymic());
	                    preparedStatement.setString(4, users.getCity());  
	                    preparedStatement.setString(5, users.getStreet());  
	                    preparedStatement.setString(6, users.getTelnumb());  
	                    preparedStatement.setString(7, users.getEmail());  
	                    preparedStatement.setString(8, users.getWifi());  
	                    preparedStatement.setString(9, users.getMobileinternet());  
	                    preparedStatement.setString(10, users.getTV());
	                    preparedStatement.setString(11, users.getPassowrd());
	                    preparedStatement.setString(12, users.getTarif());
	                    preparedStatement.setString(13, users.getUrgentCall());
	                    return  preparedStatement.executeUpdate();
	                }
	            }
	        }
	        catch(Exception ex){
	            System.out.println(ex);
	        }
	        return 0;
	    }
	    public static int check(UserAuths UserAuths) {
	    	try{
	            Class.forName("org.sqlite.JDBC").getDeclaredConstructor().newInstance();
	            try (Connection conn = DriverManager.getConnection(url1))
	            { 
	                Statement statement = conn.createStatement();
	                ResultSet resultSet = statement.executeQuery("SELECT * FROM UserAuth");
                    String userLogin =  UserAuths.getLogin().toString();
                    String userPassword =  UserAuths.getPassword().toString();
	                while(resultSet.next()){	                                     	
	                    int id = resultSet.getInt(1);
	                    String login = resultSet.getString(2);
	                    String password = resultSet.getString(3);
	                    if(login.equals(userLogin) && password.equals(userPassword))
	                    {
	                    	System.out.println("Такой пользователь есть");
	                    	
	                    	return 0;
	                    	//UserAuths UserAuths2 = new UserAuths(login,password); 
	                    	//return UserAuths2;
	                    }
	                   /// UserAuths UserAuths = new UserAuths(id,login,password);	                    
	                }
	            	
	            }
	          
	        }
	        catch(Exception ex){
	            System.out.println(ex);
	        }
			return 1;
	    }
	   	    
}

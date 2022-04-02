package sqlapp;

import java.io.Serializable;

public class UserAuths  implements Serializable {
    private int id;
    private String login;
    private String password;
    public UserAuths(){ }
    public UserAuths(String login,String password){       
        this.login = login;
        this.password = password;       
    }
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public  String getPassword() {
        return password;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

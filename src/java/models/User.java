
package models;

/**
 * User java bean.
 * @author 807930
 */
public class User {
    private String username;
    private String password;
    
    public User(String username, String password){
        this.username=username;
        this.password=password;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String Username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
}

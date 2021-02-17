
package models;

/**
 * AccountService java bean.
 * @author 807930
 */
public class AccountService {
    private String username;
    private String password;
    User user;
    
    
    public User Login(String username, String password){
        this.username=username;
        this.password=password;
        
        if(username.equals("abe") || username.equals("barb")){
            if (password.equals("password")){
                user = new User(this.username, this.password);
                return user;
            }
        }
        
        return user;
    }
}

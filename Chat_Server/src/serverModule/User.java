/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverModule;

/**
 *
 * @author abdalrahmansaleh
 */
public class User {
    
    public String userName;
    public String password;
    public String secretKey;
    public String salt;

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + '}';
    }

    public User() {
    }

    public User(String userName, String password, String secretKey, String salt) {
        this.userName = userName;
        this.password = password;
        this.secretKey = secretKey;
        this.salt = salt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    
}

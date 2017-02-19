package com.company;

/**
 * Created by hackeru on 2/19/2017.
 */
public class Users {
    public static final int ASCII_a = 97;
    public static final int ASCII_z = 122;
    String password;
    String userName;
    private static final byte ASCII_9 =57 ;
    private static final byte ASCII_0 =48 ;

    public Users(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    //בדיקה אם הuserName נכון
    private  boolean checkingUsername (String user){
        byte[] currentByte = user.getBytes();
        boolean flagNumbers=false;
        for (int i = 0; i <user.length() ; i++) {
            if ((currentByte[i] >= ASCII_0) && (currentByte[i] <= ASCII_9)&&(flagNumbers==false));{
                return false;
            }
            else
                if((currentByte[i]>= ASCII_a)&&currentByte[i]<= ASCII_z)){
            flagNumbers=true;
            }
        }
        return false;
    }
}

package cls.user;

import java.io.Serializable;


    public class User implements Serializable{
    private String name, email, password, userType, gender;
    private int age; 

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public User(String name, String email, String password, String userType, String gender, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.gender = gender;
        this.age = age;
    }
    
    
}

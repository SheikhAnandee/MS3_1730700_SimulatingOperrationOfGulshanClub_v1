package cls.president;

import cls.member.Member;
import java.io.Serializable;// to read and write and actual class convertion

   public class President extends Member implements Serializable{
    private String electedDate;

    public String getElectedDate() {
        return electedDate;
    } 

    public President(String electedDate, String joiningDate, String membershipType, int memberId, String name, String email, String password, String userType, String gender, int age) {
        super(joiningDate, membershipType, memberId, name, email, password, userType, gender, age);
        this.electedDate = electedDate;
    }
    
}

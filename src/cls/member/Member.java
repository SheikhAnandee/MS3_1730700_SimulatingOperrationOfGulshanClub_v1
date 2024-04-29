package cls.member;

import cls.user.User;
import java.io.Serializable;


public class Member extends User implements Serializable{
    private String joiningDate, membershipType;
    private int memberId;

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getMemberId() {
        return memberId;
    }

    public Member(String joiningDate, String membershipType, int memberId, String name, String email, String password, String userType, String gender, int age) {
        super(name, email, password, userType, gender, age);
        this.joiningDate = joiningDate;
        this.membershipType = membershipType;
        this.memberId = memberId;
    } 
}

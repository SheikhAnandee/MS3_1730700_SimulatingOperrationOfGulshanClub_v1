package cls.investor;

import cls.user.User;
import java.io.Serializable;


public class Investor extends User implements Serializable{
    private String CompanyName;
    private int investorId;
    
    public String getCompanyName() {
        return CompanyName;
    }

    public int getInvestorId() {
        return investorId;
    }

    public Investor(String CompanyName, int investorId, String name, String email, String password, String userType, String gender, int age) {
        super(name, email, password, userType, gender, age);
        this.CompanyName = CompanyName;
        this.investorId = investorId;
    } 
}

package InlamningsUppgifter.InlamningsUppgift_2;

public class Customer {

    private String name;
    private String address;
    private String email;
    private String socialSecurityNumber;
    private String joinDate;
    private String membershipUpdateDate;
    private String memberLvl;

    public Customer(String name, String address, String email, String ssNr,
                    String joinDate, String updDate, String memberLvl){
        this.name = name;
        this.address = address;
        this.email = email;
        this.socialSecurityNumber = ssNr;
        this.joinDate = joinDate;
        this.membershipUpdateDate = updDate;
        this. memberLvl = memberLvl;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getMembershipUpdateDate() {
        return membershipUpdateDate;
    }

    public String getMemberLvl() {
        return memberLvl;
    }
}

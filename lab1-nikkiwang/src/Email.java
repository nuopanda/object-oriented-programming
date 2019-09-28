/*
Represents the Email with the loginName and domain as Strings
 */
public class Email {
    private String loginName;
    private String domain;

    /*
    Creates a new email given the loginName and domain
     */
    public Email(String loginName, String domain) {
        this.loginName = loginName;
        this.domain = domain;
    }

    /*
    @return the loginName
     */
    public String getLoginName() {
        return this.loginName;
    }

    /*
    @return the domain
     */
    public String getDomain() {
        return this.domain;
    }

    /*
    set the loginName
     */
    public void setLoginName(String newLoginName) {
        this.loginName = newLoginName;
    }

    /*
    set the domain
     */
    public void setDomain(String newDomain) {
        this.domain = newDomain;
    }
}




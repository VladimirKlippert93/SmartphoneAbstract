package Main;

public class BusinessContact extends Contact{
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "name= " + this.getName()+
                "companyName='" + companyName + '\'' +
                '}';
    }
}

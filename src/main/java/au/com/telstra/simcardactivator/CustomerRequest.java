package au.com.telstra.simcardactivator;

public class CustomerRequest {
    private final String iccid;
    private final String customerEmail;

    public CustomerRequest(String iccid, String customerEmail) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
    }

    public String getIccid() {
        return iccid;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}


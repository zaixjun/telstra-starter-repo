package au.com.telstra.simcardactivator;


public class InternalRequest {
    private final String iccid;

    public InternalRequest(String iccid) {
        this.iccid = iccid;
    }
    public String getIccid() {
        return iccid;
    }
}

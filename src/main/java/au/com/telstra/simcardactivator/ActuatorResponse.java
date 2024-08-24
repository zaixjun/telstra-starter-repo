package au.com.telstra.simcardactivator;

public class ActuatorResponse {
    private final Boolean success;

    public ActuatorResponse(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }
}

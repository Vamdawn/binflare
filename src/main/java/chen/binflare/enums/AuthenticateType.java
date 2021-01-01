package chen.binflare.enums;

/**
 * user authenticate type enumration.
 *
 * @author chen
 */
public enum AuthenticateType {

    /**
     * email + password
     */
    EMAIL_PASS(1, "EMAIL_PASS"),

    /**
     * mobile number + password
     */
    MOBILE_PASS(2, "MOBILE_PASS");

    private static final AuthenticateType[] AUTHENTICATE_TYPES = values();
    private final Integer value;
    private final String name;

    AuthenticateType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static AuthenticateType of(Integer value) {
        for (AuthenticateType authenticateType : AUTHENTICATE_TYPES) {
            if (authenticateType.getValue().equals(value)) {
                return authenticateType;
            }
        }
        return null;
    }

    public static AuthenticateType of(String name) {
        for (AuthenticateType authenticateType : AUTHENTICATE_TYPES) {
            if (authenticateType.getName().equals(name)) {
                return authenticateType;
            }
        }
        return null;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

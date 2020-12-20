package chen.binflare.enums;

public enum CredentialType {

    EMAIL(1, "EMAIL"),
    PASSWORD(2, "PASSWORD");

    private static final CredentialType[] CREDENTIAL_TYPE_LIST = CredentialType.values();
    private final Integer value;
    private final String name;

    CredentialType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * GET CredentialType from value
     *
     * @param value
     * @return
     */
    public static CredentialType of(Integer value) {
        for (CredentialType credentialType : CREDENTIAL_TYPE_LIST) {
            if (credentialType.getValue().equals(value)) {
                return credentialType;
            }
        }
        return null;
    }

    /**
     * GET CredentialType from name
     *
     * @param name
     * @return
     */
    public static CredentialType of(String name) {
        for (CredentialType credentialType : CREDENTIAL_TYPE_LIST) {
            if (credentialType.getName().equals(name)) {
                return credentialType;
            }
        }
        return null;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}

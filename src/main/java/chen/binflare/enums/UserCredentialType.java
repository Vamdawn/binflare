package chen.binflare.enums;

public enum UserCredentialType {

    EMAIL(1, "EMAIL"),

    MOBILE(2, "MOBILE");

    private static final UserCredentialType[] USER_CREDENTIAL_TYPE_LIST = UserCredentialType.values();
    private final Integer value;
    private final String name;

    UserCredentialType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * enum value => UserCredentialType
     *
     * @param value enum value
     * @return {@literal null} if no match
     */
    public static UserCredentialType of(Integer value) {
        for (UserCredentialType userCredentialType : USER_CREDENTIAL_TYPE_LIST) {
            if (userCredentialType.getValue().equals(value)) {
                return userCredentialType;
            }
        }
        return null;
    }

    /**
     * enum name => UserCredentialType
     *
     * @param name enum name
     * @return {@literal null} if no match
     */
    public static UserCredentialType of(String name) {
        for (UserCredentialType userCredentialType : USER_CREDENTIAL_TYPE_LIST) {
            if (userCredentialType.getName().equals(name)) {
                return userCredentialType;
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

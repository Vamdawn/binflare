package chen.binflare.enums;

public enum UserSecretType {

    PASSWORD(1, "PASSWORD");

    private static final UserSecretType[] USER_SECRET_TYPE_LIST = UserSecretType.values();
    private final Integer value;
    private final String name;

    UserSecretType(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * enum value => UserSecretType
     *
     * @param value enum value
     * @return {@literal null} if no match
     */
    public static UserSecretType of(Integer value) {
        for (UserSecretType userSecretType : USER_SECRET_TYPE_LIST) {
            if (userSecretType.getValue().equals(value)) {
                return userSecretType;
            }
        }
        return null;
    }

    /**
     * enum name => UserSecretType
     *
     * @param name enum name
     * @return {@literal null} if no match
     */
    public static UserSecretType of(String name) {
        for (UserSecretType userSecretType : USER_SECRET_TYPE_LIST) {
            if (userSecretType.getName().equals(name)) {
                return userSecretType;
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

package chen.binflare.exception;

import lombok.Getter;

@Getter
public class BaseException extends Exception {

    /**
     * Http Status
     */
    private final Integer status;

    /**
     * Business Code
     */
    private final Integer code;

    /**
     * Exception Message
     */
    private final String msg;

    public BaseException(Integer status, Integer code, String msg) {
        super();
        this.status = status;
        this.code = code;
        this.msg = msg;
    }

    /**
     * Returns the detail message string of this throwable.
     *
     * @return the detail message string of this {@code Throwable} instance
     * (which may be {@code null}).
     */
    @Override
    public String getMessage() {
        return code + ":" + msg;
    }
}

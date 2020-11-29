package chen.binflare.exception;

import chen.binflare.config.GlobalExceptionHandler;
import lombok.Getter;

/**
 * Custom Base Exception,
 * will be handled by {@link GlobalExceptionHandler}
 */
@Getter
public class BaseException extends Exception {

    private final Integer status;
    private final Integer code;
    private final String msg;

    /**
     * Base Exception Constructor
     *
     * @param status Http Status
     * @param code   Business Code
     * @param msg    Exception Message
     */
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

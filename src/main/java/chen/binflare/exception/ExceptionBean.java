package chen.binflare.exception;

import lombok.Getter;

/**
 * BaseException Factory
 */
@Getter
public class ExceptionBean {

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
    public ExceptionBean(Integer status, Integer code, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    /**
     * Static Constructor - default status 200
     *
     * @param code Business Code
     * @param msg  Exception Message
     * @return ExceptionBean
     */
    public static ExceptionBean of(Integer code, String msg) {
        return new ExceptionBean(200, code, msg);
    }

    /**
     * Static Constructor
     *
     * @param status Http Status
     * @param code   Business Code
     * @param msg    Exception Message
     * @return ExceptionBean
     */
    public static ExceptionBean of(Integer status, Integer code, String msg) {
        return new ExceptionBean(status, code, msg);
    }

    /**
     * Construct new BaseException
     *
     * @return BaseException
     */
    public BaseException checked() {
        return new BaseException(status, code, msg);
    }
}

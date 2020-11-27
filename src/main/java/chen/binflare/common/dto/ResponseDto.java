package chen.binflare.common.dto;

import lombok.Data;

@Data
public class ResponseDto<T> {

    private Integer code;
    private String msg;
    private T data;

    private ResponseDto() {
    }

    private ResponseDto(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * API成功响应 no data
     *
     * @return {"code": 0}
     */
    static public ResponseDto<?> success() {
        return new ResponseDto<>(0, null, null);
    }

    /**
     * API成功响应 with data
     *
     * @param data 数据对象
     * @param <R>  数据类型
     * @return {"code": 0, "data": data}
     */
    static public <R> ResponseDto<R> success(R data) {
        return new ResponseDto<>(0, null, data);
    }

    /**
     * API失败响应
     *
     * @param code errcode
     * @param msg  errmsg
     * @return {"code": 0, "msg": "error message"}
     */
    static public ResponseDto<?> fail(Integer code, String msg) {
        return new ResponseDto<>(code, msg, null);
    }
}

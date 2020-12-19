package chen.binflare.module.dto;

import lombok.Data;

@Data
public class ResponseDTO<T> {

    private Integer code;
    private String msg;
    private T data;

    private ResponseDTO() {
    }

    private ResponseDTO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * API成功响应 no data
     *
     * @return {"code": 0}
     */
    static public ResponseDTO<?> success() {
        return new ResponseDTO<>(0, null, null);
    }

    /**
     * API成功响应 with data
     *
     * @param data 数据对象
     * @param <R>  数据类型
     * @return {"code": 0, "data": data}
     */
    static public <R> ResponseDTO<R> success(R data) {
        return new ResponseDTO<>(0, null, data);
    }

    /**
     * API失败响应
     *
     * @param code errcode
     * @param msg  errmsg
     * @return {"code": 0, "msg": "error message"}
     */
    static public ResponseDTO<?> fail(Integer code, String msg) {
        return new ResponseDTO<>(code, msg, null);
    }
}

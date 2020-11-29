package chen.binflare.config;

import chen.binflare.common.dto.ResponseDTO;
import chen.binflare.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Global Exception Handler
 * <p>
 * support Custom Exception
 * </p>
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private HttpServletResponse httpServletResponse;

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseDTO<?> exceptionHandler(Exception e) throws Exception {
        log.warn("[Exception][Handler] [url: {}][msg: {}]", httpServletRequest.getRequestURI(), e.getMessage());
        if (e instanceof BaseException) {
            BaseException ex = (BaseException) e;
            if (ex.getStatus() != null) {
                httpServletResponse.setStatus(ex.getStatus());
            }
            return ResponseDTO.fail(ex.getCode(), ex.getMsg());
        } else if (e instanceof ConstraintViolationException ||
                e instanceof BindException ||
                e instanceof ServletRequestBindingException ||
                e instanceof HttpMessageNotReadableException) {
            httpServletResponse.setStatus(400);
            return ResponseDTO.fail(10000, "参数错误");
        } else {
            throw e;
        }
    }
}

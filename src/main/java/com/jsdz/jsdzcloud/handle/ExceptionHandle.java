package com.jsdz.jsdzcloud.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsdz.jsdzcloud.exception.SessionNullException;
/****
 * 异常统一处理handle
 * @author Administrator
 *
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handle(Exception e) {
        if (e instanceof SessionNullException) {
        	SessionNullException sessionNull = (SessionNullException) e;
//            return ResultUtil.error(boyException.getCode(), boyException.getMessage());
        	return sessionNull;
        }else {
        	e.printStackTrace();
        	SessionNullException sessionNull = new SessionNullException("系统异常","-2",null);
        	return sessionNull;
        }
    }
}

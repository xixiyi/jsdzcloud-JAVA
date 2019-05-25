package com.jsdz.jsdzcloud.exception;
/****
 * 异常处理类同发送给前端数据的类参数一致
 * msg:报错信息
 * code:报错码
 * data:数据
 * @author Administrator
 *
 */
public class SessionNullException extends Exception {
	private String msg;
	private String code;
	private Object data;
	
	public SessionNullException (String msg,String code,String data) {
		this.msg = msg;
		this.code = code;
		this.data = data;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}

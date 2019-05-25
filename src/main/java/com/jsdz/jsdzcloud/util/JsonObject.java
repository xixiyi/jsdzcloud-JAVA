package com.jsdz.jsdzcloud.util;

import com.jsdz.jsdzcloud.bean.ResponseContent;

public class JsonObject {
	
	public static ResponseContent JsonObjectWrite(String code,String msg,Object object) {
		
		ResponseContent responsecontent = new ResponseContent();
		responsecontent.setCode(code);
		responsecontent.setMsg(msg);
		responsecontent.setData(object);
		return responsecontent;
	}
}

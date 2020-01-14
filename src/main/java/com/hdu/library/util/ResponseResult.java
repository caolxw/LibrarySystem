package com.hdu.library.util;

import java.io.Serializable;

/**
 * 自定义响应结构
 */
public class ResponseResult implements Serializable{
   
	private static final long serialVersionUID = -9140105642191889015L;



    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static ResponseResult build(Integer status, String msg, Object data) {
        return new ResponseResult(status, msg, data);
    }

    public ResponseResult() {

    }

    public static ResponseResult build(Integer status, String msg) {
        return new ResponseResult(status, msg, null);
    }

    public ResponseResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    

}

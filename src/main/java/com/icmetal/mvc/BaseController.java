package com.icmetal.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

/**
 * @author OF1264
 * @since 1.0, 16/1/28 上午10:05
 */
public class BaseController {

    /**
     * 返回成功结果，http状态码200
     * @return
     */
    protected ResponseEntity successResult() {
        return successResult(null);
    }

    /**
     * 返回成功结果，带数据，http状态码200
     * @return
     */
    protected <T> ResponseEntity successResult(T data) {
        return new ResponseEntity(data, HttpStatus.OK);
    }

    /**
     * 返回失败结果，http状态码500
     * @return
     */
    protected ResponseEntity failResult() {
        return failResult(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 返回失败结果，http状态码通过参数指定
     * @param status http状态码
     * @return
     */
    protected ResponseEntity failResult(HttpStatus status) {
        return failResult(null, status);
    }

    /**
     * 返回失败结果，带数据，http状态码500
     * @return
     */
    protected <T> ResponseEntity failResult(T data) {
        return failResult(data, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 返回失败结果，带数据，http状态码通过参数指定
     * @param data
     * @param status http状态码
     * @return
     */
    protected <T> ResponseEntity failResult(T data, HttpStatus status) {
        return new ResponseEntity(data, status);
    }


    private boolean isAjax(HttpServletRequest request) {
        return request.getHeader("accept").contains("application/json") ||
                "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));

    }

}

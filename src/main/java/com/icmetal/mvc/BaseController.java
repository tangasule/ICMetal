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

//    @ExceptionHandler
//    public ModelAndView handleException(HttpServletRequest request, HttpServletResponse response, Exception ex) {
//        LogUtil.error("请求发生错误", ex);
//        response.setStatus(500);
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json;charset=UTF-8");
//        String msg;
//        if (ex instanceof AutotestException) {
//            msg = ((AutotestException) ex).getDetailMessage();
//        } else {
//            msg = "错误信息: " + ErrorCode.SYSTEM_EXCEPTION + "-系统异常";
//        }
//        try {
//            PrintWriter writer = response.getWriter();
//            writer.write(msg);
//            writer.flush();
//        } catch (IOException e) {
//            // do nothing
//        }
//        return isAjax(request) ? null : new ModelAndView("error");
//    }

    private boolean isAjax(HttpServletRequest request) {
        return request.getHeader("accept").contains("application/json") ||
                "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));

    }

}

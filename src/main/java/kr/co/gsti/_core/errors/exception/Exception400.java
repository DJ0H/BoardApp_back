package kr.co.gsti._core.errors.exception;


import org.springframework.http.HttpStatus;

import kr.co.gsti._core.utils.ApiUtils;
import lombok.Getter;

@Getter
public class Exception400 extends RuntimeException {

    public Exception400(String message) {
        super(message);
    }

    public ApiUtils.ApiResult<?> body() {
        return ApiUtils.error(getMessage(), HttpStatus.BAD_REQUEST);
    }

    public HttpStatus status() {
        return HttpStatus.BAD_REQUEST;
    }
}
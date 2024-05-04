package kr.co.gsti._core.errors.exception;


import org.springframework.http.HttpStatus;

import kr.co.gsti._core.utils.ApiUtils;
import lombok.Getter;

@Getter
public class Exception401 extends RuntimeException {

    public Exception401(String message) {
        super(message);
    }

    public ApiUtils.ApiResult<?> body() {
        return ApiUtils.error(getMessage(), HttpStatus.BAD_REQUEST);
    }

    public HttpStatus status() {
        return HttpStatus.BAD_REQUEST;
    }
}
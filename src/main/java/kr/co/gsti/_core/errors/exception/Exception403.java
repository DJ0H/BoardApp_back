package kr.co.gsti._core.errors.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import kr.co.gsti._core.utils.ApiUtils;

@Getter
public class Exception403 extends RuntimeException {

    public Exception403(String message) {
        super(message);
    }

    public ApiUtils.ApiResult<?> body() {
        return ApiUtils.error(getMessage(), HttpStatus.BAD_REQUEST);
    }

    public HttpStatus status() {
        return HttpStatus.BAD_REQUEST;
    }
}
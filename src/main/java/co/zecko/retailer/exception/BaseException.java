package co.zecko.retailer.exception;

import co.zecko.retailer.common.enums.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BaseException extends Exception {

    String message;

    HttpStatus httpStatus;

    Object details;

    public BaseException(String message) {
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        this.message = message;
    }

    public BaseException(String message, HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public BaseException(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        this.message = httpStatus.getReasonPhrase();
    }

    public BaseException() {
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        this.message = HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();
    }
}

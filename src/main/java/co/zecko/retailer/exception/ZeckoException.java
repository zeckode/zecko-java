package co.zecko.retailer.exception;

import co.zecko.retailer.common.enums.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ZeckoException extends Exception {

    String message;

    HttpStatus httpStatus;

    Object details;

    public ZeckoException(String message) {
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        this.message = message;
    }

    public ZeckoException(String message, HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public ZeckoException(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        this.message = httpStatus.getReasonPhrase();
    }

    public ZeckoException() {
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        this.message = HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();
    }
}

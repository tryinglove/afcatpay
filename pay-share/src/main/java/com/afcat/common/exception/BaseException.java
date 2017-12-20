package com.afcat.common.exception;

/**
 * Created by john on 2017/12/13.
 *
 */
public class BaseException extends RuntimeException {
    /**
     *
     */
    public BaseException() {
        super();
    }
    /**
     * @param errorCode
     * @param cause
     */
    public BaseException(String errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    /**
     * @param errorCode
     */
    public BaseException(String errorCode) {
        super(errorCode);
    }

    /**
     * @param cause
     */
    public BaseException(Throwable cause) {
        super(cause);
    }
}

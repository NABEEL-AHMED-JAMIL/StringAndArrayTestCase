package com.ballistic.server.restapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManagerResponse<T> {

    private final String message;
    private final HttpStatus returnCode;
    private final T entity;

    public ManagerResponse(String message, HttpStatus returnCode, T entity) {
        this.message = message;
        this.returnCode = returnCode;
        this.entity = entity;
    }

    public String getMessage() { return message; }

    public HttpStatus getReturnCode() { return returnCode; }

    public T getEntity() { return entity; }

    @Override
    public String toString() {
        return "ManagerResponse{" + "message='" + message + '\'' + ", returnCode=" + returnCode + ", entity=" + entity + '}';
    }
}

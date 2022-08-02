package com.rga.mx.demo.domain.dao;

public class ResponseDTO<T> {
    private String message;
    private String error;
    private T data;

    public ResponseDTO() {
    }

    public ResponseDTO(String message, String error, T data) {
        this.message = message;
        this.error = error;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
                return "{ message:'" + message + '\'' +
                ", error: '" + error + '\'' +
                ", data: " + data +
                '}';
    }
}

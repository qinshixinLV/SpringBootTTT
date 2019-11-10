package com.example.demo.Exception;

import lombok.Data;

@Data
public class RegistException extends RuntimeException {
    private int code;
    private String msg;

    public RegistException() {
    }

    public RegistException(String msg) {
        super(msg);
    }

    public RegistException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

package com.example.demo.controller;


import com.example.demo.Exception.RegistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionAdviceController {

    @ExceptionHandler(RegistException.class)
    @ResponseBody
    public String registException(HttpServletRequest request, RegistException e){
        return e.getMsg();
    }
}

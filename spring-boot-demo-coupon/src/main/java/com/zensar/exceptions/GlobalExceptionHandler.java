package com.zensar.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.zensar.springbootdemo.entity.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NoSuchCouponExistsException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse handleException(NoSuchCouponExistsException ex) {
		return new ErrorResponse(ex.getMessage());
	}

	@ExceptionHandler(value = CouponAlreadyExistsException.class)
	@ResponseStatus
	public @ResponseBody ErrorResponse handleException(CouponAlreadyExistsException ex) {
		return new ErrorResponse(ex.getMessage());
	}
}
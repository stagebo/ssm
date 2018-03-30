package com.wyb.exception;

import com.wyb.model.Appointment;
import com.wyb.util.AppointStateEnum;

/**
 * 预约业务异常
 */
public class AppointException extends RuntimeException {

	public AppointException(String message) {
		super(message);
	}

	public AppointException(String message, Throwable cause) {
		super(message, cause);
	}

	

}

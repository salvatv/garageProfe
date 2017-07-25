package com.everis.alicante.courses.becajava.garage.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.everis.alicante.courses.becajava.garage.controller.ExceptionDAO;
import com.everis.alicante.courses.becajava.garage.controller.ExceptionDAOImpl;

public class GarajeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6474336936597609781L;

	public void gestionaExcepcion() throws GarajeException {

		System.out.println("Ha ocurrido una excepcion ; ");
		System.out.println("del tipo :" + super.getClass());
		System.out.println(" y con esta causa: " + super.getCause());

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		String text = "Error :" + super.getClass() + "causa : " + super.getCause() + "hora : "
				+ dateFormat.format(date);

		ExceptionDAO expDao = new ExceptionDAOImpl();
		expDao.createException(text);

	}

	public GarajeException(Exception e) {
		super.initCause(e);
	}

	public String getMessage() {
		return super.getMessage();
	}

	public Throwable getCause() {
		return super.getCause();
	}

}

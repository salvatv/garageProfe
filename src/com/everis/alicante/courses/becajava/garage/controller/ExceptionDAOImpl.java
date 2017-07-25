package com.everis.alicante.courses.becajava.garage.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import com.everis.alicante.courses.becajava.garage.domain.GarajeException;

public class ExceptionDAOImpl implements ExceptionDAO {

	@Override
	public void createException(String text) throws GarajeException {

		try {
			File file = new File("src/resources/Errores.txt");
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter buffer = new BufferedWriter(writer);

			buffer.newLine();

			buffer.write(text);

			buffer.close();
		} catch (Exception e) {

			GarajeException exp = new GarajeException(e);

			throw exp;

		}

	}

}

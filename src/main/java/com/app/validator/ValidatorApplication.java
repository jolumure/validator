package com.app.validator;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.validator.service.XmlValidatorService;

@SpringBootApplication
public class ValidatorApplication implements CommandLineRunner{
	private final Logger logger= LoggerFactory.getLogger(ValidatorApplication.class);

	@Autowired
	XmlValidatorService xmlValidatorService; 

	public static void main(String[] args) {
		SpringApplication.run(ValidatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		File input = new File(System.getProperty("user.dir") + File.separator + "data" + File.separator+"Sample.000000.00000.TA.124_Payload_bad.xml");
		File XSD = new File(System.getProperty("user.dir") + File.separator + "data" + File.separator+"FatcaXML_v2.0.xsd");
		logger.info(String.valueOf(xmlValidatorService.validate(input, XSD)));
		
		File input_2 = new File(System.getProperty("user.dir") + File.separator + "data" + File.separator+"Sample.000000.00000.TA.124_Payload_bad.xml");



	}

}

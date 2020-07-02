package com.pmalla;

import java.nio.charset.Charset;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;

import com.pmalla.model.Employee;
import com.pmalla.service.RabbitMQSender;

/**
 * @author pmalla
 *
 */
@SpringBootApplication
public class RabbitmqServer implements CommandLineRunner {

	@Autowired
	RabbitMQSender rabbitMQSender;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqServer.class, args);
	}

	@Override
	@Async
	public void run(String... args) throws Exception {
//		Thread.sleep(60000);
//		Random random = new Random(1000000);
//		for (int i = 0; i < 100000; i++) {
//			Employee company = new Employee();
//			company.setEmpId(random.nextInt() + "");
//			company.setEmpName(randomString(random));
//			rabbitMQSender.send(company);
//		}

	}

	private String randomString(Random random) {
		byte[] array = new byte[6]; // length is bounded by 7
		random.nextBytes(array);
		String generatedString = new String(array, Charset.forName("UTF-8"));

		return generatedString;
	}
}

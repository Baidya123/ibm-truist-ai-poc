package com.ibm.poc;

import com.ibm.poc.entity.Transaction;
import com.ibm.poc.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ibm.poc.repository")
public class PocApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDatabase(TransactionRepository transactionsRepository) {
		return args -> {
			transactionsRepository.deleteAll();
			for (int i = 0; i < 10; i++) {
				Transaction transaction = new Transaction();
				transaction.setTransactionId("txn-" + i);
				transaction.setStatus("pending");
				transactionsRepository.save(transaction);
			}

		};
	}

}

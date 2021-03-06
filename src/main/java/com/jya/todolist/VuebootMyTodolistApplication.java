package com.jya.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class VuebootMyTodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuebootMyTodolistApplication.class, args);
	}

}

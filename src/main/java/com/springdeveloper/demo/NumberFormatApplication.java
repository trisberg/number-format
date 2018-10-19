package com.springdeveloper.demo;

import java.util.Locale;
import java.util.function.Function;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NumberFormatApplication {

	private NumberFormat formatter = new RuleBasedNumberFormat(Locale.US, RuleBasedNumberFormat.SPELLOUT);

	@Bean
	public Function<String, String> formatNumber() {
		return s -> formatter.format(Long.parseLong(s));
	}

	public static void main(String[] args) {
		SpringApplication.run(NumberFormatApplication.class, args);
	}
}

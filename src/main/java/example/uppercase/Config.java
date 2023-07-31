package example.uppercase;

import java.util.function.Function;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class Config {

	@Bean
	public Function<String, String> echo() {
		return payload -> payload;
	}

	@Bean
	public Function<String, String> uppercase() {
		return payload -> payload.toUpperCase();
	}

	@Bean
	public Function<String, String> lowercase() {
		return payload -> payload.toLowerCase();
	}
}


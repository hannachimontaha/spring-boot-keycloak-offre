package configuration;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeyConfig {

	@Bean
	public KeycloakSpringBootConfigResolver springBootResolver(){
	return new KeycloakSpringBootConfigResolver();
	}

}

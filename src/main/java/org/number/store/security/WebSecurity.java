package org.number.store.security;

import org.number.store.services.NumberService;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFilter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	private final NumberService userDetailsService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	// constructeur de la class
	public WebSecurity(NumberService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userDetailsService = userDetailsService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// Cross-origin resource sharing activier cors pour communication avec  angular(ou autre)
		// Cross-Site Request Forgery (desactiver csrf j'ai pas des formulaire sur l'application)
		// authorizeRequests autorisé l'execution les requets HTTP(url save user(inscription) or url login , any person can access) (just sign up(/users))
		// permitAll autorisé tous les permissions poussible
		// anyRequest or post sign up have to authenticated (error 403 access denied)
		http // obj
				.cors().and()
				.csrf().disable()
				.authorizeRequests()
				.antMatchers("/numbers","/")
				.permitAll()
				.anyRequest()
				.authenticated();
	}

 

 
}
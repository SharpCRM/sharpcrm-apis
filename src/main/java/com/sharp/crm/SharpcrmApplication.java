package com.sharp.crm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SpringBootApplication
public class SharpcrmApplication {

    
	public static void main(String[] args) {
		SpringApplication.run(SharpcrmApplication.class, args);
		
	}

	@Component
	public static class CorsConfig implements Filter {

		private final Logger log = LoggerFactory.getLogger(CorsConfig.class);

		public CorsConfig() {
			log.info("SimpleCORSFilter init");
		}

		@Override
		public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

			HttpServletRequest request = (HttpServletRequest) req;
			HttpServletResponse response = (HttpServletResponse) res;

			response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
			response.setHeader("Access-Control-Allow-Credentials", "true");
			response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,PUT");
			response.setHeader("Access-Control-Max-Age", "3600");
			response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");

			chain.doFilter(req, res);
		}

		@Override
		public void init(FilterConfig filterConfig) {
		}

		@Override
		public void destroy() {
		}

	}
}

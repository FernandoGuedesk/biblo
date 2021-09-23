package br.dev.nando.biblo.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("br.dev.nando.biblo.api"))
		.build()
		.apiInfo(metaData());
	}
	
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
		.title("Biblo - API")
		.description("\"Api para os principais recursos do Biblo - Sistema para gereciamento de emprestimos de livros para bibliotecas\"")
		.version("1.0.0")
		.contact(new Contact("Fernando Guedes", "https://github.com/FernandoGuedesk", "nando3ryu@gmail.com"))
		.license("Apache License Version 2.0")
		.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
		.build();
	}
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("swagger-ui.html")
	.addResourceLocations("classpath:/META-INF/resources/");
	registry.addResourceHandler("/webjars/**")
	.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}

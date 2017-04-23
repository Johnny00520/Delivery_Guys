package net.eat.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.*;
import org.springframework.web.servlet.resource.VersionResourceResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.eat")
public class AppConfig extends WebMvcConfigurerAdapter 
{
	@Bean
	public ViewResolver viewResolver() 
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) 
	{
		configurer.enable();
	}

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("/images/");
        registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/");
        registry.addResourceHandler("/fonts/**").addResourceLocations("/WEB-INF/fonts/");
    }
}

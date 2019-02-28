package sto.spb.oauth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class Oauth2BasicResServerConf extends ResourceServerConfigurerAdapter  {
	
	//TODO :: Need to find the use of these parameters, why?? and what do they mean??
	private static final String RESOURCE_ID = "resource_id";
	
	//TODO :: What is the use of this line??
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(RESOURCE_ID).stateless(true);
	}
	
	//TODO :: Findout what this chain means
	@Override
	public void configure(HttpSecurity http) throws Exception {
        http.anonymous()
        .disable()
        .authorizeRequests()
        .antMatchers("/users/**").authenticated()
        .and()
        .exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}
	
}

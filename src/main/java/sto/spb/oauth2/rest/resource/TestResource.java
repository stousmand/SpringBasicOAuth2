package sto.spb.oauth2.rest.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class TestResource {

	@GetMapping("/user")
	public String getUser() {
		return "Foo OAuth2 Bar!!";
	}
}

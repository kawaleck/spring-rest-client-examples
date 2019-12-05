package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class User implements Serializable {
	private String gender;
	private String phone;
	private Name name;
	private Location location;
	private String language;
	private String currency;
	private Login login;
	private Job job;
	private String email;
	private Billing billing;
}

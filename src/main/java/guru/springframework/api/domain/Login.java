package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Login implements Serializable {
	private String sha1;
	private String password;
	private String sha256;
	private String username;
	private String md5;
}

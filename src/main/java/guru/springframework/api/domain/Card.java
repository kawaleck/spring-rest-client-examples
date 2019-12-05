package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Card implements Serializable {
	private String number;
	private String iban;
	private String type;
	private ExpirationDate expirationDate;
	private String swift;
}

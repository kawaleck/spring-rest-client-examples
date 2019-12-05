package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ExpirationDate implements Serializable {
	private String date;
	private String timezone;
	private int timezoneType;
}

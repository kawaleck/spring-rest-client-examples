package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Location implements Serializable {
	private String city;
	private String street;
	private String postcode;
	private String state;
}

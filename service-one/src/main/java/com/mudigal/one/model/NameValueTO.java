package com.mudigal.one.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @author Diego Marinho
 *
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NameValueTO {

	private String name;
	private String value;

}

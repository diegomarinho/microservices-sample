package com.mudigal.one.service;

import com.mudigal.one.domain.NameValue;

import reactor.core.publisher.Mono;

/**
 * 
 * @author Diego Marinho
 *
 */
public interface NameValueService {
	
	NameValue updateNameValue(NameValue value, boolean fromRabbit);

	Mono<NameValue> getNameValue();

	NameValue generateUUID();

}

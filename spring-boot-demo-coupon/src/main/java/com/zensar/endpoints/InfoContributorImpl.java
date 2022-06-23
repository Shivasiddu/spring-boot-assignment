package com.zensar.endpoints;

import org.springframework.boot.actuate.info.Info.Builder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class InfoContributorImpl implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		Map<String, Object> courseDetails = new HashMap<String, Object>();
		courseDetails.put("CreatedBy", "shiva");
		courseDetails.put("CreatedOn", "22june2022");
		builder.withDetail("Core java", courseDetails);

	}

}
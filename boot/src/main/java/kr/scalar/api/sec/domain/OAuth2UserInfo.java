package kr.scalar.api.sec.domain;

public interface OAuth2UserInfo {
	String getUsername();
	
	String getProviderId();

	String getProvider();

	String getEmail();

	String getAge();

	String getGender();
}

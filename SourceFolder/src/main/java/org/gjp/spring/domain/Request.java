package org.gjp.spring.domain;

public class Request {

	private String tokenEndPoint;
	private String authorizeEndPoint;
	private String userEndPoint;
	private String userName;
	private String password;
	private String clientName;
	private String clientSecret;
	private String grantType;
	private String scope;
	private String redirectUri;
	private String code;

	public String getTokenEndPoint() {
		return tokenEndPoint;
	}

	public void setTokenEndPoint(String tokenEndPoint) {
		this.tokenEndPoint = tokenEndPoint;
	}

	public String getAuthorizeEndPoint() {
		return authorizeEndPoint;
	}

	public void setAuthorizeEndPoint(String authorizeEndPoint) {
		this.authorizeEndPoint = authorizeEndPoint;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getUserEndPoint() {
		return userEndPoint;
	}

	public void setUserEndPoint(String userEndPoint) {
		this.userEndPoint = userEndPoint;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Request [tokenEndPoint=" + tokenEndPoint + ", authorizeEndPoint=" + authorizeEndPoint
				+ ", userEndPoint=" + userEndPoint + ", userName=" + userName + ", password=" + password
				+ ", clientName=" + clientName + ", clientSecret=" + clientSecret + ", grantType=" + grantType
				+ ", scope=" + scope + ", redirectUri=" + redirectUri + ", code=" + code + "]";
	}

}

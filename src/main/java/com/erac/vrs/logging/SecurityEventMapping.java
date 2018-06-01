package com.erac.vrs.logging;

public class SecurityEventMapping {

  private SecurityEventMapping() {
    throw new AssertionError("Suppress default constructor for noninstantiability");
  }

  //Authentication Activities
  public static final String FAILED_LOGIN = "1.1";
  public static final String SUCCESSFUL_LOGIN = "1.2";
  public static final String INVALID_EXPIRED_API_KEY = "1.3";
  public static final String INVALID_EXPIRED_AUTH_CREDENTIALS = "1.4";
  public static final String INVALID_EXPIRED_SESSION_TOKEN = "1.5";

  //todo: add rest of events from security mapping table that apply to our application
}

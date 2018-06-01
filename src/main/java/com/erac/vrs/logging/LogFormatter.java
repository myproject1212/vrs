package com.erac.vrs.logging;

import org.springframework.beans.factory.annotation.Value;

public class LogFormatter {
  @Value("${rs.application.name}")
  private static String appName;

  //TODO: add changes to follow ehi logging policy
}

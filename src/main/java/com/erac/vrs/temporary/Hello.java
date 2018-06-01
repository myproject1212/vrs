package com.erac.vrs.temporary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class Hello {
  private static final Logger LOG = LoggerFactory.getLogger(Hello.class);

  @ApiOperation("A test endpoint that returns Hello World.")
  @GetMapping("/hello")
  public String hello() {
    LOG.warn("Testing logging from test controller.");
    return "Hello World";
  }
}
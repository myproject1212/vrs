package com.erac.vrs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.erac.vrs.temporary.Hello;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UT_Application {
  @Autowired
  private Hello hello;

  @Test
  public void contextLoads()
      throws Exception {
    assertNotNull(hello);
  }
}
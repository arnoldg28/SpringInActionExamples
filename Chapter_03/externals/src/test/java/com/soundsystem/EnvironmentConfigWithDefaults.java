package com.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfigWithDefaults {

  @Autowired
  Environment env;
  
  @Bean
  public BlankDisc blankDisc() {

    BlankDisc blankDisc = new BlankDisc(
        env.getProperty("disc.title", "Rattle and Hum"),
        env.getProperty("disc.artist", "U2"));

    //Modified this sample a little bit to show auto conversion sample with default
    blankDisc.setMyInteger(env.getProperty("disc.myInteger", Integer.class, 30));

    return blankDisc;
  }
  
}

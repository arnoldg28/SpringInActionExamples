package com.soundsystem;


public class BlankDisc {

  private final String title;
  private final String artist;
  private Integer myInteger;

  public BlankDisc(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getArtist() {
    return artist;
  }

  public Integer getMyInteger() {
    return myInteger;
  }

  public void setMyInteger(Integer myInteger) {
    this.myInteger = myInteger;
  }
}

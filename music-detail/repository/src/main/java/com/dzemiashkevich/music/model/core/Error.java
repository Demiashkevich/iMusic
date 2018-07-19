package com.dzemiashkevich.music.model.core;

public class Error {

  private String about;
  private String status;
  private String code;
  private String title;
  private String detail;
  private SourceObject sourceObject;
  private Object meta;

  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public SourceObject getSourceObject() {
    return sourceObject;
  }

  public void setSourceObject(SourceObject sourceObject) {
    this.sourceObject = sourceObject;
  }

  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

}

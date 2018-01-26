package com.music.entity.core;

import com.music.entity.resource.Attribute;
import com.music.entity.resource.Relationship;

public class Resource {

  private String type;
  private String href;
  private Attribute attribute;
  private Relationship relationship;
  private Object meta;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Attribute getAttribute() {
    return attribute;
  }

  public void setAttribute(Attribute attribute) {
    this.attribute = attribute;
  }

  public Relationship getRelationship() {
    return relationship;
  }

  public void setRelationship(Relationship relationship) {
    this.relationship = relationship;
  }

  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

}

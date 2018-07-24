package com.dzemiashkevich.music.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class Key<K extends Serializable> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private K id;

  public K getId() {
    return id;
  }

  public void setId(K id) {
    this.id = id;
  }

}

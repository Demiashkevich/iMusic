package com.music.entity.resource;

import com.music.entity.core.Resource;

import java.util.HashSet;
import java.util.Set;

public class Relationship {

  private Set<Resource> contents = new HashSet<>();
  private Set<Recommendation> recommendations = new HashSet<>();

  public Set<Resource> getContents() {
    return contents;
  }

  public void setContents(Set<Resource> contents) {
    this.contents = contents;
  }

  public Set<Recommendation> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(Set<Recommendation> recommendations) {
    this.recommendations = recommendations;
  }

}

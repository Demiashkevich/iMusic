package com.music.entity.resource;

import java.util.HashSet;
import java.util.Set;

public class Attribute {

  private Boolean isGroupRecommendation;
  private String title;
  private Set<String> resourcesType = new HashSet<>();
  private String nextUpdateDate;

  public Boolean getGroupRecommendation() {
    return isGroupRecommendation;
  }

  public void setGroupRecommendation(Boolean groupRecommendation) {
    isGroupRecommendation = groupRecommendation;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Set<String> getResourcesType() {
    return resourcesType;
  }

  public void setResourcesType(Set<String> resourcesType) {
    this.resourcesType = resourcesType;
  }

  public String getNextUpdateDate() {
    return nextUpdateDate;
  }

  public void setNextUpdateDate(String nextUpdateDate) {
    this.nextUpdateDate = nextUpdateDate;
  }

}

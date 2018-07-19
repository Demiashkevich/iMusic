package com.music.entity.resource;

import com.music.entity.Key;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "playlist_types")
public class PlaylistType extends Key<Long> {

  @Column(name = "name")
  private String name;

  //Relations One-To-Many

  @OneToMany(mappedBy = "playlistType")
  private Set<Playlist> playlist = new HashSet<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Playlist> getPlaylist() {
    return playlist;
  }

  public void setPlaylist(Set<Playlist> playlist) {
    this.playlist = playlist;
  }

  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

}

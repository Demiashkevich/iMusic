package com.music.entity.resource;

import com.music.entity.Key;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

}

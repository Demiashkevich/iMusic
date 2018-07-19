package com.dzemiashkevich.music.model.resource;

import com.dzemiashkevich.music.model.Key;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "play_parameters")
public class PlayParameter extends Key<Long> {

  @Column(name = "kind")
  private String kind;

  //Relations One-To-Many

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "playParameter")
  private Set<Album> albums = new HashSet<>();

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "playParameter")
  private Set<Song> songs = new HashSet<>();

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "playParameter")
  private Set<Playlist> playlists = new HashSet<>();

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Set<Album> getAlbums() {
    return albums;
  }

  public void setAlbums(Set<Album> albums) {
    this.albums = albums;
  }

  public Set<Song> getSongs() {
    return songs;
  }

  public void setSongs(Set<Song> songs) {
    this.songs = songs;
  }

  public Set<Playlist> getPlaylists() {
    return playlists;
  }

  public void setPlaylists(Set<Playlist> playlists) {
    this.playlists = playlists;
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

package com.music.entity.resource;

import com.music.entity.Key;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genres")
public class Genre extends Key<Long> {

  @Column(name = "name")
  private String name;

  //Relation Many-To-Many

  @ManyToMany(mappedBy = "genres", cascade = CascadeType.ALL)
  private Set<Album> albums = new HashSet<>();

  @ManyToMany(mappedBy = "genres", cascade = CascadeType.ALL)
  private Set<Artist> artists = new HashSet<>();

  @ManyToMany(mappedBy = "genres", cascade = CascadeType.ALL)
  private Set<Song> songs = new HashSet<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Album> getAlbums() {
    return albums;
  }

  public void setAlbums(Set<Album> albums) {
    this.albums = albums;
  }

  public Set<Artist> getArtists() {
    return artists;
  }

  public void setArtists(Set<Artist> artists) {
    this.artists = artists;
  }

  public Set<Song> getSongs() {
    return songs;
  }

  public void setSongs(Set<Song> songs) {
    this.songs = songs;
  }

}

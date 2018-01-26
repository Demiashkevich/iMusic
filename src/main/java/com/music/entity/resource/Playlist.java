package com.music.entity.resource;

import com.music.entity.Key;
import com.music.entity.core.Resource;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "playlists")
public class Playlist extends Key<Long> {

  @Column(name = "curator_name")
  private String curatorName;

  @Column(name = "last_modified_date")
  private LocalDate lastModifiedDate;

  @Column(name = "name")
  private String name;

  @Column(name = "url")
  private String url;

  //Relations One-To-One

  @OneToOne(mappedBy = "playlist", orphanRemoval = true)
  private Artwork artwork;

  @OneToOne(mappedBy = "playlist", orphanRemoval = true)
  private EditorialNote editorialNote;

  @ManyToOne
  private PlaylistType playlistType;

  @OneToOne(mappedBy = "playlist")
  private PlayParameter playParameter;

  //Relation Many-To-Many

  @ManyToMany(mappedBy = "playlists", cascade = CascadeType.ALL)
  private Set<Curator> curators = new HashSet<>();

  //TODO
  @ManyToMany(mappedBy = "playlists", cascade = CascadeType.ALL)
  private Set<Resource> tracks = new HashSet<>();

  @ManyToMany(mappedBy = "playlists", cascade = CascadeType.ALL)
  private Set<Artist> artists = new HashSet<>();

  public Artwork getArtwork() {
    return artwork;
  }

  public void setArtwork(Artwork artwork) {
    this.artwork = artwork;
  }

  public String getCuratorName() {
    return curatorName;
  }

  public void setCuratorName(String curatorName) {
    this.curatorName = curatorName;
  }

  public EditorialNote getEditorialNote() {
    return editorialNote;
  }

  public void setEditorialNote(EditorialNote editorialNote) {
    this.editorialNote = editorialNote;
  }

  public LocalDate getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(LocalDate lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlaylistType getPlayListType() {
    return playlistType;
  }

  public void setPlayListType(PlaylistType playListType) {
    this.playlistType = playListType;
  }

  public PlayParameter getPlayParameter() {
    return playParameter;
  }

  public void setPlayParameter(PlayParameter playParameter) {
    this.playParameter = playParameter;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Set<Curator> getCurators() {
    return curators;
  }

  public void setCurators(Set<Curator> curators) {
    this.curators = curators;
  }

  public Set<Resource> getTracks() {
    return tracks;
  }

  public void setTracks(Set<Resource> tracks) {
    this.tracks = tracks;
  }

  public PlaylistType getPlaylistType() {
    return playlistType;
  }

  public void setPlaylistType(PlaylistType playlistType) {
    this.playlistType = playlistType;
  }

  public Set<Artist> getArtists() {
    return artists;
  }

  public void setArtists(Set<Artist> artists) {
    this.artists = artists;
  }

}

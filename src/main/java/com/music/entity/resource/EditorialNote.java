package com.music.entity.resource;

import com.music.entity.Key;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "editorial_notes")
public class EditorialNote extends Key<Long> {

  @Column(name = "standard")
  private String standard;

  @Column(name = "brief")
  private String brief;

  //Relations One-To-One

  @OneToOne
  @MapsId
  private Song song;

  @OneToOne
  @MapsId
  private Album album;

  @OneToOne
  @MapsId
  private Artist artist;

  @OneToOne
  @MapsId
  private Curator curator;

  @OneToOne
  @MapsId
  private Playlist playlist;

  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public String getBrief() {
    return brief;
  }

  public void setBrief(String brief) {
    this.brief = brief;
  }

  public Song getSong() {
    return song;
  }

  public void setSong(Song song) {
    this.song = song;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }

  public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    this.artist = artist;
  }

  public Curator getCurator() {
    return curator;
  }

  public void setCurator(Curator curator) {
    this.curator = curator;
  }

  public Playlist getPlaylist() {
    return playlist;
  }

  public void setPlaylist(Playlist playlist) {
    this.playlist = playlist;
  }

}

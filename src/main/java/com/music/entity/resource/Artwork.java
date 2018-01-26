package com.music.entity.resource;

import com.music.entity.Key;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "artworks")
public class Artwork extends Key<Long> {

  @Column(name = "width")
  private Integer width;

  @Column(name = "height")
  private Integer height;

  @Column(name = "url")
  private String url;

  @Column(name = "bgColor")
  private String bgColor;

  @Column(name = "textColor1")
  private String textColor1;

  @Column(name = "textColor2")
  private String textColor2;

  @Column(name = "textColor3")
  private String textColor3;

  @Column(name = "textColor4")
  private String textColor4;

  //Relations One-To-One

  @OneToOne
  @MapsId
  private Artist artist;

  @OneToOne
  @MapsId
  private Curator curator;

  @OneToOne
  @MapsId
  private Song song;

  @OneToOne
  @MapsId
  private Album album;

  @OneToOne
  @MapsId
  private Playlist playlist;

  public Integer getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getBgColor() {
    return bgColor;
  }

  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }

  public String getTextColor1() {
    return textColor1;
  }

  public void setTextColor1(String textColor1) {
    this.textColor1 = textColor1;
  }

  public String getTextColor2() {
    return textColor2;
  }

  public void setTextColor2(String textColor2) {
    this.textColor2 = textColor2;
  }

  public String getTextColor3() {
    return textColor3;
  }

  public void setTextColor3(String textColor3) {
    this.textColor3 = textColor3;
  }

  public String getTextColor4() {
    return textColor4;
  }

  public void setTextColor4(String textColor4) {
    this.textColor4 = textColor4;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public void setHeight(Integer height) {
    this.height = height;
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

  public Song getSong() {
    return song;
  }

  public void setSong(Song song) {
    this.song = song;
  }

  public Playlist getPlaylist() {
    return playlist;
  }

  public void setPlaylist(Playlist playlist) {
    this.playlist = playlist;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }

}
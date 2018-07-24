package com.dzemiashkevich.music.model.resource;

import com.dzemiashkevich.music.model.Key;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "artists")
public class Artist extends Key<Long> {

  @Column(name = "name")
  private String name;

  @Column(name = "url")
  private String url;

  //Relations One-To-One

  @OneToOne(mappedBy = "artist", orphanRemoval = true)
  private EditorialNote editorialNote;

  @OneToOne(mappedBy = "artist", orphanRemoval = true)
  private Artwork artwork;

  //Relations Many-To-Many

  @ManyToMany(cascade = CascadeType.ALL, mappedBy = "artists")
  private Set<Album> albums = new HashSet<>();

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "artist_genre",
      joinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id")
  )
  private Set<Genre> genres = new HashSet<>();

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "artist_playlist",
      joinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "playlist_id", referencedColumnName = "id")
  )
  private Set<Playlist> playlists = new HashSet<>();

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(
          name = "artist_song",
          joinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "song_id", referencedColumnName = "id")
  )
  private Set<Song> songs = new HashSet<>();

  public Set<Genre> getGenres() {
    return genres;
  }

  public void setGenres(Set<Genre> genres) {
    this.genres = genres;
  }

  public EditorialNote getEditorialNote() {
    return editorialNote;
  }

  public void setEditorialNote(EditorialNote editorialNote) {
    this.editorialNote = editorialNote;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Set<Album> getAlbums() {
    return albums;
  }

  public void setAlbums(Set<Album> albums) {
    this.albums = albums;
  }

  public Set<Playlist> getPlaylists() {
    return playlists;
  }

  public void setPlaylists(Set<Playlist> playlists) {
    this.playlists = playlists;
  }

  public Set<Song> getSongs() {
    return songs;
  }

  public void setSongs(Set<Song> songs) {
    this.songs = songs;
  }

  public Artwork getArtwork() {
    return artwork;
  }

  public void setArtwork(Artwork artwork) {
    this.artwork = artwork;
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

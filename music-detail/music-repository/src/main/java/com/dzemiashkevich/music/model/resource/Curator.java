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
@Table(name = "curators")
public class Curator extends Key<Long> {

  @Column(name = "name")
  private String name;

  @Column(name = "url")
  private String url;

  //Relations One-To-One

  @OneToOne(mappedBy = "curator", orphanRemoval = true)
  private Artwork artwork;

  @OneToOne(mappedBy = "curator", orphanRemoval = true)
  private EditorialNote editorialNote;

  //Relations Many-To-Many

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "curator_playlist",
      joinColumns = @JoinColumn(name = "curator_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "playlist_id", referencedColumnName = "id")
  )
  private Set<Playlist> playlists = new HashSet<>();

  public Artwork getArtwork() {
    return artwork;
  }

  public void setArtwork(Artwork artwork) {
    this.artwork = artwork;
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

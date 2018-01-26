package com.music.entity.resource;

import com.music.entity.Key;
import com.music.entity.core.Resource;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "albums")
public class Album extends Key<Long> {

    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "content_rating")
    private String contentRating;

    @Column(name = "copyright")
    private String copyright;

    @Column(name = "is_complete")
    private Boolean isComplete;

    @Column(name = "is_single")
    private Boolean isSingle;

    @Column(name = "name")
    private String name;

    @Column(name =  "record_label")
    private String recordLabel;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "track_count")
    private Integer trackCount;

    @Column(name = "url")
    private String url;

    //Relations One-To-One

    @OneToOne(mappedBy = "album", orphanRemoval = true)
    private EditorialNote editorialNote;

    @OneToOne(mappedBy = "album", orphanRemoval = true)
    private Artwork artwork;

    //Relations One-To-Many

    @ManyToOne
    private PlayParameter playParameter;

    //Relation Many-To-Many

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "album_genre",
        joinColumns = @JoinColumn(name = "album_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id")
    )
    private Set<Genre> genres = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "album_artist",
        joinColumns = @JoinColumn(name = "album_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id")
    )
    private Set<Artist> artists = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "album_song",
        joinColumns = @JoinColumn(name = "album_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "song_id", referencedColumnName = "id")
    )
    private Set<Song> songs = new HashSet<>();

    //TODO Relation with table Resource
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "album_resource",
        joinColumns = @JoinColumn(name = "album_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "resource_id", referencedColumnName = "id")
    )
    private Set<Resource> tracks = new HashSet<>();

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Artwork getArtwork() {
        return artwork;
    }

    public void setArtwork(Artwork artwork) {
        this.artwork = artwork;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public EditorialNote getEditorialNote() {
        return editorialNote;
    }

    public void setEditorialNote(EditorialNote editorialNote) {
        this.editorialNote = editorialNote;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    public Boolean getSingle() {
        return isSingle;
    }

    public void setSingle(Boolean single) {
        isSingle = single;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public PlayParameter getPlayParameter() {
        return playParameter;
    }

    public void setPlayParameter(PlayParameter playParameter) {
        this.playParameter = playParameter;
    }

    public Integer getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Set<Resource> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Resource> tracks) {
        this.tracks = tracks;
    }

}

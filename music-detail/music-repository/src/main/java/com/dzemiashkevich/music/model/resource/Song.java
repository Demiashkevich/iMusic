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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "songs")
public class Song extends Key<Long> {

    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "composer_name")
    private String composerName;

    @Column(name = "content_rating")
    private String contentRating;

    @Column(name = "disc_number")
    private Integer discNumber;

    @Column(name = "duration_in_millis")
    private Long durationInMillis;

    @Column(name = "isrc")
    private String isrc;

    @Column(name = "movement_count")
    private Integer movementCount;

    @Column(name = "movement_number")
    private Integer movementNumber;

    @Column(name = "movement_name")
    private String movementName;

    @Column(name = "name")
    private String name;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "track_number")
    private Integer trackNumber;

    @Column(name = "url")
    private String url;

    @Column(name = "work_name")
    private String workName;

    //Relations One-To-One

    @OneToOne(mappedBy = "song", cascade = CascadeType.ALL)
    private Artwork artwork;

    @OneToOne(mappedBy = "song", cascade = CascadeType.ALL)
    private EditorialNote editorialNote;

    //Relations One-To-Many

    @ManyToOne
    private PlayParameter playParameter;

    //Relations Many-To-Many

    @ManyToMany(mappedBy = "songs", cascade = CascadeType.ALL)
    private Set<Album> albums = new HashSet<>();

    @ManyToMany(mappedBy = "songs", cascade = CascadeType.ALL)
    private Set<Artist> artists = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "song_genre",
            joinColumns = @JoinColumn(name = "song_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id")
    )
    private Set<Genre> genres = new HashSet<>();

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

    public String getComposerName() {
        return composerName;
    }

    public void setComposerName(String composerName) {
        this.composerName = composerName;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public Integer getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Long getDurationInMillis() {
        return durationInMillis;
    }

    public void setDurationInMillis(Long durationInMillis) {
        this.durationInMillis = durationInMillis;
    }

    public EditorialNote getEditorialNote() {
        return editorialNote;
    }

    public void setEditorialNote(EditorialNote editorialNote) {
        this.editorialNote = editorialNote;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public Integer getMovementCount() {
        return movementCount;
    }

    public void setMovementCount(Integer movementCount) {
        this.movementCount = movementCount;
    }

    public Integer getMovementNumber() {
        return movementNumber;
    }

    public void setMovementNumber(Integer movementNumber) {
        this.movementNumber = movementNumber;
    }

    public String getMovementName() {
        return movementName;
    }

    public void setMovementName(String movementName) {
        this.movementName = movementName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayParameter getPlayParameter() {
        return playParameter;
    }

    public void setPlayParameter(PlayParameter playParameter) {
        this.playParameter = playParameter;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
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

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
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

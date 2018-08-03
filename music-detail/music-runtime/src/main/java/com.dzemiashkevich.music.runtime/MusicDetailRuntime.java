package com.dzemiashkevich.music.runtime;

import com.dzemiashkevich.exception.handler.MvcExceptionHandler;
import com.dzemiashkevich.music.AlbumService;
import com.dzemiashkevich.music.ArtistService;
import com.dzemiashkevich.music.ArtworkService;
import com.dzemiashkevich.music.EditorialNoteService;
import com.dzemiashkevich.music.SongService;
import com.dzemiashkevich.music.endpoint.AlbumController;
import com.dzemiashkevich.music.endpoint.ArtistController;
import com.dzemiashkevich.music.endpoint.ArtworkController;
import com.dzemiashkevich.music.endpoint.EditorialNoteController;
import com.dzemiashkevich.music.endpoint.SongController;
import com.dzemiashkevich.music.model.resource.Album;
import com.dzemiashkevich.music.model.resource.Artist;
import com.dzemiashkevich.music.model.resource.Artwork;
import com.dzemiashkevich.music.model.resource.EditorialNote;
import com.dzemiashkevich.music.model.resource.Song;
import com.dzemiashkevich.music.repository.AlbumRepository;
import com.dzemiashkevich.music.repository.ArtistRepository;
import com.dzemiashkevich.music.repository.ArtworkRepository;
import com.dzemiashkevich.music.repository.EditorialNoteRepository;
import com.dzemiashkevich.music.repository.SongRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackageClasses = {
        AlbumController.class,
        ArtistController.class,
        ArtworkController.class,
        EditorialNoteController.class,
        SongController.class,
        ArtworkService.class,
        AlbumService.class,
        ArtistService.class,
        EditorialNoteService.class,
        SongService.class,
        MvcExceptionHandler.class
})
@EnableJpaRepositories(basePackageClasses = {
        AlbumRepository.class,
        ArtistRepository.class,
        ArtworkRepository.class,
        EditorialNoteRepository.class,
        SongRepository.class
})
@EntityScan(basePackageClasses = {
        Album.class,
        Artist.class,
        Artwork.class,
        EditorialNote.class,
        Song.class
})
public class MusicDetailRuntime {

    public static void main(String[] args) {
        SpringApplication.run(MusicDetailRuntime.class, args);
    }

}

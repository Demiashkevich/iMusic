package com.dzemiashkevich.music.runtime;

import com.dzemiashkevich.music.AlbumService;
import com.dzemiashkevich.music.model.resource.Album;
import com.dzemiashkevich.music.repository.AlbumRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackageClasses = {
        AlbumService.class
})
@EnableJpaRepositories(basePackageClasses = {
        AlbumRepository.class
})
@EntityScan(basePackageClasses = {
        Album.class
})
public class MusicDetailRuntime {

    public static void main(String[] args) {
        SpringApplication.run(MusicDetailRuntime.class, args);
    }

}

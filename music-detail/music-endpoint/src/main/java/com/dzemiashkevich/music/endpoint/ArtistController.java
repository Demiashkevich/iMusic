package com.dzemiashkevich.music.endpoint;

import com.dzemiashkevich.music.ArtistService;
import com.dzemiashkevich.music.dto.ArtistRestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping("/artists")
    public ResponseEntity<Set<ArtistRestDto>> readArtist() {
        return artistService.find()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping("/artists/{id}")
    public ResponseEntity<ArtistRestDto> readArtistById(@PathVariable Long id) {
        return artistService.find(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping("/artists")
    public ResponseEntity<ArtistRestDto> createArtist(@RequestBody ArtistRestDto artistDto) {
        return artistService.save(artistDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PutMapping("/artists")
    public ResponseEntity<ArtistRestDto> updateArtist(@RequestBody ArtistRestDto artistDto) {
        return artistService.update(artistDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

}

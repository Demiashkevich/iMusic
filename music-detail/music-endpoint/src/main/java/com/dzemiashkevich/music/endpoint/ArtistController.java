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
        return ResponseEntity.ok(artistService.find());
    }

    @GetMapping("/artists/{id}")
    public ResponseEntity<ArtistRestDto> readArtistById(@PathVariable Long id) {
        return ResponseEntity.ok(artistService.find(id));
    }

    @PostMapping("/artists")
    public ResponseEntity<ArtistRestDto> createArtist(@RequestBody ArtistRestDto artistDto) {
        return ResponseEntity.ok(artistService.save(artistDto));
    }

    @PutMapping("/artists")
    public ResponseEntity<ArtistRestDto> updateArtist(@RequestBody ArtistRestDto artistDto) {
        return ResponseEntity.ok(artistService.update(artistDto));
    }

}

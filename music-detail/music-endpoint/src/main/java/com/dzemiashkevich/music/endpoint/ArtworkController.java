package com.dzemiashkevich.music.endpoint;

import com.dzemiashkevich.music.ArtworkService;
import com.dzemiashkevich.music.dto.ArtworkRestDto;
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
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

    @GetMapping("/artworks")
    public ResponseEntity<Set<ArtworkRestDto>> readArtwork() {
        return ResponseEntity.ok(artworkService.find());
    }

    @GetMapping("/artworks/{id}")
    public ResponseEntity<ArtworkRestDto> readArtworkById(@PathVariable Long id) {
        return ResponseEntity.ok(artworkService.find(id));
    }

    @PostMapping("/artworks")
    public ResponseEntity<ArtworkRestDto> createArtwork(@RequestBody ArtworkRestDto artworkDto) {
        return ResponseEntity.ok(artworkService.save(artworkDto));
    }

    @PutMapping("/artworks")
    public ResponseEntity<ArtworkRestDto> updateArtwork(@RequestBody ArtworkRestDto artworkDto) {
        return ResponseEntity.ok(artworkService.update(artworkDto));
    }

}

package com.dzemiashkevich.music.endpoint;

import com.dzemiashkevich.music.SongService;
import com.dzemiashkevich.music.dto.SongRestDto;
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
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/songs")
    public ResponseEntity<Set<SongRestDto>> readSong() {
        return ResponseEntity.ok(songService.find());
    }

    @GetMapping("/songs/{id}")
    public ResponseEntity<SongRestDto> readSongById(@PathVariable Long id) {
        return ResponseEntity.ok(songService.find(id));
    }

    @PostMapping("/songs")
    public ResponseEntity<SongRestDto> createSong(@RequestBody SongRestDto albumDto) {
        return ResponseEntity.ok(songService.save(albumDto));
    }

    @PutMapping("/songs")
    public ResponseEntity<SongRestDto> updateSong(@RequestBody SongRestDto albumDto) {
        return ResponseEntity.ok(songService.update(albumDto));
    }

}

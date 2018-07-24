package com.dzemiashkevich.music.endpoint;

import com.dzemiashkevich.music.AlbumService;
import com.dzemiashkevich.music.SongService;
import com.dzemiashkevich.music.dto.AlbumRestDto;
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
        return songService.find()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping("/songs/{id}")
    public ResponseEntity<SongRestDto> readSongById(@PathVariable Long id) {
        return songService.find(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping("/songs")
    public ResponseEntity<SongRestDto> createSong(@RequestBody SongRestDto albumDto) {
        return songService.save(albumDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PutMapping("/songs")
    public ResponseEntity<SongRestDto> updateSong(@RequestBody SongRestDto albumDto) {
        return songService.update(albumDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

}

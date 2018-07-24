package com.dzemiashkevich.music.endpoint;

import com.dzemiashkevich.music.AlbumService;
import com.dzemiashkevich.music.dto.AlbumRestDto;
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
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/albums")
    public ResponseEntity<Set<AlbumRestDto>> readAlbum() {
        return albumService.find()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping("/albums/{id}")
    public ResponseEntity<AlbumRestDto> readAlbumById(@PathVariable Long id) {
        return albumService.find(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping("/albums")
    public ResponseEntity<AlbumRestDto> createAlbum(@RequestBody AlbumRestDto albumDto) {
        return albumService.save(albumDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PutMapping("/albums")
    public ResponseEntity<AlbumRestDto> updateAlbum(@RequestBody AlbumRestDto albumDto) {
        return albumService.update(albumDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

}

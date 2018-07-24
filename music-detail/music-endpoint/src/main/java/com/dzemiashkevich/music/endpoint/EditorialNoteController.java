package com.dzemiashkevich.music.endpoint;

import com.dzemiashkevich.music.EditorialNoteService;
import com.dzemiashkevich.music.dto.EditorialNoteRestDto;
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
public class EditorialNoteController {

    @Autowired
    private EditorialNoteService editorialNoteService;

    @GetMapping("/editorialNotes")
    public ResponseEntity<Set<EditorialNoteRestDto>> readEditorialNote() {
        return editorialNoteService.find()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @GetMapping("/editorialNotes/{id}")
    public ResponseEntity<EditorialNoteRestDto> readEditorialNoteById(@PathVariable Long id) {
        return editorialNoteService.find(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping("/editorialNotes")
    public ResponseEntity<EditorialNoteRestDto> createEditorialNote(@RequestBody EditorialNoteRestDto editorialNoteDto) {
        return editorialNoteService.save(editorialNoteDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PutMapping("/editorialNotes")
    public ResponseEntity<EditorialNoteRestDto> updateEditorialNote(@RequestBody EditorialNoteRestDto editorialNoteDto) {
        return editorialNoteService.update(editorialNoteDto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

}

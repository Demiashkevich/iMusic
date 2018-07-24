package com.dzemiashkevich.music.repository;

import com.dzemiashkevich.music.model.resource.EditorialNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialNoteRepository extends JpaRepository<EditorialNote, Long> {
}

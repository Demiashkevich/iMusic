package com.dzemiashkevich.music.repository;

import com.dzemiashkevich.music.model.resource.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
}

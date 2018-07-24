package com.dzemiashkevich.music.repository;

import com.dzemiashkevich.music.model.resource.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}

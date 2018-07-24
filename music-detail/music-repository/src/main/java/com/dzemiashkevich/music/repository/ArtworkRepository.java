package com.dzemiashkevich.music.repository;

import com.dzemiashkevich.music.model.resource.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtworkRepository extends JpaRepository<Artwork, Long> {
}

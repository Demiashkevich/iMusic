package com.dzemiashkevich.music.repository;

import com.dzemiashkevich.music.model.resource.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}

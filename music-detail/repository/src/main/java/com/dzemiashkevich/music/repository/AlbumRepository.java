package com.dzemiashkevich.music.repository;

import com.dzemiashkevich.music.model.resource.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {
}

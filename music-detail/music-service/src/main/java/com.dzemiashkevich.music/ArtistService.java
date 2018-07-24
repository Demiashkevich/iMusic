package com.dzemiashkevich.music;

import com.dzemiashkevich.music.dto.ArtistRestDto;
import com.dzemiashkevich.music.model.resource.Artist;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends CrudService<ArtistRestDto, Artist, Long> {
}

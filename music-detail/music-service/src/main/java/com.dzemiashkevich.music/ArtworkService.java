package com.dzemiashkevich.music;

import com.dzemiashkevich.music.dto.ArtworkRestDto;
import com.dzemiashkevich.music.model.resource.Artwork;
import org.springframework.stereotype.Service;

@Service
public class ArtworkService extends CrudService<ArtworkRestDto, Artwork, Long> {
}

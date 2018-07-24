package com.dzemiashkevich.music.mapping;

import com.dzemiashkevich.music.dto.ArtworkRestDto;
import com.dzemiashkevich.music.model.resource.Artwork;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ArtworkMapper extends Mapper<ArtworkRestDto, Artwork> {
}

package com.dzemiashkevich.music.mapping;

import com.dzemiashkevich.music.dto.ArtistRestDto;
import com.dzemiashkevich.music.model.resource.Artist;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ArtistMapper extends Mapper<ArtistRestDto, Artist> {
}

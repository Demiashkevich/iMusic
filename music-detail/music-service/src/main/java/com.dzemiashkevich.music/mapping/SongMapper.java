package com.dzemiashkevich.music.mapping;

import com.dzemiashkevich.music.dto.SongRestDto;
import com.dzemiashkevich.music.model.resource.Song;

@org.mapstruct.Mapper(componentModel = "spring")
public interface SongMapper extends Mapper<SongRestDto, Song> {
}

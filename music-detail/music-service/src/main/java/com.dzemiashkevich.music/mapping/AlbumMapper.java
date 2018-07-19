package com.dzemiashkevich.music.mapping;

import com.dzemiashkevich.music.dto.AlbumRestDto;
import com.dzemiashkevich.music.model.resource.Album;

@org.mapstruct.Mapper
public interface AlbumMapper extends Mapper<AlbumRestDto, Album> {
}

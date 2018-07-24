package com.dzemiashkevich.music;

import com.dzemiashkevich.music.dto.AlbumRestDto;
import com.dzemiashkevich.music.model.resource.Album;
import org.springframework.stereotype.Service;

@Service
public class AlbumService extends CrudService<AlbumRestDto, Album, Long> {

}

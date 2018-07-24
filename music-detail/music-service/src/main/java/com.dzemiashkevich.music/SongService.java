package com.dzemiashkevich.music;

import com.dzemiashkevich.music.dto.SongRestDto;
import com.dzemiashkevich.music.model.resource.Song;
import org.springframework.stereotype.Service;

@Service
public class SongService extends CrudService<SongRestDto, Song, Long> {
}

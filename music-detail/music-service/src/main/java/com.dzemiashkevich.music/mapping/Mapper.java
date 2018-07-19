package com.dzemiashkevich.music.mapping;

import com.dzemiashkevich.music.model.Key;

public interface Mapper<Dto, Model extends Key> {

    Dto modelToDto(Model model);
    Model dtoToModel(Dto dto);

}

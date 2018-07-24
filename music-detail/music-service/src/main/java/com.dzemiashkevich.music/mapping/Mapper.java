package com.dzemiashkevich.music.mapping;

import com.dzemiashkevich.music.model.Key;

import java.util.List;

public interface Mapper<D, M extends Key> {

    D modelToDto(M model);
    List<D> modelToDto(List<M> model);
    M dtoToModel(D dto);
    List<M> dtoToModel(List<D> dto);

}

package com.dzemiashkevich.music;

import com.dzemiashkevich.exception.handler.ApplicationException;
import com.dzemiashkevich.music.dto.KeyRestDto;
import com.dzemiashkevich.music.mapping.Mapper;
import com.dzemiashkevich.music.model.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.dzemiashkevich.exception.handler.ApplicationErrorStatus.ENTITY_NOT_FOUND;
import static com.dzemiashkevich.exception.handler.ApplicationErrorStatus.ENTITY_NOT_SAVED;

public class CrudService<D extends KeyRestDto, M extends Key, K extends Number> {

    private static final String ENTITY = "Entity";

    @Autowired
    private JpaRepository<M, K> repository;

    @Autowired
    private Mapper<D, M> mapper;

    public Set<D> find() {
        List<M> multipleModel = repository.findAll();
        List<D> multipleDto = mapper.modelToDto(multipleModel);
        if (!CollectionUtils.isEmpty(multipleDto)) {
            return new HashSet<>(multipleDto);
        }
        return Collections.emptySet();
    }

    public D find(K id) {
        Optional<M> model = repository.findById(id);
        return model.map(m -> mapper.modelToDto(m))
                    .orElseThrow(() -> new ApplicationException(ENTITY_NOT_FOUND, ENTITY, id));
    }

    public D save(D dto) {
        M model = mapper.dtoToModel(dto);
        model = repository.save(model);
        if (ObjectUtils.isEmpty(model)) {
            throw new ApplicationException(ENTITY_NOT_SAVED, ENTITY, dto.getId());
        }
        dto = mapper.modelToDto(model);
        return dto;
    }

    public D update(D dto) {
        return save(dto);
    }

}

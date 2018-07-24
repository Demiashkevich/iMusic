package com.dzemiashkevich.music;

import com.dzemiashkevich.music.dto.KeyRestDto;
import com.dzemiashkevich.music.mapping.Mapper;
import com.dzemiashkevich.music.model.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class CrudService<D extends KeyRestDto, M extends Key, K extends Number> {

    @Autowired
    private JpaRepository<M, K> repository;

    @Autowired
    private Mapper<D, M> mapper;

    public Optional<Set<D>> find() {
        List<M> multipleModel = repository.findAll();
        List<D> multipleDto = mapper.modelToDto(multipleModel);
        if (!CollectionUtils.isEmpty(multipleDto)) {
            return Optional.of(new HashSet<>(multipleDto));
        }
        return Optional.empty();
    }

    public Optional<D> find(K id) {
        Optional<M> model = repository.findById(id);
        if (model.isPresent()) {
            D dto = mapper.modelToDto(model.get());
            return Optional.of(dto);
        }
        return Optional.empty();
    }

    public Optional<D> save(D dto) {
        M model = mapper.dtoToModel(dto);
        model = repository.save(model);
        if (ObjectUtils.isEmpty(model)) {
            return Optional.empty();
        }
        dto = mapper.modelToDto(model);
        return Optional.of(dto);
    }

    public Optional<D> update(D dto) {
        return save(dto);
    }

}

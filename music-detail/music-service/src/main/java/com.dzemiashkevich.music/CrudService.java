package com.dzemiashkevich.music;

import com.dzemiashkevich.music.model.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CrudService<T extends Key, K extends Number> {

    @Autowired
    private JpaRepository<T, K> repository;

    public Set<T> read() {
        List<T> models = repository.findAll();

        return new HashSet<>(models);
    }

}

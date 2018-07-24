package com.dzemiashkevich.music.mapping;

import com.dzemiashkevich.music.dto.EditorialNoteRestDto;
import com.dzemiashkevich.music.model.resource.EditorialNote;

@org.mapstruct.Mapper(componentModel = "spring")
public interface EditorialNoteMapper extends Mapper<EditorialNoteRestDto, EditorialNote> {
}

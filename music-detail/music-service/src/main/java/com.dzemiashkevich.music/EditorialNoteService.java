package com.dzemiashkevich.music;

import com.dzemiashkevich.music.dto.EditorialNoteRestDto;
import com.dzemiashkevich.music.model.resource.EditorialNote;
import org.springframework.stereotype.Service;

@Service
public class EditorialNoteService extends CrudService<EditorialNoteRestDto, EditorialNote, Long> {

}

package com.crio.starter.repositoryService;

import java.util.List;
import java.util.Optional;
import com.crio.starter.data.MemeEntity;
import com.crio.starter.exceptions.DataAlreadyExistsException;

public interface MemesRepositoryService {

    MemeEntity saveMemes(MemeEntity meme) throws DataAlreadyExistsException;

    Optional<MemeEntity> getMemeById(String id);

    List<MemeEntity> getLastNMemes(int N);
    
}

package com.crio.starter.service;

import java.util.List;
import java.util.Optional;
import com.crio.starter.exchange.MemeRequestDto;
import com.crio.starter.exchange.MemeRequestIdDto;

public interface MemesService {
    
    Optional<MemeRequestIdDto> saveMemes(MemeRequestDto newMeme);

    Optional<MemeRequestDto> getMemeById(String Id);

    List<MemeRequestDto> getLastNMemes(int N);
}
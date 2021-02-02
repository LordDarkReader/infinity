package com.chak.infinity.infinity.services;

import com.chak.infinity.infinity.api.rest.InfinityRequest;
import com.chak.infinity.infinity.document.Infinity;
import com.chak.infinity.infinity.mappers.InfinityMapper;
import com.chak.infinity.infinity.repository.InfinityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ ={@Autowired})
public class InfinityService {

    private final InfinityRepository infinityRepository;
    private final InfinityMapper infinityMapper;


    public void createNewInfinity(InfinityRequest infinity){
        infinityRepository.save(infinityMapper.mapInfinity(infinity));
    }

    public void createNew(){
        infinityRepository.save(infinityMapper.mapInfinity(InfinityRequest.builder()
                .info("new info")
                .build()));
    }

    public List<Infinity> getAll(){
        return infinityRepository.findAll();
    }
}

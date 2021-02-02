package com.chak.infinity.infinity.mappers;

import com.chak.infinity.infinity.api.rest.InfinityRequest;
import com.chak.infinity.infinity.document.Infinity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InfinityMapper {

    public Infinity mapInfinity(InfinityRequest request){
        UUID uuid = UUID.randomUUID();

        return Infinity.builder()
                .uuid(uuid.toString())
                .info(request.getInfo())
                .build();
    }
}

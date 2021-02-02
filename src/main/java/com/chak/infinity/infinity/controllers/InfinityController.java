package com.chak.infinity.infinity.controllers;

import com.chak.infinity.infinity.api.rest.InfinityRequest;
import com.chak.infinity.infinity.document.Infinity;
import com.chak.infinity.infinity.services.InfinityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class InfinityController {

    private final InfinityService infinityService;


    @GetMapping(value = "/all")
    public List<Infinity> getAll(){
        return infinityService.getAll();
    }

    @GetMapping(value = "/")
    public String getStart(){
        return "start";
    }

    @PostMapping(value = "/create")
    public void createNewInfinity(@RequestBody @Validated InfinityRequest infinityRequest){
        infinityService.createNewInfinity(infinityRequest);
    }

    @PostMapping(value = "/createWithoutParameters")
    public void createNew(){
        infinityService.createNew();
    }
}

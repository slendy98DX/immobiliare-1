package org.example.controllers;

import org.example.controllers.dto.ImmobileRequestDto;
import org.example.controllers.dto.ImmobileResponseDto;
import org.example.service.ImmobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/immobile")
public class ImmobileController {

    @Autowired
    private ImmobileService immobileService;

    @PostMapping
    public ImmobileResponseDto postImmobile(@RequestBody ImmobileRequestDto request) {
        return immobileService.postImmobile(request);
    }

    @GetMapping("/{id}")
    public ImmobileResponseDto getImmobile(@PathVariable("id") Long id) {
        return immobileService.getImmobile(id);
    }



    @GetMapping("/page")
    public List<ImmobileResponseDto> getImmobilePage(@RequestParam Integer page, @RequestParam Integer pageSize) {
        return immobileService.getImmobilePage(page, pageSize);

    }

    @PutMapping("/{id}")
    public ImmobileResponseDto putImmobile(@PathVariable("id") Long id,
                                           @RequestBody ImmobileRequestDto request)  {
        return immobileService.putImmobile(id,request);
    }


    @DeleteMapping("/{id}")
    public ImmobileResponseDto delete(@PathVariable("id") Long id) {
        return immobileService.delete(id);
    }



}
package com.api.Loads.controller;

import com.api.Loads.model.Load;
import com.api.Loads.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class LoadController {

    @Autowired
    private LoadService loadService;
    @PostMapping("/load")
    public Load SaveLoads( @RequestBody Load load){
        return loadService.SaveLoads(load);

    }
@GetMapping("/load")
    public ResponseEntity<List<Load>> fetchLoadList(){
    List<Load> loadList = loadService.fetchLoadList();
     //String message = "Loads fetched Successfully";

        return ResponseEntity.status(HttpStatus.OK).body(loadList);

    }

    @GetMapping("/load/{id}")
    public Load FetchLoadById(@PathVariable("id") Long ShipperID){
        return loadService.FetchLoadById(ShipperID);

    }

    @DeleteMapping("/load/{id}")
    public String DeleteLoadById(@PathVariable("id") Long ShipperId){
        loadService.DeleteLoadById(ShipperId);
        return "Load Deleted SuccessFully!!!";

    }

    @PutMapping("/load/{id}")
    public Load UpdateLoad(@PathVariable("id") Long ShipperId, @RequestBody Load load){

               return loadService.UpdateLoad(ShipperId,load);
    }


}

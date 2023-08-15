package com.api.Loads.service;

import com.api.Loads.Repository.LoadRepository;
import com.api.Loads.model.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoadServiceImpl implements LoadService {


    @Autowired
    private LoadRepository loadRepository;

    @Override
    public Load SaveLoads(Load load) {
        return loadRepository.save(load);
    }

    @Override
    public List<Load> fetchLoadList() {
        return loadRepository.findAll();
    }

    @Override
    public Load FetchLoadById(Long shipperID) {
        return loadRepository.findById(shipperID).get();
    }

    @Override
    public void DeleteLoadById(Long shipperId) {
         loadRepository.deleteById(shipperId);
    }

    @Override
    public Load UpdateLoad(Long shipperId, Load load) {
        Load loadDB = loadRepository.findById(shipperId).get();

        if(Objects.nonNull(load.getLoadingpoint())&&
                !"".equalsIgnoreCase(load.getLoadingpoint())){
            loadDB.setLoadingpoint(load.getLoadingpoint());
        }

        if(Objects.nonNull(load.getUnLoadingpoint())&&
                !"".equalsIgnoreCase(load.getUnLoadingpoint())){
            loadDB.setUnLoadingpoint(load.getUnLoadingpoint());
        }

        if(Objects.nonNull(load.getProductType())&&
                !"".equalsIgnoreCase(load.getProductType())){
            loadDB.setProductType(load.getProductType());
        }
        if(Objects.nonNull(load.getTrucktype())&&
                !"".equalsIgnoreCase(load.getTrucktype())){
            loadDB.setTrucktype(load.getTrucktype());
        }
        if(Objects.nonNull(load.getNoOfTrucks())&&
                !"".equalsIgnoreCase(load.getNoOfTrucks())){
            loadDB.setNoOfTrucks(load.getNoOfTrucks());
        }
        if(Objects.nonNull(load.getWeight())&&
                !"".equalsIgnoreCase(load.getWeight())){
            loadDB.setWeight(load.getWeight());
        }
        if(Objects.nonNull(load.getDate())&&
                !"".equalsIgnoreCase(String.valueOf(load.getDate()))){
            loadDB.setDate(load.getDate());
        }
        return loadRepository.save(loadDB);
    }


}

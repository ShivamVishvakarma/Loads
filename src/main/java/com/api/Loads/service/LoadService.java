package com.api.Loads.service;

import com.api.Loads.model.Load;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoadService {
  public  Load SaveLoads(Load load);

   public List<Load> fetchLoadList();
   public Load FetchLoadById(Long shipperID);


   public void DeleteLoadById(Long shipperId);

   public Load UpdateLoad(Long shipperId, Load load);
}

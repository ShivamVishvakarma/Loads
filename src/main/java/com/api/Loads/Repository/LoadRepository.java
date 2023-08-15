package com.api.Loads.Repository;

import com.api.Loads.model.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRepository extends JpaRepository<Load , Long> {
}

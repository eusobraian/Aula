package com.example.Test.Repository;

import com.example.Test.Model.CampeoesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CampeoesRepository extends
        CrudRepository<CampeoesEntity, Long> {


}


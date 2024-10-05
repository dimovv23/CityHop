package com.dimovv.city_hop.repositories;

import com.dimovv.city_hop.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityEntity, Long> {
}

package com.dimovv.city_hop.repositories;

import com.dimovv.city_hop.entities.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<TripEntity, Long> {
}

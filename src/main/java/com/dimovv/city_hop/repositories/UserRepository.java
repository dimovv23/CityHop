package com.dimovv.city_hop.repositories;

import com.dimovv.city_hop.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

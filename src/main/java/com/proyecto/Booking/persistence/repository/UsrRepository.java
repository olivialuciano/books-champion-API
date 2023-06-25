package com.proyecto.Booking.persistence.repository;

import com.proyecto.Booking.persistence.entities.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrRepository extends JpaRepository<Usr, Long> {
}

package com.groupeisi.hotelservice.repository;

import com.groupeisi.hotelservice.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

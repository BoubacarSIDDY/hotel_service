package com.groupeisi.hotelservice.web;

import com.groupeisi.hotelservice.entities.Reservation;
import com.groupeisi.hotelservice.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;

    @GetMapping("/reservations")
    public List<Reservation> reservationList(){
        return reservationRepository.findAll();
    }
}

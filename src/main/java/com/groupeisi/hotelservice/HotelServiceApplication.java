package com.groupeisi.hotelservice;

import com.groupeisi.hotelservice.entities.Reservation;
import com.groupeisi.hotelservice.entities.ReservationStatus;
import com.groupeisi.hotelservice.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
		return args -> {
			reservationRepository.save(Reservation.builder().title("reservation 1").price(1200).status(ReservationStatus.CONFIRMED).build());
			reservationRepository.save(Reservation.builder().title("reservation 2").price(500).status(ReservationStatus.CANCELED).build());
			reservationRepository.save(Reservation.builder().title("reservation 3").price(1500).status(ReservationStatus.PENDING).build());
		};
	}

}

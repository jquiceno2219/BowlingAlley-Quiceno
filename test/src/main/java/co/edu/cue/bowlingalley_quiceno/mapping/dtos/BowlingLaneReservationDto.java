package co.edu.cue.bowlingalley_quiceno.mapping.dtos;

import co.edu.cue.bowlingalley_quiceno.domain.entities.BowlingLane;
import co.edu.cue.bowlingalley_quiceno.domain.entities.User;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Builder
public record BowlingLaneReservationDto(int idBowlingLaneReservation,
                                        LocalDate date,
                                        LocalTime startHour,
                                        LocalTime endHour,
                                        int personQuantity,
                                        User user,
                                        Double price,
                                        BowlingLane BowlingLane) {
}

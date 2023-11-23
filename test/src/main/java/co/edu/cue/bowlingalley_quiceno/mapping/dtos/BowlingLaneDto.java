package co.edu.cue.bowlingalley_quiceno.mapping.dtos;



import co.edu.cue.bowlingalley_quiceno.domain.entities.BowlingLaneReservation;
import co.edu.cue.bowlingalley_quiceno.domain.enums.LaneStatus;
import lombok.Builder;

import java.util.List;


//DTOS & MAPPERS LISTOS
@Builder
public record BowlingLaneDto(String idBowlingLane,
        String name,
        LaneStatus status,
        List<BowlingLaneReservation> reservationHistory) {
}
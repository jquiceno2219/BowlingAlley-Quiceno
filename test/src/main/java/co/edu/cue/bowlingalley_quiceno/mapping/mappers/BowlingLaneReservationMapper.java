package co.edu.cue.bowlingalley_quiceno.mapping.mappers;

import co.edu.cue.bowlingalley_quiceno.domain.entities.BowlingLaneReservation;
import co.edu.cue.bowlingalley_quiceno.mapping.dtos.BowlingLaneReservationDto;

import java.util.List;
import java.util.stream.Collectors;

public class BowlingLaneReservationMapper {
    public static BowlingLaneReservationDto mapFrom(BowlingLaneReservation source) {
        return new BowlingLaneReservationDto(
                source.getIdBowlingLaneReservation(),
                source.getDate(),
                source.getStartHour(),
                source.getEndHour(),
                source.getPersonQuantity(),
                source.getUser(),
                source.getPrice(),
                source.getBowlingLane()
        );
    }

    public static BowlingLaneReservation mapFrom(BowlingLaneReservationDto source) {
        return new BowlingLaneReservation(
                source.idBowlingLaneReservation(),
                source.date(),
                source.startHour(),
                source.endHour(),
                source.personQuantity(),
                source.user(),
                source.price(),
                source.BowlingLane()
        );
    }

    public static List<BowlingLaneReservationDto> mapFrom(List<BowlingLaneReservation> source) {
        return source.parallelStream().map(BowlingLaneReservationMapper::mapFrom).collect(Collectors.toList());
    }
}
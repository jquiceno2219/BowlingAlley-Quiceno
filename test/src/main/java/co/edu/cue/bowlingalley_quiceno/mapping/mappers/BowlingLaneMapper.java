package co.edu.cue.bowlingalley_quiceno.mapping.mappers;

import co.edu.cue.bowlingalley_quiceno.domain.entities.BowlingLane;
import co.edu.cue.bowlingalley_quiceno.mapping.dtos.BowlingLaneDto;

import java.util.List;
import java.util.stream.Collectors;

public class BowlingLaneMapper {
    public static BowlingLaneDto mapFrom(BowlingLane source) {
        return new BowlingLaneDto(
                source.getIdBowlingLane(),
                source.getName(),
                source.getStatus()
        );
    }

    public static BowlingLane mapFrom(BowlingLaneDto source) {
        return new BowlingLane(
                source.idBowlingLane(),
                source.name(),
                source.status()
        );
    }

    public static List<BowlingLaneDto> mapFrom(List<BowlingLane> source) {
        return source.parallelStream().map(BowlingLaneMapper::mapFrom).collect(Collectors.toList());
    }
}

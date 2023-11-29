package co.edu.cue.bowlingalley_quiceno.domain.entities;

import co.edu.cue.bowlingalley_quiceno.domain.enums.LaneStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BowlingLane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bowling_lane")
    private int idBowlingLane;
    private String name;
    @Enumerated(EnumType.STRING)
    private LaneStatus status;
}
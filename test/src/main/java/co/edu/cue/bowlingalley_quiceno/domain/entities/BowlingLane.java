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
    @Column(name = "id_Bowling_Lane")
    private String idBowlingLane;
    private String name;
    @Enumerated(EnumType.STRING)
    private LaneStatus status;
    @OneToMany
    @JoinColumn(name = "id_lane_reservation")
    private List<BowlingLaneReservation> reservationHistory;
}
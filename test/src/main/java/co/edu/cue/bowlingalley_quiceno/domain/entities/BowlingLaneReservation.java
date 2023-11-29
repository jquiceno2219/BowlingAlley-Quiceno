package co.edu.cue.bowlingalley_quiceno.domain.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BowlingLaneReservation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_lane_reservation")
    private int idBowlingLaneReservation;
    @Column(name="reservation_date")
    private LocalDate date;
    @Column(name="reservation_start_hour")
    private LocalTime startHour;
    @Column(name="reservation_end_hour")
    private LocalTime endHour;
    @Column(name="reservation_quantity")
    private int personQuantity;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name="reservation_price")
    private Double price;
    @ManyToOne
    @JoinColumn(name="id_bowling_lane")
    private BowlingLane bowlingLane;
}

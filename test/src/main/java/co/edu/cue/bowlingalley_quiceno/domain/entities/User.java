package co.edu.cue.bowlingalley_quiceno.domain.entities;

import co.edu.cue.bowlingalley_quiceno.domain.enums.IsUserAffiliate;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_email")
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "user_affiliate")
    private IsUserAffiliate isUserAffiliate;
}
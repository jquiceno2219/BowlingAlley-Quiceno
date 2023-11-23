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
    @Column(name = "id_user")
    private String userId;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_phone")
    private Long phoneNumber;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_password")
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "user_affiliate")
    private IsUserAffiliate isUserAffiliate;
}

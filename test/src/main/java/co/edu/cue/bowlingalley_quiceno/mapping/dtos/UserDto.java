package co.edu.cue.bowlingalley_quiceno.mapping.dtos;

import co.edu.cue.bowlingalley_quiceno.domain.enums.IsUserAffiliate;
import lombok.Builder;

@Builder
public record UserDto(String userId,
        String name,
        Long phoneNumber,
        String email,
        String password,
        IsUserAffiliate isUserAffiliate) {
}

package co.edu.cue.bowlingalley_quiceno.mapping.dtos;

import co.edu.cue.bowlingalley_quiceno.domain.enums.IsUserAffiliate;
import lombok.Builder;

@Builder
public record UserDto(int userId,
        String name,
        String email,
        IsUserAffiliate isUserAffiliate) {
}

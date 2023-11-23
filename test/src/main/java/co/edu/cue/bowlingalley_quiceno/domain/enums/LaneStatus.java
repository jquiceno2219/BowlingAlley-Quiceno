package co.edu.cue.bowlingalley_quiceno.domain.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum LaneStatus {
    AVAILABLE("Disponible"),
    OCCUPIED("Ocupada"),
    MAINTENANCE("Mantenimiento");

    LaneStatus(String value) {
        this.value = value;
    }

    private String value;

    public static LaneStatus fromValue(String value) {
        return Arrays.stream(LaneStatus.values())
                .filter(e -> e.getValue().equalsIgnoreCase(value))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Status not found"));
    }
}

package co.edu.cue.bowlingalley_quiceno.domain.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum IsUserAffiliate {
    NONAFFILIATE("Not Affiliated"),
    AFFILIATE("Affiliated");

 IsUserAffiliate(String value){
     this.value = value;
 }

 private String value;

 public static IsUserAffiliate fromValue(String value) {
     return Arrays.stream(IsUserAffiliate.values())
             .filter(e -> e.getValue().equalsIgnoreCase(value))
             .findAny()
             .orElseThrow(() -> new RuntimeException("Affiliation not found"));
 }
}

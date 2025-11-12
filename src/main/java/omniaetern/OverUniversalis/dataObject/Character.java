package omniaetern.OverUniversalis.dataObject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import omniaetern.OverUniversalis.common.IdPrefix;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Character {

    String id;

    private static String generateId() {
        return IdPrefix.Character.value() + UUID.randomUUID().toString();
    }

    String name;
    LocalDate birthDate;

    int gender;

    @Getter
    public enum Gender {
        MALE(1),
        FEMALE(2);

        private int value;

        Gender(int value) {}
    }

    int sexualOrientation;

    @Getter
    public enum SexualOrientation {
        HETEROSEXUAL(1),
        HOMOSEXUAL(2),
        BISEXUAL(3),
        ASEXUAL(4);

        private int value;

        SexualOrientation(int value) {}
    }

    int diplomacy;
    int martial;
    int stewardship;
    int intrigue;
    int learning;
    int prowess;
    int dread;

    ArrayList<Trait> traits;
    ArrayList<Effect> effects;

    String fatherId;
    String motherId;
    String biologicalFatherId;
    String biologicalMotherId;

    String PrimarySpouseId;
    ArrayList<String> secondarySpouseIds;
    ArrayList<String> loverIds;

    ArrayList<String> childrenIds;

    ArrayList<String> wardIds;

    String teacherId;




}

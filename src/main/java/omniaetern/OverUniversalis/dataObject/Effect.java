package omniaetern.OverUniversalis.dataObject;

import omniaetern.OverUniversalis.common.IdPrefix;

import java.util.UUID;

public class Effect extends Modifier {
    private String generateId(){
        return IdPrefix.Effect.value() + UUID.randomUUID().toString();
    }
}

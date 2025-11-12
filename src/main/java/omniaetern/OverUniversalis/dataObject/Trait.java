package omniaetern.OverUniversalis.dataObject;

import omniaetern.OverUniversalis.common.IdPrefix;

import java.util.UUID;

public class Trait extends Modifier {

    private String generateId(){
        return IdPrefix.Trait.value() + UUID.randomUUID().toString();
    }

}

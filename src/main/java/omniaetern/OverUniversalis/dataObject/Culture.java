package omniaetern.OverUniversalis.dataObject;

import omniaetern.OverUniversalis.common.IdPrefix;

import java.util.UUID;

public class Culture {
    String id;
    private String generateId(){
        return IdPrefix.Culture.value() + UUID.randomUUID().toString();
    }

    String name;
}

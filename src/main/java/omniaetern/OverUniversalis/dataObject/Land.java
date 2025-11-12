package omniaetern.OverUniversalis.dataObject;

import omniaetern.OverUniversalis.common.IdPrefix;

import java.util.UUID;

public class Land {
    String id;
    private String generateId(){
        return IdPrefix.Land.value() + UUID.randomUUID().toString();
    }

    String name;
}

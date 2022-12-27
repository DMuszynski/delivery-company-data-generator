package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Packet extends AbstractEntity {
    private final String packetType;
    private final String wrappingType;

    public Packet(long id, String packetType, String wrappingType) {
        super(id);
        this.packetType = packetType;
        this.wrappingType = wrappingType;
    }
}

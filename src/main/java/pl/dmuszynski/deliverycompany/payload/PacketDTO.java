package pl.dmuszynski.deliverycompany.payload;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@SuperBuilder
@ToString
@EqualsAndHashCode(callSuper = true)
public class PacketDTO extends AbstractEntityDTO implements Serializable {
    private final String packetType;
    private final String wrappingType;
}

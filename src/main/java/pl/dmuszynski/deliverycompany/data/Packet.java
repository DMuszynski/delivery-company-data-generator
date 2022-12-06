package pl.dmuszynski.deliverycompany.data;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Packet {
    private long idPacket;
    private String packetType;
    private String wrappingType;
    private Dimension dimension;
    private int weight;
}

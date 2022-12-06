package pl.dmuszynski.deliverycompany.payload;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class PackageDTO implements Serializable {
    private final long idPacket;
    private final String packageType;
    private final String wrappingType;
    private final int length;
    private final int width;
    private final int height;
    private final int weight;
}

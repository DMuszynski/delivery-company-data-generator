package pl.dmuszynski.deliverycompany.payload;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class PackageDTO {
    private final long idPacket;
    private final String packageType;
    private final String wrappingType;
    private final int length;
    private final int width;
    private final int height;
    private final int weight;
}

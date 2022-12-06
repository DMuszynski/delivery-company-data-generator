package pl.dmuszynski.deliverycompany.payload;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class SupplierDTO {
    private final long idSupplier;
    private final String name;
    private final String NIP;
}

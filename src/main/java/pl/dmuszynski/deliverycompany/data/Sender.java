package pl.dmuszynski.deliverycompany.data;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Sender {
    private long idSender;
    private Person person;
}

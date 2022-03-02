package hello.typeconverter.type;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Objects;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class IpPort {

    private String ip;
    private int port;

}

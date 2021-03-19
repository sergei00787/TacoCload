package sia.tacocloud.web;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;

@Component
@ConfigurationProperties(prefix = "tacocload.orders")
@Data
@Validated
public class OrderProps {
    @Min(value = 5, message = "must be between 5 and 25")
    @Min(value = 25, message = "must be between 5 and 25")
    private int pageSize = 20;
}

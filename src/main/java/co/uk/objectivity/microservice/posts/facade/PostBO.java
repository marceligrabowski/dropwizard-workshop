package co.uk.objectivity.microservice.posts.facade;

import io.dropwizard.validation.MinSize;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostBO {
    @NotNull
    private Integer id;
    @Size(min = 10, max = 255)
    private String description;
    @NotNull
    private Integer userId;
}

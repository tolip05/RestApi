package exercise.demo.projection;

import exercise.demo.entity.News;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDateTime;

@Projection(types = {News.class})
public interface AllNewsProjection {
    String getTitle();

    LocalDateTime getPostedOn();

    String getDescription();

    String getText();
}

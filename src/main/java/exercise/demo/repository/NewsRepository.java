package exercise.demo.repository;

import exercise.demo.entity.News;
import exercise.demo.projection.AllNewsProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource(excerptProjection = AllNewsProjection.class)
public interface NewsRepository extends JpaRepository<News, Long> {
    Page<AllNewsProjection> findAllByPostedOnAndTitle(@Param("date") LocalDateTime postedOn,@Param("title") String title, Pageable pageable);

    Page<AllNewsProjection> findByPostedOn(@Param("date") LocalDateTime postedOn, Pageable pageable);

    Page<AllNewsProjection> findAllByPostedOnBetweenAndTitle
            (@Param("from") LocalDateTime postedOn,
             @Param("to") LocalDateTime postedOn2, @Param("title") String title, Pageable pageable);

    AllNewsProjection findByTitle(@Param("title") String title);

    Page<AllNewsProjection>getNewsByPostedOnAfterAndTitleContains(@Param("date") LocalDateTime postedOn,@Param("title") String title, Pageable pageable);

    Page<AllNewsProjection>getAllByTitleEquals(@Param("title") String title, Pageable pageable);

    Page<AllNewsProjection>findAllByPostedOnAfter(@Param("date") LocalDateTime postedOn, Pageable pageable);
}

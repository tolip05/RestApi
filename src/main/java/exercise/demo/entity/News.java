package exercise.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class News {
    private Long id;
    private LocalDateTime postedOn;
    private String title;
    private String description;
    private String text;

    public News() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "postedOn",nullable = false)
    public LocalDateTime getPostedOn() {
        return this.postedOn;
    }

    public void setPostedOn(LocalDateTime postedOn) {
        this.postedOn = postedOn;
    }
    @Column(name = "title",nullable = false)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "description",nullable = false)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "text", columnDefinition = "TEXT",nullable = false)
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

package pl.rafalab.rafdit.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank(message = "Post name cannot be empty")
    private String postName;

    @Nullable
    private String url;

    @Nullable
    @Lob
    private String description;
    private Integer voteCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personId", referencedColumnName = "id")
    private Person person;
    private Instant dateCreated;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subrafditId", referencedColumnName = "id")
    private Subrafdit subrafdit;
}

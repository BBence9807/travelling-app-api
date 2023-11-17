package hu.bb.travellingappapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "c_hun_name")
    private String hunName;

    @Column(nullable = false, name = "c_eng_name")
    private String engName;
}

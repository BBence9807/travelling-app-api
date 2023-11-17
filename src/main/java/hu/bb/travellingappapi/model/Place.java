package hu.bb.travellingappapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "place")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "p_name")
    private String name;

    @Column(nullable = false, name = "p_address")
    private String address;

    @Column(nullable = false, name = "p_langitude")
    private String langitude;

    @Column(nullable = false, name = "p_longitude")
    private String longitude;


    @ManyToOne()
    @JoinColumn(name = "p_user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "p_categories_id", referencedColumnName = "id")
    private Categories Categories;
}

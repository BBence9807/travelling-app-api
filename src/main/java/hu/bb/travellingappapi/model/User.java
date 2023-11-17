package hu.bb.travellingappapi.model;


import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.Email;


@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, name = "u_email")
    @Email(message = "Please provide valid email address!")
    private String email;

    @Column(nullable = false, name = "u_first_name")
    private String firstName;

    @Column(nullable = false, name = "u_last_name")
    private String lastName;

    @Column(nullable = false, name = "u_password")
    private String password;
}

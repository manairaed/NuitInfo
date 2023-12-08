package tn.nuitinfo.nuitinfo.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long role_id;
    @Column(unique = true)
    private String role;
}
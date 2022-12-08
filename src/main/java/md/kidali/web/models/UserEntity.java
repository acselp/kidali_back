package md.kidali.web.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserEntity {
    @Id
    private int id;

    private String email;
    private String username;
    private String password;
    private String role;


}

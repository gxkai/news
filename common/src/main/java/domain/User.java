package domain;



import domain.enumeration.SexType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A User.
 */
@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  extends AbstractAuditingEntity implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "jhi_user")
    private String user;

    @Column(name = "jhi_password")
    private String password;

    @Column(name = "salt")
    private String salt;

    @Column(name = "token")
    private String token;

    @Column(name = "age")
    private Integer age;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private SexType sex;

    @Column(name = "authority")
    private String authority;
}

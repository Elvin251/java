package az.developia.demo2.Lesson64;
@Entity
@Table(name = "users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String phone;
    private String password;

    @OneToOne(mappedBy = "user")
    private CustomerEntity customer;
}

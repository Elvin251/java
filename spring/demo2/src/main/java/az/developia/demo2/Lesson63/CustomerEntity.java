package az.developia.demo2.Lesson63;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String phone;
    private LocalDate birthday;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<ProductEntity> products;
}

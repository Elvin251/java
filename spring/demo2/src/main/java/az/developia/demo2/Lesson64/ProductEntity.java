package az.developia.demo2.Lesson64;

@Entity
@Table(name = "products")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    @OneToMany(mappedBy = "product")
    private List<OrderEntity> orders;
}

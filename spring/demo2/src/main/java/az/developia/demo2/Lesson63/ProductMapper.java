package az.developia.demo2.Lesson63;

public class ProductMapper {

    public static ProductEntity toEntity(ProductRequestDTO dto, CustomerEntity customer) {
        ProductEntity entity = new ProductEntity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setCustomer(customer);
        return entity;
    }

    public static ProductResponseDTO toResponse(ProductEntity entity) {
        ProductResponseDTO dto = new ProductResponseDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setCustomerFullName(
                entity.getCustomer().getName() + " " + entity.getCustomer().getSurname()
        );
        return dto;
    }
}

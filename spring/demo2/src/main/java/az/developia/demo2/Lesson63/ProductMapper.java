package az.developia.demo2.Lesson63;

public class ProductMapper {

    public static ProductEntity toEntity(ProductRequestDto dto, CustomerEntity customer) {
        ProductEntity p = new ProductEntity();
        p.setName(dto.getName());
        p.setDescription(dto.getDescription());
        p.setPrice(dto.getPrice());
        p.setCustomer(customer);
        return p;
    }

    public static ProductResponseDto toDto(ProductEntity entity) {
        ProductResponseDto dto = new ProductResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        dto.setCustomerName(entity.getCustomer().getName());
        return dto;
    }
}

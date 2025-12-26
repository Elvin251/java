package az.developia.demo2.Lesson64;

public class ProductMapper {

    public static ProductEntity toEntity(ProductRequestDto dto) {
        ProductEntity product = new ProductEntity();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        return product;
    }

    public static ProductResponseDto toDto(ProductEntity entity) {
        ProductResponseDto dto = new ProductResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        return dto;
    }
}

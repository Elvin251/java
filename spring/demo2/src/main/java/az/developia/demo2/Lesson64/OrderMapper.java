package az.developia.demo2.Lesson64;

public class OrderMapper {

    public static OrderResponseDto toDto(OrderEntity entity) {
        OrderResponseDto dto = new OrderResponseDto();
        dto.setId(entity.getId());
        dto.setQuantity(entity.getQuantity());
        dto.setCustomerName(entity.getCustomer().getName());
        dto.setProductName(entity.getProduct().getName());
        return dto;
    }
}

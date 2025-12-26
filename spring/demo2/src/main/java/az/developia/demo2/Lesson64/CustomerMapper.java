package az.developia.demo2.Lesson64;

public class CustomerMapper {

    public static CustomerEntity toEntity(CustomerRequestDto dto, UserEntity user) {
        CustomerEntity customer = new CustomerEntity();
        customer.setName(dto.getName());
        customer.setSurname(dto.getSurname());
        customer.setBirthday(dto.getBirthday());
        customer.setUser(user);
        return customer;
    }

    public static CustomerResponseDto toDto(CustomerEntity entity) {
        CustomerResponseDto dto = new CustomerResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        dto.setBirthday(entity.getBirthday());
        dto.setUser(UserMapper.toDto(entity.getUser()));
        return dto;
    }
}

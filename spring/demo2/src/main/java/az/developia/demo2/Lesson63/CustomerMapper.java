package az.developia.demo2.Lesson63;

public class CustomerMapper {

    public static CustomerEntity toEntity(CustomerRequestDto dto) {
        CustomerEntity c = new CustomerEntity();
        c.setName(dto.getName());
        c.setSurname(dto.getSurname());
        c.setEmail(dto.getEmail());
        c.setPhone(dto.getPhone());
        c.setBirthday(dto.getBirthday());
        return c;
    }

    public static CustomerResponseDto toDto(CustomerEntity entity) {
        CustomerResponseDto dto = new CustomerResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        return dto;
    }
}

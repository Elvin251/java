package az.developia.demo2.Lesson63;

public class CustomerMapper {

    public static CustomerEntity toEntity(CustomerRequestDTO dto) {
        CustomerEntity entity = new CustomerEntity();
        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setBirthday(dto.getBirthday());
        return entity;
    }

    public static CustomerResponseDTO toResponse(CustomerEntity entity) {
        CustomerResponseDTO dto = new CustomerResponseDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        dto.setEmail(entity.getEmail());
        return dto;
    }
}

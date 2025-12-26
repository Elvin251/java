package az.developia.demo2.Lesson64;

public class UserMapper {

    public static UserEntity toEntity(UserRequestDto dto) {
        UserEntity user = new UserEntity();
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setPassword(dto.getPassword());
        return user;
    }

    public static UserResponseDto toDto(UserEntity entity) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        return dto;
    }
}

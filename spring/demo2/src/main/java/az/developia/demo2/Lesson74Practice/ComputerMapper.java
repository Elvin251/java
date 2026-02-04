package az.developia.demo2.Lesson74Practice;


import java.util.List;
import java.util.stream.Collectors;

public class ComputerMapper {

    public static ComputerResponse toDTO(ComputerEntity computer) {

        ComputerResponse response = new ComputerResponse();
        response.setId(computer.getId());
        response.setBrand(computer.getBrand());
        response.setModel(computer.getModel());
        response.setPrice(computer.getPrice());
        response.setColor(computer.getColor());

        return response;
    }

    public static List<ComputerResponse> toDTOList(List<ComputerEntity> computers) {

        return computers.stream()
                .map(ComputerMapper::toDTO)
                .collect(Collectors.toList());
    }
}
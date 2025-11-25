package az.developia.demo2.Lesson55;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.*;
import java.util.*;

@RestController
@RequestMapping("/api/phones")
@CrossOrigin
public class PhoneRestController {

    private List<PhoneEntity> phones = new ArrayList<>();
    private Long idCounter = 1L;

    private final String uploadDir = "uploads/";

    @GetMapping
    public List<PhoneEntity> getAll() {
        return phones;
    }

    @GetMapping("/search")
    public List<PhoneEntity> search(@RequestParam String q) {
        return phones.stream()
                .filter(p -> p.getModel().toLowerCase().contains(q.toLowerCase()))
                .toList();
    }

    @PostMapping
    public PhoneEntity create(@RequestBody PhoneEntity phone) {
        phone.setId(idCounter++);
        phones.add(phone);
        return phone;
    }

    @PutMapping("/{id}")
    public ResponseEntity<PhoneEntity> update(@PathVariable Long id, @RequestBody PhoneEntity newPhone) {
        for (PhoneEntity p : phones) {
            if (p.getId().equals(id)) {
                p.setBrand(newPhone.getBrand());
                p.setModel(newPhone.getModel());
                p.setPrice(newPhone.getPrice());
                p.setColor(newPhone.getColor());
                p.setRam(newPhone.getRam());
                p.setMemory(newPhone.getMemory());
                return ResponseEntity.ok(p);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        phones.removeIf(p -> p.getId().equals(id));
        return ResponseEntity.ok().build();
    }
    @PostMapping("/{id}/upload")
    public ResponseEntity<String> uploadImage(@PathVariable Long id,
                                              @RequestParam("file") MultipartFile file) {
        try {
            if (!Files.exists(Paths.get(uploadDir))) {
                Files.createDirectories(Paths.get(uploadDir));
            }

            String fileName = id + "_" + file.getOriginalFilename();
            Path path = Paths.get(uploadDir + fileName);
            Files.write(path, file.getBytes());

            for (PhoneEntity p : phones) {
                if (p.getId().equals(id)) {
                    p.setPictureUrl("/api/phones/pic/" + fileName);
                    return ResponseEntity.ok("Upload successful");
                }
            }

            return ResponseEntity.notFound().build();

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @GetMapping("/pic/{fileName}")
    public ResponseEntity<byte[]> downloadImage(@PathVariable String fileName) {
        try {
            Path path = Paths.get(uploadDir + fileName);
            byte[] bytes = Files.readAllBytes(path);
            return ResponseEntity.ok(bytes);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}

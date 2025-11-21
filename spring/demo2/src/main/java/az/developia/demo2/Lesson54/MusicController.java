package az.developia.demo2.Lesson54;



import az.developia.demo2.Lesson54.MusicEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/musics")
@CrossOrigin(origins = "*")
public class MusicController {

    private List<MusicEntity> musics = new ArrayList<>();
    private Long counter = 1L;

    @PostMapping
    public MusicEntity create(@RequestBody MusicEntity music) {
        music.setId(counter++);
        musics.add(music);
        return music;
    }

    @GetMapping
    public List<MusicEntity> findAll() {
        return musics;
    }

    @GetMapping("/{id}")
    public MusicEntity findById(@PathVariable Long id) {
        for (MusicEntity m : musics) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public MusicEntity update(@PathVariable Long id, @RequestBody MusicEntity updated) {
        for (int i = 0; i < musics.size(); i++) {
            if (musics.get(i).getId().equals(id)) {
                updated.setId(id);
                musics.set(i, updated);
                return updated;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        musics.removeIf(m -> m.getId().equals(id));
    }
}

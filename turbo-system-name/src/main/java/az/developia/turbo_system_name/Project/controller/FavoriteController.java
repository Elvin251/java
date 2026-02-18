package az.developia.turbo_system_name.Project.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import az.developia.turbo_system_name.Project.entity.FavoriteEntity;
import az.developia.turbo_system_name.Project.requestresponse.MessageResponse;
import az.developia.turbo_system_name.Project.service.FavoriteService;

@RestController
@RequestMapping("/favorites")
@CrossOrigin
public class FavoriteController {

    private final FavoriteService service;

    public FavoriteController(FavoriteService service){
        this.service=service;
    }

    @PostMapping("/{userId}/{adId}")
    public MessageResponse add(@PathVariable Long userId,@PathVariable Long adId){
        service.addFavorite(userId,adId);
        return new MessageResponse("Added to Favorites!");
    }

    @GetMapping("/{userId}")
    public List<FavoriteEntity> list(@PathVariable Long userId){
        return service.myFavorites(userId);
    }

    @DeleteMapping("/{id}")
    public MessageResponse delete(@PathVariable Long id){
        service.deleteFavorite(id);
        return new MessageResponse("Favorite Deleted!");
    }
}
package az.developia.turbo_system_name.Project.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import az.developia.turbo_system_name.Project.entity.AdEntity;
import az.developia.turbo_system_name.Project.requestresponse.AdRequest;
import az.developia.turbo_system_name.Project.requestresponse.MessageResponse;
import az.developia.turbo_system_name.Project.service.AdService;

@RestController
@RequestMapping("/ads")
@CrossOrigin
public class AdController {

    private final AdService service;

    public AdController(AdService service){
        this.service=service;
    }

    @PostMapping
    public MessageResponse add(@RequestBody AdRequest req){
        service.addAd(req);
        return new MessageResponse("Ad Added!");
    }

    @GetMapping
    public List<AdEntity> all(){
        return service.allAds();
    }

    @GetMapping("/{id}")
    public AdEntity detail(@PathVariable Long id){
        return service.detail(id);
    }

    @DeleteMapping("/{id}")
    public MessageResponse delete(@PathVariable Long id){
        service.deleteAd(id);
        return new MessageResponse("Deleted!");
    }
}
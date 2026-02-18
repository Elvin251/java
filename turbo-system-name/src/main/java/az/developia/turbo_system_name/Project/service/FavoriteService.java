package az.developia.turbo_system_name.Project.service;

import java.util.List;
import org.springframework.stereotype.Service;

import az.developia.turbo_system_name.Project.entity.*;
import az.developia.turbo_system_name.Project.repository.*;

@Service
public class FavoriteService {

    private final FavoriteRepository favRepo;
    private final UserRepository userRepo;
    private final AdRepository adRepo;

    public FavoriteService(FavoriteRepository favRepo,UserRepository userRepo,AdRepository adRepo){
        this.favRepo=favRepo;
        this.userRepo=userRepo;
        this.adRepo=adRepo;
    }

    public void addFavorite(Long userId,Long adId){
        UserEntity user=userRepo.findById(userId).get();
        AdEntity ad=adRepo.findById(adId).get();

        FavoriteEntity f=new FavoriteEntity();
        f.setUser(user);
        f.setAd(ad);

        favRepo.save(f);
    }

    public List<FavoriteEntity> myFavorites(Long userId){
        return favRepo.findByUserId(userId);
    }

    public void deleteFavorite(Long id){
        favRepo.deleteById(id);
    }
}
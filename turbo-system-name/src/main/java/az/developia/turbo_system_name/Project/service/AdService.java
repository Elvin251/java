package az.developia.turbo_system_name.Project.service;

import java.util.List;
import org.springframework.stereotype.Service;

import az.developia.turbo_system_name.Project.entity.AdEntity;
import az.developia.turbo_system_name.Project.entity.UserEntity;
import az.developia.turbo_system_name.Project.repository.AdRepository;
import az.developia.turbo_system_name.Project.repository.UserRepository;
import az.developia.turbo_system_name.Project.requestresponse.AdRequest;

@Service
public class AdService {

    private final AdRepository adRepo;
    private final UserRepository userRepo;

    public AdService(AdRepository adRepo,UserRepository userRepo){
        this.adRepo=adRepo;
        this.userRepo=userRepo;
    }

    public void addAd(AdRequest req){
        UserEntity seller=userRepo.findById(req.getSellerId()).get();

        AdEntity ad=new AdEntity();
        ad.setYear(req.getYear());
        ad.setPrice(req.getPrice());
        ad.setCity(req.getCity());
        ad.setImageUrl(req.getImageUrl());
        ad.setDescription(req.getDescription());
        ad.setSeller(seller);

        adRepo.save(ad);
    }

    public List<AdEntity> allAds(){
        return adRepo.findAll();
    }

    public void deleteAd(Long id){
        adRepo.deleteById(id);
    }

    public AdEntity detail(Long id){
        return adRepo.findById(id).get();
    }
}
package az.developia.turbo_system_name.Project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="favorites")
public class FavoriteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private AdEntity ad;

    public FavoriteEntity(){}

    public Long getId(){ return id; }

    public UserEntity getUser(){ return user; }

    public void setUser(UserEntity user){ this.user = user; }

    public AdEntity getAd(){ return ad; }

    public void setAd(AdEntity ad){ this.ad = ad; }
}
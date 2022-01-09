package model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
public class Dechet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String category;
    public Long latitude;
    public Long longitude;
    public LocalDateTime date_insertion;

    public Dechet(Long id, String category, Long lat, Long longi, LocalDateTime ldt) {
        this.id = id;
        this.category = category;
        this.latitude = lat;
        this.longitude = longi;
        this.date_insertion = ldt;
    }

}

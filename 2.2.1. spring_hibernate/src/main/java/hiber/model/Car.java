package hiber.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "serises")
    private int series;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;
    public Car() {

    }
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    public String getMode() {
        return model;
    }

    public void setMode(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}

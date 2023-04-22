package mx.finsus.back_remesas_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "datapersonal")
public class User {

    @Id
    @Column(name = "curp")
    private String curp;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "level")
    private String level;
    @Column(name = "phone")
    private String phone;

    @OneToOne
    @JoinColumn(name = "curp")
    private AppData data;














}

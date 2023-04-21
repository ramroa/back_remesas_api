package mx.finsus.back_remesas_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "appdata")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppData {

    @Id
    @Column(name = "curp")
    private String curp;
    @Column(name = "idAsociado")
    private String idAsociado;
    @Column(name = "interbankKey")
    private String interbankKey;


}

package co.edu.cotecnova.entidad;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "nombre")
    private String nombre;
}

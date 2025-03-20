package com.teste.teste.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="TBCLIENTE")
public class ClientModel implements Serializable {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nmCliente;
    private String cdEmpresa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getCdEmpresa() {
        return cdEmpresa;
    }

    public void setCdEmpresa(String cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }
}

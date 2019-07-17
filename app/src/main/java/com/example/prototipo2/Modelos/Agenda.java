package com.example.prototipo2.Modelos;

public class Agenda {

    private String data, hora, turno, paciente, motivo, cpf_profissional;

    public Agenda(String data) {
        this.data = data;
        this.hora = hora;
        this.turno = turno;
        this.paciente = paciente;
        this.motivo = motivo;
        this.cpf_profissional = cpf_profissional;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getTurno() {
        return turno;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getCpf_profissional() {
        return cpf_profissional;
    }
}

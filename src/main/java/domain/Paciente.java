/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author tron
 */
public class Paciente {

    private int id_paciente;
    private String nombre;
    private String apellidos;
    private String ocupacion;
    private String direccion;
    private String cod_postal;
    private String poblacion;
    private String provincia;
    private String pais;
    private String tlf1;
    private String tlf2;
    private String email;
    private String web;
    private String estado_civil;
    private String fecha_nacimiento;
    private String lugar_nacimiento;
    private String n_hijos;
    private String fecha_alta;
    private String recomendado_por;
    private String motivo_consulta;

    public Paciente() {
    }

    public Paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Paciente(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public Paciente(int id_paciente, String nombre, String apellidos) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    

    public Paciente(String nombre, String apellidos, String ocupacion, String direccion, String cod_postal, String poblacion, String provincia, String pais, String tlf1, String tlf2, String email, String web, String estado_civil, String fecha_nacimiento, String lugar_nacimiento, String n_hijos, String fecha_alta, String recomendado_por, String motivo_consulta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
        this.cod_postal = cod_postal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.pais = pais;
        this.tlf1 = tlf1;
        this.tlf2 = tlf2;
        this.email = email;
        this.web = web;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lugar_nacimiento = lugar_nacimiento;
        this.n_hijos = n_hijos;
        this.fecha_alta = fecha_alta;
        this.recomendado_por = recomendado_por;
        this.motivo_consulta = motivo_consulta;
    }

    public Paciente(int id_paciente, String nombre, String apellidos, 
            String ocupacion, String direccion, String cod_postal, String poblacion,
            String provincia, String pais, String tlf1, String tlf2, String email,
            String web, String estado_civil, String fecha_nacimiento,
            String lugar_nacimiento, String n_hijos, String fecha_alta, 
            String recomendado_por, String motivo_consulta) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
        this.cod_postal = cod_postal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.pais = pais;
        this.tlf1 = tlf1;
        this.tlf2 = tlf2;
        this.email = email;
        this.web = web;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lugar_nacimiento = lugar_nacimiento;
        this.n_hijos = n_hijos;
        this.fecha_alta = fecha_alta;
        this.recomendado_por = recomendado_por;
        this.motivo_consulta = motivo_consulta;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTlf1() {
        return tlf1;
    }

    public void setTlf1(String tlf1) {
        this.tlf1 = tlf1;
    }

    public String getTlf2() {
        return tlf2;
    }

    public void setTlf2(String tlf2) {
        this.tlf2 = tlf2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getN_hijos() {
        return n_hijos;
    }

    public void setN_hijos(String n_hijos) {
        this.n_hijos = n_hijos;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getRecomendado_por() {
        return recomendado_por;
    }

    public void setRecomendado_por(String recomendado_por) {
        this.recomendado_por = recomendado_por;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id_paciente=" + id_paciente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ocupacion=" + ocupacion + ", direccion=" + direccion + ", cod_postal=" + cod_postal + ", poblacion=" + poblacion + ", provincia=" + provincia + ", pais=" + pais + ", tlf1=" + tlf1 + ", tlf2=" + tlf2 + ", email=" + email + ", web=" + web + ", estado_civil=" + estado_civil + ", fecha_nacimiento=" + fecha_nacimiento + ", lugar_nacimiento=" + lugar_nacimiento + ", n_hijos=" + n_hijos + ", fecha_alta=" + fecha_alta + ", recomendado_por=" + recomendado_por + ", motivo_consulta=" + motivo_consulta + '}';
    }

}

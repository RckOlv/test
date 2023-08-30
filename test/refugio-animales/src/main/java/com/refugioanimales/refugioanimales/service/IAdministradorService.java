/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Administrador;
import java.util.List;

public interface IAdministradorService {

    public List<Administrador> getAdministradores();

    public void saveAdministrador(Administrador administrador);

    public void deleteAdministrador(Long id);

    public void editAdministrador(Administrador administrador);

    public Administrador getAdministrador(Long id);

}

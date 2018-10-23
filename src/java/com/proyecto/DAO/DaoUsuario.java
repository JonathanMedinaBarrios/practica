/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.DAO;

import java.util.List;

/**
 *
 * @author sistemas 
 * @param <Usuario>
 */
public interface DaoUsuario<Usuario> {
    
    public void save(Usuario u);
    public void delete(Usuario U);
    public void update(Usuario U);
    List<Usuario> ListarUsuario();
    
}

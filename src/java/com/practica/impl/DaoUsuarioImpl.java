/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica.impl;

import com.practica.POJOS.Usuario;
import com.proyecto.DAO.DaoUsuario;
import com.proyecto.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author siste
 */
public class DaoUsuarioImpl implements  DaoUsuario<Usuario>{

    
    @Override
    public void save(Usuario u){
        SessionFactory sf =  HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession(); 
        Transaction tx = sesion.beginTransaction(); 
        sesion.save(u); 
        tx.commit();
        sesion.close();
    }

    @Override
    public void delete(Usuario U){
        
    }

    @Override
    public void update(Usuario U){
        
    }

    @Override
    public List<Usuario> ListarUsuario() {
      return null; 
    }
    
}

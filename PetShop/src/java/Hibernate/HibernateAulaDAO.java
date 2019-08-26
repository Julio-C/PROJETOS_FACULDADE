
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import com.bean.TabelaClienteBean;
import com.bean.TabelaPetBean;
import com.bean.TabelaProdutoBean;
import com.bean.TabelaTelefoneBean;
import com.bean.TabelaUsuarioBean;
import com.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Gonçalves
 */
public class HibernateAulaDAO {

public TabelaUsuarioBean login(int cod ,String user , String password){
        
    List<TabelaUsuarioBean> list= null;
    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        list = session.createQuery("from TabelaUsuarioBean ").list();
        for(TabelaUsuarioBean usuario : list)
        {
            if(usuario.getCod() == cod && usuario.getUsuario().equals(user) && usuario.getSenha().equals(password)) 
            return usuario;         
        }

    } catch (Exception e) {
            return null;
    }
    return null;
}      
    
public int sessao(int valor)
{
    int login = valor;
    return login;
}


public TabelaUsuarioBean login(String user , String password){
        
    List<TabelaUsuarioBean> list= null;
    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        list = session.createQuery("from TabelaUsuarioBean ").list();
        for(TabelaUsuarioBean usuario : list)
        {
            if(usuario.getUsuario().equals(user) && usuario.getSenha().equals(password)) return usuario;         
        }   
    } catch (Exception e) {
        e.printStackTrace();
    }
    TabelaUsuarioBean loginFail = new TabelaUsuarioBean();
    loginFail.setCod(sessao(99));
    
    return loginFail;
}    

public TabelaProdutoBean getProdutoById(int codProduto){

    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    TabelaProdutoBean produto = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from TabelaProdutoBean as produto where produto.cod=" + codProduto);
        produto = (TabelaProdutoBean) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return produto;
}

 
public TabelaClienteBean getClienteById(int codCliente){

    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    TabelaClienteBean cliente = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from TabelaClienteBean as cliente where cliente.cod=" + codCliente);
        cliente = (TabelaClienteBean) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return cliente;
}

    
    
public TabelaTelefoneBean getTelefoneById(int codTelefone){

    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    TabelaTelefoneBean telefone = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from TabelaTelefoneBean as telefone where telefone.cod=" + codTelefone);
        telefone = (TabelaTelefoneBean) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return telefone;
}

public TabelaPetBean getPetById(int codPet){

    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    TabelaPetBean pet = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from TabelaPetBean as pet where pet.cod=" + codPet);
        pet = (TabelaPetBean) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return pet;
}

public TabelaUsuarioBean getUsuarioById(int codUsuario){

    Transaction trns = null;
    Session session = HibernateUtil.getSessionFactory().openSession();
    TabelaUsuarioBean usuario = null;

    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from TabelaTelefoneBean as telefone where telefone.cod=" + codUsuario);
        usuario = (TabelaUsuarioBean) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return usuario;
}


    public void update(Object obj)
    {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            Transaction t = session.beginTransaction();
            session.update(obj);
            t.commit();
        }catch(RuntimeException e)
      {
          if(trns != null)
          {
          trns.rollback();
          }
          e.printStackTrace();
      }
      finally
      {
        session.flush();
        session.close();
      }
    }
    
    
    
     public void insert(Object obj)
    {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
      try
      {
        Transaction t = session.beginTransaction();
        session.save(obj);
        t.commit();
      } catch(RuntimeException e)
      {
          if(trns != null)
          {
          trns.rollback();
          }
          e.printStackTrace();
      }
      finally
      {
        session.flush();
        session.close();
      }
    }
    
     
     
     public void delete(Object obj) {
         Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction t = session.beginTransaction();
            session.delete(obj);
            t.commit();
            session.clear();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }    
    public static <T> List<T> listar (String select) 
    {
        List listaAluno = null;   
        try {
                
            SessionFactory session = new Configuration().configure().buildSessionFactory();
            Session sessao = session.openSession();
            listaAluno = (List<T>) sessao.createQuery(select).list();
            sessao.close();
        }catch (Exception e){
           e.printStackTrace();
        }
        return listaAluno;
    }
    
    public static <T> List<T> listar (Class cls) 
    {
        return listar("from " + cls.getSimpleName());
    }
}

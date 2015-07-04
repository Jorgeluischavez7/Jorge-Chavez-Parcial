
package com.unitec.jorgechavezparcial;

import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author T-107
 */
public class DAOevaluacion {
   
     static SessionFactory factory;// staticos para que se carguen inmediatamente
    static Session session;
    static Transaction tranza;
   
    
    static{//inicializa la sesion (DAOUsuario dao=new DAOUsuario()//dao.guardar )
       factory= MiConfiguracionHibernate.getSessionFactory();//solo se abre una sola vez
       session= factory.openSession();
       tranza= (Transaction) session.beginTransaction();
    }
          public void abrirSession(){
    factory=MiConfiguracionHibernate.getSessionFactory();
    session=factory.openSession();
    tranza= (Transaction) session.beginTransaction();
    }
     
    public DAOevaluacion() {
    }
    
}

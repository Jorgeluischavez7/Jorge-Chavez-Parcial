
package com.unitec.jorgechavezparcial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class PersistenciaEvaluacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory factory = MiConfiguracionHibernate.getSessionFactory();
           
           //Obtenemos la apertura de sesion actual
           Session sesion = factory.openSession();
           
           //creamos la transaccion
            Transaction tranza=sesion.beginTransaction();
    }
    
}

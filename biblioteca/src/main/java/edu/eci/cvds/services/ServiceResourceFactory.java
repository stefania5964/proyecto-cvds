package edu.eci.cvds.services;
import com.google.inject.Injector;
import edu.eci.cvds.persistence.DAOResource;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisDAOResource;
import edu.eci.cvds.services.impl.ServiciosResourceImpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import static com.google.inject.Guice.createInjector;

public class ServiceResourceFactory {
    private static ServiceResourceFactory instance = new ServiceResourceFactory();
    private static Injector injector;
    private static Injector testingInjector;
    private ServiceResourceFactory() {
        injector = createInjector(new XMLMyBatisModule() {
                                      @Override
                                      protected void initialize() {
                                          install(JdbcHelper.MySQL);
                                          setClassPathResource("mybatis-config.xml");
                                          bind(serviciosResource.class).to(ServiciosResourceImpl.class);
                                          bind(DAOResource.class).to(MyBatisDAOResource.class);

                                      }

                                  }
        );
    }
    public serviciosResource getForumsServices() {
        return injector.getInstance(serviciosResource.class);
    }

    public static ServiceResourceFactory getInstance() {
        return instance;
    }

}

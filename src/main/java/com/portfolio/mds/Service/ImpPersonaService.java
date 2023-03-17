
package com.portfolio.mds.Service;

import com.portfolio.mds.Entity.Persona;
import com.portfolio.mds.Interface.IPersonaService;
import com.portfolio.mds.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonarepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonarepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonarepository.findById(id).orElse(null);
        return persona;
    }
    
}

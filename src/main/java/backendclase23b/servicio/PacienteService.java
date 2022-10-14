package backendclase23b.servicio;

import backendclase23b.dao.IDao;
import backendclase23b.dao.PacienteDAOH2;
import backendclase23b.modelo.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService() {
        this.pacienteIDao = new PacienteDAOH2();
    }

    public Paciente guardar(Paciente paciente) throws Exception {
        return pacienteIDao.guardar(paciente);
    }
    public Paciente buscar(Integer id){
        return pacienteIDao.buscar(id);
    }
    public Paciente buscarXEmail(String email){
        return pacienteIDao.buscarXEmail(email);
    }
    public List<Paciente> buscarTodos(){
        return pacienteIDao.buscarTodos();
    }
}

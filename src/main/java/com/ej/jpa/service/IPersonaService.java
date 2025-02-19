package com.ej.jpa.service;
import com.ej.jpa.model.Persona;
import java.util.List;

public interface IPersonaService {
    //método de traer personas Read o lectura
    public List<Persona> getPersonas();

    //método para guardar personas
    public void savePersona(Persona persona);
    
    //método para borrar una persona (eliminar por id)
    public void deletePersona(Long id_persona);

    //método para buscar personas
    public Persona findPersona(Long id_persona);

    //método para editar una persona
    public void editarPersona(Long id_persona, Persona personaAcualizada);
}

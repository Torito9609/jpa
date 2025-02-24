package com.ej.jpa.controller;

import com.ej.jpa.model.Persona;
import com.ej.jpa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/personas")
@RestController
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    //Endpoint para obtener todas las personas
    @GetMapping("/traer")
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }

    //Endpoint para crear una persona
    @PostMapping("/crear")
    public String savePersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
        return "La persona fué creada con éxito.";
    }

    //Endpoint para eliminar una persona
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
        return "La persona se eliminó.";
    }

    //Endpoint para editar una persona
    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarPersona(@PathVariable Long id, @RequestBody Persona personaActualizada){
        personaService.editarPersona(id, personaActualizada);
        return ResponseEntity.ok("Se actualizó correctamente");
    }
}

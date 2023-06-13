package com.sms.carm.controller;


import com.sms.carm.model.Expediente;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/expediente")
public class ExpedienteController {

    List<Expediente> expedienteList = new ArrayList<>();

    public ExpedienteController(){
        expedienteList.add(new Expediente(1L, "Es_75895654", 300));
        expedienteList.add(new Expediente(2L, "UX_6549632185", 301));
        expedienteList.add(new Expediente(3L, "ES_654984", 302));
    }
    @GetMapping
    public List<Expediente> getAllExpediente() {
        return expedienteList;
    }

    @GetMapping("/{id}")
    public Expediente getExpediente(@PathVariable Long idExpediente) throws NotFoundException {
        for (Expediente expediente : expedienteList) {
            if (expediente.getIdExpediente().equals(idExpediente)) {
                return expediente;
            }
        }
        throw new NotFoundException("No se encontró el expediente con ID: " + idExpediente);
    }

    @PostMapping
    public Expediente createExpediente(@RequestBody Expediente expediente) {
        // Lógica para crear un nuevo expediente
        System.out.println("Nuevo expediente: " + expediente.toString());
        return expediente;
    }

    @PutMapping("/{id}")
    public Expediente updateExpediente(@PathVariable Long idExpediente,@RequestBody Expediente expediente) throws NotFoundException {
        for (Expediente existingExpediente : expedienteList) {
            if (existingExpediente.getIdExpediente().equals(idExpediente)) {
                existingExpediente.setNameExpediente(expediente.getNameExpediente());
                return existingExpediente;
            }
        }
        throw new NotFoundException("No se encontró el expediente con ID: " + idExpediente);
    }

    @DeleteMapping("/{id}")
    public void deleteExpediente(@PathVariable Long idExpediente) throws NotFoundException {
        for (Expediente expediente : expedienteList) {
            if (expediente.getIdExpediente().equals(idExpediente)) {
                expedienteList.remove(expediente);
                return;
            }
        }
        throw new NotFoundException("No se encontró el expediente con ID: " + idExpediente);
    }
}

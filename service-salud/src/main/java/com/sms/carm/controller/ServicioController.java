package com.sms.carm.controller;

import com.sms.carm.model.Servicio;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

        List<Servicio> servicioList = new ArrayList<>();

    public ServicioController() {
        servicioList.add(new Servicio(1L, "patrimonio area"));
        servicioList.add(new Servicio(2L, "caja pagadora 1"));
        servicioList.add(new Servicio(3L, "caja pagadora 2"));
    }
        @GetMapping
        public List<Servicio> getAllServicio() {
            return servicioList;
        }

        @GetMapping("/{id}")
        public Servicio getServicio(@PathVariable Long idServicio) throws NotFoundException {
            for (Servicio servicio : servicioList) {
                if (servicio.getIdService().equals(idServicio)) {
                    return servicio;
                }
            }
            throw new NotFoundException("No se encontró el servicio con ID: " + idServicio);
        }

        @PostMapping
        public Servicio createServicio(@RequestBody Servicio servicio) {
            // Lógica para crear un nuevo servicio
            System.out.println("Nuevo servicio: " + servicio.toString());
            return servicio;
        }

        @PutMapping("/{id}")
        public Servicio updateServicio(@PathVariable Long idServicio,@RequestBody Servicio servicio) throws NotFoundException {
            for (Servicio existingServicio : servicioList) {
                if (existingServicio.getIdService().equals(idServicio)) {
                    existingServicio.setNameService(servicio.getNameService());
                    return existingServicio;
                }
            }
            throw new NotFoundException("No se encontró el servicio con ID: " + idServicio);
        }

        @DeleteMapping("/{id}")
        public void deleteServicio(@PathVariable Long idServicio) throws NotFoundException {
            for (Servicio servicio : servicioList) {
                if (servicio.getIdService().equals(idServicio)) {
                    servicioList.remove(servicio);
                    return;
                }
            }
            throw new NotFoundException("No se encontró el servicio con ID: " + idServicio);
        }
    }



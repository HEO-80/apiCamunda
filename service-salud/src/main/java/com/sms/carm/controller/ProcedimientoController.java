package com.sms.carm.controller;

import com.sms.carm.model.Procedimiento;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/procedimiento")
public class ProcedimientoController {

    List<Procedimiento> procedimientoList = new ArrayList<>();

    public ProcedimientoController() {
        procedimientoList.add(new Procedimiento(1L,"seguro"));
        procedimientoList.add(new Procedimiento(2L,"inventario"));
        procedimientoList.add(new Procedimiento(3L,"tesoreria"));
    }

    @GetMapping
    public List<Procedimiento> getAllProcedimiento() {
        return procedimientoList;
    }

    @GetMapping("/{id}")
    public Procedimiento getProcedimiento(@PathVariable Long idProcedimiento) throws NotFoundException{
        for (Procedimiento procedimiento: procedimientoList) {
            if (procedimiento.getIdProcedimiento().equals(idProcedimiento)){
                return procedimiento;
            };
        }
        throw new NotFoundException("No se encontro el procedimiento con Id: " + idProcedimiento);
    }

    @PostMapping
    public Procedimiento createProcedimiento(@RequestBody Procedimiento procedimiento) {
        // Lógica para crear un nuevo producto
        System.out.println("Nuevo procedimiento: " + procedimiento.toString());
        return procedimiento;
    }



    @PutMapping("/{id}")
    public Procedimiento updateProcedimiento(@PathVariable Long idProcedimiento, @RequestBody Procedimiento procedimiento) throws NotFoundException {
        for (Procedimiento existingProcedimiento : procedimientoList) {
            if (existingProcedimiento.getIdProcedimiento().equals(idProcedimiento)) {
                existingProcedimiento.setNameProcedimiento(procedimiento.getNameProcedimiento());
                return existingProcedimiento;
            }
        }
        throw new NotFoundException("No se encontró el procedimiento con ID: " + idProcedimiento);
    }

    @DeleteMapping("/{id}")
    public void deleteProcedimiento(@PathVariable Long idProcedimiento) throws NotFoundException {
        for (Procedimiento procedimiento : procedimientoList) {
            if (procedimiento.getIdProcedimiento().equals(idProcedimiento)) {
                procedimientoList.remove(procedimiento);
                return;
            }
        }
        throw new NotFoundException("No se encontró el procedimiento con ID: " + idProcedimiento);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.example.Hospital.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/front")
public class FrontControlador {
    @GetMapping("/secretariaPrincipal")
    public String secretariaPrincipal(){
        return "secretariaPrincipal";
    }
    
    @GetMapping("/registroPaciente")
    public String registroPaciente(){
        return "registroPaciente";
    }
    
    @GetMapping("/generacionTurnosSec")
    public String generacionTurnosSec(){
        return "GeneracionTurnosSec";
    }
    
}

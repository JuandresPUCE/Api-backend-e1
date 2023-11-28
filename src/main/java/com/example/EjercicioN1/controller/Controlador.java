
package com.example.EjercicioN1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotacion controlador Rest
@RestController
//Ruta Api rest
@RequestMapping ("/api")

public class Controlador {
    
    @GetMapping("saludo")
    public String saludar (){
    
        return ("Esta API opera Matemáticas");
    }
    
    @GetMapping("suma")
    public String sumar (){
        
        int n1=4; 
        int n2=6;
        int resultado=n1+n2;
                
        return("El resultado es: n1+n2 = "+resultado);
    
    }
    
    @GetMapping("resta")
    public String restar (){
        
        int n1=4; 
        int n2=61;
        int resultado=n1-n2;
                
        return("El resultado es: n1-n2 = "+resultado);
    
    }
    
    @GetMapping("divide")
    public String dividir (){
        
        int n1=4; 
        int n2=6;
        float resultado=n1/n2;
                
        return("El resultado es: n1/n2 = "+resultado);
    
    }
    
    @GetMapping("multiplica")
    public String multiplicar (){
        
        int n1=4; 
        int n2=100;
        int resultado=n1*n2;
                
        return("El resultado es: n1*n2 = "+resultado);
    
    }
    
    @GetMapping("compara")
    public String comparar (){
        
        int n1=100; 
        int n2=100;
        
        if(n1>n2){
            return "el mayor es n1";
        }else if (n2>n1){ 
            return "el mayor es n2";
        }else {
            return "son iguales";
        }


    
    }
    
    
}

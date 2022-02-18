package com.example.demo;

//contenido del fichero: src/main/java/org/eadp/spring/controller/MyController.java


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Controller
public class MyController {

 @GetMapping("/")
 public String index(Model model) {
     model.addAttribute("tstamp", LocalDateTime.now());
     return "index";
 }
 @GetMapping("/greeting")
 public String greetingForm(Model model) {
   model.addAttribute("greeting", new Greeting());
   return "greeting";
 }

 @PostMapping("/greeting") // Esta es la parte del submit en el formulario
 public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
   model.addAttribute("greeting", greeting);
   return "result";
 }
 
 @GetMapping("/formulario")
 public String formularioForm(Model model) {
   model.addAttribute("formulario", new formulario());
   return "formulario";
 }

 @PostMapping("/formulario") // Esta es la parte del submit en el formulario
 public String formularioSubmit(@ModelAttribute formulario formulario, Model model) {
   model.addAttribute("formulario", formulario);
   return "resultado";
 }
 
 @GetMapping("/formulario2")
 public String formularioEnviar2 (Model model) {
	 model.addAttribute("formulario2", new formulario2());
	 return "formulario2";
 }
 
 @PostMapping("/formulario2")
 public String formulariosubmit2(@ModelAttribute formulario2 formulario2,Model model) {
	 model.addAttribute("formulario2", formulario2 );
	 return "resultado2";
	 }
}
package com.example.petclinic;

import com.example.petclinic.controller.VetController;
import com.example.petclinic.model.Speciality;
import com.example.petclinic.model.Vet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PetClinicVet {

    private static ConfigurableApplicationContext context;
    private static VetController vetController;
    
    public static void main(String[] args) {

        context = SpringApplication.run(PetClinicVet.class, args);
        generateData();
    }

    private static void generateData() {

        vetController = (VetController) context.getBean("vetController");
        
        // ***** Vet *****
        Vet vet1 = Vet.builder().withName("SuperVet").withSpeciality(Speciality.DENTISTRY).withSpeciality(Speciality.DENTISTRY).withSpeciality(Speciality.SURGERY).build();
        Vet vet2 = Vet.builder().withName("SuperDuperVet").withSpeciality(Speciality.DENTISTRY).withSpeciality(Speciality.SURGERY).withSpeciality(Speciality.RADIOLOGY).build();
        Vet vet3 = Vet.builder().withName("OutstandingVet").withSpeciality(Speciality.DENTISTRY).withSpeciality(Speciality.SURGERY).build();

        vetController.add(vet1);
        vetController.add(vet2);
        vetController.add(vet3);
        
    }
}

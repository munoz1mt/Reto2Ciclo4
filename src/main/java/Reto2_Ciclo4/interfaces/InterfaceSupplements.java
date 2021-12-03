/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Ciclo4.interfaces;


import Reto2_Ciclo4.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Sebastian
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
    
}

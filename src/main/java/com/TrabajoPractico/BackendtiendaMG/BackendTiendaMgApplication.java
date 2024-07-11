package com.TrabajoPractico.BackendtiendaMG;

import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import com.TrabajoPractico.BackendtiendaMG.servicios.Usuario_metodos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.TrabajoPractico.BackendtiendaMG.model.*;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class BackendTiendaMgApplication
{

	public static void main(String[] args)
	{


		SpringApplication.run(BackendTiendaMgApplication.class, args);



	}




}

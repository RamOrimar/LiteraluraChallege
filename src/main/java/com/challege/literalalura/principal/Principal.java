package com.challege.literalalura.principal;

import com.challege.literalalura.model.DatosLibro;
import com.challege.literalalura.repository.LibroRepository;
import com.challege.literalalura.service.ConsultaAPIgutendex;
import com.challege.literalalura.service.ConvierteClase;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsultaAPIgutendex consumoApi = new ConsultaAPIgutendex();
    private  String URL_BASE = "https://gutendex.com/books";
    private LibroRepository repositorio;
    private ConvierteClase conversor = new ConvierteClase();

    public void muestraElMeu(){
        System.out.println("Escriba el nombre de uma pelicula: ");
        var nombreSerie = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE+"/?search="+
                nombreSerie.replace(" ", "%20"));
        var datos = conversor.obtenerDatos(json, DatosLibro.class);
        System.out.println(datos);
        //Busca los datos de todos las temporadas





    }



























//public Principal(LibroRepository repository){
//    this.repositorio = repository;
//}
//
//    //MENUOPCIONES
//    public void menu() {
//        var opcion = -1;
//        while (opcion != 0) {
//            var menu = """
//                    Elija la opcion que desea escojer:
//                    1 - Buscar libro por titulo
//                    2 - Mostrar libros buscados
//                    3 - Mostras autores buscados
//                    4 - Mostrar autpres vivos en un determinado año
//                    5 - Mostrar libros por idiomas
//                    6 -
//                    7 -
//                    8 -
//                    9 -
//
//                    0 - Salir
//                    """;
//            System.out.println(menu);
//            opcion = teclado.nextInt();
//            teclado.nextLine();
//
//            switch (opcion) {
//                case 1:
//                    buscarLibroTitulo();
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
//                case 8:
//                    break;
//                case 9:
//                    break;
//
//                case 0:
//                    System.out.println("Cerrando la aplicación...");
//                    break;
//                default:
//                    System.out.println("Opción inválida");
//            }
//        }
//
//    }
//
//    private DatosLibro getDatosLibro() {
//        System.out.println("Escriba el titulo del libro que deseas buscar");
//        var nombreLibro = teclado.nextLine();
//        var json = consumoApi.obtenerDatos(URL_BASE + "?search="+nombreLibro.replace(" ", "%20") );
//        System.out.println(json);
//        DatosLibro datos = conversor.obtenerDatos(json, DatosLibro.class);
//        return datos;
//    }
//    private void buscarLibroTitulo() {
//        DatosLibro datos = getDatosLibro();
//
////        Serie serie = new Serie(datos);
////        repositorio.save(serie);
//        System.out.println(datos);
//
//    }


}

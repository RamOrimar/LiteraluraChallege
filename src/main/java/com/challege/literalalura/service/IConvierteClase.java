package com.challege.literalalura.service;

public interface IConvierteClase {
    <T> T obtenerDatos(String json, Class<T> clase);
}

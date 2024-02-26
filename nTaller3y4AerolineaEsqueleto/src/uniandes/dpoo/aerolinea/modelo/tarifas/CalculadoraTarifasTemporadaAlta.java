package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {
    private static final int COSTO_POR_KM = 1000;

    @Override
    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
        int costoBase = calcularCostoBase(vuelo, cliente);
        double descuento = calcularPorcentajeDescuento(cliente);
        int impuestos = calcularValorImpuestos(costoBase);
        return (int) ((costoBase - (costoBase * descuento)) + impuestos);
    }

    @Override
    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
       
        return 0; 
    }

    @Override
    protected double calcularPorcentajeDescuento(Cliente cliente) {
        
        return 0; 
    }
}
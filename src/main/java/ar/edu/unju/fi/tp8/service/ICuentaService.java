package ar.edu.unju.fi.tp8.service;

import java.util.List;

import ar.edu.unju.fi.tp8.models.Cuenta;

public interface ICuentaService {

	public void guardarCuenta(Cuenta cuenta);

	public List<Cuenta> getAllCuentas();

	public void generarTablaCuenta();
}

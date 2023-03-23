Se deben desarrollar una serie de clases:

Partimos de la clase abstracta Cliente,
    De la cual podrán derivar:
        ClienteA
        ClienteB
        Estudiante


Cada cliente se compone de: 
	* Identificador (Long)
	* Nombre completo (String)
	* Telefono (String)
	* email (String)
	* Fecha de alta (String) con formato "DD-mm-YYYY" - Date
	* cuentas
	* ingresoMensual (Float)
	* prestamos

La clase Estudiate, no podrá acceder a prestamos, no poseé ingresoMensual
poseen una unica cuenta y poseen un atributo extra, llamado balance. 

Los Clientes A, poseen al menos dos cuentas, un ingreso mensual superior a 2000
y llevan mas de un año siendo clientes. Esto les posibilita acceder a prestamos
que multipliquen por 10, sus ingresos mensuales.

El resto de clientes son del tipo B, y acceden a prestamos que multiplican por 5
sus ingresos.
Los objetos del tipo cuenta, poseen los atributos:

	* Identificador (Integer)
	* Status (bool)
	* Balance (Float)
    
Los objetos del tipo prestamo, poseen los atributos:

	* Identificador (Integer)
	* Saldo (Float)

En los clientes A y B implementar una interface, llamada "ClienteService" para 
el calculo de prestamo y el calculo de balance.
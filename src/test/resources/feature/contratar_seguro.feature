
# language: es
Característica: Contratar poliza de seguro

Escenario: Contrata poliza de seguro
Dado "Pedro" un usuario que presupuesto un seguro de vida
Y que completo informacion medica,datos personales, de contacto y datos adicionales
Y cargo un medio de pago valido
Y avanzo si designar beneficiario
Cuando ve el resumen de la poliza
Y acepta terminos y condiciones
Entonces visualiza que la poliza de seguro se genero con exito
# language: es
Característica: Consutar costo de seguro de vida

  Escenario: El usuario no puede obtener un presupuesto
    Dado "Juan" un usuario que accedio a cotizar su seguro de vida
    Cuando completa los datos para presupuestar
      | fecha_de_nacimiento | provincia | codigo_de_area | numero_de_telefono |
      |          10/01/1990 | Chubut    |             11 |           12345678 |
    Entonces es notificado que no puede asegurarse por el momento

  Escenario: El usuario obtiene un presupuesto
    Dado "Pedro" un usuario que accedio a cotizar su seguro de vida
    Cuando completa los datos para presupuestar
      | fecha_de_nacimiento | provincia | codigo_de_area | numero_de_telefono |
      |          10/01/1990 | CABA      |             11 |           12345678 |
    Entonces visualiza la suma asegurada
    Y visualiza el valor por mes

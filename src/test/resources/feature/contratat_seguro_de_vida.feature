# language: es
Característica: Contratar seguro de vida
            Luego de presupuestar un seguro de vida
            El usuario puede continuar unos pasos para cotratar el servicio
            En los pasos siguientes debera ingreasar informacion personal
  
  Escenario: Iniciar contratacion de seguro
    Dado "Pedro" un usuario que presupuesto un seguro de vida
    Cuando inicia el proceso de contratacion
    Entonces visualiza el formulario del paso numero dos

  Escenario: El usuario esta habilitado a avanzar al paso numero tres
    Dado "Pedro" un usuario que presupuesto un seguro de vida
    Cuando inicia el proceso de contratacion
    Y completa el paso dos con los datos requeridos
      |altura|peso|
      |180|85|
    Y avanza al paso numero tres
    Entonces visualiza el formulario del paso numero tres

  
  Escenario: El usuario no esta habilitado a avanzar al paso numero tres
    Dado "Pedro" un usuario que presupuesto un seguro de vida
    Cuando inicia el proceso de contratacion
    Y completa el paso dos con los datos requeridos
      |altura|peso|
      |180|45|
    Y avanza al paso numero tres
    Entonces visualiza el formulario de contacto

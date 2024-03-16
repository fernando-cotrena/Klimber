      # language: es
      Característica: Proceso de contratacion de seguro de vida
      Luego de presupuestar un seguro de vida
      El usuario puede continuar una serie de pasos y cotratar el servicio


      Escenario: Paso 1: Iniciar contratacion de seguro
      Dado "Pedro" un usuario que presupuesto un seguro de vida
      Cuando inicia el proceso de contratacion
      Entonces visualiza el formulario del paso numero dos


      Escenario: Paso 2: El usuario esta habilitado a avanzar al paso numero tres
      Dado "Pedro" un usuario que presupuesto un seguro de vida
      Cuando inicia el proceso de contratacion
      Y completa el paso dos con los datos requeridos
      | altura | peso |
      | 180    | 85   |
      Y avanza al paso numero tres
      Entonces visualiza el formulario del paso numero tres


      Escenario: Paso 2: El usuario no esta habilitado a avanzar al paso numero tres
      Dado "Pedro" un usuario que presupuesto un seguro de vida
      Cuando inicia el proceso de contratacion
      Y completa el paso dos con los datos requeridos
      | altura | peso |
      | 180    | 45   |
      Y avanza al paso numero tres
      Entonces visualiza el formulario de contacto


      Escenario: Paso 3: El usuario esta habilitado a avanzar al paso numero cuatro
      Dado "Pedro" un usuario que presupuesto un seguro de vida
      Y llego al paso para dar de alta la poliza de seguro
      Cuando completa sus datos personales
      | nombre | apellido | dni      | sexo_biologico | genero    | estado_civil |
      | Pedro  | Gonzales | 33445566 | Masculino      | Masculino | Soltera/o    |
      Y completa los datos de su domicilio
      | calle        | numero | codigo_postal | ciudad  |
      | Av. La Plata | 666    | 1228          | C.A.B.A |
      Y completa la informacion de contacto
      | email                   | cod_de_area | celular  |
      | pedro.gonzales@test.com | 11          | 12345678 |
      Y cargar una clave para su usuario que presupuesto un seguro de vida
      Entonces visualiza el formulario del paso numero cuatro

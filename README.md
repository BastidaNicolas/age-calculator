# age-calculator
Calculate the period that goes from one time to another, could be from X time to pressent time or X time to Y time.

# Task

### API manejo de fecha

Se necesita el desarrollo de una API con Spring Boot que sea capaz de recibir como parámetro la fecha de nacimiento de una persona dividida en tres partes: día, mes y año. A partir de la recepción de estos tres valores, la API debe ser capaz de devolver la cantidad de años con los que cuenta la persona en el día de la fecha. 

Por ejemplo, si hoy es 16/08/2021 y la fecha de nacimiento de la persona es 23/11/1991, la solicitud debería verse de la siguiente manera: localhost:8080/calcularedad/23/11/1991 y como respuesta se debería obtener 29 años.

### Calls

#### Calculate from X to current date

/calcularedad/{day}/{month}/{year}

#### Calculate from X to Y date

/calculate/{day}/{month}/{year}/to/{mday}/{mmonth}/{myear}

# Status

:heavy_check_mark: Completed

Made the response of the persons age more acurate using `Period` method and added an extra call that lets you place a custom "max-date".

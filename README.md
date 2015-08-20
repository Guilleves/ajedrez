#Ajedrez

Operatoria: Se realizará en equipos de no más de  3 alumnos.

Se desea hacer un sistema de juego de ajedrez. Existen una cantidad de jugadores que ya estan cargados en el sistema y los cuales pueden realizar partidas entre ellos. Cada partida tiene un numero correlativo que la identifica. 

Al inicio, se solicita quien es el jugador que va a usar el sistema, identificandolo por medio de su documento de identidad.

Acto seguido se ofrecen dos opciones: continuar una partida ya iniciada o iniciar una nueva.

Si se continua una partida ya iniciada, se deben listar las que esta jugando en ese momento y luego que seleccione la partida se lista las posiciones de las fichas e indica de quien es el turno  acepta la jugada.

Cuando alguien juega, pide que ficha (trebejo) y que posicion final desea. Antes de actualizar la posicion, verifica que sea valida para el juego. Si como resultado come otra ficha debe actuar en consecuencia.

Cada partida posee por lo tanto: una identificacion, 32 fichas (16 de cada color), dos jugadores, un turno.

Cada ficha posee, una posicion, si esta en tablero y es de una clase especial.

El tablero identifica cada casilla (escaque) con una notacion denominada algebraica

El primer carácter identifica siempre la columna de la casilla y se representa por una de las siguientes letras minúsculas: a - b - c - d - e - f - g - h. La columna de la casilla se ordena desde la izquierda del jugador con piezas blancas hasta su derecha.

El segundo carácter identifica siempre la fila de la casilla y se representa por un número del 1 al 8, en orden ascendente, desde el lado del jugador de piezas blancas hasta el lado jugador de piezas negras.

Las casillas, en la posición inicial, de algunas piezas son: torre del lado de la dama blanca a1, dama blanca d1, torre del lado del rey negro h8.

Cada pieza tiene una letra mayúscula asociada, y varía en función del idioma de quien realiza la notación.

En Español utilizamos: R para el Rey - D para la dama - T para la Torre - A para el alfil - C para el caballo – P para los peones.

Un tablero indica entonces Ficha y posicion, primero blancas y luego negras. 

En la solución se debe utilizar el concepto de programación en tres capas.

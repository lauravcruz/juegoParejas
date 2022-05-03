Mi primer proyecto trabajando con interfaz swing en java. 

Se trata del típico juego de encontrar parejas. Hay que clicar en dos de las 16 cartas y comparar si son la misma. De ser así, las dos desaparecían del tablero y 
sumaría uno al contador de aciertos. Si por el contrario no son coincidentes, se vuelven a voltear. Una vez el contador de aciertos llegue a 8, saltará un mensaje 
que indicará al jugador que ha ganado la partida y se le pregunta si quiere volver a jugar. 

Para desarrollar esta aplicación trabajé con la interfaz swing. Hice uso de un grid para colocar 16 JLabel en una cuadrícula. Para darles el aspecto de una carta, le 
asigné a todas un ImageIcon. Concretamente, la parte trasera de las cartas. Cuando el usuario pulsa una, se activa el evento click del ratón de esa carta, el cual tiene 
programado llamar a la función revelarCarta. En ella se comprueba primero que se pueda seleccionar una carta (no haya 2 levantadas) y después se le asigna el ImageIcon 
que le corresponde. En el caso de haber 2 levantadas (controladas por un array que almacena las dos cartas seleccionadas en el turno), se llama a la función comparar, 
la cual hace un equals de la URL del ImageIcon de cada carta. Además, se suma un intento al contador intentos, ubicado en la parte superior de la pantalla. De esta forma
el usuario puede ver en cuántas rondas gana la partida. 

Es interesante también señalar que cada vez que se ejecuta el programa, las cartas cambian de posición. Esto lo he logrado haciendo uso de un ArrayList con todos las
imágenes de las cartas, ya que con un Collections.shuffle lo desordenaba antes de asignarle una JLabel en el tablero. Para hacer esto empleé un HashMap en el que 
almacenaba un id con uno de los icons del ArrayList. 




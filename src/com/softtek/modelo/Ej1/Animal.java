package com.softtek.modelo.Ej1;

//Crear la clase abstracta Animal con los métodos abstractos comer() y moverse(). A continuación crearemos varias clases Perro, Pez, Pajaro, Gusano
//¿Qué ocurre si no implemento todos los métodos?
//-----Class 'Perro' must either be declared abstract or implement abstract method 'comer()' in 'Animal'
//¿Puedo crear instancias igualmente?
//-----java: com.softtek.modelo.Perro is not abstract and does not override abstract method moverse() in com.softtek.modelo.Animal. Se puede instanciar de todas menos que de animal. Una variable de refencia de una clase abstracta si la puedo instanciar. Lo que no Animal a1= new Animal();
//¿Puedo modificar parte de la definición de los métodos abstractos?
//------Los métodos abstractos deben ir vacíos. En las hijas sí pero en la abstracta no: misma salida
//¿Puedo utilizar polimorfismo?
//------Sí, es una de sus aplicaciones principales
//Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre.
//¿También son abstractas estas clases?
// No, estas clases pueden implementar e instanciar. Al extender ya no son abstractas.
public abstract class Animal {
    //Atributos
    //Metodos
    public abstract String comer();
    public abstract String moverse();
    //Constructor
    //Getters y Setters
}

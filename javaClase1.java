
import static java.time.Clock.system;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luisnavas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String saludar ="Hola cómo están?";
        // TODO code application logic here
        System.out.println(saludar);
        System.out.println(saludar + "Chao");
        /*Si usamos var no necesitamos definir el tipo de dato
        var despedida="Hasta pronto!";
        System.out.println(despedida);
        var usuario = "Luis";
        var saludar = "Hola ";
        System.out.println(saludar + " " + usuario);*/
 /*Operador sobrecargado*/
 /* var num = 90;
        var num2 = 120;
        System.out.println(num + num2);
        /*si encuentra cadena concatena*/
 /* System.out.println(saludar + num2 + num);
        /*si encuentra numeros suma y después concatena depende del orden es lo que va a realizar*/
 /*System.out.println(num + num2 + saludar);

        /*Reglas de declaración de variables*/
 /*Tipo de dato identificador*/
        //se deben usar letras minusculas
        //uso la notación de camello si contiene más de una palabra se usa mayusculas 
        /* var nombre = "Luis";
        System.out.println(nombre);
        //podemos usarguión bajo, signo dolar, caracteres, numeros intercalados al principio no
        var _apellido = "Navas";
        var $edad = 48;
        //si usamos var debenmos de asignar un valor
        int numero;
        float n;
        char adios;
        /*No se pueden usar palabras reservadas*/

 /*caracteres especiales*/
 /* System.out.println(nombre + " " + _apellido);
        System.out.println("Nueva línea \n " + nombre);
        System.out.println("Tabulador \t " + _apellido);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("Comillas simple \'" + nombre + "\'");
        System.out.println("Comilla doble \"" + nombre + "\"");

        /*Clase scanner*/
 /* Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcinoa el valor del usuario");
        var usuario = scanner.nextLine();
        
        System.out.println("usuario = " + usuario);*/
        //datos primitivos byte,short, int, long
        /*byte byteVar = 15;
        System.out.println(byteVar);*/
 /*byte otroByte=150; nos indica posible perdida al comvertir una literal
        de tipo entero a byte 32bytes no lo podemos guardar en 8bits
         *//*
        System.out.println("bits tipo byte " + Byte.SIZE);
        System.out.println("bytes que contiene " + Byte.BYTES);
        System.out.println("valor minimo " + Byte.MIN_VALUE);
        System.out.println("valor maximo " + Byte.MAX_VALUE);

        short shortVar = 1000;
        System.out.println(shortVar);
        System.out.println(" tamaño de short" + Short.SIZE);
        System.out.println(" bytes que contiene" + Short.BYTES);
        System.out.println(" tamaño minimo" + Short.MIN_VALUE);
        System.out.println(" tamaño maximo" + Short.MAX_VALUE);
        
        int intVar = 1000;
        System.out.println(intVar);
        System.out.println(" tamaño de int" + Integer.SIZE);
        System.out.println(" bytes que contiene" + Integer.BYTES);
        System.out.println(" tamaño minimo" + Integer.MIN_VALUE);
        System.out.println(" tamaño maximo" + Integer.MAX_VALUE);
        
        long longVar = 10000;
        System.out.println("longVar = " + longVar);
        System.out.println(longVar);
        System.out.println(" tamaño de int" + Long.SIZE);
        System.out.println(" bytes que contiene" + Long.BYTES);
        System.out.println(" tamaño minimo" + Long.MIN_VALUE);
        System.out.println(" tamaño maximo" + Long.MAX_VALUE);
        
        var numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        
        var numeroLong =2147483648L;
        System.out.println("numeroLong = " + numeroLong);*/
 /*numeros decimal, Octal,Hexadecimal y binario*/
 /* 
         int numeroDecimal=10;
         System.out.println("numeroDecimal = " + numeroDecimal);
         
         int numeroOctal = 012;
         System.out.println("numeroOctal = " + numeroOctal);
         
         int numeroHexadecimal= 0XA;
         System.out.println("numeroHexadecimal = " + numeroHexadecimal);
         
         int numeroBinario = 0b1010;
         System.out.println("numeroBinario = " + numeroBinario);*/

 /*primitivos float y double*//*
        float floatVar = 10000.10f;
        System.out.println("floatVar = " + floatVar);
        
        System.out.println("bits en el tipo float " + Float.SIZE);
        System.out.println("bytes en el tipo float " + Float.BYTES);
        System.out.println("valor minimo en el tipo float " + Float.MIN_VALUE);
        System.out.println("valor maximo en el tipo float " + Float.MAX_VALUE);
        
        double doubleVar = 100.10d;
        System.out.println("doubleVar = " + doubleVar);
        
        System.out.println("bits en el tipo Double " + Double.SIZE);
        System.out.println("bytes en el tipo Double " + Double.BYTES);
        System.out.println("valor minimo en el tipo Double " + Double.MIN_VALUE);
        System.out.println("valor maximo en el tipo Double " + Double.MAX_VALUE);
         */
 /*
        System.out.println("bits en el tipo Char " + Character.SIZE);
        System.out.println("bytes en el tipo Char " + Character.BYTES);
        System.out.println("valor minimo en el tipo Char " + Character.MIN_VALUE);
        System.out.println("valor maximo en el tipo Char " + Character.MAX_VALUE);
        char varChar='a';
        System.out.println("varChar = " + varChar);
        //usando unicode
        char dosChar ='\u0021';
        System.out.println("dosChar = " + dosChar);
        //usando el char decimal, no se puede usar con var
        char varCharDecimal=33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        //directo del simbolo
        char simboloChar='!';
        System.out.println("simboloChar = " + simboloChar);*/

 /*Primitivos tipo boolean*/
        //boolean/*
        /*System.out.println("true tipo boolean " + Boolean.TRUE);
        System.out.println("true tipo boolean " + Boolean.FALSE);
        
        boolean booleanVar = false;
        
        if(booleanVar){
            System.out.println("Es verdadero el valor");
        }else{
            System.out.println("El valor es falso");
        }
        System.out.println("");
        
        var edad =20;
        var esAdulto=edad >=18;
        if(esAdulto){
            System.out.println("Es adulto");
        }else{
            System.out.println("Aún eres menor ");
        }*/
 /*Conversión de tipos primitivos cadena a entero*/
 /*
        var edad = Integer.parseInt("190");
        System.out.println("edad = " + edad);
        
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        /*string a cadena seleccionar un elemento de la cadena*/
 /*char c = "Hola".charAt(3);
        System.out.println("c = " + c);
        
        var scanner =new Scanner(System.in);
        int edades = Integer.parseInt(scanner.nextLine());
        System.out.println("edades = " + edades);
        
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        /*conversion a string*/
 /* String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);
        
        /*Conversión de tipos*/
 /*  short s = 10;
        byte b = (byte)s;//se debe usar antes el tipo a convertir entre parentesis short 16 bits byte 8 se puede perder información por ser incompatibles
        System.out.println("b = " + b);*/
 /*Operadores Aritmeticos*/
        //int a = 3, b = 4; //No se puede usar var para declarar varias
        /* int resultado = a + b;
        System.out.println("resultado = " + resultado);
        System.out.println("El resultado de la suma es: " + a + b);
        System.out.println("El resultado de la suma es: " + (a + b));
        resultado = a - b;
        System.out.println(" Resultado resta = " + resultado);
        System.out.println("La resta es : " + (a-b));
        System.out.println("La multiplicación es: " +(a * b));
        resultado = a/b;
        System.out.println("resultado de la división = " + resultado);
        
        resultado = a % b;
        System.out.println(" módulo resultado = " +  resultado);
        
        resultado = a % 2;
        System.out.println("resultado = " + resultado);
        if(resultado == 0){
            System.out.println("Es un número par");
        }else{
            System.out.println("Es Impar");
        }*/
 /*Operador de asignación Composición*/
 /* int a=3, b=2;
       
       int c =a;
       
        System.out.println("c = " + c);
        
        c= a+5-b;
        System.out.println("c = " + c);
        
        a+=1;//a=a+1
        System.out.println("a = " + a);
        a+=5;
        System.out.println("a = " + a);
        a-=1;// es lo mismo a=a-1;
        System.out.println("a = " + a);
        
        a*=3;//a = a*3;
        System.out.println("a = " + a);
        
        a/=5;
        System.out.println("a = " + a);
        a++;
        a%=2;
        System.out.println("a = " + a);*/
 /*(OPeradores unarios) de inversión */
 /*
     int a = 3;
     int b = -a;
        System.out.println("b = " + b);
        
        boolean c=true;
        boolean d= !c;
        
        System.out.println("d = " + d);
         */
        //incremento y decremento preincremento y post incremento
        /* int e = 3;
        int f= ++e;
        System.out.println("f = " + f);
        System.out.println("e = " + e);
        int g=5;
        int h = g++;
        
        
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        System.out.println("Decremento"+ g--);//post decremento
        System.out.println("g = " + g);*/
 /*Operadores de igualdad y relacionales*/
 int a=3, b=2;
 
 boolean si = (a == b);//si son iguales
        System.out.println("si = " + si);
        
        si = (a!=b);//si son diferentes
        System.out.println("si = " + si);
        String cadena = "Hola";
        String cadena2 ="CHao";
        System.out.println(cadena.equals(cadena2));
        boolean d = a >= b;//< > <=  >=
        System.out.println("d = " + d);
        
        boolean e=a<=b;
        System.out.println("e = " + e);
        
        if(b % 2 == 0){
            System.out.println("Es un número Par");
        }else{
            System.out.println("Es un número Impar");
        }
    }

}

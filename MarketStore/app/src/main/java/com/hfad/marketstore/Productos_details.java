package com.hfad.marketstore;

public class Productos_details {

    private String name_prod;
    private String description;
    private String precio;
    private int imageResourceId;
    private  int tipo;
//14 20 25 33
    public static final  Productos_details[] productos = { //   0 KG   - 1 PZA   - 2 CJA
            new Productos_details("Manzana Roja","75","Manzana roja escolar deliciosa, piel brillante, bicolor (roja-verdosa) textura crujiente y sabor suave y azucarado. Venta por kilogramos ",
                    R.drawable.manroja,0),
            new Productos_details("Manzana Verde", "60","Fruto de color verde intenso. De pulpa blanca, muy crujiente y jugosa con sabor ligeramente ácido. Venta por kilogramos",
                    R.drawable.manverde,0),
            new Productos_details("Pera", "35","Fruta con sabor dulce y apreciablemente harinosa al paladar; su piel es delgada, lisa y puede ser de una tonalidad de color verde pastel. Venta en kilogramos",
                    R.drawable.peras,0),
            new Productos_details("Fresas", "75","Fruto de color rojo brillante, suculento y fragante que se obtiene de la planta que recibe su mismo nombre. Venta en kilogramos",
                    R.drawable.fresas,0),
            new Productos_details("Platano", "75","Fruta tropical procedente de la planta herbácea que recibe el mismo nombre o banano, textura lisa y color amarillo. Venta en kilogramos",
                    R.drawable.platano,0),
            new Productos_details("Naranja", "75","Fruto del naranjo dulce, árbol que pertenece al género Citrusde la familia de las rutáceas. Color naranja, sabor dulce y agrio. Venta en kilogramos",
                    R.drawable.naranja,0),
            new Productos_details("Sandia", "75","Fruto grande y de forma más o menos esférica que suele consumirse cruda como postre. Su pulpa es de color rojizo o amarillento y de sabor dulce. Venta en piezas",
                    R.drawable.sandia, 1),

            new Productos_details("Filete de RES", "150","Trozos de carne que se encuentran entre el aguayón y el entrecot, muy codiciada y de alto valor comercial. Venta en kilogramos",
                    R.drawable.f_r, 0),
            new Productos_details("Filete de CERDO", "130","Trozos de carne que se encuentran entre el aguayón y el entrecot, muy codiciada y de alto valor comercial. Venta en kilogramos",
                    R.drawable.f_c, 0),
            new Productos_details("Filete de PESCADO", "115","Trozos de carne que se encuentran entre el aguayón y el entrecot, muy codiciada y de alto valor comercial. Venta en kilogramos",
                    R.drawable.f_p, 0),
            new Productos_details("Nuggets de POLLO", "4","Piezas de pollo envueltas en una capa de harina para freir. Venta en piezas",
                    R.drawable.nuggets, 1),
            new Productos_details("POLLO", "110","Trozos de carne de pollo sin cuero, venta en kilogramos",
                    R.drawable.pollo, 0),
            new Productos_details("SALCHICHA DE PAVO", "68","Salchicha hecha de carne de pavo, 100 % fresca y deliciosa, Venta en kilogramos",
                    R.drawable.salchicha, 0),
            new Productos_details("JAMON DE PAVO", "78","Jamon hecho de carne de pavo, 100% pavo, venta en kilogramos",
                    R.drawable.jamon, 0),

            new Productos_details("LYSON", "87","Producto para desinfectar el hogar mediante presion, efectivo contra 99.9% de germenes y virus en el hogar",
                    R.drawable.lyson, 1),
            new Productos_details("Fabuloso", "28","Producto de limpieza en el hogar, con un aroma delicioso",
                    R.drawable.fab, 1),
            new Productos_details("Pinol", "34","Producto de limpieza, uso tipico en mesas y pisos, con un olor delicioso. Combate virus y vacterias al casi 100%",
                    R.drawable.pinol, 1),
            new Productos_details("Jabon de ropa MarketPlace", "26","Jabon para ropa oficial de esta tienda en linea, hecho de forma natural el cual dejara la ropa impecable",
                    R.drawable.j_r, 1),
            new Productos_details("Jabon de cuerpo MarketPlace", "26","Jabon para cuerpo oficial de esta tienda en linea, hecho de forma natural",
                    R.drawable.j_c, 1),
            new Productos_details("Shampoo MarketPlace", "65","Shampoo marca propia de esta tienda, contra la caspa, fortalece el cabello hasta las puntas y ayuda a un hidratado favorable",
                    R.drawable.shampoo, 1),

            new Productos_details("Muneca Barbie", "115","Muneca de barbie para jugar, es un juguete famoso y muy vendido",
                    R.drawable.barbie, 1),
            new Productos_details("Oso de peluche", "150","Peluche en forma de oso relleno con algodon y cocido a mano",
                    R.drawable.oso, 1),
            new Productos_details("Carritos HotWheels", "80","Carritos coleccionables marca hot Wheels, los carritos vendidos son de forma aleatoria",
                    R.drawable.carrito, 1),
            new Productos_details("LEGOS", "198","Lego para armas lo que la mente quiera, completamente libres y de 1000 piezas",
                    R.drawable.legos, 1),
            new Productos_details("Rompecabezas de Perritos", "115","Rompecabezas de 100 piezas con dibujos de perritos, perfecto para entrenar la mente",
                    R.drawable.romp, 1),

            new Productos_details("Aspirina", "90","Medicamento enfocado en el dolor; de cabeza, cuerpo, gripe",
                    R.drawable.aspi, 2),
            new Productos_details("Paracetamol", "89","Medicamento general especializado para el dolor de cuerpo y de cabeza ligeros.",
                    R.drawable.para, 2),
            new Productos_details("Jarabe para la tos", "80","Medicamento liquido para tos con flemas y garraspera en la garganta",
                    R.drawable.jar, 2),
            new Productos_details("Pastillas Next", "50","Pastillas enfocadas para la gripe y alergias simples.",
                    R.drawable.next, 2),
            new Productos_details("Vendas", "15","Vendas para cubrir heridas completamente nuevas y empaquetadas",
                    R.drawable.vendas, 1),
            new Productos_details("Jeringas", "20","Jeringas para inyectar medicamento liquido, nuevas y con aguja",
                    R.drawable.jeringas, 1),
            new Productos_details("Botiquin de Primeros Auxilios", "115","Botiquin con los objetos basicos que se necesitan en un viaje; Vendas, gasas, agua oxigenada, curitas etc.",
                    R.drawable.botiquin, 1),
            new Productos_details("Gasas", "115","Pequenos trozos de tela para cubrir heridas o limpiarlas.",
                    R.drawable.gasas, 1),

            new Productos_details("Frijol", "30","Legumbres son semillas de plantas grandes, carnosas y coloridas. Venta en KG",
                    R.drawable.frijol, 0),
            new Productos_details("Azucar", "25","Cuerpo de características sólidas que es blanco y se encuentra cristalizado. Sabor dulce. Venta en KG ",
                    R.drawable.azucar, 0),
            new Productos_details("Lentejas", "25","Especie dicotiledónea, herbácea, anual, de porte erecto y ramificado. Pertenece a la familia de las Leguminosas (Fabaceae) y es de hábito de crecimiento indeterminado.",
                    R.drawable.lentejas, 0),
            new Productos_details("Leche LALA", "22","La leche es una mezcla de agua, proteínas, grasas, vitaminas, hidratos de carbono y minerales. Cada tipo de leche tiene diferentes propiedades, dependiendo de las sustancias que aparezcan en la mezcla: ",
                    R.drawable.leche, 1),
            new Productos_details("Tortillas de Maiz", "23","Es un alimento de forma plana y circular elaborado con maíz nixtamalizado, que se muele, se hace masa, y se cuece en un comal",
                    R.drawable.tormaiz, 0),
            new Productos_details("Cartera de huevo", "90","Huevo de gallita, 30pzas, Es un alimento de origen animal con muchas propiedades nutricionales y culinarias.",
                    R.drawable.cartera, 2),
            new Productos_details("Tortillas de Harina", "30","Es un alimento de forma plana y circular elaborado con maíz nixtamalizado, que se muele, se hace masa, y se cuece en un comal",
                    R.drawable.torharina, 0),

            new Productos_details("Galletas", "16","Paquetes de galletas mixtos, la especialidad del mercado son las galetas de vainilla",
                    R.drawable.galletas, 1),
            new Productos_details("Empanadas", "10","Empanadas caceras rellenas de cajeta, deliciosas y recien orneadas",
                    R.drawable.empanada, 1),
            new Productos_details("Papitas Mixtas", "16","Papas de diferentes marcas, venta en bolsas ",
                    R.drawable.papitas, 1),
            new Productos_details("Cacahuates", "40"," es uno de los frutos secos más consumidos junto con la almendra. Venta en kilogramos. ",
                    R.drawable.cacahuate, 0),
            new Productos_details("Sodas Mixtas", "40","Bebida con gas de diferentes sabores, unicamente se venden de a 3 Litros",
                    R.drawable.sodas, 1),
            new Productos_details("Pan Dulce", "10","Piezas de pan dulces, como conchas, cuernitos y pastelitos ",
                    R.drawable.pan, 1)
    };
    private  Productos_details(String name, String precio, String description, int imageResourceId, int tipo) {
        this.name_prod = name;
        this.precio = precio;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.tipo = tipo;
    }

    public String getName() {
        return name_prod;
    }

    public String getPrecio() {
        return precio;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() { return imageResourceId; }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return this.name_prod;
    }
}
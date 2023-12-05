package com.hfad.marketstore;

public class Productos_details {

    private String name_prod;
    private String description;
    private String precio;
    private int imageResourceId;
    private  int tipo;
//14 20 25 33
    public static final  Productos_details[] productos = { //   0 KG   - 1 PZA   - 2 CJA
        new Productos_details("Americano", "43", "Espresso suave diluido en agua caliente, perfecto para los amantes del café con un toque menos intenso.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Espresso", "60", "Café fuerte y concentrado hecho al forzar vapor a través de granos de café molido finamente.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Cortado", "35", "Un espresso 'cortado' o 'corto', con un toque de leche para suavizar su sabor.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Chai", "75", "Té con especias infusionadas en una base de leche caliente o agua.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Tisana", "45", "Infusión de hierbas, frutas o especias en agua caliente, sin contenido de cafeína.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Vietnamita", "65", "Café vietnamita con café molido, filtrado y mezclado con leche condensada.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Mocha", "70", "Café con leche o chocolate, a menudo servido con crema batida y jarabe de chocolate.",
                R.drawable.banner_coffee, 1),
        new Productos_details("Chocolate", "55", "Bebida caliente hecha con chocolate derretido o polvo de cacao.",
                R.drawable.banner_coffee, 1),
        new Productos_details("Matcha", "80", "Polvo de té verde molido fino, a menudo usado para hacer bebidas calientes o helados.",
                R.drawable.banner_coffee, 1),
        new Productos_details("Capuchino", "55", "Café espresso mezclado con leche y una capa de espuma de leche vaporizada.",
                R.drawable.banner_coffee, 1),
        new Productos_details("Latte", "50", "Café espresso con leche al vapor y una fina capa de espuma de leche.",
                R.drawable.banner_coffee, 1),

        new Productos_details("Mocha", "80", "Frappé delicioso con una mezcla perfecta de café y chocolate, coronado con crema batida y jarabe de chocolate.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Brownie", "75", "Frappé con sabor a brownie, mezcla de chocolate y nueces con crema batida y trozos de brownie en la parte superior.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Oreo", "70", "Frappé con sabor a galleta oreo, mezclado con helado de vainilla y galletas oreo trituradas.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Mazapán", "85", "Frappé con sabor a mazapán, una mezcla suave de almendras y azúcar, decorado con crema batida y almendras.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Chai", "65", "Frappé con sabor a chai, infusionado con especias y leche, una bebida refrescante con un toque de sabor oriental.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Tisana", "60", "Frappé refrescante hecho con una infusión de hierbas y frutas en una base de hielo, sin cafeína.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Matcha", "90", "Frappé hecho con matcha, té verde molido, servido frío y con leche, una bebida energizante.",
                R.drawable.banner_coffee, 0),

        new Productos_details("Americano en las Rocas", "85", "Café americano enfriado con hielo, una bebida refrescante con un toque intenso de café.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Chai en las Rocas", "80", "Chai especiado servido sobre hielo, una bebida fresca con sabores orientales.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Tisana en las Rocas", "75", "Tisana fría con hierbas y frutas, una opción sin cafeína para refrescarte.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Vietnamita en las Rocas", "90", "Café vietnamita con hielo, café filtrado mezclado con leche condensada y servido sobre hielo.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Mocha en las Rocas", "95", "Mocha frío con hielo, mezcla de café, chocolate y leche, perfecto para refrescarte en días calurosos.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Matcha en las Rocas", "100", "Bebida de matcha fría servida sobre hielo, una opción refrescante y llena de antioxidantes.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Latte en las Rocas", "85", "Latte con hielo, café suave con leche servido frío sobre hielo, una opción refrescante.",
                R.drawable.banner_coffee, 0),

        new Productos_details("Brownie", "60", "Delicioso brownie casero, chocolate denso y jugoso, el acompañante perfecto para tu café.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Galleta", "40", "Galleta recién horneada, crujiente por fuera y suave por dentro, para acompañar tu bebida favorita.",
                R.drawable.banner_coffee, 0),
        new Productos_details("Deli Barras", "75", "Barra de postre variado con trozos de brownie, galleta y otros dulces para endulzar tu día.",
                R.drawable.banner_coffee, 0)
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
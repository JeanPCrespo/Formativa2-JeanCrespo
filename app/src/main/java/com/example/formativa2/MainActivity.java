package com.example.formativa2;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.formativa2.adaptador.ProductoAdaptador;
import com.example.formativa2.productos.Productos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_produc;
    List<Productos> ListaProductos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rcv_produc = findViewById(R.id.rcv_produc);

        Productos produc1 = new Productos("https://images.pexels.com/photos/70497/pexels-photo-70497.jpeg", 25000, "Comida rápida", "Deliciosa comida rápida para disfrutar en cualquier momento.");
        Productos produc2 = new Productos("https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg", 45000, "Comida Gourmet", "Exquisita comida gourmet para los paladares más exigentes.");
        Productos produc3 = new Productos("https://images.pexels.com/photos/1703272/pexels-photo-1703272.jpeg", 18000, "Sopa", "Sopa caliente y reconfortante, perfecta para cualquier ocasión.");
        Productos produc4 = new Productos("https://images.pexels.com/photos/1282278/pexels-photo-1282278.jpeg", 4000, "Bebidas", "Refrescantes bebidas para acompañar tus comidas.");

        for (int i = 0; i < 1; i++) {
            ListaProductos.add(produc1);
            ListaProductos.add(produc2);
            ListaProductos.add(produc3);
            ListaProductos.add(produc4);
        }

        rcv_produc.setLayoutManager(new GridLayoutManager(this, 2));
        rcv_produc.setAdapter(new ProductoAdaptador(ListaProductos));
    }
}

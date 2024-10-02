package com.example.formativa2.productos;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.formativa2.R;
import com.squareup.picasso.Picasso;

public class DetallesProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalles_producto);

        TextView txtNombre = findViewById(R.id.txt_nombre_prod);
        TextView txtPrecio = findViewById(R.id.txt_precio_prod);
        TextView txtDetalles = findViewById(R.id.txt_detalles_prod);
        ImageView imgProd = findViewById(R.id.img_prod);

        String nombre = getIntent().getStringExtra("nombre");
        double precio = getIntent().getDoubleExtra("precio", 0);
        String imagen = getIntent().getStringExtra("imagen");
        String detalles = getIntent().getStringExtra("detalles");

        txtNombre.setText(nombre);
        txtPrecio.setText(String.valueOf(precio));
        txtDetalles.setText(detalles);
        Picasso.get().load(imagen).into(imgProd);
    }
}

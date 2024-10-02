package com.example.formativa2.adaptador;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.formativa2.R;
import com.example.formativa2.productos.DetallesProducto;
import com.example.formativa2.productos.Productos;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductoAdaptador extends RecyclerView.Adapter<ProductoAdaptador.ViewHolder> {
    private List<Productos> datos;

    public ProductoAdaptador(List<Productos> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public ProductoAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_productos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoAdaptador.ViewHolder holder, int position) {
        Productos dato = this.datos.get(position);
        holder.bind(dato);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetallesProducto.class);
                intent.putExtra("nombre", dato.getNombre());
                intent.putExtra("precio", dato.getPrecio());
                intent.putExtra("imagen", dato.getImg());
                intent.putExtra("detalles", dato.getDetalles()); // Asegúrate de pasar los detalles
                v.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_nombre_prod, txt_precio_prod;
        ImageView img_prod;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre_prod = itemView.findViewById(R.id.txt_nombre_prod);
            txt_precio_prod = itemView.findViewById(R.id.txt_precio_prod);
            img_prod = itemView.findViewById(R.id.img_prod);
        }

        public void bind(Productos datos) {
            txt_nombre_prod.setText(datos.getNombre());
            txt_precio_prod.setText(String.valueOf(datos.getPrecio()));
            Picasso.get().load(datos.getImg()).into(img_prod);
        }
    }
}

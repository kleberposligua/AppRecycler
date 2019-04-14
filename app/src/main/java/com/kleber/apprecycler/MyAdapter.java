package com.kleber.apprecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<PersonajeVo> listDatos = new ArrayList<PersonajeVo>();

    public MyAdapter(List<PersonajeVo> listDatos) {
        this.listDatos = listDatos;
    }



    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        //carga una lista de personajes
        //View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personajes,null,false);

        //carga un grid de personajes
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_personajes,null,false);

        return new MyViewHolder (view);

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        //aqui se establece la comunicación en nuestro adaptador y la clase ViewHolderDatos;
       holder.etiNombre.setText(listDatos.get(position).getNombre());
       //holder.etiInformacion.setText(listDatos.get(position).getInfo()); //comentado para poder usar el grid
       holder.foto.setImageResource(listDatos.get(position).getFoto());

        //holder.textView.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView etiNombre;
        TextView etiInformacion;
        ImageView foto;

        public MyViewHolder(View viewItem) {
            super(viewItem);
            etiNombre=(TextView) viewItem.findViewById(R.id.idNombre);
            //etiInformacion=(TextView) viewItem.findViewById(R.id.idInfo); //comentado para poder usar el gridlayout
            foto=(ImageView)viewItem.findViewById(R.id.idImagen);

        }

//        public void asignarDatos(String s) {
//            textView.setText(s);
//        }
    }

}
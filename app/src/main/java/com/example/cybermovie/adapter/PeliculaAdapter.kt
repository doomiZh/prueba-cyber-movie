package com.example.cybermovie.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import com.example.cybermovie.activity.PeliculaCrudFormularioActivity
import com.example.cybermovie.R
import com.example.cybermovie.activity.UserCrudFormularioActivity
import com.example.cybermovie.entity.Pelicula

class PeliculaAdapter {
    private var context: Context? = null
    private var lista: List<Pelicula>? = null

    fun PeliculaAdapter(context: Context, resource: Int, lista: List<Pelicula>) {
        super(context, resource, lista)
        this.context = context
        this.lista = lista
    }

    @NonNull
    fun getView(position: Int, @Nullable convertView: View?, @NonNull parent: ViewGroup?): View? {
        val inflater: LayoutInflater =
            context.getSystemService(context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row: View = inflater.inflate(R.layout.activity_pelicula_crud_item, parent, false)
        val obj = lista!![position]

        val txtId: TextView = row.findViewById(R.id.idItemCrudPeliculaId)
        txtId.setText(obj.getIdPelicula().toString())

        val txtNom_peli: TextView = row.findViewById(R.id.idItemCrudPeliculaNomPeli)
        txtNom_peli.setText(obj.getNom_peli())

        val txtDuracion: TextView = row.findViewById(R.id.idItemCrudPeliculaDuracion)
        txtDuracion.setText(obj.getDuracion())

        val txtStock: TextView = row.findViewById(R.id.idItemCrudPeliculaStock)
        txtStock.setText(obj.getStock())

        val imgsPeli: TextView = row.findViewById(R.id.idItemCrudPeliculaImgs)
        imgsPeli.setText(obj.getImgPeli())

        row.setOnClickListener(object : View.OnClickListener() {
            override fun onClick(v: View?) {
                val intent = Intent(context, PeliculaCrudFormularioActivity::class.java)
                intent.putExtra("var_id", obj.getIdPelicula())
                intent.putExtra("var_nom_peli", obj.getNom_peli())
                intent.putExtra("var_duracion", obj.getDuracion())
                intent.putExtra("var_stock", obj.getStock())
                intent.putExtra("var_imgspeli", obj.getImgPeli())
                context.startActivity(intent)
            }
        })
        return row
    }

}
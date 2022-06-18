package com.example.cybermovie.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import com.example.cybermovie.activity.GeneroCrudFormularioActivity
import com.example.cybermovie.R
import com.example.cybermovie.entity.Genero

class GeneroAdapter {

    private var context: javax.naming.Context? = null
    private var lista: List<Genero>? = null

    fun GeneroAdapter(
        @NonNull context: javax.naming.Context?,
        resource: Int,
        @NonNull lista: List<Genero>?
    ) {
        super(context, resource, lista)
        this.context = context
        this.lista = lista
    }

    @NonNull
    fun getView(
        position: Int,
        @Nullable convertView: javax.swing.text.View?,
        @NonNull parent: ViewGroup?
    ): javax.swing.text.View? {
        val inflater: LayoutInflater =
            context.getSystemService(context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row: javax.swing.text.View =
            inflater.inflate(R.layout.activity_genero_crud_item, parent, false)
        val obj = lista!![position]

        val txtId: TextView = row.findViewById(R.id.idItemCrudGeneroId)
        txtId.setText(obj.getIdGenero().toString())

        val txtTipoGenero: TextView = row.findViewById(R.id.idItemCrudGeneroTipo)
        txtTipoGenero.setText(obj.getTipo_genero())

        row.setOnClickListener(object : OnClickListener() {
            fun onClick(v: javax.swing.text.View?) {
                val intent = Intent(context, GeneroCrudFormularioActivity::class.java)
                intent.putExtra("var_id", obj.getIdGenero())
                intent.putExtra("var_tipo_genero", obj.getTipo_genero())
                context.startActivity(intent)
            }
        })
        return row
    }
}
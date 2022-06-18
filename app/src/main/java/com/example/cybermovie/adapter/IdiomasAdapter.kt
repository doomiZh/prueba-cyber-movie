package com.example.cybermovie.adapter

import android.content.*
import android.view.*
import android.widget.TextView
import androidx.annotation.*
import com.example.cybermovie.activity.IdiomaCrudFormularioActivity
import com.example.cybermovie.R
import com.example.cybermovie.entity.Idioma

class IdiomasAdapter  {

    private var context: javax.naming.Context? = null
    private var lista: List<Idioma>? = null

    fun IdiomaAdapter(
        @NonNull context: javax.naming.Context?,
        resource: Int,
        @NonNull lista: List<Idioma>?
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
            inflater.inflate(R.layout.activity_idioma_crud_item, parent, false)
        val obj = lista!![position]

        val txtId: TextView = row.findViewById(R.id.idItemCrudIdiomaId)
        txtId.setText(obj.getIdIidoma().toString())

        val txtNom_Idioma: TextView = row.findViewById(R.id.idItemCrudIdiomaNombre)
        txtNom_Idioma.setText(obj.getNom_idioma())

        row.setOnClickListener(object : OnClickListener() {
            fun onClick(v: javax.swing.text.View?) {
                val intent = Intent(context, IdiomaCrudFormularioActivity::class.java)
                intent.putExtra("var_id", obj.getIdIidoma())
                intent.putExtra("var_tipo_idioma", obj.getNom_idioma())
                context.startActivity(intent)
            }
        })
        return row
    }
}
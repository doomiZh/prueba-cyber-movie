package com.example.cybermovie.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import com.example.cybermovie.R
import com.example.cybermovie.activity.TipoPagoCrudFormularioActivity

import com.example.cybermovie.entity.TipoPago


class TipoPagoAdapter {
    private var context: Context? = null
    private var lista: List<TipoPago>? = null

    fun TipoPagoAdapter(context: Context, resource: Int, lista: List<TipoPago>) {
        super(context, resource, lista)
        this.context = context
        this.lista = lista
    }

    @NonNull
    fun getView(position: Int, @Nullable convertView: View?, @NonNull parent: ViewGroup?): View? {
        val inflater: LayoutInflater =
            context.getSystemService(context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row: View = inflater.inflate(R.layout.activity_tipopago_crud_item, parent, false)
        val obj = lista!![position]

        val txtId: TextView = row.findViewById(R.id.idItemCrudTipoPagoId)
        txtId.setText(obj.getIdTipoPago().toString())

        val txtNom_Tpago: TextView = row.findViewById(R.id.idItemCrudTipoPagoNPago)
        txtNom_Tpago.setText(obj.getNom_tpago())

        row.setOnClickListener(object : View.OnClickListener() {
            override fun onClick(v: View?) {
                val intent = Intent(context, TipoPagoCrudFormularioActivity::class.java)
                intent.putExtra("var_id", obj.getIdTipoPago())
                intent.putExtra("var_nom_tpago", obj.getNom_tpago())
                context.startActivity(intent)
            }
        })
        return row
    }
}
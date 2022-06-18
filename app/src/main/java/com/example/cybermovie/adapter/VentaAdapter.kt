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
import com.example.cybermovie.activity.VentaCrudFormularioActivity
import com.example.cybermovie.entity.Venta

class VentaAdapter {
    private var context: Context? = null
    private var lista: List<Venta>? = null

    fun VentaAdapter(context: Context, resource: Int, lista: List<Venta>) {
        super(context, resource, lista)
        this.context = context
        this.lista = lista
    }

    @NonNull
    fun getView(position: Int, @Nullable convertView: View?, @NonNull parent: ViewGroup?): View? {
        val inflater: LayoutInflater =
            context.getSystemService(context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row: View = inflater.inflate(R.layout.activity_venta_crud_item, parent, false)
        val obj = lista!![position]

        val txtId: TextView = row.findViewById(R.id.idItemCrudVentaId)
        txtId.setText(obj.getIdVenta().toString())

        val txtValor: TextView = row.findViewById(R.id.idItemCrudVentaValor)
        txtValor.setText(obj.getValor())

        val txtFechaPedido: TextView = row.findViewById(R.id.idItemCrudVentaFechaPedido)
        txtFechaPedido.setText(obj.getFechaPedido())

        row.setOnClickListener(object : View.OnClickListener() {
            override fun onClick(v: View?) {
                val intent = Intent(context, VentaCrudFormularioActivity::class.java)
                intent.putExtra("var_id", obj.getIdVenta())
                intent.putExtra("var_valor", obj.getValor())
                intent.putExtra("var_fec_ped", obj.getFechaPedido())
                context.startActivity(intent)
            }
        })
        return row
    }

}
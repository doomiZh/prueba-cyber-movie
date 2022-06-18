package com.example.cybermovie.adapter

import android.content.*
import android.view.*
import android.widget.*
import androidx.annotation.*
import com.example.cybermovie.R
import com.example.cybermovie.activity.UserCrudFormularioActivity
import com.example.cybermovie.entity.User

class UserAdapter {

    private var context: Context? = null
    private var lista: List<User>? = null

    fun UserAdapter(context: Context, resource: Int, lista: List<User>) {
        super(context, resource, lista)
        this.context = context
        this.lista = lista
    }

    @NonNull
    fun getView(position: Int, @Nullable convertView: View?, @NonNull parent: ViewGroup?): View? {
        val inflater: LayoutInflater =
            context.getSystemService(context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row: View = inflater.inflate(R.layout.activity_user_crud_item, parent, false)
        val obj = lista!![position]

        val txtId: TextView = row.findViewById(R.id.idItemCrudUserId)
        txtId.setText(obj.getIdUsuario().toString())

        val txtNom_usu: TextView = row.findViewById(R.id.idItemCrudUserNombre)
        txtNom_usu.setText(obj.getNom_usu())

        val txtApe_usu: TextView = row.findViewById(R.id.idItemCrudUserApellido)
        txtApe_usu.setText(obj.getApe_usu())

        val txtFec_nac: TextView = row.findViewById(R.id.idItemCrudUserFNac)
        txtFec_nac.setText(obj.getFec_nac())

        val txtTelefono: TextView = row.findViewById(R.id.idItemCrudUserTelefono)
        txtTelefono.setText(obj.getTel_usu())

        val txtCorreo: TextView = row.findViewById(R.id.idItemCrudUserCorreo)
        txtCorreo.setText(obj.getCorreo_usu())

        val txtPassword: TextView = row.findViewById(R.id.idItemCrudUserPassword)
        txtPassword.setText(obj.getPassword())

        row.setOnClickListener(object : View.OnClickListener() {
            override fun onClick(v: View?) {
                val intent = Intent(context, UserCrudFormularioActivity::class.java)
                intent.putExtra("var_id", obj.getIdUsuario())
                intent.putExtra("var_nom_usu", obj.getNom_usu())
                intent.putExtra("var_ape_usu", obj.getApe_usu())
                intent.putExtra("var_fecnac", obj.getFec_nac())
                intent.putExtra("var_telefono", obj.getTel_usu())
                intent.putExtra("var_correo", obj.getCorreo_usu())
                intent.putExtra("var_password", obj.getPassword())
                context.startActivity(intent)
            }
        })
        return row
    }
}
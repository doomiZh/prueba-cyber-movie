package com.example.cybermovie.entity

class User {

    private var idUsuario = 0
    private var nom_usu: String? = null
    private var ape_usu: String? = null
    private var fec_nac: String? = null
    private var tel_usu: String? = null
    private var correo_usu: String? = null
    private var password: String? = null




    fun getIdUsuario(): Int {
        return idUsuario
    }

    fun setIdUsuario(idUsuario: Int) {
        this.idUsuario = idUsuario
    }

    fun getNom_usu(): String? {
        return nom_usu
    }

    fun setNom_usu(nom_usu: String?) {
        this.nom_usu = nom_usu
    }

    fun getApe_usu(): String? {
        return ape_usu
    }

    fun setApe_usu(ape_usu: String?) {
        this.ape_usu = ape_usu
    }

    fun getFec_nac(): String? {
        return fec_nac
    }

    fun setFec_nac(fec_nac: String?) {
        this.fec_nac = fec_nac
    }

    fun getTel_usu(): String? {
        return tel_usu
    }

    fun setTel_usu(tel_usu: String?) {
        this.tel_usu= tel_usu
    }


    fun getCorreo_usu(): String? {
        return correo_usu
    }

    fun setCorreo_usu(nacionalidad: String?) {
        this.correo_usu = correo_usu
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String?) {
        this.password = password
    }



}
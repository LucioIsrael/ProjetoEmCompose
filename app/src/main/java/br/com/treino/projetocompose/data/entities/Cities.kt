package br.com.treino.projetocompose.data.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "cities")
@Parcelize
data class Cities(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val name: String? = null,
    val cep: String? = null,
    val uf: String? = null
): Parcelable

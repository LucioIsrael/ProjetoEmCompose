package br.com.treino.projetocompose.data.dao

import androidx.room.*
import br.com.treino.projetocompose.data.entities.Cities
import kotlinx.coroutines.flow.Flow

@Dao
interface CityDAO {

    @Insert
    suspend fun insert(city: Cities)

    @Update
    suspend fun update(city: Cities)

    @Delete
    suspend fun delete(city: Cities)

    @Query("SELECT * from cities")
    fun getAllCities(): Flow<List<Cities>>

}
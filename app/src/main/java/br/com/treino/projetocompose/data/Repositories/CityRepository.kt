package br.com.treino.projetocompose.data.Repositories

import br.com.treino.projetocompose.data.db.AppDB
import br.com.treino.projetocompose.data.entities.Cities
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


@ViewModelScoped
class CityRepository @Inject constructor(
    appDB: AppDB
) {

    private val dao = appDB.CityDAO()

    val getAllCities: Flow<List<Cities>> = dao.getAllCities()

    suspend fun addCity(c: Cities){
        dao.insert(c)
    }
    suspend fun updateCity(c: Cities){
        dao.update(c)
    }
    suspend fun deleteCity(c: Cities){
        dao.delete(c)
    }



}
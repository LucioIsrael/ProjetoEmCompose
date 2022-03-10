package br.com.treino.projetocompose.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.treino.projetocompose.data.dao.CityDAO
import br.com.treino.projetocompose.data.entities.Cities

@Database(entities = [Cities::class],version = 1, exportSchema = false)
abstract class AppDB: RoomDatabase() {

    abstract fun CityDAO() : CityDAO

}
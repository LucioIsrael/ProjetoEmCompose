package br.com.treino.projetocompose.DI

import android.content.Context
import androidx.room.Room
import br.com.treino.projetocompose.data.db.AppDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Module {

    @Provides
    @Singleton
    fun providerDb(@ApplicationContext appContext: Context): AppDB
    {
        return Room.databaseBuilder(appContext, AppDB::class.java, "bdRoomCompose")
            .fallbackToDestructiveMigration().build()
    }

    @Provides
    fun CityRepository(db:AppDB) = db.CityDAO()

}
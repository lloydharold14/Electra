package com.tkh.tech.electra.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tkh.tech.electra.contact_feature.data.local.ContactDao
import com.tkh.tech.electra.contact_feature.data.local.ContactGroupDao
import com.tkh.tech.electra.contact_feature.data.local.entity.ContactEntity
import com.tkh.tech.electra.contact_feature.data.local.entity.ContactGroupEntity

@Database(
    entities = [ContactEntity::class, ContactGroupEntity::class],
    version = 1
)

abstract class ElectraDatabase: RoomDatabase (){

    abstract fun contactDao(): ContactDao
    abstract fun contactGroupDao(): ContactGroupDao
}
package com.tkh.tech.electra.contact_feature.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactEntity(

    @PrimaryKey
    val id: Int? = null,
    val name: String?,
    val number: Int? = null,
)
